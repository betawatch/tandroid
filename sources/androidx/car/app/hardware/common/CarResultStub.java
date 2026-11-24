package androidx.car.app.hardware.common;

import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.e;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final y21 mBundle;
    private final kc1 mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<wo7, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i, y21 y21Var, boolean z, T t, kc1 kc1Var) {
        Objects.requireNonNull(kc1Var);
        this.mHostDispatcher = kc1Var;
        this.mResultType = i;
        this.mBundle = y21Var;
        this.mIsSingleShot = z;
        Objects.requireNonNull(t);
        this.mUnsupportedValue = t;
    }

    private T convertAndRecast(y21 y21Var) {
        return (T) y21Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyResults$1(Map.Entry entry, Object obj) {
        entry.getKey().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onCarHardwareResult$0(boolean z, y21 y21Var) {
        notifyResults(z, y21Var);
        return null;
    }

    private void notifyResults(boolean z, y21 y21Var) {
        T convertAndRecast = z ? convertAndRecast(y21Var) : this.mUnsupportedValue;
        for (Map.Entry<wo7, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new q21(entry, convertAndRecast, (byte) 16));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, wo7 wo7Var) {
        this.mListeners.isEmpty();
        Objects.requireNonNull(wo7Var);
        throw new ClassCastException();
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i, boolean z, y21 y21Var, IBinder iBinder) {
        e.c(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new ch((Object) this, z, (Object) y21Var, (byte) 3));
    }

    public boolean removeListener(wo7 wo7Var) {
        Map<wo7, Executor> map = this.mListeners;
        Objects.requireNonNull(wo7Var);
        map.remove(wo7Var);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        kc1 kc1Var = this.mHostDispatcher;
        int i = this.mResultType;
        y21 y21Var = this.mBundle;
        kc1Var.getClass();
        e.d("unsubscribeCarHardwareResult", new qm0(kc1Var, i, y21Var));
        return true;
    }
}
