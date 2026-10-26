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
import bi.ca;
import bi.g5;
import bi.x1;
import di.b6;
import di.k8;
import di.t5;
import di.y5;
import di.y9;
import fi.c9;
import fi.e6;
import fi.f4;
import fi.f8;
import fi.ia;
import fi.j4;
import fi.k4;
import fi.ma;
import fi.o3;
import fi.o6;
import fi.o7;
import fi.q2;
import fi.sb;
import fi.ta;
import fi.v7;
import fi.w7;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.K1.y) == false) goto L48;
     */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        String str;
        String str2;
        j71 j71Var;
        int i10 = 2;
        int i11 = 0;
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (yVar.y == null) {
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                        yVar.F = true;
                    } else {
                        yVar.y = tL_messages_stickerSet;
                    }
                    yVar.e();
                    break;
                }
                break;
            case 1:
                r2 r2Var = (r2) this.b;
                Long l4 = (Long) obj;
                if (!r2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        r2Var.presentFragment(ProfileActivity.t4(l4.longValue()), true);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new ag.c(1));
                        break;
                    }
                }
                break;
            case 2:
                f1 f1Var = (f1) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                t1 t1Var = f1Var.b;
                if (!f1Var.E && tL_exportedContactToken != null) {
                    f1Var.r = tL_exportedContactToken;
                    f1Var.s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = f1Var.c.b;
                    if (!TextUtils.equals(t1Var.f, str4) || t1Var.h) {
                        t1Var.f = str4;
                        t1Var.h = false;
                        t1Var.I5 = null;
                        t1Var.J5 = 0;
                    }
                    if (!TextUtils.equals(t1Var.d, str3)) {
                        t1Var.d = str3;
                        Utilities.globalQueue.postRunnable(new j1(str3, new i1(t1Var, str3, 0)));
                    }
                    t1Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            case 3:
                t1 t1Var2 = (t1) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    t1Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        t1Var2.q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                t1Var2.invalidate();
                break;
            case 4:
                bi.b1 b1Var = (bi.b1) this.b;
                int i12 = bi.b1.x0[((Integer) obj).intValue()];
                if (b1Var.o0 != i12) {
                    b1Var.o0 = i12;
                    b1Var.g0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                b1Var.T(true);
                break;
            case 5:
                x1 x1Var = (x1) this.b;
                x1Var.i0.g();
                x1Var.k0.O(true);
                break;
            case 6:
                g5 g5Var = (g5) this.b;
                g5Var.getClass();
                g5Var.s = new Matrix();
                g5Var.v = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                g5Var.r = bitmapShader;
                Paint paint = g5Var.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 7:
                ca.a((ca) this.b, (TL_stars.StarGifts) obj);
                break;
            case 8:
                ((k3) this.b).dismiss(((Boolean) obj).booleanValue());
                break;
            case 9:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i13 = starGift.availability_remains;
                        textView.setText(i13 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i13, LocaleController.formatNumber(starGift.availability_total, ',')));
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
            case 10:
                di.h1 h1Var = (di.h1) this.b;
                if (((Boolean) obj).booleanValue() && !h1Var.w) {
                    h1Var.n = true;
                    h1Var.I = true;
                    h1Var.u(false);
                    di.h1.W = h1Var;
                    h1Var.J = NativeInstance.createVideoCapturer(h1Var.H, h1Var.I ? 1 : 0);
                    if (h1Var.E != null) {
                        DispatchQueue2 dispatchQueue2 = Utilities.globalQueue;
                        NativeInstance nativeInstance = h1Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue2.postRunnable(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        h1Var.M.clear();
                        h1Var.E = null;
                    }
                    h1Var.c();
                    h1Var.k();
                    NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.f.id));
                    break;
                }
                break;
            case 11:
                y9 y9Var = (y9) this.b;
                y9Var.k1 = false;
                y9Var.P();
                break;
            case 12:
                t5 t5Var = (t5) obj;
                b6 b6Var = ((y5) this.b).e;
                while (true) {
                    ArrayList arrayList2 = b6Var.G;
                    if (i11 >= arrayList2.size()) {
                        break;
                    } else {
                        if (t5Var != arrayList2.get(i11)) {
                            ((t5) arrayList2.get(i11)).getClass();
                        }
                        i11++;
                    }
                }
            case 13:
                k8 k8Var = (k8) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                k8Var.p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    k8Var.m = true;
                    k8Var.l = str2;
                    k8Var.f = TextUtils.isEmpty(str2);
                    View view = k8Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = k8Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 14:
                ei.v vVar = (ei.v) this.b;
                String str5 = (String) obj;
                ArrayList arrayList3 = vVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    vVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new e2.q0(i10, vVar, str5), 120L);
                break;
            case 15:
                ((fi.m) this.b).x(((Integer) obj).intValue());
                break;
            case 16:
                fi.e0 e0Var = (fi.e0) this.b;
                e0Var.j0.n.P = ((Float) obj).floatValue();
                fi.d0 d0Var = e0Var.j0;
                fi.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.n.P);
                    break;
                }
                break;
            case 17:
                fi.r0 r0Var = (fi.r0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.c);
                    break;
                }
                break;
            case 18:
                q2 q2Var = (q2) this.b;
                q2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new e2.q0(6, q2Var, (Runnable) obj), 80L);
                break;
            case 19:
                ((o3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                break;
            case 20:
                k4 k4Var = (k4) this.b;
                View view2 = (View) obj;
                f4 f4Var = k4Var.b;
                if (view2 instanceof j4) {
                    f4Var.getClass();
                    int R = RecyclerView.R(view2);
                    t61 G = f4Var.g3.G(R);
                    if (G != null) {
                        j4 j4Var = (j4) view2;
                        j4Var.setPosition(k4Var.b(R));
                        j4Var.b(k4Var.f == G.d, true);
                        boolean contains = k4Var.e.contains(Integer.valueOf(G.d));
                        if (j4Var.h != contains) {
                            j4Var.h = contains;
                            j4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 21:
                f4 f4Var2 = (f4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof j4) {
                    ia iaVar = f4Var2.n3;
                    iaVar.b.getClass();
                    ((j4) view3).setPosition(iaVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 22:
                ta taVar = (ta) ((e6) this.b);
                sb sbVar = taVar.p2;
                sbVar.X0.q((MessageObject) obj);
                w7 w7Var = sbVar.K1;
                if (w7Var != null && sbVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(w7Var.y);
                    boolean z10 = !isEmpty;
                    ((dh0) sbVar.j1.c).a(!sbVar.X0.k(), false);
                    sbVar.j1.setVisibility(0);
                    sbVar.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new bh.n(9, taVar, z10)).start();
                }
                if (sbVar.A0.j()) {
                    ArrayList arrayList4 = sbVar.A0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            w7 w7Var2 = ((fi.d0) obj2).n;
                            if (w7Var2 != null && w7Var2.K) {
                                break;
                            }
                        }
                    }
                }
                i10 = -1;
                sbVar.k0(i10, true, true);
                break;
            case 23:
                v7 v7Var = (v7) obj;
                h81 h81Var = ((o6) this.b).n;
                if (h81Var != null) {
                    h81Var.setHDRInfo(v7Var);
                    break;
                }
                break;
            case 24:
                o7.P((o7) this.b, (Long) obj);
                break;
            case 25:
                f8 f8Var = (f8) this.b;
                sg.o0 o0Var = (sg.o0) obj;
                if (o0Var != null) {
                    f8Var.o0 = o0Var.e;
                    f8Var.n0 = o0Var.f;
                    break;
                } else {
                    f8Var.U();
                    break;
                }
            case 26:
                ((c9) this.b).n.W.H = ((Integer) obj).intValue();
                break;
            case 27:
                ((ma) this.b).h((Utilities.Callback) obj);
                break;
            case 28:
                hi.a0 a0Var = (hi.a0) this.b;
                ArrayList arrayList5 = a0Var.b;
                arrayList5.clear();
                arrayList5.addAll((ArrayList) obj);
                r71 r71Var = a0Var.a;
                if (r71Var != null && (j71Var = r71Var.g3) != null) {
                    j71Var.O(true);
                    break;
                }
                break;
            default:
                ((ig.n) this.b).M((TLRPC.User) obj);
                break;
        }
    }
}
