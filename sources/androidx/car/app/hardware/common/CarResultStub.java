package androidx.car.app.hardware.common;

import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.i;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.ui.sw0;
import org.telegram.ui.web.g1;
import r.a;
import r.c;
import w.b;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final b mBundle;
    private final a mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<c, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i10, b bVar, boolean z10, T t10, a aVar) {
        Objects.requireNonNull(aVar);
        this.mHostDispatcher = aVar;
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
        for (Map.Entry<c, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new g1(11, entry, convertAndRecast));
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
    public void onCarHardwareResult(int i10, boolean z10, b bVar, IBinder iBinder) {
        i.b(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new com.google.firebase.messaging.i(this, z10, bVar, 12));
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
        int i10 = this.mResultType;
        b bVar = this.mBundle;
        aVar.getClass();
        i.d("unsubscribeCarHardwareResult", new sw0(aVar, i10, bVar));
        return true;
    }
}
