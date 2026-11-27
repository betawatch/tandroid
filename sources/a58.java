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
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s;
import org.telegram.ui.v;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a58 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a58(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        rbb rbbVar;
        kcb kcbVar;
        nr1 nr1Var;
        um4 um4Var;
        um4 um4Var2;
        float f = 1.0f;
        byte b = 20;
        Object obj = null;
        int i = 0;
        Object[] objArr = 0;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                o68 o68Var = (o68) this.b;
                sbb C = sbb.C((Activity) this.c, o68Var.m2);
                d30 d30Var = o68Var.w2;
                long j = (d30Var == null || (kcbVar = (kcb) d30Var.c) == null) ? 0L : kcbVar.currentPosition;
                File f2 = o68Var.y1.f();
                TL_stories.StoryItem storyItem = o68Var.y1.a;
                c8b c8bVar = new c8b();
                c8bVar.n = true;
                c8bVar.t = storyItem.media;
                int i2 = c8bVar.a;
                c8bVar.q = uc7.s1(i2).y1(storyItem.dialogId);
                c8bVar.r = storyItem.id;
                c8bVar.s = storyItem.caption;
                c8bVar.L = f2;
                c8bVar.M = false;
                c8bVar.k0 = 720;
                c8bVar.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    c8bVar.K = false;
                    if (f2 != null) {
                        c8bVar.h(f2.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    c8bVar.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i3);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    c8bVar.k0 = documentAttribute.w;
                                    c8bVar.l0 = documentAttribute.h;
                                    c8bVar.i = documentAttribute.duration;
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
                            c8bVar.N = str;
                        } else if (document2.thumbs != null) {
                            for (int i4 = 0; i4 < storyItem.media.document.thumbs.size(); i4++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i4);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    c8bVar.O = in5.B(null, photoSize.bytes);
                                } else {
                                    xb4.G(i2);
                                    File J = xb4.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        c8bVar.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                c8bVar.z();
                c8bVar.e(storyItem);
                lbb d = nbb.d(o68Var.t0);
                RectF rectF = C.I;
                WindowManager.LayoutParams layoutParams = C.h;
                WindowManager windowManager = C.f;
                int i5 = C.c;
                if (!C.d) {
                    if (uc7.s1(i5).x2()) {
                        i5.b(i5);
                    } else {
                        C.v0 = false;
                        C.e = false;
                        C.C2 = false;
                        if (windowManager != null && (rbbVar = C.n) != null && rbbVar.getParent() == null) {
                            hl.s3(windowManager, C.n, layoutParams);
                            windowManager.addView(C.n, layoutParams);
                            C.f0();
                        }
                        C.L1 = c8bVar;
                        y9b.a(i5, c8bVar);
                        c8b c8bVar2 = C.L1;
                        C.P1 = (c8bVar2 == null || !c8bVar2.K) ? 0 : 1;
                        C.t0.g = false;
                        if (d != null) {
                            C.G = d;
                            C.K = d.a;
                            rectF.set(d.c);
                            C.H = d.b;
                            C.G.e();
                        } else {
                            C.K = false;
                            float L = hl.L(100.0f);
                            Point point = hl.q;
                            rectF.set(0.0f, L, point.x, hl.L(100.0f) + point.y);
                            C.H = hl.L(8.0f);
                        }
                        C.r.c();
                        fbb fbbVar = C.i0;
                        boolean z = C.K;
                        fbbVar.setBackgroundColor((z || !z) ? 0 : -14737633);
                        C.r.setTranslationX(0.0f);
                        C.r.setTranslationY(0.0f);
                        C.r.b(0.0f);
                        C.r.setScaleX(1.0f);
                        C.r.setScaleY(1.0f);
                        C.L = 0.0f;
                        hl.e2(C.b);
                        c8b c8bVar3 = C.L1;
                        if (c8bVar3 != null) {
                            C.d1.setText(c8bVar3.C0);
                        }
                        C.J(new bab(C, (byte) 18), j);
                        C.c1.b(true, false);
                        C.I(1, false);
                        C.k0(-1, false, false);
                        C.a();
                        C.w0 = 0L;
                        C.x0 = "";
                    }
                }
                C.R = new u48(o68Var, (byte) 12);
                C.S = new k25(o68Var, C, b2);
                return;
            case 1:
                ((ccb) ((j68) this.b).x.A1).h(new xk8(((lcb) this.c).f, 14, false));
                return;
            case 2:
                ((v98) this.b).s((Bitmap) this.c);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                x53 x53Var = (x53) this.c;
                Drawable[] drawableArr = PhotoViewer.d9;
                qe9.Z0(photoViewer.F, photoViewer.l4, false, x53Var, null);
                return;
            case 4:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                tb8 tb8Var = (tb8) this.c;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (tb8Var.getWindow() != null) {
                    tb8Var.w0(true);
                    zu1 zu1Var = photoViewer2.k4;
                    if (zu1Var == null || (nr1Var = zu1Var.a0) == null) {
                        return;
                    }
                    nr1Var.N0(false);
                    return;
                }
                return;
            case 5:
                r4c r4cVar = (r4c) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                r4cVar.a(bitmap);
                return;
            case 6:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                gc8 gc8Var = (gc8) this.c;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                gc8Var.e.h();
                gc8Var.c.postRunnable(new pg6(b2));
                photoViewer3.f0.removeView(photoViewer3.O1);
                return;
            case 7:
                lm lmVar = (lm) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                ArrayList arrayList = lmVar.h;
                im imVar = lmVar.n;
                if (imVar != null) {
                    arrayList.add(imVar);
                }
                im imVar2 = lmVar.r;
                if (imVar2 != null) {
                    arrayList.add(imVar2);
                }
                im imVar3 = lmVar.s;
                if (imVar3 != null) {
                    arrayList.add(imVar3);
                }
                lmVar.n = new im(bitmap2);
                lmVar.r = null;
                lmVar.s = null;
                lmVar.t();
                return;
            case 8:
                vb8 vb8Var = (vb8) this.b;
                ((View) this.c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = vb8Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                zc8 zc8Var = photoViewer4.F2;
                if (zc8Var != null) {
                    zc8Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 9:
                cc8 cc8Var = (cc8) this.b;
                kfc kfcVar = (kfc) this.c;
                if (kfcVar.U() <= 0 || kfcVar.S() < kfcVar.U() - 590) {
                    return;
                }
                cc8Var.a.f0.invalidate();
                return;
            case 10:
                s sVar = (s) this.b;
                gc8 gc8Var2 = (gc8) this.c;
                gc8Var2.e.h();
                gc8Var2.c.postRunnable(new pg6(b2));
                try {
                    sVar.b.f0.removeView(gc8Var2);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 11:
                v vVar = (v) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                vVar.r.q7.d();
                animatorSet.start();
                return;
            case 12:
                v vVar2 = (v) this.b;
                fd8 fd8Var = (fd8) this.c;
                vVar2.r.r4 = false;
                if (fd8Var.s) {
                    return;
                }
                fd8Var.a.v0(false, true);
                return;
            case 13:
                ne8 ne8Var = (ne8) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                if (ne8Var.a == surfaceTexture && ne8Var.getSurfaceTexture() == null) {
                    ne8Var.setSurfaceTexture(surfaceTexture);
                    return;
                }
                return;
            case 14:
                ji8 ji8Var = (ji8) this.b;
                hl.g((String) this.c);
                ji8Var.b(true);
                return;
            case 15:
                ji8 ji8Var2 = (ji8) this.b;
                hl.g(r47.h0(((TLRPC.PollAnswer) this.c).text, false));
                ji8Var2.b(true);
                return;
            case 16:
                ji8 ji8Var3 = (ji8) this.b;
                byte[] bArr = (byte[]) this.c;
                r7a B = r7a.B(ji8Var3.I.K1);
                r47 r47Var = ji8Var3.I;
                if (r47Var != null && (r47.m1(r47Var) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = r47.B0(r47Var.k);
                    int e1 = r47Var.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = B.getMessagesController().j1(B0);
                    tL_messages_deletePollAnswer.msg_id = e1;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = B.getConnectionsManager();
                    to3 to3Var = Utilities.d;
                    Objects.requireNonNull(to3Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new pe2(to3Var, objArr == true ? 1 : 0), new hj8(B, b));
                }
                ji8Var3.b(true);
                return;
            case 17:
                y99 y99Var = (y99) this.b;
                ib2 ib2Var = (ib2) this.c;
                y99Var.getClass();
                ib2Var.run();
                y99Var.a.remove(ib2Var);
                return;
            case 18:
                mj8 mj8Var = (mj8) this.b;
                TLObject tLObject = (TLObject) this.c;
                mj8Var.N = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    mj8Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        mj8Var.a(false);
                        return;
                    } else {
                        mj8Var.d();
                        mj8Var.c.g3.O(true);
                        return;
                    }
                }
                return;
            case 19:
                ((pcc) this.b).a((Bitmap) this.c);
                return;
            case 20:
                ((mm8) this.b).k((c8b) this.c);
                return;
            case 21:
                pm3 pm3Var = (pm3) this.b;
                c8b c8bVar4 = (c8b) this.c;
                mm8 mm8Var = (mm8) pm3Var.d;
                Bitmap bitmap3 = mm8Var.a;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    if (c8bVar4.M0 == mm8Var.a) {
                        c8bVar4.M0 = null;
                    }
                    mm8Var.a = null;
                    mm8Var.invalidate();
                    return;
                }
                return;
            case 22:
                wm8 wm8Var = (wm8) this.b;
                um8 um8Var = (um8) this.c;
                synchronized (wm8Var.a) {
                    if (wm8Var.f) {
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) wm8Var.d.get(um8Var);
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = arrayList2.get(i6);
                            i6++;
                            if (((vm8) obj2).a != null) {
                                sm8 sm8Var = (sm8) wm8Var.c.get(um8Var);
                                if (sm8Var != null) {
                                    um4Var2 = sm8Var.a;
                                } else {
                                    if (wm8Var.a()) {
                                        try {
                                            j26 c = wm8Var.h.a.c(um8Var.a, um8Var.b);
                                            c.b();
                                            um4Var = new um4(c, obj, b);
                                        } catch (LinkageError | OutOfMemoryError | RuntimeException e2) {
                                            try {
                                                cc4.g(e2, true);
                                            } catch (LinkageError | RuntimeException unused) {
                                            }
                                            um4Var = new um4(obj, e2, b);
                                        }
                                        synchronized (wm8Var.a) {
                                            if (wm8Var.f) {
                                                return;
                                            }
                                            if (sm8Var == null && ((Throwable) um4Var.c) == null) {
                                                wm8Var.c(um8Var, um4Var);
                                            }
                                            ArrayList arrayList3 = (ArrayList) wm8Var.d.remove(um8Var);
                                            if (arrayList3 != null) {
                                                int size2 = arrayList3.size();
                                                while (i < size2) {
                                                    Object obj3 = arrayList3.get(i);
                                                    i++;
                                                    vm8 vm8Var = (vm8) obj3;
                                                    try {
                                                        tm8 tm8Var = vm8Var.a;
                                                        vm8Var.a = null;
                                                        if (tm8Var != null) {
                                                            tm8Var.f(um4Var);
                                                        }
                                                    } catch (LinkageError | RuntimeException e3) {
                                                        try {
                                                            cc4.g(e3, true);
                                                        } catch (LinkageError | RuntimeException unused2) {
                                                        }
                                                    }
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    um4Var2 = new um4(obj, wm8Var.n, b);
                                }
                                um4Var = um4Var2;
                                synchronized (wm8Var.a) {
                                }
                            }
                        }
                    }
                    wm8Var.d.remove(um8Var);
                    return;
                }
            case 23:
                ((PrivacyControlActivity) this.b).I0((TLObject) this.c);
                return;
            case 24:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.B0();
                    return;
                }
                return;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.B0();
                return;
            case 26:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                wkb wkbVar = (wkb) this.c;
                boolean z2 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z2;
                wkbVar.setChecked(z2);
                return;
            case 27:
                ((vn8) this.b).getMessagesController().t5(null, ((Long) this.c).longValue());
                return;
            case 28:
                ap8 ap8Var = (ap8) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = ap8Var.a;
                int i7 = ap8Var.s;
                int size3 = arrayList4.size();
                ap8Var.s = size3;
                if (i7 != size3 && ap8Var.Q != null) {
                    ap8Var.g();
                }
                int size4 = arrayList5.size();
                int i8 = 0;
                while (i8 < size4) {
                    xo8 xo8Var = (xo8) arrayList5.get(i8);
                    if (xo8Var.o && !xo8Var.p) {
                        arrayList4.add(xo8Var);
                    } else if (ap8.i(xo8Var.a, arrayList4) == null) {
                        ap8 ap8Var2 = xo8Var.y;
                        float f3 = ap8Var2.L;
                        RectF rectF2 = xo8Var.c;
                        RectF rectF3 = xo8Var.f;
                        va6 va6Var = xo8Var.r;
                        if (va6Var != null) {
                            va6Var.a();
                            xo8Var.t = false;
                            xo8Var.s = false;
                        }
                        xo8Var.o = true;
                        Object[] objArr2 = rectF2.left - f <= f3;
                        Object[] objArr3 = rectF2.right + f >= ((float) ap8Var2.getMeasuredWidth()) - f3;
                        if (objArr2 != false && objArr3 != false) {
                            objArr3 = false;
                            objArr2 = false;
                        }
                        xo8Var.g.set(rectF2);
                        rectF3.set(rectF2);
                        if (objArr2 == true) {
                            rectF3.right = rectF3.left;
                        } else if (objArr3 == true) {
                            rectF3.left = rectF3.right;
                        } else {
                            byte b3 = xo8Var.a;
                            if ((b3 == 3 || b3 == 2) && ap8Var2.F == 1) {
                                rectF3.left = rectF3.right;
                            } else {
                                float centerX = rectF3.centerX();
                                rectF3.right = centerX;
                                rectF3.left = centerX;
                            }
                        }
                        xo8Var.e.e(true, 0.0f);
                        arrayList4.add(xo8Var);
                    }
                    i8++;
                    f = 1.0f;
                }
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                ap8Var.invalidate();
                return;
            default:
                ap8 ap8Var3 = (ap8) this.b;
                xo8 xo8Var2 = (xo8) this.c;
                zo8 zo8Var = ap8Var3.y;
                byte b4 = xo8Var2.a;
                RectF rectF4 = xo8Var2.d;
                float f4 = rectF4.left;
                float f5 = rectF4.top;
                ProfileActivity profileActivity = ((bp8) zo8Var).b;
                RectF rectF5 = ProfileActivity.Z6;
                profileActivity.u2(f4, f5, b4);
                return;
        }
    }
}
