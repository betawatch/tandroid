package ai;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.s5;
import bi.u6;
import bi.v3;
import bi.y5;
import di.h4;
import di.v8;
import fi.c5;
import fi.f6;
import fi.h5;
import fi.i9;
import fi.k5;
import fi.v7;
import hi.c7;
import hi.d3;
import hi.d7;
import hi.l9;
import hi.m5;
import hi.sa;
import hi.u9;
import hi.v6;
import hi.w3;
import hi.x3;
import hi.x5;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.p5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        String str;
        String str2;
        int i7;
        int i10 = 3;
        int i11 = 0;
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.b;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence == null) {
                    m0Var.getClass();
                    break;
                } else if (m0Var.r == 3) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.equals(m0Var.t())) {
                        if (m0Var.J == null) {
                            m0Var.J = m0Var.t();
                        }
                        m0Var.v(false);
                        m0Var.p(charSequence2);
                        m0Var.w.setRevert(true);
                        break;
                    }
                }
                break;
            case 1:
                ((bi.n2) this.b).a();
                break;
            case 2:
                y5 y5Var = (y5) this.b;
                ((Boolean) obj).getClass();
                s5 s5Var = y5Var.d;
                if (s5Var != null) {
                    s5Var.run();
                    break;
                }
                break;
            case 3:
                wg.h.j(((u6) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
            case 4:
                ci.s sVar = (ci.s) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (sVar.E == null) {
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                        sVar.G = true;
                    } else {
                        sVar.E = tL_messages_stickerSet;
                    }
                    sVar.e();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.b;
                Long l10 = (Long) obj;
                if (!e2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        e2Var.presentFragment(ProfileActivity.C4(l10.longValue()), true);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new o(6));
                        break;
                    }
                }
                break;
            case 6:
                ci.n0 n0Var = (ci.n0) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                ci.z0 z0Var = n0Var.b;
                if (!n0Var.F && tL_exportedContactToken != null) {
                    n0Var.r = tL_exportedContactToken;
                    n0Var.s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = n0Var.c.b;
                    if (!TextUtils.equals(z0Var.f, str4) || z0Var.h) {
                        z0Var.f = str4;
                        z0Var.h = false;
                        z0Var.I5 = null;
                        z0Var.J5 = 0;
                    }
                    if (!TextUtils.equals(z0Var.d, str3)) {
                        z0Var.d = str3;
                        Utilities.e.c(new g0(str3, new ci.q0(z0Var, str3, 0)));
                    }
                    z0Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            case 7:
                ci.z0 z0Var2 = (ci.z0) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    z0Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z0Var2.q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                z0Var2.invalidate();
                break;
            case 8:
                di.p0 p0Var = (di.p0) this.b;
                int i12 = di.p0.t2[((Integer) obj).intValue()];
                if (p0Var.k2 != i12) {
                    p0Var.k2 = i12;
                    p0Var.c2.setText(hd.G(i12 / 3600, "GiftOfferHours", new Object[0]));
                }
                p0Var.e1(true);
                break;
            case 9:
                di.i1 i1Var = (di.i1) this.b;
                i1Var.e2.g();
                i1Var.g2.O(true);
                break;
            case 10:
                h4 h4Var = (h4) this.b;
                h4Var.getClass();
                h4Var.s = new Matrix();
                h4Var.w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                h4Var.r = bitmapShader;
                Paint paint = h4Var.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 11:
                v8.a((v8) this.b, (TL_stars.StarGifts) obj);
                break;
            case 12:
                ((org.telegram.ui.ActionBar.u2) this.b).a(((Boolean) obj).booleanValue());
                break;
            case 13:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i13 = starGift.availability_remains;
                        textView.setText(i13 <= 0 ? hd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : hd.K("Gift2Availability4Value", i13, ',', hd.E(starGift.availability_total, ',')));
                        break;
                    } else {
                        if (starGift.availability_remains <= 0) {
                            str = hd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = hd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + hd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        break;
                    }
                }
                break;
            case 14:
                fi.e1 e1Var = (fi.e1) this.b;
                if (((Boolean) obj).booleanValue() && !e1Var.x) {
                    e1Var.n = true;
                    e1Var.J = true;
                    e1Var.u(false);
                    fi.e1.X = e1Var;
                    e1Var.K = NativeInstance.createVideoCapturer(e1Var.I, e1Var.J ? 1 : 0);
                    if (e1Var.F != null) {
                        p5 p5Var = Utilities.e;
                        NativeInstance nativeInstance = e1Var.F;
                        Objects.requireNonNull(nativeInstance);
                        p5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, i10));
                        e1Var.N.clear();
                        e1Var.F = null;
                    }
                    e1Var.c();
                    e1Var.k();
                    ns.f(e1Var.e).k(ns.G2, Long.valueOf(e1Var.f.id));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (u0Var != null) {
                    u0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 16:
                i9 i9Var = (i9) this.b;
                i9Var.k1 = false;
                i9Var.V();
                break;
            case 17:
                c5 c5Var = (c5) obj;
                k5 k5Var = ((h5) this.b).e;
                while (true) {
                    ArrayList arrayList2 = k5Var.H;
                    if (i11 >= arrayList2.size()) {
                        break;
                    } else {
                        if (c5Var != arrayList2.get(i11)) {
                            ((c5) arrayList2.get(i11)).getClass();
                        }
                        i11++;
                    }
                }
            case 18:
                v7 v7Var = (v7) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                v7Var.p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    v7Var.m = true;
                    v7Var.l = str2;
                    v7Var.f = TextUtils.isEmpty(str2);
                    View view = v7Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = v7Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 19:
                gi.q qVar = (gi.q) this.b;
                String str5 = (String) obj;
                ArrayList arrayList3 = qVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    qVar.i(true);
                }
                org.telegram.messenger.g0.i3(new f6(17, qVar, str5), 120L);
                break;
            case 20:
                ((hi.m) this.b).x(((Integer) obj).intValue());
                break;
            case 21:
                hi.e0 e0Var = (hi.e0) this.b;
                e0Var.k0.n.P = ((Float) obj).floatValue();
                hi.d0 d0Var = e0Var.k0;
                hi.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.n.P);
                    break;
                }
                break;
            case 22:
                hi.r0 r0Var = (hi.r0) this.b;
                g20 g20Var = (g20) obj;
                gj gjVar = r0Var.c;
                if (gjVar != null) {
                    gjVar.r0 = g20Var;
                    MediaController.B().h0(r0Var.c, false, true, false);
                    break;
                }
                break;
            case 23:
                hi.n2 n2Var = (hi.n2) this.b;
                n2Var.h(-1.0f);
                org.telegram.messenger.g0.i3(new f6(29, n2Var, (Runnable) obj), 80L);
                break;
            case 24:
                ((d3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                break;
            case 25:
                x3 x3Var = (x3) this.b;
                View view2 = (View) obj;
                v3 v3Var = x3Var.b;
                if (view2 instanceof w3) {
                    v3Var.getClass();
                    int R = RecyclerView.R(view2);
                    b41 G = v3Var.g3.G(R);
                    if (G != null) {
                        w3 w3Var = (w3) view2;
                        w3Var.setPosition(x3Var.b(R));
                        w3Var.b(x3Var.f == G.d, true);
                        boolean contains = x3Var.e.contains(Integer.valueOf(G.d));
                        if (w3Var.h != contains) {
                            w3Var.h = contains;
                            w3Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 26:
                v3 v3Var2 = (v3) this.b;
                View view3 = (View) obj;
                if (view3 instanceof w3) {
                    l9 l9Var = (l9) v3Var2.o3;
                    l9Var.b.getClass();
                    ((w3) view3).setPosition(l9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 27:
                u9 u9Var = (u9) ((m5) this.b);
                sa saVar = u9Var.k2;
                saVar.Y0.q((gj) obj);
                d7 d7Var = saVar.L1;
                if (d7Var != null && saVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(d7Var.y);
                    boolean z10 = !isEmpty;
                    ((ke0) saVar.k1.c).a(!saVar.Y0.k(), false);
                    saVar.k1.setVisibility(0);
                    saVar.k1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new q(10, u9Var, z10)).start();
                }
                if (saVar.B0.j()) {
                    ArrayList arrayList4 = saVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            d7 d7Var2 = ((hi.d0) obj2).n;
                            if (d7Var2 != null && d7Var2.K) {
                                i7 = TextUtils.isEmpty(saVar.L1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                saVar.k0(i7, true, true);
                break;
            case 28:
                c7 c7Var = (c7) obj;
                k51 k51Var = ((x5) this.b).n;
                if (k51Var != null) {
                    k51Var.setHDRInfo(c7Var);
                    break;
                }
                break;
            default:
                v6 v6Var = (v6) this.b;
                Long l11 = (Long) obj;
                v6Var.A2 = false;
                TLRPC.User a22 = l11 != null ? np.s1(v6Var.a).a2(l11) : null;
                v6Var.z2 = a22;
                v6Var.B2 = a22 == null;
                if (a22 != null) {
                    v6Var.g1();
                    break;
                }
                break;
        }
    }
}
