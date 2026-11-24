// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ b5a(e34 e34Var, vo4 vo4Var, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z) {
        this.a = (byte) 8;
        this.c = e34Var;
        this.e = vo4Var;
        this.d = tLObject;
        this.f = stickerSet;
        this.h = document;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        ArrayList arrayList;
        LongSparseIntArray longSparseIntArray;
        vh6 vh6Var;
        vh6 vh6Var2;
        SparseIntArray sparseIntArray;
        vh6 vh6Var3;
        boolean z;
        int i;
        vh6 vh6Var4;
        ArrayList arrayList2;
        int i2;
        vh6 vh6Var5;
        long j;
        vh6 vh6Var6;
        b5a b5aVar = this;
        oc7 oc7Var = (oc7) b5aVar.c;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) b5aVar.d;
        vh6 vh6Var7 = (vh6) b5aVar.e;
        vh6 vh6Var8 = (vh6) b5aVar.f;
        LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) b5aVar.h;
        ArrayList arrayList3 = oc7Var.y;
        SparseIntArray sparseIntArray2 = oc7Var.S1;
        vh6 vh6Var9 = oc7Var.S;
        vh6 vh6Var10 = oc7Var.T;
        SparseArray sparseArray = oc7Var.V;
        b3c b3cVar = oc7Var.i4;
        vh6 vh6Var11 = oc7Var.R;
        Long l = 0L;
        long j2 = 0;
        oc7Var.d4(tL_messages_dialogs.users, true);
        oc7Var.X3(tL_messages_dialogs.chats, true);
        int i3 = 0;
        while (i3 < vh6Var7.m()) {
            Long l2 = l;
            long j3 = vh6Var7.j(i3);
            if (e21.a) {
                longSparseIntArray = longSparseIntArray2;
                fc4.b("processDialogsUpdate " + j3);
            } else {
                longSparseIntArray = longSparseIntArray2;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) vh6Var7.n(i3);
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) vh6Var11.f(j3);
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = (ArrayList) vh6Var8.f(dialog.id);
            boolean z2 = b5aVar.b;
            if (dialog2 == null) {
                if (e21.a) {
                    fc4.b("processDialogsUpdate dialog null");
                }
                vh6Var = vh6Var7;
                sparseIntArray2.put(dialog.folder_id, sparseIntArray2.get(dialog.folder_id, 0) + 1);
                vh6Var11.k(dialog, j3);
                vh6Var9.k(arrayList5, j3);
                if (arrayList5 == null || arrayList5.size() <= 0) {
                    vh6Var2 = vh6Var8;
                    if (z2) {
                        oc7Var.H(dialog, null, j2);
                    }
                    if (e21.a) {
                        fc4.b("processDialogsUpdate new message is null");
                    }
                } else {
                    int i4 = 0;
                    while (i4 < arrayList5.size()) {
                        k47 k47Var = (k47) arrayList5.get(i4);
                        if (k47Var != null) {
                            vh6Var6 = vh6Var8;
                            if (k47Var.k.peer_id.channel_id == j2) {
                                sparseArray.put(k47Var.e1(), k47Var);
                                oc7Var.O = Math.min(oc7Var.O, k47Var.k.date);
                                long j4 = k47Var.k.random_id;
                                if (j4 != j2) {
                                    vh6Var10.k(k47Var, j4);
                                }
                            }
                        } else {
                            vh6Var6 = vh6Var8;
                        }
                        i4++;
                        vh6Var8 = vh6Var6;
                    }
                    vh6Var2 = vh6Var8;
                    if (e21.a) {
                        fc4.b("processDialogsUpdate new message not null");
                    }
                }
                if (b3cVar.u(j3)) {
                    b3cVar.d(j3);
                }
                sparseIntArray = sparseIntArray2;
                vh6Var4 = vh6Var9;
                i = i3;
            } else {
                vh6Var = vh6Var7;
                vh6Var2 = vh6Var8;
                if (e21.a) {
                    fc4.b("processDialogsUpdate dialog not null");
                }
                dialog2.unread_count = dialog.unread_count;
                int i5 = dialog2.unread_mentions_count;
                int i6 = dialog.unread_mentions_count;
                sparseIntArray = sparseIntArray2;
                if (i5 != i6) {
                    dialog2.unread_mentions_count = i6;
                    vh6 vh6Var12 = vh6Var9;
                    if (oc7Var.n0.contains(Long.valueOf(dialog2.id))) {
                        vh6Var3 = vh6Var12;
                        oc7Var.getNotificationCenter().k(nm7.e1, Long.valueOf(dialog2.id), l2, Integer.valueOf(dialog2.unread_mentions_count));
                    } else {
                        vh6Var3 = vh6Var12;
                    }
                } else {
                    vh6Var3 = vh6Var9;
                }
                int i7 = dialog2.unread_reactions_count;
                int i8 = dialog.unread_reactions_count;
                if (i7 != i8) {
                    dialog2.unread_reactions_count = i8;
                    oc7Var.getNotificationCenter().k(nm7.c5, Long.valueOf(dialog2.id), l2, Integer.valueOf(dialog2.unread_reactions_count), null);
                }
                int i9 = dialog2.unread_poll_votes_count;
                int i10 = dialog.unread_poll_votes_count;
                if (i9 != i10) {
                    dialog2.unread_poll_votes_count = i10;
                    oc7Var.getNotificationCenter().k(nm7.d5, Long.valueOf(dialog2.id), l2, Integer.valueOf(dialog2.unread_poll_votes_count), null);
                }
                vh6 vh6Var13 = vh6Var3;
                ArrayList arrayList6 = (ArrayList) vh6Var13.f(j3);
                for (int i11 = 0; arrayList6 != null && i11 < arrayList6.size(); i11++) {
                    if (arrayList6.get(i11) != null && ((k47) arrayList6.get(i11)).Z) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (e21.a) {
                    i = i3;
                    StringBuilder sb = new StringBuilder("processDialogsUpdate oldMsgs (count = ");
                    sb.append(arrayList6 == null ? "null" : Integer.valueOf(arrayList6.size()));
                    sb.append(") old top_message = ");
                    sb.append(dialog2.top_message);
                    sb.append(" new top_message = ");
                    sb.append(dialog.top_message);
                    sb.append("  unread_count =");
                    sb.append(dialog2.unread_count);
                    sb.append(" fromCache=");
                    sb.append(z2);
                    fc4.b(sb.toString());
                    fc4.b("processDialogsUpdate oldMsgDeleted " + z);
                } else {
                    i = i3;
                }
                if (arrayList6 == null || dialog2.top_message > 0) {
                    if (!z && dialog.top_message <= dialog2.top_message) {
                        if ((arrayList6 == null) == (arrayList5 == null) && (arrayList6 == null || arrayList5 == null || arrayList6.size() == arrayList5.size())) {
                            vh6Var4 = vh6Var13;
                            if (z2 && arrayList5 == null) {
                                j = 0;
                                oc7Var.H(dialog, null, 0L);
                                if (!e21.a) {
                                    fc4.b("processDialogsUpdate new messages are null");
                                }
                                i3 = i + 1;
                                b5aVar = this;
                                j2 = j;
                                l = l2;
                                longSparseIntArray2 = longSparseIntArray;
                                arrayList3 = arrayList4;
                                vh6Var7 = vh6Var;
                                vh6Var8 = vh6Var2;
                                sparseIntArray2 = sparseIntArray;
                                vh6Var9 = vh6Var4;
                            }
                        }
                    }
                    vh6Var11.k(dialog, j3);
                    vh6Var13.k(arrayList5, j3);
                    int i12 = 0;
                    while (arrayList6 != null && i12 < arrayList6.size()) {
                        k47 k47Var2 = (k47) arrayList6.get(i12);
                        if (k47Var2 != null) {
                            i2 = i12;
                            vh6Var5 = vh6Var13;
                            if (k47Var2.k.peer_id.channel_id == 0) {
                                sparseArray.remove(k47Var2.e1());
                                long j5 = k47Var2.k.random_id;
                                if (j5 != 0) {
                                    vh6Var10.l(j5);
                                }
                            }
                        } else {
                            i2 = i12;
                            vh6Var5 = vh6Var13;
                        }
                        i12 = i2 + 1;
                        vh6Var13 = vh6Var5;
                    }
                    vh6Var4 = vh6Var13;
                    if (arrayList5 != null) {
                        int i13 = 0;
                        while (i13 < arrayList5.size()) {
                            k47 k47Var3 = (k47) arrayList5.get(i13);
                            int i14 = 0;
                            while (arrayList6 != null && i14 < arrayList6.size()) {
                                k47 k47Var4 = (k47) arrayList6.get(i14);
                                if (k47Var4 != null) {
                                    arrayList2 = arrayList6;
                                    if (k47Var4.e1() == k47Var3.e1()) {
                                        k47Var3.Z = k47Var4.Z;
                                        break;
                                    }
                                } else {
                                    arrayList2 = arrayList6;
                                }
                                i14++;
                                arrayList6 = arrayList2;
                            }
                            arrayList2 = arrayList6;
                            if (k47Var3 != null && k47Var3.k.peer_id.channel_id == 0) {
                                sparseArray.put(k47Var3.e1(), k47Var3);
                                oc7Var.O = Math.min(oc7Var.O, k47Var3.k.date);
                                long j6 = k47Var3.k.random_id;
                                if (j6 != 0) {
                                    vh6Var10.k(k47Var3, j6);
                                }
                            }
                            i13++;
                            arrayList6 = arrayList2;
                        }
                    }
                    if (b3cVar.u(j3)) {
                        b3cVar.d(j3);
                    }
                    if (z2) {
                        j = 0;
                        oc7Var.H(dialog, null, 0L);
                        if (!e21.a) {
                        }
                        i3 = i + 1;
                        b5aVar = this;
                        j2 = j;
                        l = l2;
                        longSparseIntArray2 = longSparseIntArray;
                        arrayList3 = arrayList4;
                        vh6Var7 = vh6Var;
                        vh6Var8 = vh6Var2;
                        sparseIntArray2 = sparseIntArray;
                        vh6Var9 = vh6Var4;
                    }
                } else {
                    if (z || oc7.z3(arrayList5) > oc7.z3(arrayList6)) {
                        vh6Var11.k(dialog, j3);
                        vh6Var13.k(arrayList5, j3);
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            k47 k47Var5 = (k47) arrayList6.get(i15);
                            if (k47Var5 != null && k47Var5.k.peer_id.channel_id == 0) {
                                sparseArray.remove(k47Var5.e1());
                            }
                        }
                        if (arrayList5 != null) {
                            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                                k47 k47Var6 = (k47) arrayList5.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList6.size()) {
                                        break;
                                    }
                                    k47 k47Var7 = (k47) arrayList6.get(i17);
                                    if (k47Var7 != null && k47Var7.e1() == k47Var6.e1()) {
                                        k47Var6.Z = k47Var7.Z;
                                        break;
                                    }
                                    i17++;
                                }
                                if (k47Var6 != null && k47Var6.k.peer_id.channel_id == 0) {
                                    sparseArray.put(k47Var6.e1(), k47Var6);
                                    oc7Var.O = Math.min(oc7Var.O, k47Var6.k.date);
                                    long j7 = k47Var6.k.random_id;
                                    if (j7 != 0) {
                                        vh6Var10.k(k47Var6, j7);
                                    }
                                }
                            }
                        }
                        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                            long j8 = ((k47) arrayList6.get(i18)).k.random_id;
                            if (j8 != 0) {
                                vh6Var10.l(j8);
                            }
                        }
                        if (b3cVar.u(j3)) {
                            b3cVar.d(j3);
                        }
                    }
                    vh6Var4 = vh6Var13;
                }
            }
            j = 0;
            i3 = i + 1;
            b5aVar = this;
            j2 = j;
            l = l2;
            longSparseIntArray2 = longSparseIntArray;
            arrayList3 = arrayList4;
            vh6Var7 = vh6Var;
            vh6Var8 = vh6Var2;
            sparseIntArray2 = sparseIntArray;
            vh6Var9 = vh6Var4;
        }
        LongSparseIntArray longSparseIntArray3 = longSparseIntArray2;
        ArrayList arrayList7 = arrayList3;
        arrayList7.clear();
        int m = vh6Var11.m();
        int i19 = 0;
        while (i19 < m) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) vh6Var11.n(i19);
            if (oc7Var.u0.h(dialog3.id) >= 0) {
                arrayList = arrayList7;
            } else {
                arrayList = arrayList7;
                arrayList.add(dialog3);
            }
            i19++;
            arrayList7 = arrayList;
        }
        oc7Var.b5(null);
        oc7Var.getNotificationCenter().k(nm7.r, new Object[0]);
        oc7Var.getNotificationsController().J(longSparseIntArray3);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03cd A[Catch: all -> 0x03d3, TRY_LEAVE, TryCatch #5 {all -> 0x03d3, blocks: (B:158:0x03c5, B:160:0x03cd), top: B:157:0x03c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0460  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        File file;
        boolean z;
        boolean renameTo;
        boolean z2;
        String str;
        String str2;
        Bitmap bitmap;
        char c;
        char c2 = '\b';
        byte b = 3;
        boolean z3 = true;
        int i2 = 0;
        switch (this.a) {
            case 0:
                a6a a6aVar = (a6a) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                yv1 yv1Var = (yv1) this.f;
                String str3 = (String) this.h;
                boolean z4 = this.b;
                if (tLObject == null) {
                    ik.n0(yv1Var, str3, false, z4);
                    return;
                }
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    xp7.b(false, a6aVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, null);
                    return;
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    xp7.b(false, a6aVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, null);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                        ik.n0(yv1Var, str3, false, z4);
                        return;
                    }
                    return;
                }
            case 1:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                return;
            case 2:
                ik1 ik1Var = (ik1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                Activity activity = (Activity) this.h;
                boolean z5 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error == null) {
                    twoStepVerificationActivity.t0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        l11.u(ik1Var.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject2).url);
                        if (z5) {
                            ik1Var.I(true);
                        }
                    }
                    ik1Var.K();
                    return;
                }
                if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(ik1Var.o0).sendRequest(new TL_account.getPassword(), new vj1((Object) ik1Var, (Object) twoStepVerificationActivity, z5, (byte) 0), 8);
                        return;
                    }
                    twoStepVerificationActivity.t0();
                    twoStepVerificationActivity.finishFragment();
                    c41.e0(tL_error);
                    return;
                }
                twoStepVerificationActivity.t0();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                alertDialog$Builder.a.S = jb6.M0(2131751234, null);
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setPadding(gm.L(24.0f), gm.L(2.0f), gm.L(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                TextView textView = new TextView(activity);
                int i3 = cmb.i5;
                anb.X(textView, i3, null);
                textView.setTextSize(1, 16.0f);
                textView.setGravity((jb6.a0 ? 5 : 3) | 48);
                textView.setText(gm.S2(jb6.M0(2131742527, null)));
                linearLayout.addView(textView, qoe.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(activity);
                imageView.setImageResource(R.drawable.list_circle);
                imageView.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                anb.s(imageView, i3, null, mode);
                TextView textView2 = new TextView(activity);
                anb.X(textView2, i3, null);
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((jb6.a0 ? 5 : 3) | 48);
                textView2.setText(gm.S2(jb6.M0(2131751237, null)));
                if (jb6.a0) {
                    linearLayout2.addView(textView2, qoe.o(-1, -2));
                    linearLayout2.addView(imageView, qoe.r(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, qoe.o(-2, -2));
                    linearLayout2.addView(textView2, qoe.o(-1, -2));
                }
                LinearLayout l = td4.l(activity, 0);
                linearLayout.addView(l, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(activity);
                imageView2.setImageResource(R.drawable.list_circle);
                imageView2.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
                anb.s(imageView2, i3, null, mode);
                TextView textView3 = new TextView(activity);
                anb.X(textView3, i3, null);
                textView3.setTextSize(1, 16.0f);
                textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
                textView3.setText(gm.S2(jb6.M0(2131751236, null)));
                if (jb6.a0) {
                    l.addView(textView3, qoe.o(-1, -2));
                    i = 5;
                    l.addView(imageView2, qoe.r(-2, -2, 5));
                } else {
                    i = 5;
                    l.addView(imageView2, qoe.o(-2, -2));
                    l.addView(textView3, qoe.o(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    alertDialog$Builder.j(jb6.M0(2131751228, null), new lj1(ik1Var));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                } else {
                    TextView textView4 = new TextView(activity);
                    anb.X(textView4, i3, null);
                    textView4.setTextSize(1, 16.0f);
                    hg9.p(textView4, (jb6.a0 ? i : 3) | 48, null, 2131751235);
                    linearLayout.addView(textView4, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder.g(jb6.M0(2131747564, null), null);
                }
                twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                return;
            case 3:
                ((yv1) this.f).Y8((rc2) this.c, this.b, (String) this.h, (TLRPC.User[]) this.d, (CharacterStyle) this.e);
                return;
            case 4:
                yv1 yv1Var2 = (yv1) this.f;
                he heVar = (he) this.c;
                boolean[] zArr = (boolean[]) this.d;
                boolean z6 = this.b;
                k47 k47Var = (k47) this.e;
                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) this.h;
                try {
                    heVar.dismiss();
                } catch (Throwable unused) {
                }
                if (zArr[0]) {
                    return;
                }
                if (z6) {
                    yv1Var2.createArticleViewer(false).L(k47Var, tL_webPage, null, null);
                    return;
                }
                try {
                    gm.r2(k47Var, yv1Var2.getParentActivity(), yv1Var2.Ba, false);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    yv1Var2.F4(k47Var);
                    return;
                }
            case 5:
                na2 na2Var = (na2) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                boolean z7 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                pa2 pa2Var = na2Var.a;
                qa2 qa2Var = pa2Var.i3;
                qa2Var.Q.remove(tL_channels_toggleUsername.username);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    pa2Var.z1(tL_username, !z7, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    pa2Var.z1(tL_username, z7, true);
                    qa2Var.b0();
                } else {
                    gm.c3(new np6((Object) na2Var, (Object) tL_username, z7, (byte) 14));
                }
                qa2Var.getMessagesController().B5(qa2Var.Y, tL_username.username, tL_username.active);
                return;
            case 6:
                bw2 bw2Var = (bw2) this.c;
                boolean z8 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                ArrayList arrayList2 = (ArrayList) this.h;
                if (z8) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        TLRPC.User W1 = bw2Var.getMessagesController().W1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i4)).user_id));
                        if (W1 != null && !TextUtils.isEmpty(W1.phone)) {
                            String str4 = W1.phone;
                            yv2 yv2Var = (yv2) hashMap.get(str4.substring(Math.max(0, str4.length() - 7)));
                            if (yv2Var == null) {
                                String a = yv2.a(W1.first_name, W1.last_name);
                                ArrayList arrayList3 = (ArrayList) hashMap2.get(a);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    hashMap2.put(a, arrayList3);
                                    arrayList2.add(a);
                                }
                                arrayList3.add(W1);
                            } else if (yv2Var.m == null) {
                                yv2Var.m = W1;
                            }
                        }
                    }
                }
                Collator u = bw2.u();
                Iterator it = hashMap2.values().iterator();
                while (it.hasNext()) {
                    Collections.sort((ArrayList) it.next(), new io0(u, b));
                }
                Collections.sort(arrayList2, new io0(u, (byte) 4));
                gm.c3(new pv2(bw2Var, arrayList2, hashMap, hashMap2));
                return;
            case 7:
                c23 c23Var = (c23) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                b61 b61Var = (b61) this.e;
                boolean z9 = this.b;
                HashSet hashSet = (HashSet) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                if (!(tLObject4 instanceof TLRPC.Updates)) {
                    if (!(tLObject4 instanceof TL_phone.groupCall)) {
                        if (tL_error3 != null) {
                            wi8.u(c23Var.F, c23Var.J0, tL_error3, false);
                            return;
                        }
                        return;
                    }
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    oc7.r1(c23Var.a).d4(groupcall.users, false);
                    oc7.r1(c23Var.a).X3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        c23Var.X1 = false;
                        b61Var.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall = groupcall.call;
                    tL_inputGroupCall.id = groupCall.id;
                    tL_inputGroupCall.access_hash = groupCall.access_hash;
                    c23Var.dismiss();
                    sic.g(LaunchActivity.H1, c23Var.a, tL_inputGroupCall, z9, groupcall.call, hashSet);
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                oc7.r1(c23Var.a).d4(updates.users, false);
                oc7.r1(c23Var.a).X3(updates.chats, false);
                ArrayList w0 = oc7.w0(updates, TL_update.TL_updateGroupCall.class);
                int size2 = w0.size();
                int i5 = 0;
                TLRPC.GroupCall groupCall2 = null;
                while (i5 < size2) {
                    Object obj = w0.get(i5);
                    i5++;
                    groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
                }
                Utilities.d.c(new mv2((Object) c23Var, (Object) updates, (byte) 12));
                if (groupCall2 == null || LaunchActivity.H1 == null) {
                    c23Var.X1 = false;
                    b61Var.setLoading(false);
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall2.id = groupCall2.id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                c23Var.dismiss();
                sic.g(LaunchActivity.H1, c23Var.a, tL_inputGroupCall2, z9, groupCall2, hashSet);
                return;
            case 8:
                ((e34) this.c).I((vo4) this.e, (TLObject) this.d, (TLRPC.StickerSet) this.f, (TLRPC.Document) this.h, this.b, true);
                return;
            case 9:
                lb4 lb4Var = (lb4) this.c;
                File file2 = (File) this.d;
                File file3 = (File) this.e;
                File file4 = (File) this.f;
                File file5 = (File) this.h;
                boolean z10 = this.b;
                if (file2 != null) {
                    file2.delete();
                }
                if (file3 != null) {
                    file3.delete();
                }
                if (file4 != null) {
                    file4.delete();
                }
                if (file5 != null) {
                    if (lb4Var.a1) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file5));
                            bc4.o(gZIPInputStream, lb4Var.K0);
                            gZIPInputStream.close();
                            file5.delete();
                            file = lb4Var.K0;
                            z = false;
                            try {
                                lb4Var.a1 = false;
                            } catch (ZipException unused2) {
                                file5 = file;
                                lb4Var.a1 = z;
                                if (lb4Var.a1) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                Typeface typeface = gm.a;
                                fc4.g(th, !((th instanceof FileNotFoundException) || (th instanceof EOFException)));
                                if (e21.a) {
                                    fc4.d("unable to ungzip temp = " + file5 + " to final = " + lb4Var.L0);
                                }
                                file5 = file;
                                if (lb4Var.a1) {
                                }
                            }
                        } catch (ZipException unused3) {
                            z = false;
                        } catch (Throwable th2) {
                            th = th2;
                            file = file5;
                        }
                        file5 = file;
                    }
                    if (lb4Var.a1) {
                        Utilities.d.c(new bb4(lb4Var, (byte) 6));
                        return;
                    }
                    if (lb4Var.p0 instanceof TLRPC.TL_theme) {
                        try {
                            renameTo = gm.E(file5, lb4Var.L0);
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            z2 = false;
                            if (!z2) {
                                try {
                                    z2 = gm.E(file5, lb4Var.L0);
                                    if (z2) {
                                    }
                                } catch (Throwable th3) {
                                    fc4.g(th3, true);
                                }
                            }
                            if (z2) {
                            }
                            Utilities.d.c(new gb4(lb4Var, z10, (byte) 2));
                            return;
                        }
                    } else {
                        try {
                            if (lb4Var.c1 != null) {
                                synchronized (lb4.m1) {
                                    try {
                                        lb4Var.L0 = new File(lb4Var.T0, lb4Var.s);
                                        int i6 = 1;
                                        while (lb4Var.L0.exists()) {
                                            int lastIndexOf = lb4Var.s.lastIndexOf(46);
                                            lb4Var.L0 = new File(lb4Var.T0, lastIndexOf > 0 ? lb4Var.s.substring(0, lastIndexOf) + " (" + i6 + ")" + lb4Var.s.substring(lastIndexOf) : lb4Var.s + " (" + i6 + ")");
                                            i6++;
                                        }
                                    } finally {
                                    }
                                }
                            }
                            renameTo = file5.renameTo(lb4Var.L0);
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                            z2 = false;
                            if (!z2) {
                            }
                            if (z2) {
                            }
                            Utilities.d.c(new gb4(lb4Var, z10, (byte) 2));
                            return;
                        }
                    }
                    z2 = renameTo;
                    if (!z2 && lb4Var.m0 == 3) {
                        z2 = gm.E(file5, lb4Var.L0);
                        if (z2) {
                            lb4Var.L0.delete();
                        }
                    }
                    if (z2) {
                        lb4Var.O0 = true;
                        if (lb4Var.c1 != null && lb4Var.L0.exists()) {
                            zb4 zb4Var = lb4Var.g0;
                            xy xyVar = lb4Var.c1;
                            File file6 = lb4Var.L0;
                            lc4 lc4Var = zb4Var.e.d;
                            long j = xyVar.b;
                            int i7 = xyVar.c;
                            byte b2 = xyVar.d;
                            String file7 = file6 != null ? file6.toString() : null;
                            lc4Var.getClass();
                            lc4Var.h(new jc4(lc4Var, j, i7, b2, file7, 0));
                        }
                    } else {
                        if (e21.a) {
                            fc4.d("unable to rename temp = " + file5 + " to final = " + lb4Var.L0 + " retry = " + lb4Var.m0);
                        }
                        int i8 = lb4Var.m0 + 1;
                        lb4Var.m0 = i8;
                        if (i8 < 3) {
                            lb4Var.Y = (byte) 1;
                            Utilities.d.d(new gb4(lb4Var, z10, (byte) 0), 200L);
                            return;
                        } else {
                            lb4Var.L0 = file5;
                            lb4Var.O0 = false;
                        }
                    }
                }
                Utilities.d.c(new gb4(lb4Var, z10, (byte) 2));
                return;
            case 10:
                b07 b07Var = (b07) this.c;
                Pair pair = (Pair) this.d;
                b07Var.b.i.w(((Integer) pair.first).intValue(), (rz6) pair.second, (ea6) this.e, (ft6) this.f, (IOException) this.h, this.b);
                return;
            case 11:
                a();
                return;
            case 12:
                wsa wsaVar = (wsa) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                m45 m45Var = (m45) this.f;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.h;
                boolean z11 = this.b;
                TLObject tLObject5 = (TLObject) this.d;
                long j2 = wsaVar.S1;
                if (wsaVar.getContext() != null) {
                    if (tL_error4 != null && m45Var != null && tL_error4.text.startsWith("TMP_PASSWORD")) {
                        m45Var.a(Boolean.TRUE);
                        return;
                    }
                    if (m45Var != null) {
                        m45Var.a(Boolean.FALSE);
                    }
                    if (tL_error4 != null) {
                        wsaVar.P1(tL_error4, twoStepVerificationActivity2, z11);
                        return;
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.t0();
                        twoStepVerificationActivity2.finishFragment();
                    }
                    if (tLObject5 instanceof TL_stars.starGiftWithdrawalUrl) {
                        l11.w(wsaVar.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject5).url, false);
                        return;
                    }
                    if (!(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                        if (tLObject5 instanceof TLRPC.TL_boolFalse) {
                            c41.c0("NULL_ERROR");
                            return;
                        }
                        return;
                    }
                    TL_stars.TL_starGiftUnique A1 = wsaVar.A1();
                    c C = c.C(wsaVar.a);
                    if (A1 != null) {
                        str = A1.gift_address;
                        str2 = A1.slug;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    w15 w15Var = C.B;
                    gm.r(w15Var);
                    C.y = str;
                    C.z = str2;
                    C.A = 0;
                    C.A().d();
                    C.G().g();
                    C.J();
                    int i9 = C.A;
                    long[] jArr = c.S;
                    if (i9 < 7) {
                        C.A = i9 + 1;
                        gm.d3(w15Var, jArr[i9]);
                    }
                    long e4 = z8c.h(wsaVar.a).e();
                    jva.v(wsaVar.a, false).M(e4);
                    if (j2 != 0 && j2 != e4) {
                        jva.v(wsaVar.a, false).M(j2);
                    }
                    if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
                        int i10 = wsaVar.a;
                        String str5 = A1.slug;
                        if (!TextUtils.isEmpty(str5)) {
                            gm.d3(new ep1(i10, 0, str5, z3), fs7.b[0]);
                        }
                        gm.c3(new hw9((Object) new bo6((byte) 26), (Object) A1.getDocument(), (Object) jb6.M0(2131750034, null), (byte) 19));
                    }
                    wsaVar.dismiss();
                    return;
                }
                return;
            default:
                lqc lqcVar = (lqc) this.c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f;
                int[] iArr4 = (int[]) this.h;
                boolean z12 = this.b;
                np3 np3Var = fsc.a;
                int i11 = 0;
                while (true) {
                    int i12 = nm7.J4;
                    if (i11 >= 288) {
                        int i13 = 0;
                        while (i13 < 288) {
                            for (int i14 = i2; i14 < 288; i14++) {
                                iArr4[i14] = iArr3[(i14 * nm7.K4) + i13];
                            }
                            int i15 = i2;
                            while (i15 < 288) {
                                int min = Math.min(i12, i15 + 8);
                                int i16 = 128;
                                for (int max = Math.max(i2, i15 - 8); max <= min; max++) {
                                    int i17 = iArr4[max];
                                    if (i17 < 8) {
                                        int i18 = max - i15;
                                        int i19 = (i18 * i18) + (i17 * i17);
                                        if (i19 < i16) {
                                            i16 = i19;
                                        }
                                    }
                                }
                                iArr3[(i15 * nm7.K4) + i13] = fsc.b[i16];
                                i15++;
                                i2 = 0;
                                i12 = nm7.J4;
                            }
                            i13++;
                            i2 = 0;
                            i12 = nm7.J4;
                        }
                        int i20 = 0;
                        while (i20 < 82944) {
                            int i21 = iArr[i20];
                            int i22 = i21 >>> 24;
                            int max2 = Math.max(iArr3[i20], i22);
                            if (i22 != 255) {
                                if (i22 == 0) {
                                    i21 = 16777215 | (max2 << 24);
                                } else {
                                    int i23 = ((255 - i22) * max2) / nm7.d4;
                                    int i24 = i22 + i23;
                                    int i25 = ((i21 >> 16) & nm7.d4) * i22;
                                    int i26 = i23 * nm7.d4;
                                    c = c2;
                                    i21 = ((((i21 & nm7.d4) * i22) + i26) / i24) | (i24 << 24) | (((i25 + i26) / i24) << 16) | ((((((i21 >> 8) & nm7.d4) * i22) + i26) / i24) << 8);
                                    iArr2[i20] = i21;
                                    i20++;
                                    c2 = c;
                                }
                            }
                            c = c2;
                            iArr2[i20] = i21;
                            i20++;
                            c2 = c;
                        }
                        if (z12) {
                            int i27 = 0;
                            for (int i28 = 0; i28 < 82944; i28 += 7) {
                                if ((iArr2[i28] >>> 24) > 0) {
                                    i27++;
                                }
                            }
                            if (i27 > 592) {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, nm7.K4, nm7.K4, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                bitmap = Bitmap.createBitmap(nm7.F2, nm7.F2, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(bitmap).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                gm.c3(new gcc(lqcVar, iArr2, bitmap, (byte) 20));
                                return;
                            }
                        }
                        bitmap = null;
                        gm.c3(new gcc(lqcVar, iArr2, bitmap, (byte) 20));
                        return;
                    }
                    int i29 = i11 * nm7.K4;
                    int i30 = 8;
                    for (int i31 = 0; i31 < 288; i31++) {
                        int i32 = i29 + i31;
                        i30 = (iArr[i32] >>> 24) >= 128 ? 0 : Math.min(i30 + 1, 8);
                        iArr3[i32] = i30;
                    }
                    int i33 = 8;
                    while (i12 >= 0) {
                        int i34 = i29 + i12;
                        i33 = iArr3[i34] == 0 ? 0 : Math.min(i33 + 1, 8);
                        if (i33 < iArr3[i34]) {
                            iArr3[i34] = i33;
                        }
                        i12--;
                    }
                    i11++;
                }
        }
    }

    public /* synthetic */ b5a(yv1 yv1Var, rc2 rc2Var, boolean z, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = (byte) 3;
        this.f = yv1Var;
        this.c = rc2Var;
        this.b = z;
        this.h = str;
        this.d = userArr;
        this.e = characterStyle;
    }

    public /* synthetic */ b5a(na2 na2Var, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z, TLRPC.TL_error tL_error) {
        this.a = (byte) 5;
        this.c = na2Var;
        this.e = tL_channels_toggleUsername;
        this.d = tLObject;
        this.f = tL_username;
        this.b = z;
        this.h = tL_error;
    }

    public /* synthetic */ b5a(bw2 bw2Var, boolean z, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = (byte) 6;
        this.c = bw2Var;
        this.b = z;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ b5a(c23 c23Var, TLObject tLObject, b61 b61Var, boolean z, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.c = c23Var;
        this.d = tLObject;
        this.e = b61Var;
        this.b = z;
        this.f = hashSet;
        this.h = tL_error;
    }

    public /* synthetic */ b5a(yv1 yv1Var, he heVar, boolean[] zArr, boolean z, k47 k47Var, TLRPC.TL_webPage tL_webPage) {
        this.a = (byte) 4;
        this.f = yv1Var;
        this.c = heVar;
        this.d = zArr;
        this.b = z;
        this.e = k47Var;
        this.h = tL_webPage;
    }

    public /* synthetic */ b5a(KeyEvent.Callback callback, TLRPC.TL_error tL_error, Object obj, Object obj2, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.e = tL_error;
        this.f = obj;
        this.h = obj2;
        this.b = z;
        this.d = tLObject;
    }

    public /* synthetic */ b5a(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = serializable;
        this.b = z;
    }

    public /* synthetic */ b5a(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
        this.h = obj5;
    }
}
