package androidx.car.app.hardware.common;

import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.j;
import com.google.firebase.messaging.i;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.ui.web.y;
import r.a;
import r.d;
import w.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final b mBundle;
    private final r.b mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<d, Executor> mListeners = new HashMap();
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
        for (Map.Entry<d, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new y(18, entry, convertAndRecast));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, d dVar) {
        this.mListeners.isEmpty();
        Objects.requireNonNull(dVar);
        throw new ClassCastException();
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i10, boolean z10, b bVar, IBinder iBinder) {
        j.b(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new i(this, z10, bVar, 11));
    }

    public boolean removeListener(d dVar) {
        Map<d, Executor> map = this.mListeners;
        Objects.requireNonNull(dVar);
        map.remove(dVar);
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
        j.d("unsubscribeCarHardwareResult", new a(bVar, i10, bVar2));
        return true;
    }
}
