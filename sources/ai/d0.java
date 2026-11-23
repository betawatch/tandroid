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
import bi.e8;
import bi.f9;
import bi.i6;
import bi.k8;
import bi.l4;
import bi.n3;
import di.k4;
import di.y8;
import fi.b5;
import fi.g5;
import fi.j5;
import fi.s7;
import hi.f4;
import hi.f6;
import hi.g4;
import hi.ga;
import hi.m3;
import hi.nb;
import hi.pa;
import hi.v5;
import hi.w7;
import hi.x7;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        String str;
        String str2;
        int i7;
        int i10 = 0;
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.b;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence == null) {
                    l0Var.getClass();
                    break;
                } else if (l0Var.r == 3) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.equals(l0Var.x())) {
                        if (l0Var.J == null) {
                            l0Var.J = l0Var.x();
                        }
                        l0Var.B(false);
                        l0Var.u(charSequence2);
                        l0Var.w.setRevert(true);
                        break;
                    }
                }
                break;
            case 1:
                ((n3) this.b).a();
                break;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                if (!((Boolean) obj).booleanValue()) {
                    l4.t(2131749595, tL_starGiftUnique);
                    break;
                }
                break;
            case 3:
                ((hi.e) this.b).setLoading(((Boolean) obj).booleanValue());
                break;
            case 4:
                k8 k8Var = (k8) this.b;
                ((Boolean) obj).getClass();
                e8 e8Var = k8Var.d;
                if (e8Var != null) {
                    e8Var.run();
                    break;
                }
                break;
            case 5:
                wg.h.j(((f9) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
            case 6:
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
            case 7:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.b;
                Long l10 = (Long) obj;
                if (!g2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        g2Var.presentFragment(ProfileActivity.D4(l10.longValue()), true);
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(new k(7));
                        break;
                    }
                }
                break;
            case 8:
                ci.o0 o0Var = (ci.o0) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                ci.z0 z0Var = o0Var.b;
                if (!o0Var.F && tL_exportedContactToken != null) {
                    o0Var.r = tL_exportedContactToken;
                    o0Var.s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = o0Var.c.b;
                    if (!TextUtils.equals(z0Var.f, str4) || z0Var.h) {
                        z0Var.f = str4;
                        z0Var.h = false;
                        z0Var.I5 = null;
                        z0Var.J5 = 0;
                    }
                    if (!TextUtils.equals(z0Var.d, str3)) {
                        z0Var.d = str3;
                        Utilities.e.c(new e0(str3, new ci.q0(z0Var, str3, 0)));
                    }
                    z0Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            case 9:
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
            case 10:
                di.h1 h1Var = (di.h1) this.b;
                h1Var.e2.g();
                h1Var.g2.O(true);
                break;
            case 11:
                k4 k4Var = (k4) this.b;
                k4Var.getClass();
                k4Var.s = new Matrix();
                k4Var.w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                k4Var.r = bitmapShader;
                Paint paint = k4Var.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 12:
                y8.a((y8) this.b, (TL_stars.StarGifts) obj);
                break;
            case 13:
                ((w2) this.b).a(((Boolean) obj).booleanValue());
                break;
            case 14:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i11 = starGift.availability_remains;
                        textView.setText(i11 <= 0 ? gd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : gd.K("Gift2Availability4Value", i11, ',', gd.E(starGift.availability_total, ',')));
                        break;
                    } else {
                        if (starGift.availability_remains <= 0) {
                            str = gd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = gd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + gd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        break;
                    }
                }
                break;
            case 15:
                fi.c1 c1Var = (fi.c1) this.b;
                if (((Boolean) obj).booleanValue() && !c1Var.x) {
                    c1Var.n = true;
                    c1Var.J = true;
                    c1Var.u(false);
                    fi.c1.X = c1Var;
                    c1Var.K = NativeInstance.createVideoCapturer(c1Var.I, c1Var.J ? 1 : 0);
                    if (c1Var.F != null) {
                        q5 q5Var = Utilities.e;
                        NativeInstance nativeInstance = c1Var.F;
                        Objects.requireNonNull(nativeInstance);
                        q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        c1Var.N.clear();
                        c1Var.F = null;
                    }
                    c1Var.c();
                    c1Var.k();
                    ks.f(c1Var.e).k(ks.G2, Long.valueOf(c1Var.f.id));
                    break;
                }
                break;
            case 16:
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
            case 17:
                fi.f9 f9Var = (fi.f9) this.b;
                f9Var.k1 = false;
                f9Var.V();
                break;
            case 18:
                b5 b5Var = (b5) obj;
                j5 j5Var = ((g5) this.b).e;
                while (true) {
                    ArrayList arrayList2 = j5Var.H;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        if (b5Var != arrayList2.get(i10)) {
                            ((b5) arrayList2.get(i10)).getClass();
                        }
                        i10++;
                    }
                }
            case 19:
                s7 s7Var = (s7) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                s7Var.p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    s7Var.m = true;
                    s7Var.l = str2;
                    s7Var.f = TextUtils.isEmpty(str2);
                    View view = s7Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = s7Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 20:
                gi.q qVar = (gi.q) this.b;
                String str5 = (String) obj;
                ArrayList arrayList3 = qVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    qVar.i(true);
                }
                org.telegram.messenger.g0.h3(new fi.l4(21, qVar, str5), 120L);
                break;
            case 21:
                ((hi.n) this.b).x(((Integer) obj).intValue());
                break;
            case 22:
                hi.n0 n0Var = (hi.n0) this.b;
                n0Var.k0.n.P = ((Float) obj).floatValue();
                hi.m0 m0Var = n0Var.k0;
                hi.l0 l0Var2 = m0Var.d;
                if (l0Var2 != null) {
                    l0Var2.setVolume(m0Var.n.P);
                    break;
                }
                break;
            case 23:
                hi.a1 a1Var = (hi.a1) this.b;
                d20 d20Var = (d20) obj;
                fj fjVar = a1Var.c;
                if (fjVar != null) {
                    fjVar.r0 = d20Var;
                    MediaController.B().h0(a1Var.c, false, true, false);
                    break;
                }
                break;
            case 24:
                hi.w2 w2Var = (hi.w2) this.b;
                w2Var.h(-1.0f);
                org.telegram.messenger.g0.h3(new hi.c(4, w2Var, (Runnable) obj), 80L);
                break;
            case 25:
                ((m3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                break;
            case 26:
                g4 g4Var = (g4) this.b;
                View view2 = (View) obj;
                i6 i6Var = g4Var.b;
                if (view2 instanceof f4) {
                    i6Var.getClass();
                    int R = RecyclerView.R(view2);
                    n41 G = i6Var.g3.G(R);
                    if (G != null) {
                        f4 f4Var = (f4) view2;
                        f4Var.setPosition(g4Var.b(R));
                        f4Var.b(g4Var.f == G.d, true);
                        boolean contains = g4Var.e.contains(Integer.valueOf(G.d));
                        if (f4Var.h != contains) {
                            f4Var.h = contains;
                            f4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 27:
                i6 i6Var2 = (i6) this.b;
                View view3 = (View) obj;
                if (view3 instanceof f4) {
                    ga gaVar = (ga) i6Var2.o3;
                    gaVar.b.getClass();
                    ((f4) view3).setPosition(gaVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 28:
                pa paVar = (pa) ((v5) this.b);
                nb nbVar = paVar.o2;
                nbVar.Y0.q((fj) obj);
                x7 x7Var = nbVar.L1;
                if (x7Var != null && nbVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(x7Var.y);
                    boolean z10 = !isEmpty;
                    ((ve0) nbVar.k1.c).a(!nbVar.Y0.k(), false);
                    nbVar.k1.setVisibility(0);
                    nbVar.k1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new ch.k(9, paVar, z10)).start();
                }
                if (nbVar.B0.j()) {
                    ArrayList arrayList4 = nbVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i10 < size) {
                            Object obj2 = arrayList4.get(i10);
                            i10++;
                            x7 x7Var2 = ((hi.m0) obj2).n;
                            if (x7Var2 != null && x7Var2.K) {
                                i7 = TextUtils.isEmpty(nbVar.L1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                nbVar.k0(i7, true, true);
                break;
            default:
                w7 w7Var = (w7) obj;
                x51 x51Var = ((f6) this.b).n;
                if (x51Var != null) {
                    x51Var.setHDRInfo(w7Var);
                    break;
                }
                break;
        }
    }
}
