package ai;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.cy;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str;
        String str2;
        int i10;
        u61 u61Var;
        int i11 = 3;
        int i12 = 0;
        int i13 = 0;
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                int i14 = b1.w0[((Integer) obj).intValue()];
                if (b1Var.n0 != i14) {
                    b1Var.n0 = i14;
                    b1Var.f0.setText(LocaleController.formatPluralString("GiftOfferHours", i14 / 3600, new Object[0]));
                }
                b1Var.U(true);
                break;
            case 1:
                a2 a2Var = (a2) this.b;
                a2Var.i0.g();
                a2Var.k0.N(true);
                break;
            case 2:
                l5 l5Var = (l5) this.b;
                l5Var.getClass();
                l5Var.s = new Matrix();
                l5Var.v = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                l5Var.r = bitmapShader;
                Paint paint = l5Var.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 3:
                ga.a((ga) this.b, (TL_stars.StarGifts) obj);
                break;
            case 4:
                ((org.telegram.ui.ActionBar.f3) this.b).dismiss(((Boolean) obj).booleanValue());
                break;
            case 5:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i15 = starGift.availability_remains;
                        textView.setText(i15 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i15, LocaleController.formatNumber(starGift.availability_total, ',')));
                        break;
                    } else {
                        if (starGift.availability_remains <= 0) {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        break;
                    }
                }
                break;
            case 6:
                ci.h1 h1Var = (ci.h1) this.b;
                if (((Boolean) obj).booleanValue() && !h1Var.w) {
                    h1Var.n = true;
                    h1Var.I = true;
                    h1Var.u(false);
                    ci.h1.W = h1Var;
                    h1Var.J = NativeInstance.createVideoCapturer(h1Var.H, h1Var.I ? 1 : 0);
                    if (h1Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = h1Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        h1Var.M.clear();
                        h1Var.E = null;
                    }
                    h1Var.c();
                    h1Var.k();
                    NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.f.id));
                    break;
                }
                break;
            case 7:
                ci.aa aaVar = (ci.aa) this.b;
                aaVar.k1 = false;
                aaVar.P();
                break;
            case 8:
                ci.u5 u5Var = (ci.u5) obj;
                ci.c6 c6Var = ((ci.z5) this.b).e;
                while (true) {
                    ArrayList arrayList = c6Var.G;
                    if (i12 >= arrayList.size()) {
                        break;
                    } else {
                        if (u5Var != arrayList.get(i12)) {
                            ((ci.u5) arrayList.get(i12)).getClass();
                        }
                        i12++;
                    }
                }
            case 9:
                ci.n8 n8Var = (ci.n8) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                n8Var.p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    n8Var.m = true;
                    n8Var.l = str2;
                    n8Var.f = TextUtils.isEmpty(str2);
                    View view = n8Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = n8Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 10:
                di.v vVar = (di.v) this.b;
                String str3 = (String) obj;
                ArrayList arrayList2 = vVar.h;
                if (!arrayList2.contains(str3)) {
                    arrayList2.add(str3);
                    vVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ci.v7(12, vVar, str3), 120L);
                break;
            case 11:
                ((ei.m) this.b).x(((Integer) obj).intValue());
                break;
            case 12:
                ei.e0 e0Var = (ei.e0) this.b;
                e0Var.j0.n.P = ((Float) obj).floatValue();
                ei.d0 d0Var = e0Var.j0;
                ei.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.n.P);
                    break;
                }
                break;
            case 13:
                ei.r0 r0Var = (ei.r0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.c);
                    break;
                }
                break;
            case 14:
                ei.s2 s2Var = (ei.s2) this.b;
                s2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ci.v7(25, s2Var, (Runnable) obj), 80L);
                break;
            case 15:
                ((ei.q3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
                break;
            case 16:
                ei.l4 l4Var = (ei.l4) this.b;
                View view2 = (View) obj;
                ei.g4 g4Var = l4Var.b;
                if (view2 instanceof ei.k4) {
                    g4Var.getClass();
                    int R = RecyclerView.R(view2);
                    h61 G = g4Var.W2.G(R);
                    if (G != null) {
                        ei.k4 k4Var = (ei.k4) view2;
                        k4Var.setPosition(l4Var.b(R));
                        k4Var.b(l4Var.f == G.d, true);
                        boolean contains = l4Var.e.contains(Integer.valueOf(G.d));
                        if (k4Var.f != contains) {
                            k4Var.f = contains;
                            k4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 17:
                ei.g4 g4Var2 = (ei.g4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof ei.k4) {
                    ei.ma maVar = g4Var2.d3;
                    maVar.b.getClass();
                    ((ei.k4) view3).setPosition(maVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 18:
                ei.xa xaVar = (ei.xa) ((ei.f6) this.b);
                ei.vb vbVar = xaVar.A2;
                vbVar.X0.q((MessageObject) obj);
                ei.a8 a8Var = vbVar.K1;
                if (a8Var != null && vbVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(a8Var.y);
                    boolean z10 = !isEmpty;
                    ((bh0) vbVar.j1.c).a(!vbVar.X0.k(), false);
                    vbVar.j1.setVisibility(0);
                    vbVar.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new ah.t(9, xaVar, z10)).start();
                }
                if (vbVar.A0.j()) {
                    ArrayList arrayList3 = vbVar.A0.h;
                    int size = arrayList3.size();
                    while (true) {
                        if (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            ei.a8 a8Var2 = ((ei.d0) obj2).n;
                            if (a8Var2 != null && a8Var2.K) {
                                i10 = TextUtils.isEmpty(vbVar.K1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                vbVar.k0(i10, true, true);
                break;
            case 19:
                ei.z7 z7Var = (ei.z7) obj;
                r71 r71Var = ((ei.r6) this.b).n;
                if (r71Var != null) {
                    r71Var.setHDRInfo(z7Var);
                    break;
                }
                break;
            case 20:
                ei.s7.T((ei.s7) this.b, (Long) obj);
                break;
            case 21:
                ei.j8 j8Var = (ei.j8) this.b;
                rg.n0 n0Var = (rg.n0) obj;
                if (n0Var != null) {
                    j8Var.o0 = n0Var.e;
                    j8Var.n0 = n0Var.f;
                    break;
                } else {
                    j8Var.V();
                    break;
                }
            case 22:
                ((ei.g9) this.b).n.W.H = ((Integer) obj).intValue();
                break;
            case 23:
                ((ei.qa) this.b).h((Utilities.Callback) obj);
                break;
            case 24:
                gi.t tVar = (gi.t) this.b;
                ArrayList arrayList4 = tVar.b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                c71 c71Var = tVar.a;
                if (c71Var != null && (u61Var = c71Var.W2) != null) {
                    u61Var.N(true);
                    break;
                }
                break;
            case 25:
                ((hg.m) this.b).L((TLRPC.User) obj);
                break;
            case 26:
                TLRPC.User user = (TLRPC.User) obj;
                po0 po0Var = (po0) ((hg.h0) this.b);
                lx lxVar = po0Var.K0;
                if (user != null) {
                    cy cyVar = lxVar.J0;
                    if (cyVar != null) {
                        cyVar.I3();
                    }
                    MessagesController.getInstance(lxVar.H0).openApp(user, 0);
                    po0Var.R(user.id, user);
                    break;
                }
                break;
            case 27:
                hi.f fVar = (hi.f) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                boolean z11 = arrayList6 == null || arrayList6.isEmpty();
                fVar.h = arrayList5;
                c71 c71Var2 = fVar.e;
                if (c71Var2 != null) {
                    c71Var2.W2.N(z11);
                    break;
                }
                break;
            case 28:
                ig.m mVar = (ig.m) this.b;
                boolean z12 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (mVar.F != z12) {
                    mVar.F = z12;
                    if (!z12) {
                        mVar.a.x0(0);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.forEachViews((RecyclerView) ((ig.i0) this.b).s, (Utilities.Callback<View>) new ci.e(i11));
                break;
        }
    }
}
