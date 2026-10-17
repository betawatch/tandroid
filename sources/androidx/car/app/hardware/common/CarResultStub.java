package androidx.car.app.hardware.common;

import ai.d4;
import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.g;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import r.a;
import r.e;
import w.b;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final b mBundle;
    private final r.b mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<e, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i10, b bVar, boolean z10, T t10, r.b bVar2) {
        Objects.requireNonNull(bVar2);
        this.mHostDispatcher = bVar2;
        this.mResultType = i10;
        this.mBundle = bVar;
        this.mIsSingleShot = z10;
        Objects.requireNonNull(t10);
        this.mUnsupportedValue = t10;
    }

    private T convertAndRecast(b bVar) {
        return (T) bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyResults$1(Map.Entry entry, Object obj) {
        entry.getKey().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onCarHardwareResult$0(boolean z10, b bVar) {
        notifyResults(z10, bVar);
        return null;
    }

    private void notifyResults(boolean z10, b bVar) {
        T convertAndRecast = z10 ? convertAndRecast(bVar) : this.mUnsupportedValue;
        for (Map.Entry<e, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new p2.b(6, entry, convertAndRecast));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, e eVar) {
        this.mListeners.isEmpty();
        Objects.requireNonNull(eVar);
        throw new ClassCastException();
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i10, boolean z10, b bVar, IBinder iBinder) {
        g.b(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new d4(this, z10, bVar, 12));
    }

    public boolean removeListener(e eVar) {
        Map<e, Executor> map = this.mListeners;
        Objects.requireNonNull(eVar);
        map.remove(eVar);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        r.b bVar = this.mHostDispatcher;
        int i10 = this.mResultType;
        b bVar2 = this.mBundle;
        bVar.getClass();
        g.d("unsubscribeCarHardwareResult", new a(bVar, i10, bVar2));
        return true;
    }
}
