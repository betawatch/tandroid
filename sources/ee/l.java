package ee;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ji.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.j71;
import v7.i8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class l implements b, bp0, ne.d, oe.a {
    public final Object a;

    public /* synthetic */ l(Object obj) {
        this.a = obj;
    }

    @Override // ne.d
    public void C(float f7, int i10) {
        ((ne.j) this.a).h(f7);
    }

    @Override // org.telegram.ui.Components.bp0
    public void b(float f7) {
        z zVar = (z) this.a;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override // org.telegram.ui.Components.bp0
    public void c(float f7) {
        MessageObject messageObject = ((z) this.a).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override // oe.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ee.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(c cVar, md.c cVar2) {
        a aVar;
        int i10;
        Throwable th2;
        fe.g gVar;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                ld.a aVar2 = ld.a.a;
                i10 = aVar.d;
                id.i iVar = id.i.a;
                if (i10 != 0) {
                    i8.b(obj);
                    fe.g gVar2 = new fe.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.n) this.a).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        i8.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new a(this, cVar2);
        Object obj2 = aVar.b;
        ld.a aVar22 = ld.a.a;
        i10 = aVar.d;
        id.i iVar2 = id.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    @Override // oe.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // oe.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // oe.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // oe.a
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        j71 j71Var = (j71) this.a;
        float f11 = -dp;
        j71Var.g.inset(f11, f11);
        boolean contains = j71Var.g.contains(f7, f10);
        float f12 = dp;
        j71Var.g.inset(f12, f12);
        return contains;
    }

    @Override // oe.a
    public /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // oe.a
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((j71) this.a).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // oe.a
    public void onClickTouchDown(View view, float f7, float f10) {
        ((j71) this.a).h.c(true);
    }

    @Override // oe.a
    public void onClickTouchUp(View view, float f7, float f10) {
        ((j71) this.a).h.c(false);
    }

    @Override // oe.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override // ne.d
    public void p(int i10, float f7, float f10, ne.e eVar) {
        ((ne.j) this.a).h(f7);
    }

    @Override // oe.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override // oe.a
    public /* synthetic */ void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override // oe.a
    public /* synthetic */ void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override // oe.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
