// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e77(d17 d17Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, oc7 oc7Var, cf7 cf7Var) {
        this.a = (byte) 17;
        this.c = d17Var;
        this.h = str;
        this.d = tL_error;
        this.e = tLObject;
        this.b = oc7Var;
        this.f = cf7Var;
    }

    private final void a() {
        wr9 wr9Var = (wr9) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        ArrayList arrayList4 = (ArrayList) this.f;
        vh6 vh6Var = (vh6) this.h;
        ArrayList arrayList5 = wr9Var.c;
        ArrayList arrayList6 = wr9Var.i;
        int i = wr9Var.a;
        oc7.r1(i).d4(arrayList, true);
        oc7.r1(i).X3(arrayList2, true);
        vm.g(i).d(arrayList3);
        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
            wr9Var.i(((Long) arrayList4.get(i2)).longValue());
        }
        for (int i3 = 0; i3 < vh6Var.m(); i3++) {
            long j = vh6Var.j(i3);
            k47 k47Var = new k47(wr9Var.a, (TLRPC.Message) vh6Var.n(i3), null, null, null, null, null, false, false, 0L, false, false, true, 0);
            for (int i4 = 0; i4 < arrayList6.size(); i4++) {
                vr9 vr9Var = (vr9) arrayList6.get(i4);
                if (vr9Var.a == j) {
                    vr9Var.c = k47Var.e1();
                    vr9Var.d = k47Var;
                }
            }
            for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                vr9 vr9Var2 = (vr9) arrayList5.get(i5);
                if (vr9Var2.a == j) {
                    vr9Var2.c = k47Var.e1();
                    vr9Var2.d = k47Var;
                }
            }
        }
        wr9Var.k();
    }

    private final void b() {
        wr9 wr9Var = (wr9) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        ArrayList arrayList4 = (ArrayList) this.f;
        ur9 ur9Var = (ur9) this.h;
        wr9Var.k = false;
        wr9Var.l = true;
        int i = wr9Var.a;
        oc7.r1(i).d4(arrayList, true);
        oc7.r1(i).X3(arrayList2, true);
        vm.g(i).d(arrayList3);
        ArrayList arrayList5 = wr9Var.c;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        wr9Var.l();
        if (wr9Var.m) {
            return;
        }
        ur9Var.run();
    }

    private final void c() {
        dw9 dw9Var = (dw9) this.b;
        Activity activity = (Activity) this.c;
        he heVar = (he) this.d;
        TLObject tLObject = (TLObject) this.e;
        byte[] bArr = (byte[]) this.f;
        TLRPC.User user = (TLRPC.User) this.h;
        dw9Var.n = false;
        if (!activity.isFinishing()) {
            try {
                heVar.dismiss();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject;
        encryptedChat.user_id = encryptedChat.participant_id;
        encryptedChat.seq_in = -2;
        encryptedChat.seq_out = 1;
        encryptedChat.a_or_b = bArr;
        dw9Var.getMessagesController().Z3(encryptedChat, false);
        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
        tL_dialog.id = pg3.E(encryptedChat.id);
        tL_dialog.unread_count = 0;
        tL_dialog.top_message = 0;
        tL_dialog.last_message_date = dw9Var.getConnectionsManager().getCurrentTime();
        dw9Var.getMessagesController().R.k(tL_dialog, tL_dialog.id);
        dw9Var.getMessagesController().y.add(tL_dialog);
        dw9Var.getMessagesController().b5(null);
        cf7 messagesStorage = dw9Var.getMessagesStorage();
        messagesStorage.a.c(new jy6(messagesStorage, encryptedChat, user, tL_dialog, (byte) 10));
        dw9Var.getNotificationCenter().k(nm7.r, new Object[0]);
        dw9Var.getNotificationCenter().k(nm7.a0, encryptedChat);
        Utilities.d.c(new kf9(dw9Var, (byte) 22));
    }

    private final void d() {
        int i;
        final k0a k0aVar = (k0a) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
        TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
        if (tL_error == null) {
            if (tL_inputCheckPasswordSRP != null) {
                eh ehVar = k0aVar.U1;
                if (ehVar != null) {
                    ehVar.run();
                }
                k0aVar.dismiss();
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (k0aVar.e2 != null) {
            final byte b = 0;
            if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                if (tL_inputCheckPasswordSRP == null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k0aVar.e2);
                    String M0 = jb6.M0(sd2.V(k0aVar.S1) ? 2131751259 : 2131751252, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = gm.S2(jb6.a0(null, null, 2131751229, k0aVar.S1.title, m9c.k(user, true)));
                    alertDialog$Builder.j(jb6.M0(2131751233, null), new xr8(k0aVar, user, (byte) 18));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), new ee() { // from class: a0a
                        @Override // ee
                        public final void r(he heVar2, int i2) {
                            byte b2 = b;
                            k0a k0aVar2 = k0aVar;
                            switch (b2) {
                                case 0:
                                    k0aVar2.c2.setLoading(false);
                                    break;
                                case 1:
                                    d S = LaunchActivity.S();
                                    if (S != null) {
                                        k0aVar2.dismiss();
                                        S.presentFragment(new p5c(6, null));
                                        break;
                                    }
                                    break;
                                case 2:
                                    k0aVar2.c2.setLoading(false);
                                    break;
                                default:
                                    k0aVar2.c2.setLoading(false);
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(k0aVar.a).sendRequest(new TL_account.getPassword(), new fm8((Object) k0aVar, (Object) twoStepVerificationActivity, (Object) user, (byte) 6), 8);
                    return;
                }
                if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    d S = LaunchActivity.S();
                    if (S != null) {
                        ik.e0(tL_error, S, sd2.V(k0aVar.S1), sd2.Y(k0aVar.S1), tL_channels_editCreator);
                        return;
                    }
                    return;
                }
                if (k0aVar.e2 != null && !z8c.h(j5.a(k0aVar.a).a).p()) {
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        new i46(5, k0aVar.a, null, k0aVar.e2, S2);
                        return;
                    }
                    return;
                }
                d S3 = LaunchActivity.S();
                if (S3 != null) {
                    k0aVar.dismiss();
                    S3.presentFragment(new avb(1));
                    return;
                }
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k0aVar.e2);
            alertDialog$Builder2.a.S = jb6.M0(2131751234, null);
            LinearLayout linearLayout = new LinearLayout(k0aVar.e2);
            linearLayout.setPadding(gm.L(24.0f), gm.L(2.0f), gm.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder2.n(linearLayout);
            TextView textView = new TextView(k0aVar.e2);
            int i2 = cmb.i5;
            anb.X(textView, i2, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((jb6.a0 ? 5 : 3) | 48);
            if (sd2.V(k0aVar.S1)) {
                hg9.q(null, null, 2131751220, new Object[]{m9c.k(user, true)}, textView);
            } else {
                hg9.q(null, null, 2131751238, new Object[]{m9c.k(user, true)}, textView);
            }
            linearLayout.addView(textView, qoe.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(k0aVar.e2);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(k0aVar.e2);
            imageView.setImageResource(R.drawable.list_circle);
            imageView.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.s(imageView, i2, null, mode);
            TextView textView2 = new TextView(k0aVar.e2);
            anb.X(textView2, i2, null);
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
            LinearLayout linearLayout3 = new LinearLayout(k0aVar.e2);
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(k0aVar.e2);
            imageView2.setImageResource(R.drawable.list_circle);
            imageView2.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
            anb.s(imageView2, i2, null, mode);
            TextView textView3 = new TextView(k0aVar.e2);
            anb.X(textView3, i2, null);
            textView3.setTextSize(1, 16.0f);
            textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
            textView3.setText(gm.S2(jb6.M0(2131751236, null)));
            if (jb6.a0) {
                linearLayout3.addView(textView3, qoe.o(-1, -2));
                i = 5;
                linearLayout3.addView(imageView2, qoe.r(-2, -2, 5));
            } else {
                i = 5;
                linearLayout3.addView(imageView2, qoe.o(-2, -2));
                linearLayout3.addView(textView3, qoe.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                final byte b2 = 1;
                alertDialog$Builder2.j(jb6.M0(2131751228, null), new ee() { // from class: a0a
                    @Override // ee
                    public final void r(he heVar2, int i22) {
                        byte b22 = b2;
                        k0a k0aVar2 = k0aVar;
                        switch (b22) {
                            case 0:
                                k0aVar2.c2.setLoading(false);
                                break;
                            case 1:
                                d S4 = LaunchActivity.S();
                                if (S4 != null) {
                                    k0aVar2.dismiss();
                                    S4.presentFragment(new p5c(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                k0aVar2.c2.setLoading(false);
                                break;
                            default:
                                k0aVar2.c2.setLoading(false);
                                break;
                        }
                    }
                });
                final byte b3 = 2;
                alertDialog$Builder2.g(jb6.M0(2131752542, null), new ee() { // from class: a0a
                    @Override // ee
                    public final void r(he heVar2, int i22) {
                        byte b22 = b3;
                        k0a k0aVar2 = k0aVar;
                        switch (b22) {
                            case 0:
                                k0aVar2.c2.setLoading(false);
                                break;
                            case 1:
                                d S4 = LaunchActivity.S();
                                if (S4 != null) {
                                    k0aVar2.dismiss();
                                    S4.presentFragment(new p5c(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                k0aVar2.c2.setLoading(false);
                                break;
                            default:
                                k0aVar2.c2.setLoading(false);
                                break;
                        }
                    }
                });
            } else {
                TextView textView4 = new TextView(k0aVar.e2);
                anb.X(textView4, i2, null);
                textView4.setTextSize(1, 16.0f);
                hg9.p(textView4, (jb6.a0 ? i : 3) | 48, null, 2131751235);
                linearLayout.addView(textView4, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                final byte b4 = 3;
                alertDialog$Builder2.g(jb6.M0(2131747564, null), new ee() { // from class: a0a
                    @Override // ee
                    public final void r(he heVar2, int i22) {
                        byte b22 = b4;
                        k0a k0aVar2 = k0aVar;
                        switch (b22) {
                            case 0:
                                k0aVar2.c2.setLoading(false);
                                break;
                            case 1:
                                d S4 = LaunchActivity.S();
                                if (S4 != null) {
                                    k0aVar2.dismiss();
                                    S4.presentFragment(new p5c(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                k0aVar2.c2.setLoading(false);
                                break;
                            default:
                                k0aVar2.c2.setLoading(false);
                                break;
                        }
                    }
                });
            }
            alertDialog$Builder2.o();
        }
    }

    private final void e() {
        a6a a6aVar = (a6a) this.b;
        String str = (String) this.h;
        String str2 = (String) this.c;
        String str3 = (String) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        h2b h2bVar = (h2b) this.f;
        v5a v5aVar = new v5a(a6aVar);
        v5aVar.f = str;
        v5aVar.e = str2;
        v5aVar.g = str3;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            t5a t5aVar = (t5a) arrayList.get(i);
            File file = new File(t5aVar.a);
            if (file.exists()) {
                long length = file.length();
                if (length != 0) {
                    v5aVar.h += length;
                    v5aVar.d.add(t5aVar);
                    v5aVar.a.put(t5aVar.a, t5aVar);
                    hashMap.put(t5aVar.a, v5aVar);
                }
            }
            if (i == 0) {
                gm.c3(new c0a(h2bVar, (byte) 4));
                return;
            }
        }
        gm.c3(new hz7((Object) a6aVar, (Object) v5aVar, (Object) hashMap, (Object) str2, (Object) h2bVar, (byte) 21));
    }

    private final void f() {
        a6a a6aVar = (a6a) this.b;
        TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
        k47 k47Var = (k47) this.d;
        File file = (File) this.f;
        m5a m5aVar = (m5a) this.e;
        String str = (String) this.h;
        if (tL_photo == null) {
            if (e21.a) {
                StringBuilder p = wi8.p("can't load image ", str, " to file ");
                p.append(file.toString());
                fc4.d(p.toString());
            }
            m5aVar.c();
            return;
        }
        TLRPC.Message message = k47Var.k;
        message.media.photo = tL_photo;
        message.attachPath = file.toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(k47Var.k);
        a6aVar.getMessagesStorage().g1(arrayList, false, true, false, 0, false, k47Var.r1 ? 1 : 0, 0L);
        a6aVar.getNotificationCenter().k(nm7.l0, k47Var.k);
        m5aVar.g = (TLRPC.PhotoSize) b10.f(1, tL_photo.sizes);
        m5aVar.h = tL_photo;
        m5aVar.l = null;
        if (m5aVar.e != 4) {
            a6aVar.L(m5aVar, -1);
        } else {
            m5aVar.p = true;
            a6aVar.L(m5aVar, m5aVar.x.indexOf(k47Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:323:0x0846, code lost:
    
        if (r8.creator == false) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0842, code lost:
    
        if ((r12 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L297;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0474 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        amb ambVar;
        HashMap<String, String> hashMap;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.ChatParticipants chatParticipants;
        boolean z;
        byte b;
        z99 z99Var;
        z99 z99Var2;
        b61 b61Var;
        byte b2 = 6;
        int i2 = 33;
        Uri uri = null;
        r9 = null;
        TLRPC.PhotoSize photoSize = null;
        r9 = null;
        TLRPC.User user = null;
        uri = null;
        uri = null;
        uri = null;
        uri = null;
        byte b3 = 0;
        r11 = false;
        r11 = false;
        r11 = false;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                oc7 oc7Var = (oc7) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) this.d;
                xlb xlbVar = (xlb) this.e;
                File file = (File) this.f;
                String str = (String) this.h;
                if (oc7Var.J2 == null || oc7Var.K2.s == null || wallPaper == null) {
                    return;
                }
                wallPaper.settings = tL_wallPaperSettings;
                wallPaper.flags |= 4;
                xlbVar.c = wallPaper.slug;
                bmb bmbVar = xlbVar.p;
                if (bmbVar != null && ((ambVar = xlbVar.q) != null ? ambVar.y == xlbVar : bmbVar.j0 == xlbVar)) {
                    xlbVar.c();
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(wallPaper);
                oc7Var.getMessagesStorage().m1(2, arrayList3);
                TLRPC.PhotoSize w = bc4.w(wallPaper.document.thumbs, nm7.q5, false, null, false);
                if (w != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(w.location.volume_id);
                    sb.append("_");
                    fn5.z().O(Utilities.a(file.getAbsolutePath()) + "@100_100", hg9.k(sb, w.location.local_id, "@100_100"), gn5.c(w, wallPaper.document));
                }
                nm7.e().k(nm7.j4, wallPaper.slug);
                ArrayList arrayList4 = oc7Var.K2.s;
                if (arrayList4 == null || xlbVar.n == 0) {
                    return;
                }
                arrayList4.add(Integer.valueOf(uf2.e(oc7Var.currentAccount).s(xlbVar.n, str, xlbVar, null, null)));
                return;
            case 1:
                a6a a6aVar = (a6a) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f;
                ArrayList arrayList9 = (ArrayList) this.h;
                boolean z3 = true;
                a6aVar.getMessagesController().d4(arrayList5, true);
                a6aVar.getMessagesController().X3(arrayList6, true);
                a6aVar.getMessagesController().a4(arrayList7);
                int size = arrayList8.size();
                int i3 = 0;
                while (i3 < size) {
                    k47 k47Var = new k47(a6aVar.currentAccount, (TLRPC.Message) arrayList8.get(i3), false, z3);
                    long c1 = k47Var.c1();
                    if (c1 != 0 && (hashMap = k47Var.k.params) != null && !hashMap.containsKey("final") && (i3 == size - 1 || ((TLRPC.Message) arrayList8.get(i3 + 1)).grouped_id != c1)) {
                        k47Var.k.params.put("final", "1");
                    }
                    a6aVar.j0(0L, k47Var, true);
                    i3++;
                    z3 = true;
                }
                if (arrayList9 != null) {
                    for (int i4 = 0; i4 < arrayList9.size(); i4++) {
                        k47 k47Var2 = new k47(a6aVar.currentAccount, (TLRPC.Message) arrayList9.get(i4), false, true);
                        k47Var2.r1 = true;
                        a6aVar.j0(0L, k47Var2, true);
                    }
                    return;
                }
                return;
            case 2:
                ((cj0) this.b).l((Activity) this.c, (j5) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f, (ohd) this.h, true);
                return;
            case 3:
                qw0 qw0Var = (qw0) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                String str2 = (String) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                String str3 = (String) this.f;
                ylb ylbVar = qw0Var.e;
                if (tLObject == null) {
                    if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            new c41(qw0Var, ylbVar).I(R.raw.error, jb6.M0(2131753093, null), gm.L2(cmb.v0(cmb.wj, ylbVar), jb6.a0(null, null, 2131753095, str3))).j();
                            return;
                        } else {
                            new c41(qw0Var, ylbVar).g0(tL_error, false);
                            return;
                        }
                    }
                    return;
                }
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    xp7.b(false, qw0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, qw0Var);
                    return;
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    xp7.b(false, qw0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, qw0Var);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                        ik.m0(qw0Var.getContext(), str2, false, true, true, false, 0L, null, null, null);
                        return;
                    }
                    return;
                }
            case 4:
                qw0 qw0Var2 = (qw0) this.b;
                File file2 = (File) this.f;
                he heVar = (he) this.c;
                String str4 = (String) this.h;
                String str5 = (String) this.d;
                String str6 = (String) this.e;
                if (file2 == null) {
                    heVar.b(500L);
                    return;
                } else {
                    int[] iArr = new int[11];
                    Utilities.e.c(new op6(file2, iArr, new ja7((Object) qw0Var2, (Object) iArr, (Object) file2, (Object) heVar, (Object) str4, (Object) str5, (Object) str6, (byte) 4), (byte) 28));
                    return;
                }
            case 5:
                TLObject tLObject2 = (TLObject) this.b;
                String[] strArr = (String[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                l66 l66Var = (l66) this.e;
                my0 my0Var = (my0) this.f;
                ylb ylbVar2 = (ylb) this.h;
                if (tLObject2 instanceof TL_phone.exportedGroupCallInvite) {
                    String str7 = ((TL_phone.exportedGroupCallInvite) tLObject2).link;
                    strArr[0] = str7;
                    if (str7.startsWith("https://")) {
                        str7 = str7.substring(8);
                    }
                    String str8 = str7;
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new l91(frameLayout, atomicBoolean, l66Var, str8, (byte) 0));
                    duration.addListener(new aa1(atomicBoolean, l66Var, str8));
                    duration.start();
                    new c41(my0Var.F, ylbVar2).I(R.raw.linkbroken, jb6.M0(2131749232, null), jb6.M0(2131749233, null)).j();
                    return;
                }
                return;
            case 6:
                vg1 vg1Var = (vg1) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                ArrayList arrayList12 = (ArrayList) this.f;
                xf1 xf1Var = (xf1) this.h;
                TLRPC.Chat chat = vg1Var.f;
                vg1Var.a0 = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (!sd2.T(chat)) {
                            TLRPC.ChatFull M0 = vg1Var.getMessagesController().M0(chat.id);
                            if (M0 != null && (chatParticipants = M0.participants) != null) {
                                int size2 = chatParticipants.participants.size();
                                while (b3 < size2) {
                                    TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(b3);
                                    i = i2;
                                    arrayList = arrayList11;
                                    if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                        if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                            break;
                                        }
                                    } else {
                                        i2 = i;
                                        arrayList11 = arrayList;
                                        b3++;
                                    }
                                }
                            }
                        } else {
                            oc7 messagesController = vg1Var.getMessagesController();
                            long j = channelParticipant.peer.user_id;
                            vh6 vh6Var = (vh6) messagesController.q1.f(chat.id);
                            TLRPC.ChannelParticipant channelParticipant2 = vh6Var == null ? null : (TLRPC.ChannelParticipant) vh6Var.f(j);
                            if (channelParticipant2 != null && ((channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) || channelParticipant2.admin_rights.manage_call)) {
                                i = 33;
                                arrayList = arrayList11;
                                break;
                            }
                        }
                    }
                    i = i2;
                    arrayList = arrayList11;
                    if (sd2.x(chat, channelParticipant, 6) || sd2.x(chat, channelParticipant, 7)) {
                        arrayList2 = arrayList;
                        b10.r(null, 2131745796, arrayList10, R.drawable.msg_block2, arrayList2);
                        arrayList12.add(Integer.valueOf(i));
                    } else {
                        arrayList2 = arrayList;
                    }
                    b10.r(null, 2131753694, arrayList10, R.drawable.msg_block, arrayList2);
                    arrayList12.add(35);
                }
                xf1Var.run();
                return;
            case 7:
                yv1 yv1Var = (yv1) this.b;
                br1 br1Var = (br1) this.c;
                rc2 rc2Var = (rc2) this.d;
                String str9 = (String) this.h;
                TLObject tLObject3 = (TLObject) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                br1Var.c(false);
                bu5 J = bu5.J(yv1Var, rc2Var);
                vs9 vs9Var = new vs9(yv1Var.getParentActivity(), yv1Var.Ba);
                J.p = new hm1(vs9Var, b3);
                J.b(R.drawable.msg_copy, jb6.M0(2131751703, null), new nm1(yv1Var, vs9Var, str9, (byte) 3), false);
                if (tLObject3 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject3;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList13 = tL_payments_bankCardData.open_urls;
                    int size3 = arrayList13.size();
                    int i5 = 0;
                    while (true) {
                        byte b4 = 13;
                        if (i5 < size3) {
                            TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList13.get(i5);
                            i5++;
                            TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                            J.b(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new uj1(yv1Var, tL_bankCardOpenUrl2, b4), false);
                        } else if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                            J.j();
                            J.o(13, gm.L(200.0f), tL_payments_bankCardData.title);
                        }
                    }
                }
                vs9Var.e(J);
                vs9Var.f(rc2Var, characterStyle, null, false);
                yv1Var.showDialog(vs9Var);
                return;
            case 8:
                c cVar = (c) this.b;
                ykc ykcVar = (ykc) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view = (View) this.e;
                RectF rectF = (RectF) this.f;
                eg9 eg9Var = (eg9) this.h;
                cVar.getClass();
                ykcVar.getLocationInWindow(new int[2]);
                frameLayout2.getLocationInWindow(new int[2]);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + r0[0]) - r5[0]);
                layoutParams.topMargin = Math.round((rectF.top + r0[1]) - r5[1]);
                view.setLayoutParams(layoutParams);
                view.post(new xo1(cVar, frameLayout2, view, eg9Var, (byte) 5));
                return;
            case 9:
                final ux4 ux4Var = (ux4) this.b;
                he heVar2 = (he) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                i77 i77Var = (i77) this.e;
                final qac qacVar = (qac) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                heVar2.dismiss();
                if (tLObject4 instanceof TL_stars.checkCanSendGiftResultOk) {
                    i77Var.run();
                    return;
                }
                if (!(tLObject4 instanceof TL_stars.checkCanSendGiftResultFail)) {
                    if (tL_error2 != null) {
                        new c41(ux4Var.c, ux4Var.J0).g0(tL_error2, false);
                        return;
                    }
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ux4Var.J0, ux4Var.getContext());
                alertDialog$Builder.a.S = jb6.M0(2131749684, null);
                alertDialog$Builder.a.U = k47.h0(((TL_stars.checkCanSendGiftResultFail) tLObject4).reason, false);
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                final he o = alertDialog$Builder.o();
                final mv3 mv3Var = o.n;
                if (mv3Var != null) {
                    mv3Var.setOnLinkPressListener(new k66() { // from class: dx4
                        @Override // k66
                        public final void a(ClickableSpan clickableSpan) {
                            o.dismiss();
                            qac qacVar2 = qacVar;
                            if (qacVar2 != null) {
                                qacVar2.a(Boolean.FALSE);
                            }
                            ux4.this.dismiss();
                            clickableSpan.onClick(mv3Var);
                        }
                    });
                    return;
                }
                return;
            case 10:
                w45 w45Var = (w45) this.b;
                String str10 = (String) this.h;
                byte[] bArr = (byte[]) this.c;
                u35 u35Var = (u35) this.d;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
                t45 t45Var = (t45) this.f;
                org.telegram.ui.Wallet.c cVar2 = w45Var.b;
                if (!TextUtils.equals(str10, cVar2.x()) || !Arrays.equals(bArr, cVar2.D())) {
                    u35Var.a("Wallet or TON Connect session changed. Open the request again.");
                    return;
                }
                TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                tonconnectclosesession.session_id = tonconnectsession.id;
                tonconnectclosesession.body = t45Var.c;
                w45Var.f.sendRequestTyped(tonconnectclosesession, new kc((byte) 0), new vt4(u35Var, b2));
                return;
            case 11:
                w45 w45Var2 = (w45) this.b;
                String str11 = (String) this.h;
                byte[] bArr2 = (byte[]) this.c;
                t45 t45Var2 = (t45) this.d;
                byte[] bArr3 = t45Var2.b;
                lf2 lf2Var = (lf2) this.e;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f;
                org.telegram.ui.Wallet.c cVar3 = w45Var2.b;
                if (!TextUtils.equals(str11, cVar3.x()) || !Arrays.equals(bArr2, cVar3.D())) {
                    Arrays.fill(bArr3, (byte) 0);
                    lf2Var.a(null, "Wallet changed. Open the request again.");
                    return;
                }
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
                inputtonconnectoauthsession.session_id = tonconnectsession2.id;
                inputtonconnectoauthsession.challenge_answer = bArr3;
                inputtonconnectoauthsession.body = t45Var2.c;
                inputtonconnectoauthsession.proof = t45Var2.d;
                lf2Var.a(inputtonconnectoauthsession, null);
                return;
            case 12:
                w45 w45Var3 = (w45) this.b;
                String str12 = (String) this.h;
                qac qacVar2 = (qac) this.c;
                s45 s45Var = (s45) this.d;
                y25 y25Var = (y25) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                if (str12 != null) {
                    qacVar2.a(str12);
                    return;
                } else if (!w45Var3.A(s45Var) || w45Var3.i(s45Var)) {
                    qacVar2.a("Request expired or wallet changed");
                    return;
                } else {
                    w45Var3.f.sendRequestTyped(sendtransfer, new kc((byte) 0), new sm1(w45Var3, qacVar2, s45Var, y25Var, sendtransfer, (byte) 6));
                    return;
                }
            case 13:
                w45 w45Var4 = (w45) this.b;
                s45 s45Var2 = (s45) this.c;
                y25 y25Var2 = (y25) this.d;
                u35 u35Var2 = (u35) this.e;
                JSONObject jSONObject = (JSONObject) this.f;
                String str13 = (String) this.h;
                if (!w45Var4.A(s45Var2) || w45Var4.i(s45Var2)) {
                    w45Var4.y(s45Var2, y25Var2, null, 0, "Request expired or wallet changed", u35Var2);
                    return;
                } else {
                    w45Var4.y(s45Var2, y25Var2, jSONObject, jSONObject != null ? -1 : 0, str13, u35Var2);
                    return;
                }
            case 14:
                j55 j55Var = (j55) this.b;
                int[] iArr2 = (int[]) this.c;
                TextView textView = (TextView) this.d;
                xo1 xo1Var = (xo1) this.e;
                org.telegram.ui.Wallet.c cVar4 = (org.telegram.ui.Wallet.c) this.f;
                v45 v45Var = (v45) this.h;
                if (j55Var.e || j55Var.d) {
                    return;
                }
                iArr2[0] = 0;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                spannableStringBuilder.setSpan(new ta6(gm.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
                textView.setText(jb6.V(null, null, 2131742802, spannableStringBuilder));
                xo1Var.run();
                WalletEngine2 walletEngine2 = cVar4.b;
                if (walletEngine2 != null) {
                    walletEngine2.previewTonConnect(v45Var, new w35((Object) j55Var, (Object) iArr2, (Object) cVar4, (Object) textView, (Object) v45Var, (Object) xo1Var, (byte) 4));
                    return;
                }
                iArr2[0] = 3;
                textView.setText(jb6.M0(2131742649, null));
                xo1Var.run();
                return;
            case 15:
                qc6 qc6Var = (qc6) this.b;
                String str14 = (String) this.h;
                String str15 = (String) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = (TLRPC.TL_messageMediaVenue) this.e;
                Location location = (Location) this.f;
                dd6.R.remove(qc6Var);
                qc6Var.K(str14, str15, tL_messageMediaVenue, tL_messageMediaVenue2, location);
                return;
            case 16:
                File file3 = (File) this.f;
                File file4 = (File) this.b;
                boolean[] zArr = (boolean[]) this.c;
                qac qacVar3 = (qac) this.d;
                he heVar3 = (he) this.e;
                boolean[] zArr2 = (boolean[]) this.h;
                String[] strArr2 = MediaController.W1;
                try {
                } catch (Exception e) {
                    e = e;
                    z = true;
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                    boolean z4 = z;
                    fc4.g(e, z4);
                    b = z4;
                    if (z2) {
                    }
                    if (heVar3 != null) {
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    String p0 = gm.p0(0, "jpg");
                    ContentValues contentValues = new ContentValues();
                    Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                    z = true;
                    contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                    contentValues.put("_display_name", p0);
                    contentValues.put("mime_type", "image/jpeg");
                    contentValues.put("mime_type", "image/jpeg");
                    Uri insert = a.b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = a.b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.H0(file3, file4, openOutputStream, zArr);
                                z2 = !zArr[0];
                            } finally {
                            }
                        }
                        if (openOutputStream != null) {
                            openOutputStream.close();
                        }
                        if (z2) {
                            uri = insert;
                        } else {
                            try {
                                a.b.getContentResolver().delete(insert, null, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    b = z;
                    if (z2 && qacVar3 != null) {
                        gm.c3(new jn6(qacVar3, uri, b));
                    }
                    if (heVar3 != null) {
                        gm.c3(new gn6(heVar3, zArr2, (byte) 3));
                        return;
                    }
                    return;
                }
                z = true;
                File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                file5.mkdirs();
                File file6 = new File(file5, gm.p0(0, "jpg"));
                if (!file6.exists()) {
                    file6.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file6);
                try {
                    MediaController.H0(file3, file4, fileOutputStream, zArr);
                    fileOutputStream.close();
                    if (zArr[0]) {
                        file6.delete();
                    } else {
                        gm.d(file6.getAbsoluteFile());
                        uri = Uri.fromFile(file6);
                        z2 = true;
                    }
                    b = z;
                    if (z2) {
                        gm.c3(new jn6(qacVar3, uri, b));
                    }
                    if (heVar3 != null) {
                    }
                } finally {
                }
            case 17:
                d17 d17Var = (d17) this.c;
                String str16 = (String) this.h;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                oc7 oc7Var2 = (oc7) this.b;
                cf7 cf7Var = (cf7) this.f;
                k17 k17Var = d17Var.e;
                String str17 = k17Var.r0;
                if (str17 == null || !str17.equals(str16)) {
                    return;
                }
                if (tL_error3 == null) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                        TLRPC.User user2 = tL_contacts_resolvedPeer.users.get(0);
                        oc7Var2.c4(user2, false, false);
                        cf7Var.j1(tL_contacts_resolvedPeer.users, null, true, true);
                        user = user2;
                    }
                }
                k17Var.R(user);
                k17Var.u0 = 0;
                return;
            case 18:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                ylb ylbVar3 = (ylb) this.d;
                b61 b61Var2 = (b61) this.e;
                p71 p71Var = (p71) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tL_error4 != null) {
                    new c41(n21.a(context), ylbVar3).g0(tL_error4, false);
                    return;
                }
                b61Var2.setLoading(false);
                p71Var.dismiss();
                ts2.u(null, 2131746688, new c41(n21.a(context), ylbVar3), R.raw.chats_infotip, 36);
                runnable.run();
                return;
            case 19:
                oc7 oc7Var3 = (oc7) this.b;
                he heVar4 = (he) this.c;
                cr1 cr1Var = (cr1) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                d dVar = (d) this.f;
                Bundle bundle = (Bundle) this.h;
                if (heVar4 != null) {
                    try {
                        heVar4.dismiss();
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                    }
                }
                if (cr1Var != null) {
                    cr1Var.c(false);
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject6;
                oc7Var3.d4(messages_messages.users, false);
                oc7Var3.X3(messages_messages.chats, false);
                oc7Var3.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                dVar.presentFragment(new yv1(bundle), true);
                return;
            case 20:
                ((xz7) this.b).y1((TLRPC.TL_error) this.c, (String) this.h, (ez7) this.d, (TLObject) this.e, (TL_account.sendVerifyPhoneCode) this.f);
                return;
            case 21:
                da9 da9Var = (da9) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                byte[] bArr4 = (byte[]) this.f;
                String str18 = (String) this.h;
                hs1 hs1Var = da9Var.l1;
                if ((hs1Var.getCurrentView() instanceof ca9) && (b61Var = ((ca9) hs1Var.getCurrentView()).s) != null) {
                    b61Var.setLoading(false);
                }
                if (tLObject7 == null) {
                    if (tL_error5 != null) {
                        if (!da9Var.o1 && "MESSAGE_ID_REQUIRED".equals(tL_error5.text)) {
                            long j2 = da9Var.t1;
                            String charSequence2 = charSequence.toString();
                            int i6 = yv1.xd;
                            d S = LaunchActivity.S();
                            if (S != null) {
                                Bundle bundle2 = new Bundle();
                                if (pg3.D(j2)) {
                                    bundle2.putLong("user_id", j2);
                                } else {
                                    bundle2.putLong("chat_id", -j2);
                                }
                                bundle2.putString("reportTitle", charSequence2);
                                bundle2.putByteArray("reportOption", bArr4);
                                bundle2.putString("reportMessage", str18);
                                S.presentFragment(new yv1(bundle2));
                            }
                        } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error5.text)) {
                            z99 z99Var3 = da9Var.u1;
                            if (z99Var3 != null) {
                                z99Var3.i();
                            }
                        } else if ("AD_EXPIRED".equals(tL_error5.text) && (z99Var = da9Var.u1) != null) {
                            z99Var.d();
                        }
                        da9Var.dismiss();
                        return;
                    }
                    return;
                }
                boolean z5 = tLObject7 instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
                if (!z5 && !(tLObject7 instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject7 instanceof TLRPC.TL_reportResultAddComment)) {
                    if (tLObject7 instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        oc7.r1(da9Var.a).l0(false);
                        z99 z99Var4 = da9Var.u1;
                        if (z99Var4 != null) {
                            z99Var4.f();
                            da9Var.dismiss();
                            return;
                        }
                        return;
                    }
                    if (((tLObject7 instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject7 instanceof TLRPC.TL_reportResultReported)) && (z99Var2 = da9Var.u1) != null) {
                        z99Var2.d();
                        da9Var.dismiss();
                        return;
                    }
                    return;
                }
                hs1Var.E(hs1Var.b + 1);
                ca9 ca9Var = (ca9) hs1Var.getViewPages()[1];
                if (ca9Var != null) {
                    q7c q7cVar = ca9Var.f;
                    if (tLObject7 instanceof TLRPC.TL_reportResultChooseOption) {
                        ca9Var.b = null;
                        ca9Var.c = (TLRPC.TL_reportResultChooseOption) tLObject7;
                        ca9Var.d = null;
                        q7cVar.g3.O(false);
                    } else if (tLObject7 instanceof TLRPC.TL_reportResultAddComment) {
                        ca9Var.b((TLRPC.TL_reportResultAddComment) tLObject7);
                    } else if (z5) {
                        ca9Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject7;
                        ca9Var.c = null;
                        ca9Var.d = null;
                        q7cVar.g3.O(false);
                    }
                    if (charSequence != null) {
                        jp0 jp0Var = ca9Var.h;
                        ((TextView) jp0Var.b).setText(charSequence);
                        ((TextView) jp0Var.b).getText();
                        jp0Var.measure(View.MeasureSpec.makeMeasureSpec(gm.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(120.0f), TLObject.FLAG_31));
                        if (q7cVar != null) {
                            q7cVar.g3.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.b;
                Context context2 = (Context) this.c;
                ylb ylbVar4 = (ylb) this.d;
                byte[] bArr5 = (byte[]) this.e;
                d dVar2 = (d) this.f;
                il9 il9Var = (il9) this.h;
                da9 da9Var2 = new da9(context2, ylbVar4, 0L, bArr5);
                da9Var2.I0(tL_channels_sponsoredMessageReportResultChooseOption);
                da9Var2.u1 = new e7a(dVar2, context2, ylbVar4, il9Var);
                da9Var2.show();
                return;
            case 23:
                a();
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                e();
                return;
            case 28:
                f();
                return;
            default:
                a6a a6aVar2 = (a6a) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) this.d;
                m5a m5aVar = (m5a) this.e;
                String str19 = (String) this.h;
                k47 k47Var3 = (k47) this.f;
                if (!(tLObject8 instanceof TLRPC.TL_messageMediaPhoto)) {
                    m5aVar.c();
                    return;
                }
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject8).photo;
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                    inputMedia.flags |= 64;
                    inputMedia.video_cover = tL_inputPhoto;
                } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    inputMedia.flags |= 8;
                    inputMedia.video_cover = tL_inputPhoto;
                }
                m5aVar.j = null;
                m5aVar.i = null;
                HashMap hashMap2 = m5aVar.E;
                if (hashMap2 != null) {
                    hashMap2.remove(str19 + "_ct");
                }
                int indexOf = m5aVar.x.indexOf(k47Var3);
                ArrayList arrayList14 = m5aVar.A;
                if (arrayList14 != null && indexOf >= 0 && indexOf < arrayList14.size()) {
                    TLRPC.InputMedia inputMedia2 = (TLRPC.InputMedia) m5aVar.A.get(indexOf);
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                        inputMedia2.flags |= 64;
                        inputMedia2.video_cover = tL_inputPhoto;
                    }
                }
                HashMap hashMap3 = m5aVar.E;
                if (hashMap3 != null) {
                    if (hashMap3.containsKey(str19 + "_t")) {
                        photoSize = (TLRPC.PhotoSize) m5aVar.E.get(str19 + "_t");
                    }
                }
                m5aVar.g = photoSize;
                if (inputMedia.thumb != null || photoSize == null || photoSize.location == null) {
                    a6aVar2.s0(m5aVar, false);
                    return;
                } else {
                    m5aVar.p = true;
                    a6aVar2.L(m5aVar, indexOf);
                    return;
                }
        }
    }

    public /* synthetic */ e77(qw0 qw0Var, File file, he heVar, String str, String str2, String str3) {
        this.a = (byte) 4;
        this.b = qw0Var;
        this.f = file;
        this.c = heVar;
        this.h = str;
        this.d = str2;
        this.e = str3;
    }

    public /* synthetic */ e77(jm7 jm7Var, Object obj, Object obj2, String str, TLObject tLObject, Object obj3, byte b) {
        this.a = b;
        this.b = jm7Var;
        this.c = obj;
        this.d = obj2;
        this.h = str;
        this.e = tLObject;
        this.f = obj3;
    }

    public /* synthetic */ e77(xz7 xz7Var, TLRPC.TL_error tL_error, String str, ez7 ez7Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = (byte) 20;
        this.b = xz7Var;
        this.c = tL_error;
        this.h = str;
        this.d = ez7Var;
        this.e = tLObject;
        this.f = sendverifyphonecode;
    }

    public /* synthetic */ e77(a6a a6aVar, TLObject tLObject, TLRPC.InputMedia inputMedia, m5a m5aVar, String str, k47 k47Var) {
        this.a = (byte) 29;
        this.b = a6aVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = m5aVar;
        this.h = str;
        this.f = k47Var;
    }

    public /* synthetic */ e77(a6a a6aVar, TLRPC.TL_photo tL_photo, k47 k47Var, File file, m5a m5aVar, String str) {
        this.a = (byte) 28;
        this.b = a6aVar;
        this.c = tL_photo;
        this.d = k47Var;
        this.f = file;
        this.e = m5aVar;
        this.h = str;
    }

    public /* synthetic */ e77(File file, File file2, boolean[] zArr, qac qacVar, he heVar, boolean[] zArr2) {
        this.a = (byte) 16;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = qacVar;
        this.e = heVar;
        this.h = zArr2;
    }

    public /* synthetic */ e77(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ e77(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.h = str;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
