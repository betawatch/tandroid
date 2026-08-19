package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* loaded from: classes3.dex */
public abstract class CacheFetcher<Args, R> {
    private HashMap<Pair<Integer, Args>, R> cachedResults;
    private HashMap<Pair<Integer, Args>, Long> lastRequestedRemotely;
    private HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> loadingCallbacks;
    private final long requestRemotelyTimeout;

    protected boolean emitLocal(Args args) {
        return false;
    }

    protected void getRemote(int i, Args args, long j, Utilities.Callback4<Boolean, R, Long, Boolean> callback4) {
    }

    protected long getSavedLastTimeRequested(int i) {
        return 0L;
    }

    protected boolean saveLastTimeRequested() {
        return false;
    }

    protected void setLocal(int i, Args args, R r, long j) {
    }

    protected void setSavedLastTimeRequested(int i, long j) {
    }

    protected boolean useCache(Args args) {
        return true;
    }

    protected void getLocal(int i, Args args, Utilities.Callback2<Long, R> callback2) {
        callback2.run(0L, null);
    }

    public CacheFetcher() {
        this(240000);
    }

    public CacheFetcher(int i) {
        this.requestRemotelyTimeout = i;
    }

    public void fetch(final int i, final Args args, Utilities.Callback<R> callback) {
        final Pair<Integer, Args> pair = new Pair<>(Integer.valueOf(i), args);
        if (isLoading(pair)) {
            saveCallback(pair, callback);
            return;
        }
        R cachedResult = getCachedResult(pair);
        if (cachedResult == null || shouldRequest(pair)) {
            saveCallback(pair, callback);
            getLocal(i, args, new Utilities.Callback2() { // from class: org.telegram.messenger.CacheFetcher$$ExternalSyntheticLambda3
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    CacheFetcher.$r8$lambda$vKB003R5Kta8BpKYwF16lmDbD4c(CacheFetcher.this, pair, args, i, (Long) obj, obj2);
                }
            });
        } else if (callback != null) {
            callback.run(cachedResult);
        }
    }

    public static /* synthetic */ void $r8$lambda$vKB003R5Kta8BpKYwF16lmDbD4c(final CacheFetcher cacheFetcher, final Pair pair, final Object obj, final int i, Long l, final Object obj2) {
        if (cacheFetcher.shouldRequest(pair)) {
            if (obj2 != null && cacheFetcher.emitLocal(obj)) {
                cacheFetcher.cacheResult(pair, obj2);
                cacheFetcher.callCallbacks(pair, obj2, false);
            }
            cacheFetcher.getRemote(i, obj, l.longValue(), new Utilities.Callback4() { // from class: org.telegram.messenger.CacheFetcher$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.Utilities.Callback4
                public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                    CacheFetcher.$r8$lambda$igJR4yzJOQFxj1rf2x-X47xcXuQ(CacheFetcher.this, pair, obj2, i, obj, (Boolean) obj3, obj4, (Long) obj5, (Boolean) obj6);
                }
            });
            return;
        }
        cacheFetcher.cacheResult(pair, obj2);
        cacheFetcher.callCallbacks(pair, obj2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void $r8$lambda$igJR4yzJOQFxj1rf2x-X47xcXuQ(CacheFetcher cacheFetcher, Pair pair, Object obj, int i, Object obj2, Boolean bool, Object obj3, Long l, Boolean bool2) {
        CacheFetcher cacheFetcher2;
        R r;
        cacheFetcher.getClass();
        if (bool2.booleanValue()) {
            cacheFetcher.saveLastRequested(pair);
        }
        if (bool.booleanValue()) {
            cacheFetcher.cacheResult(pair, obj);
            cacheFetcher.callCallbacks(pair, obj, true);
            return;
        }
        if (obj3 != 0) {
            cacheFetcher2 = cacheFetcher;
            r = obj3;
            cacheFetcher2.setLocal(i, obj2, r, l.longValue());
            cacheFetcher2.cacheResult(pair, r);
        } else {
            cacheFetcher2 = cacheFetcher;
            r = obj3;
        }
        cacheFetcher2.callCallbacks(pair, r, true);
    }

    private R getCachedResult(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, R> hashMap = this.cachedResults;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(pair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void cacheResult(Pair<Integer, Args> pair, R r) {
        if (useCache(pair.second)) {
            if (this.cachedResults == null) {
                this.cachedResults = new HashMap<>();
            }
            this.cachedResults.put(pair, r);
        }
    }

    private void saveLastRequested(Pair<Integer, Args> pair) {
        if (this.lastRequestedRemotely == null) {
            this.lastRequestedRemotely = new HashMap<>();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.lastRequestedRemotely.put(pair, Long.valueOf(currentTimeMillis));
        if (saveLastTimeRequested()) {
            setSavedLastTimeRequested(pair.hashCode(), currentTimeMillis);
        }
    }

    private boolean shouldRequest(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, Long> hashMap = this.lastRequestedRemotely;
        Long l = hashMap != null ? hashMap.get(pair) : null;
        if (saveLastTimeRequested() && l == null) {
            l = Long.valueOf(getSavedLastTimeRequested(pair.hashCode()));
        }
        return l == null || System.currentTimeMillis() - l.longValue() >= this.requestRemotelyTimeout;
    }

    public void forceRequest(int i, Args args) {
        if (this.lastRequestedRemotely == null) {
            return;
        }
        Pair pair = new Pair(Integer.valueOf(i), args);
        this.lastRequestedRemotely.remove(pair);
        if (saveLastTimeRequested()) {
            setSavedLastTimeRequested(pair.hashCode(), 0L);
        }
    }

    private boolean isLoading(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> hashMap = this.loadingCallbacks;
        return (hashMap == null || hashMap.get(pair) == null) ? false : true;
    }

    private void saveCallback(final Pair<Integer, Args> pair, final Utilities.Callback<R> callback) {
        if (callback == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.CacheFetcher$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CacheFetcher.$r8$lambda$YYG6dtJSqtyEXKjDlAhxnX0vONg(CacheFetcher.this, pair, callback);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$YYG6dtJSqtyEXKjDlAhxnX0vONg(CacheFetcher cacheFetcher, Pair pair, Utilities.Callback callback) {
        if (cacheFetcher.loadingCallbacks == null) {
            cacheFetcher.loadingCallbacks = new HashMap<>();
        }
        ArrayList<Utilities.Callback<R>> arrayList = cacheFetcher.loadingCallbacks.get(pair);
        if (arrayList == null) {
            HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> hashMap = cacheFetcher.loadingCallbacks;
            arrayList = new ArrayList<>();
            hashMap.put(pair, arrayList);
        }
        arrayList.add(callback);
    }

    private void callCallbacks(final Pair<Integer, Args> pair, final R r, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.CacheFetcher$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CacheFetcher.$r8$lambda$pneNqVUnFb75PaQjLCFyQ7yTNYw(CacheFetcher.this, pair, r, z);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$pneNqVUnFb75PaQjLCFyQ7yTNYw(CacheFetcher cacheFetcher, Pair pair, Object obj, boolean z) {
        ArrayList<Utilities.Callback<R>> arrayList;
        HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> hashMap = cacheFetcher.loadingCallbacks;
        if (hashMap == null || (arrayList = hashMap.get(pair)) == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Utilities.Callback<R> callback = arrayList.get(i);
            i++;
            callback.run(obj);
        }
        if (z) {
            arrayList.clear();
        }
        if (z) {
            cacheFetcher.loadingCallbacks.remove(pair);
        }
    }
}
