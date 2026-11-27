package androidx.car.app.hardware.common;

import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.e;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final h31 mBundle;
    private final sc1 mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<wr7, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i, h31 h31Var, boolean z, T t, sc1 sc1Var) {
        Objects.requireNonNull(sc1Var);
        this.mHostDispatcher = sc1Var;
        this.mResultType = i;
        this.mBundle = h31Var;
        this.mIsSingleShot = z;
        Objects.requireNonNull(t);
        this.mUnsupportedValue = t;
    }

    private T convertAndRecast(h31 h31Var) {
        return (T) h31Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyResults$1(Map.Entry entry, Object obj) {
        entry.getKey().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onCarHardwareResult$0(boolean z, h31 h31Var) {
        notifyResults(z, h31Var);
        return null;
    }

    private void notifyResults(boolean z, h31 h31Var) {
        T convertAndRecast = z ? convertAndRecast(h31Var) : this.mUnsupportedValue;
        for (Map.Entry<wr7, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new z21(entry, convertAndRecast, (byte) 16));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, wr7 wr7Var) {
        this.mListeners.isEmpty();
        Objects.requireNonNull(wr7Var);
        throw new ClassCastException();
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i, boolean z, h31 h31Var, IBinder iBinder) {
        e.c(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new bh((Object) this, z, (Object) h31Var, (byte) 3));
    }

    public boolean removeListener(wr7 wr7Var) {
        Map<wr7, Executor> map = this.mListeners;
        Objects.requireNonNull(wr7Var);
        map.remove(wr7Var);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        sc1 sc1Var = this.mHostDispatcher;
        int i = this.mResultType;
        h31 h31Var = this.mBundle;
        sc1Var.getClass();
        e.d("unsubscribeCarHardwareResult", new rm0(sc1Var, i, h31Var));
        return true;
    }
}
