// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Point;
import android.graphics.Shader;
import android.net.Uri;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.p;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class l3c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l3c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLObject Z1;
        TLObject Z12;
        u3b u3bVar;
        xl3 xl3Var;
        int i;
        byte b = 25;
        ArrayList arrayList = null;
        byte b2 = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((p3c) this.b).s0((String) this.c);
                break;
            case 1:
                p3c p3cVar = (p3c) this.b;
                Runnable runnable = (Runnable) this.c;
                sj2[] sj2VarArr = p3cVar.x.f;
                int length = sj2VarArr.length;
                while (i2 < length) {
                    sj2VarArr[i2].D(0.0f);
                    i2++;
                }
                runnable.run();
                break;
            case 2:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i3 = UndoView.j0;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new p((TLRPC.PaymentReceipt) tLObject));
                    break;
                }
                break;
            case 3:
                ((c4c) this.b).E.onClick((zgb) this.c);
                break;
            case 4:
                y6c y6cVar = (y6c) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                y6cVar.getClass();
                if (tLObject2 != null) {
                    y6cVar.q0 = ((TLRPC.TL_defaultHistoryTTL) tLObject2).period / 60;
                    y6cVar.getNotificationCenter().k(kk7.u5, new Object[0]);
                    y6cVar.r0 = false;
                    y6cVar.s0 = System.currentTimeMillis();
                    break;
                }
                break;
            case 5:
                c7c c7cVar = (c7c) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList2 = c7cVar.e;
                ArrayList arrayList3 = c7cVar.d;
                if (tLObject3 instanceof TLRPC.messages_Chats) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.messages_Chats) tLObject3).chats);
                }
                na7.q1(c7cVar.a).V3(arrayList3, false);
                c7cVar.c = false;
                c7cVar.b = true;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    ((Runnable) obj).run();
                }
                arrayList2.clear();
                break;
            case 6:
                s7c s7cVar = (s7c) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList4 = s7cVar.e2;
                arrayList4.clear();
                s7cVar.q2 = -1;
                if (tLObject4 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject4;
                    na7 q1 = na7.q1(s7cVar.a);
                    q1.b4(tL_contacts_found.users, false);
                    q1.V3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList5 = tL_contacts_found.my_results;
                    int size2 = arrayList5.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        TLRPC.Peer peer = arrayList5.get(i4);
                        i4++;
                        long n = cf3.n(peer);
                        if (!hashSet.contains(Long.valueOf(n)) && (Z12 = q1.Z1(n)) != null) {
                            arrayList4.add(Z12);
                            hashSet.add(Long.valueOf(n));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList6 = tL_contacts_found.results;
                    int size3 = arrayList6.size();
                    while (i2 < size3) {
                        TLRPC.Peer peer2 = arrayList6.get(i2);
                        i2++;
                        long n2 = cf3.n(peer2);
                        if (!hashSet.contains(Long.valueOf(n2)) && (Z1 = q1.Z1(n2)) != null) {
                            arrayList4.add(Z1);
                            hashSet.add(Long.valueOf(n2));
                        }
                    }
                }
                s7cVar.g1(true, true);
                break;
            case 7:
                p7a p7aVar = (p7a) this.b;
                t56 t56Var = (t56) this.c;
                if (p7aVar.a instanceof h2) {
                    t56Var.cancel(false);
                    break;
                }
                break;
            case 8:
                ((VideoAds) this.b).lambda$showPremium$19((jh8) this.c);
                break;
            case 9:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                break;
            case 10:
                ((VideoAds) this.b).lambda$show$16((p8c) this.c);
                break;
            case 11:
                cb9.Y0((Context) this.b, null, false, (e53) this.c, null);
                break;
            case 12:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                break;
            case 13:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                break;
            case 14:
                ((VideoFileRenderer) this.b).lambda$onFrame$0((VideoFrame) this.c);
                break;
            case 15:
                ((VideoFileRenderer) this.b).lambda$release$2((CountDownLatch) this.c);
                break;
            case 16:
                lbc lbcVar = (lbc) this.b;
                j54 j54Var = (j54) this.c;
                Throwable cause = j54Var.getCause();
                if (!(cause instanceof hk6) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = lbcVar.n;
                    if (textureView != null && ((!lbcVar.F && (cause instanceof jk6)) || (cause instanceof acb))) {
                        lbcVar.F = true;
                        if (lbcVar.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(lbcVar.n);
                                viewGroup.removeView(lbcVar.n);
                                viewGroup.addView(lbcVar.n, indexOfChild);
                            }
                            do3 do3Var = lbcVar.b;
                            if (do3Var == null) {
                                y54 y54Var = lbcVar.d;
                                TextureView textureView2 = lbcVar.n;
                                y54Var.y1();
                                if (textureView2 != null && textureView2 == y54Var.X) {
                                    y54Var.y1();
                                    y54Var.i1();
                                    y54Var.q1(null);
                                    y54Var.f1(0, 0);
                                }
                                lbcVar.d.s1(lbcVar.n);
                                ArrayList arrayList7 = lbcVar.O;
                                if (arrayList7 != null) {
                                    lbcVar.j0(arrayList7, lbcVar.P);
                                } else {
                                    boolean z = lbcVar.V;
                                    Uri uri = lbcVar.R;
                                    String str = lbcVar.T;
                                    if (z) {
                                        lbcVar.k0(uri, str, lbcVar.S, lbcVar.U);
                                    } else {
                                        lbcVar.i0(uri, str);
                                    }
                                }
                                lbcVar.g0();
                                break;
                            } else {
                                do3Var.postRunnable(new cib(lbcVar, (byte) 29));
                                break;
                            }
                        }
                    } else {
                        lbcVar.K.onError(lbcVar, j54Var);
                        break;
                    }
                } else {
                    fa4.g(j54Var, true);
                    fa4.d("av1 codec failed, we think this codec is not supported");
                    na7.c1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = lbc.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList8 = lbcVar.O;
                    if (arrayList8 != null) {
                        int i5 = 0;
                        while (i5 < arrayList8.size()) {
                            hbc hbcVar = (hbc) arrayList8.get(i5);
                            int i6 = 0;
                            while (true) {
                                ArrayList arrayList9 = hbcVar.d;
                                if (i6 < arrayList9.size()) {
                                    jbc jbcVar = (jbc) arrayList9.get(i6);
                                    if (!TextUtils.isEmpty(jbcVar.m) && !lbc.C0(jbcVar.m)) {
                                        arrayList9.remove(i6);
                                        i6--;
                                    }
                                    i6++;
                                } else {
                                    if (arrayList9.isEmpty()) {
                                        arrayList8.remove(i5);
                                        i5--;
                                    }
                                    i5++;
                                }
                            }
                        }
                        arrayList = arrayList8;
                    }
                    lbcVar.O = arrayList;
                    if (arrayList != null) {
                        lbcVar.j0(arrayList, lbcVar.P);
                        break;
                    }
                }
                break;
            case 17:
                ((lbc) ((xi9) this.b).f).L.o(true, (float[]) this.c);
                break;
            case 18:
                mbc mbcVar = (mbc) this.b;
                if (mbcVar.b == ((u3b[]) this.c)[0]) {
                    if (na7.c1().getBoolean("asr_video_captions", false) && (xl3Var = (u3bVar = mbcVar.b).f) != null && (DictationAsr.A((vl3) xl3Var.b) || DictationAsr.y((vl3) u3bVar.f.b))) {
                        mbcVar.b();
                    }
                    mbcVar.a.a();
                    break;
                }
                break;
            case 19:
                mbc mbcVar2 = (mbc) this.b;
                if (mbcVar2.b == ((u3b) this.c) && mbcVar2.d) {
                    mbcVar2.d();
                    break;
                }
                break;
            case 20:
                v8b v8bVar = (v8b) this.b;
                uj2 uj2Var = (uj2) this.c;
                xbc xbcVar = (xbc) v8bVar.c;
                String str2 = g8c.a;
                ((t54) xbcVar).a.G.V(uj2Var);
                break;
            case 21:
                v8b v8bVar2 = (v8b) this.b;
                icc iccVar = (icc) this.c;
                xbc xbcVar2 = (xbc) v8bVar2.c;
                String str3 = g8c.a;
                y54 y54Var2 = ((t54) xbcVar2).a;
                y54Var2.k0 = iccVar;
                y54Var2.m.e(25, new j93(iccVar));
                break;
            case 22:
                v8b v8bVar3 = (v8b) this.b;
                Exception exc = (Exception) this.c;
                xbc xbcVar3 = (xbc) v8bVar3.c;
                String str4 = g8c.a;
                l93 l93Var = ((t54) xbcVar3).a.s;
                tj U = l93Var.U();
                l93Var.V(U, 1030, new jz2(U, (Object) exc, (byte) 10));
                break;
            case 23:
                v8b v8bVar4 = (v8b) this.b;
                String str5 = (String) this.c;
                xbc xbcVar4 = (xbc) v8bVar4.c;
                String str6 = g8c.a;
                l93 l93Var2 = ((t54) xbcVar4).a.s;
                tj U2 = l93Var2.U();
                l93Var2.V(U2, 1019, new jz2(U2, (Object) str5, (byte) 17));
                break;
            case 24:
                acc accVar = (acc) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                ba4.G(accVar.s);
                gl.c3(new l3c(accVar, ba4.I(document), b));
                break;
            case 25:
                acc accVar2 = (acc) this.b;
                accVar2.e = (File) this.c;
                accVar2.a();
                break;
            case 26:
                ecc eccVar = (ecc) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (eccVar.x != null) {
                        Bitmap bitmap2 = eccVar.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        eccVar.w = eccVar.x;
                    }
                    eccVar.x = bitmap;
                    Bitmap bitmap3 = eccVar.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    eccVar.H = bitmapShader;
                    bitmapShader.setLocalMatrix(eccVar.M);
                    eccVar.K.setShader(eccVar.H);
                    eccVar.invalidate();
                    int L = gl.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i = L;
                    }
                    ViewGroup.LayoutParams layoutParams = eccVar.getLayoutParams();
                    if (eccVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i) {
                        layoutParams.width = L;
                        layoutParams.height = i;
                        eccVar.setVisibility(0);
                        eccVar.requestLayout();
                    }
                }
                eccVar.f = null;
                break;
            case 27:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                break;
            case 28:
                hgc hgcVar = (hgc) this.b;
                hgcVar.V.a(new qfc(hgcVar, (VoIPService) this.c, b2), true);
                break;
            default:
                hgc hgcVar2 = (hgc) this.b;
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                xgc.T = false;
                xgc.b();
                ViewPropertyAnimator duration = hgcVar2.L.animate().setDuration(150L);
                s33 s33Var = s33.f;
                duration.setInterpolator(s33Var).start();
                hgcVar2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(s33Var).start();
                hgcVar2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(s33Var).start();
                hgcVar2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(s33Var).start();
                valueAnimator.addListener(new xfc(hgcVar2, (byte) 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(s33Var);
                valueAnimator.start();
                break;
        }
    }
}
