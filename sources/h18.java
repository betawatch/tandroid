// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.s;
import org.telegram.ui.v;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class h18 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h18(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        s7b s7bVar;
        l8b l8bVar;
        ar1 ar1Var;
        wk4 wk4Var;
        wk4 wk4Var2;
        float f = 1.0f;
        Object obj = null;
        int i = 0;
        Object[] objArr = 0;
        byte b = 1;
        switch (this.a) {
            case 0:
                y28 y28Var = (y28) this.b;
                je5 je5Var = (je5) this.c;
                y28Var.removeView(je5Var);
                if (y28Var.T1 == je5Var) {
                    y28Var.T1 = null;
                    return;
                }
                return;
            case 1:
                y28 y28Var2 = (y28) this.b;
                t7b C = t7b.C((Activity) this.c, y28Var2.s2);
                c30 c30Var = y28Var2.C2;
                long j = (c30Var == null || (l8bVar = (l8b) c30Var.c) == null) ? 0L : l8bVar.currentPosition;
                File f2 = y28Var2.E1.f();
                TL_stories.StoryItem storyItem = y28Var2.E1.a;
                f4b f4bVar = new f4b();
                f4bVar.n = true;
                f4bVar.t = storyItem.media;
                int i2 = f4bVar.a;
                f4bVar.q = na7.q1(i2).w1(storyItem.dialogId);
                f4bVar.r = storyItem.id;
                f4bVar.s = storyItem.caption;
                f4bVar.L = f2;
                f4bVar.M = false;
                f4bVar.k0 = 720;
                f4bVar.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    f4bVar.K = false;
                    if (f2 != null) {
                        f4bVar.h(f2.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    f4bVar.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i3);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    f4bVar.k0 = documentAttribute.w;
                                    f4bVar.l0 = documentAttribute.h;
                                    f4bVar.i = documentAttribute.duration;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str = storyItem.firstFramePath;
                        if (str != null) {
                            f4bVar.N = str;
                        } else if (document2.thumbs != null) {
                            for (int i4 = 0; i4 < storyItem.media.document.thumbs.size(); i4++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i4);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    f4bVar.O = fl5.B(null, photoSize.bytes);
                                } else {
                                    ba4.G(i2);
                                    File J = ba4.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        f4bVar.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                f4bVar.z();
                f4bVar.e(storyItem);
                m7b d = o7b.d(y28Var2.z0);
                RectF rectF = C.I;
                WindowManager.LayoutParams layoutParams = C.h;
                WindowManager windowManager = C.f;
                int i5 = C.c;
                if (!C.d) {
                    if (na7.q1(i5).t2()) {
                        h5.b(i5);
                    } else {
                        C.v0 = false;
                        C.e = false;
                        C.C2 = false;
                        if (windowManager != null && (s7bVar = C.n) != null && s7bVar.getParent() == null) {
                            gl.s3(windowManager, C.n, layoutParams);
                            windowManager.addView(C.n, layoutParams);
                            C.f0();
                        }
                        C.L1 = f4bVar;
                        a6b.a(i5, f4bVar);
                        f4b f4bVar2 = C.L1;
                        C.P1 = (f4bVar2 == null || !f4bVar2.K) ? 0 : 1;
                        C.t0.g = false;
                        if (d != null) {
                            C.G = d;
                            C.K = d.a;
                            rectF.set(d.c);
                            C.H = d.b;
                            C.G.e();
                        } else {
                            C.K = false;
                            float L = gl.L(100.0f);
                            Point point = gl.q;
                            rectF.set(0.0f, L, point.x, gl.L(100.0f) + point.y);
                            C.H = gl.L(8.0f);
                        }
                        C.r.c();
                        g7b g7bVar = C.i0;
                        boolean z = C.K;
                        g7bVar.setBackgroundColor((z || !z) ? 0 : -14737633);
                        C.r.setTranslationX(0.0f);
                        C.r.setTranslationY(0.0f);
                        C.r.b(0.0f);
                        C.r.setScaleX(1.0f);
                        C.r.setScaleY(1.0f);
                        C.L = 0.0f;
                        gl.e2(C.b);
                        f4b f4bVar3 = C.L1;
                        if (f4bVar3 != null) {
                            C.d1.setText(f4bVar3.C0);
                        }
                        C.J(new d6b(C, (byte) 7), j);
                        C.c1.b(true, false);
                        C.I(1, false);
                        C.k0(-1, false, false);
                        C.a();
                        C.w0 = 0L;
                        C.x0 = "";
                    }
                }
                C.R = new e18(y28Var2, (byte) 12);
                C.S = new g05(y28Var2, C, b);
                return;
            case 2:
                ((d8b) ((s28) this.b).x.G1).h(new jh8(((m8b) this.c).f, 14, false));
                return;
            case 3:
                ((e68) this.b).s((Bitmap) this.c);
                return;
            case 4:
                km kmVar = (km) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList = kmVar.h;
                hm hmVar = kmVar.n;
                if (hmVar != null) {
                    arrayList.add(hmVar);
                }
                hm hmVar2 = kmVar.r;
                if (hmVar2 != null) {
                    arrayList.add(hmVar2);
                }
                hm hmVar3 = kmVar.s;
                if (hmVar3 != null) {
                    arrayList.add(hmVar3);
                }
                kmVar.n = new hm(bitmap);
                kmVar.r = null;
                kmVar.s = null;
                kmVar.t();
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                f53 f53Var = (f53) this.c;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                cb9.Y0(photoViewer.F, photoViewer.l4, false, f53Var, null);
                return;
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                b88 b88Var = (b88) this.c;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                if (b88Var.getWindow() != null) {
                    b88Var.v0(true);
                    mu1 mu1Var = photoViewer2.k4;
                    if (mu1Var == null || (ar1Var = mu1Var.a0) == null) {
                        return;
                    }
                    ar1Var.J0(false);
                    return;
                }
                return;
            case 7:
                s0c s0cVar = (s0c) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                s0cVar.a(bitmap2);
                return;
            case 8:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                p88 p88Var = (p88) this.c;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                p88Var.e.h();
                p88Var.c.postRunnable(new ql3((byte) 29));
                photoViewer3.f0.removeView(photoViewer3.O1);
                return;
            case 9:
                d88 d88Var = (d88) this.b;
                ((View) this.c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = d88Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                j98 j98Var = photoViewer4.F2;
                if (j98Var != null) {
                    j98Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 10:
                l88 l88Var = (l88) this.b;
                lbc lbcVar = (lbc) this.c;
                if (lbcVar.U() <= 0 || lbcVar.S() < lbcVar.U() - 590) {
                    return;
                }
                l88Var.a.f0.invalidate();
                return;
            case 11:
                s sVar = (s) this.b;
                p88 p88Var2 = (p88) this.c;
                p88Var2.e.h();
                p88Var2.c.postRunnable(new ql3((byte) 29));
                try {
                    sVar.b.f0.removeView(p88Var2);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 12:
                v vVar = (v) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                vVar.r.q7.d();
                animatorSet.start();
                return;
            case 13:
                v vVar2 = (v) this.b;
                p98 p98Var = (p98) this.c;
                vVar2.r.r4 = false;
                if (p98Var.s) {
                    return;
                }
                p98Var.a.v0(false, true);
                return;
            case 14:
                ya8 ya8Var = (ya8) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                if (ya8Var.a == surfaceTexture && ya8Var.getSurfaceTexture() == null) {
                    ya8Var.setSurfaceTexture(surfaceTexture);
                    return;
                }
                return;
            case 15:
                ve8 ve8Var = (ve8) this.b;
                gl.g((String) this.c);
                ve8Var.b(true);
                return;
            case 16:
                ve8 ve8Var2 = (ve8) this.b;
                gl.g(k27.h0(((TLRPC.PollAnswer) this.c).text, false));
                ve8Var2.b(true);
                return;
            case 17:
                ve8 ve8Var3 = (ve8) this.b;
                byte[] bArr = (byte[]) this.c;
                z3a B = z3a.B(ve8Var3.I.K1);
                k27 k27Var = ve8Var3.I;
                if (k27Var != null && (k27.m1(k27Var) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = k27.B0(k27Var.k);
                    int e1 = k27Var.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = B.getMessagesController().h1(B0);
                    tL_messages_deletePollAnswer.msg_id = e1;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = B.getConnectionsManager();
                    co3 co3Var = Utilities.d;
                    Objects.requireNonNull(co3Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new ge2(co3Var, objArr == true ? 1 : 0), new tf8(B, (byte) 20));
                }
                ve8Var3.b(true);
                return;
            case 18:
                tj2 tj2Var = (tj2) this.b;
                sa2 sa2Var = (sa2) this.c;
                tj2Var.getClass();
                sa2Var.run();
                tj2Var.a.remove(sa2Var);
                return;
            case 19:
                yf8 yf8Var = (yf8) this.b;
                TLObject tLObject = (TLObject) this.c;
                yf8Var.N = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    yf8Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        yf8Var.a(false);
                        return;
                    } else {
                        yf8Var.d();
                        yf8Var.c.g3.O(true);
                        return;
                    }
                }
                return;
            case 20:
                ((p8c) this.b).a((Bitmap) this.c);
                return;
            case 21:
                ((zi8) this.b).k((f4b) this.c);
                return;
            case 22:
                xl3 xl3Var = (xl3) this.b;
                f4b f4bVar4 = (f4b) this.c;
                zi8 zi8Var = (zi8) xl3Var.d;
                Bitmap bitmap3 = zi8Var.a;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    if (f4bVar4.M0 == zi8Var.a) {
                        f4bVar4.M0 = null;
                    }
                    zi8Var.a = null;
                    zi8Var.invalidate();
                    return;
                }
                return;
            case 23:
                jj8 jj8Var = (jj8) this.b;
                hj8 hj8Var = (hj8) this.c;
                synchronized (jj8Var.a) {
                    if (jj8Var.f) {
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) jj8Var.d.get(hj8Var);
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = arrayList2.get(i6);
                            i6++;
                            if (((ij8) obj2).a != null) {
                                fj8 fj8Var = (fj8) jj8Var.c.get(hj8Var);
                                if (fj8Var != null) {
                                    wk4Var2 = fj8Var.a;
                                } else {
                                    byte b2 = 19;
                                    if (jj8Var.a()) {
                                        try {
                                            f06 c = jj8Var.h.a.c(hj8Var.a, hj8Var.b);
                                            c.b();
                                            wk4Var = new wk4(c, obj, b2);
                                        } catch (LinkageError | OutOfMemoryError | RuntimeException e2) {
                                            try {
                                                fa4.g(e2, true);
                                            } catch (LinkageError | RuntimeException unused) {
                                            }
                                            wk4Var = new wk4(obj, e2, b2);
                                        }
                                        synchronized (jj8Var.a) {
                                            if (jj8Var.f) {
                                                return;
                                            }
                                            if (fj8Var == null && ((Throwable) wk4Var.c) == null) {
                                                jj8Var.c(hj8Var, wk4Var);
                                            }
                                            ArrayList arrayList3 = (ArrayList) jj8Var.d.remove(hj8Var);
                                            if (arrayList3 != null) {
                                                int size2 = arrayList3.size();
                                                while (i < size2) {
                                                    Object obj3 = arrayList3.get(i);
                                                    i++;
                                                    ij8 ij8Var = (ij8) obj3;
                                                    try {
                                                        gj8 gj8Var = ij8Var.a;
                                                        ij8Var.a = null;
                                                        if (gj8Var != null) {
                                                            gj8Var.a(wk4Var);
                                                        }
                                                    } catch (LinkageError | RuntimeException e3) {
                                                        try {
                                                            fa4.g(e3, true);
                                                        } catch (LinkageError | RuntimeException unused2) {
                                                        }
                                                    }
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    wk4Var2 = new wk4(obj, jj8Var.n, b2);
                                }
                                wk4Var = wk4Var2;
                                synchronized (jj8Var.a) {
                                }
                            }
                        }
                    }
                    jj8Var.d.remove(hj8Var);
                    return;
                }
            case 24:
                ((PrivacyControlActivity) this.b).H0((TLObject) this.c);
                return;
            case 25:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.A0();
                    return;
                }
                return;
            case 26:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.A0();
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                ahb ahbVar = (ahb) this.c;
                boolean z2 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z2;
                ahbVar.setChecked(z2);
                return;
            case 28:
                ((gk8) this.b).getMessagesController().l5(null, ((Long) this.c).longValue());
                return;
            default:
                pl8 pl8Var = (pl8) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = pl8Var.a;
                int i7 = pl8Var.s;
                int size3 = arrayList4.size();
                pl8Var.s = size3;
                if (i7 != size3 && pl8Var.Q != null) {
                    pl8Var.g();
                }
                int size4 = arrayList5.size();
                int i8 = 0;
                while (i8 < size4) {
                    ml8 ml8Var = (ml8) arrayList5.get(i8);
                    if (ml8Var.o && !ml8Var.p) {
                        arrayList4.add(ml8Var);
                    } else if (pl8.i(ml8Var.a, arrayList4) == null) {
                        pl8 pl8Var2 = ml8Var.y;
                        float f3 = pl8Var2.L;
                        RectF rectF2 = ml8Var.c;
                        RectF rectF3 = ml8Var.f;
                        r86 r86Var = ml8Var.r;
                        if (r86Var != null) {
                            r86Var.a();
                            ml8Var.t = false;
                            ml8Var.s = false;
                        }
                        ml8Var.o = true;
                        Object[] objArr2 = rectF2.left - f <= f3;
                        Object[] objArr3 = rectF2.right + f >= ((float) pl8Var2.getMeasuredWidth()) - f3;
                        if (objArr2 != false && objArr3 != false) {
                            objArr3 = false;
                            objArr2 = false;
                        }
                        ml8Var.g.set(rectF2);
                        rectF3.set(rectF2);
                        if (objArr2 == true) {
                            rectF3.right = rectF3.left;
                        } else if (objArr3 == true) {
                            rectF3.left = rectF3.right;
                        } else {
                            byte b3 = ml8Var.a;
                            if ((b3 == 3 || b3 == 2) && pl8Var2.F == 1) {
                                rectF3.left = rectF3.right;
                            } else {
                                float centerX = rectF3.centerX();
                                rectF3.right = centerX;
                                rectF3.left = centerX;
                            }
                        }
                        ml8Var.e.e(true, 0.0f);
                        arrayList4.add(ml8Var);
                    }
                    i8++;
                    f = 1.0f;
                }
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                pl8Var.invalidate();
                return;
        }
    }
}
