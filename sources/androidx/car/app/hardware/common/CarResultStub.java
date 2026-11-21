package androidx.car.app.hardware.common;

import ab.j;
import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.g;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p4.r0;
import p4.z;
import r.a;
import r.c;
import w.b;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final b mBundle;
    private final a mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<c, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i7, b bVar, boolean z10, T t6, a aVar) {
        Objects.requireNonNull(aVar);
        this.mHostDispatcher = aVar;
        this.mResultType = i7;
        this.mBundle = bVar;
        this.mIsSingleShot = z10;
        Objects.requireNonNull(t6);
        this.mUnsupportedValue = t6;
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
        for (Map.Entry<c, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new z(7, entry, convertAndRecast));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, c cVar) {
        this.mListeners.isEmpty();
        Objects.requireNonNull(cVar);
        throw new ClassCastException();
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i7, boolean z10, b bVar, IBinder iBinder) {
        g.b(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new j(this, z10, bVar, 12));
    }

    public boolean removeListener(c cVar) {
        Map<c, Executor> map = this.mListeners;
        Objects.requireNonNull(cVar);
        map.remove(cVar);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        a aVar = this.mHostDispatcher;
        int i7 = this.mResultType;
        b bVar = this.mBundle;
        aVar.getClass();
        g.d("unsubscribeCarHardwareResult", new r0(aVar, i7, bVar));
        return true;
    }
}
