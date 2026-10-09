package de;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ii.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.m71;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class m implements b, fp0, me.d, ne.a {
    public final Object a;

    public /* synthetic */ m(Object obj) {
        this.a = obj;
    }

    @Override // me.d
    public void A(float f7, int i10) {
        ((me.j) this.a).i(f7);
    }

    @Override // org.telegram.ui.Components.fp0
    public void b(float f7) {
        z zVar = (z) this.a;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override // org.telegram.ui.Components.fp0
    public void d(float f7) {
        MessageObject messageObject = ((z) this.a).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override // ne.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // ne.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // ne.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // me.d
    public void n(int i10, float f7, float f10, me.e eVar) {
        ((me.j) this.a).i(f7);
    }

    @Override // ne.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // ne.a
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        m71 m71Var = (m71) this.a;
        float f11 = -dp;
        m71Var.g.inset(f11, f11);
        boolean contains = m71Var.g.contains(f7, f10);
        float f12 = dp;
        m71Var.g.inset(f12, f12);
        return contains;
    }

    @Override // ne.a
    public /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // ne.a
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((m71) this.a).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ne.a
    public void onClickTouchDown(View view, float f7, float f10) {
        ((m71) this.a).h.c(true);
    }

    @Override // ne.a
    public void onClickTouchUp(View view, float f7, float f10) {
        ((m71) this.a).h.c(false);
    }

    @Override // ne.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // de.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(c cVar, ld.c cVar2) {
        a aVar;
        int i10;
        Throwable th2;
        ee.g gVar;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                kd.a aVar2 = kd.a.a;
                i10 = aVar.d;
                hd.i iVar = hd.i.a;
                if (i10 != 0) {
                    a8.b(obj);
                    ee.g gVar2 = new ee.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.m) this.a).invoke(gVar2, aVar);
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
                        a8.b(obj);
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
        kd.a aVar22 = kd.a.a;
        i10 = aVar.d;
        hd.i iVar2 = hd.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    @Override // ne.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override // ne.a
    public /* synthetic */ void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override // ne.a
    public /* synthetic */ void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override // ne.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
