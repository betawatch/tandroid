package androidx.car.app.hardware.common;

import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.g;
import ci.l3;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.ui.hc1;
import r.a;
import r.c;
import w.b;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final b mBundle;
    private final a mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<c, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i3, b bVar, boolean z10, T t10, a aVar) {
        Objects.requireNonNull(aVar);
        this.mHostDispatcher = aVar;
        this.mResultType = i3;
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
        for (Map.Entry<c, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new hc1(20, entry, convertAndRecast));
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
    public void onCarHardwareResult(int i3, boolean z10, b bVar, IBinder iBinder) {
        g.b(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new l3(this, z10, bVar, 11));
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
        this.mHostDispatcher.getClass();
        g.d("unsubscribeCarHardwareResult", new org.telegram.utils.twidget.a());
        return true;
    }
}
