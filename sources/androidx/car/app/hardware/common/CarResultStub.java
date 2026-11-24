package androidx.car.app.hardware.common;

import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.e;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final g41 mBundle;
    private final sd1 mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<zq7, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i, g41 g41Var, boolean z, T t, sd1 sd1Var) {
        Objects.requireNonNull(sd1Var);
        this.mHostDispatcher = sd1Var;
        this.mResultType = i;
        this.mBundle = g41Var;
        this.mIsSingleShot = z;
        Objects.requireNonNull(t);
        this.mUnsupportedValue = t;
    }

    private T convertAndRecast(g41 g41Var) {
        return (T) g41Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyResults$1(Map.Entry entry, Object obj) {
        entry.getKey().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onCarHardwareResult$0(boolean z, g41 g41Var) {
        notifyResults(z, g41Var);
        return null;
    }

    private void notifyResults(boolean z, g41 g41Var) {
        T convertAndRecast = z ? convertAndRecast(g41Var) : this.mUnsupportedValue;
        for (Map.Entry<zq7, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new y31(entry, convertAndRecast, (byte) 17));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, zq7 zq7Var) {
        this.mListeners.isEmpty();
        Objects.requireNonNull(zq7Var);
        throw new ClassCastException();
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i, boolean z, g41 g41Var, IBinder iBinder) {
        e.c(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new ci((Object) this, z, (Object) g41Var, (byte) 3));
    }

    public boolean removeListener(zq7 zq7Var) {
        Map<zq7, Executor> map = this.mListeners;
        Objects.requireNonNull(zq7Var);
        map.remove(zq7Var);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        sd1 sd1Var = this.mHostDispatcher;
        int i = this.mResultType;
        g41 g41Var = this.mBundle;
        sd1Var.getClass();
        e.d("unsubscribeCarHardwareResult", new qn0(sd1Var, i, g41Var));
        return true;
    }
}
