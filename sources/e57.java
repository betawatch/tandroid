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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class e57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e57(dz6 dz6Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, na7 na7Var, ad7 ad7Var) {
        this.a = (byte) 17;
        this.c = dz6Var;
        this.h = str;
        this.d = tL_error;
        this.e = tLObject;
        this.b = na7Var;
        this.f = ad7Var;
    }

    private final void a() {
        vp9 vp9Var = (vp9) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        ArrayList arrayList4 = (ArrayList) this.f;
        vf6 vf6Var = (vf6) this.h;
        ArrayList arrayList5 = vp9Var.c;
        ArrayList arrayList6 = vp9Var.i;
        int i = vp9Var.a;
        na7.q1(i).b4(arrayList, true);
        na7.q1(i).V3(arrayList2, true);
        vl.g(i).d(arrayList3);
        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
            vp9Var.i(((Long) arrayList4.get(i2)).longValue());
        }
        for (int i3 = 0; i3 < vf6Var.m(); i3++) {
            long j = vf6Var.j(i3);
            k27 k27Var = new k27(vp9Var.a, (TLRPC.Message) vf6Var.n(i3), null, null, null, null, null, false, false, 0L, false, false, true, 0);
            for (int i4 = 0; i4 < arrayList6.size(); i4++) {
                up9 up9Var = (up9) arrayList6.get(i4);
                if (up9Var.a == j) {
                    up9Var.c = k27Var.e1();
                    up9Var.d = k27Var;
                }
            }
            for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                up9 up9Var2 = (up9) arrayList5.get(i5);
                if (up9Var2.a == j) {
                    up9Var2.c = k27Var.e1();
                    up9Var2.d = k27Var;
                }
            }
        }
        vp9Var.k();
    }

    private final void b() {
        vp9 vp9Var = (vp9) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        ArrayList arrayList4 = (ArrayList) this.f;
        tp9 tp9Var = (tp9) this.h;
        vp9Var.k = false;
        vp9Var.l = true;
        int i = vp9Var.a;
        na7.q1(i).b4(arrayList, true);
        na7.q1(i).V3(arrayList2, true);
        vl.g(i).d(arrayList3);
        ArrayList arrayList5 = vp9Var.c;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        vp9Var.l();
        if (vp9Var.m) {
            return;
        }
        tp9Var.run();
    }

    private final void c() {
        bu9 bu9Var = (bu9) this.b;
        Activity activity = (Activity) this.c;
        hd hdVar = (hd) this.d;
        TLObject tLObject = (TLObject) this.e;
        byte[] bArr = (byte[]) this.f;
        TLRPC.User user = (TLRPC.User) this.h;
        bu9Var.n = false;
        if (!activity.isFinishing()) {
            try {
                hdVar.dismiss();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject;
        encryptedChat.user_id = encryptedChat.participant_id;
        encryptedChat.seq_in = -2;
        encryptedChat.seq_out = 1;
        encryptedChat.a_or_b = bArr;
        bu9Var.getMessagesController().X3(encryptedChat, false);
        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
        tL_dialog.id = cf3.E(encryptedChat.id);
        tL_dialog.unread_count = 0;
        tL_dialog.top_message = 0;
        tL_dialog.last_message_date = bu9Var.getConnectionsManager().getCurrentTime();
        bu9Var.getMessagesController().R.k(tL_dialog, tL_dialog.id);
        bu9Var.getMessagesController().y.add(tL_dialog);
        bu9Var.getMessagesController().Z4(null);
        ad7 messagesStorage = bu9Var.getMessagesStorage();
        messagesStorage.a.c(new jw6(messagesStorage, encryptedChat, user, tL_dialog, (byte) 10));
        bu9Var.getNotificationCenter().k(kk7.r, new Object[0]);
        bu9Var.getNotificationCenter().k(kk7.Z, encryptedChat);
        Utilities.d.c(new zk9(bu9Var, (byte) 14));
    }

    private final void d() {
        int i;
        final iy9 iy9Var = (iy9) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
        TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
        if (tL_error == null) {
            if (tL_inputCheckPasswordSRP != null) {
                eg egVar = iy9Var.U1;
                if (egVar != null) {
                    egVar.run();
                }
                iy9Var.dismiss();
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (iy9Var.e2 != null) {
            final byte b = 0;
            if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                if (tL_inputCheckPasswordSRP == null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iy9Var.e2);
                    String M0 = k96.M0(hc2.V(iy9Var.S1) ? 2131751310 : 2131751303, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = gl.S2(k96.a0(null, null, 2131751280, iy9Var.S1.title, l7c.k(user, true)));
                    alertDialog$Builder.j(k96.M0(2131751284, null), new kq8(iy9Var, user, (byte) 17));
                    alertDialog$Builder.g(k96.M0(2131752577, null), new ed() { // from class: zx9
                        @Override // ed
                        public final void u(hd hdVar2, int i2) {
                            byte b2 = b;
                            iy9 iy9Var2 = iy9Var;
                            switch (b2) {
                                case 0:
                                    iy9Var2.c2.setLoading(false);
                                    break;
                                case 1:
                                    d S = LaunchActivity.S();
                                    if (S != null) {
                                        iy9Var2.dismiss();
                                        S.presentFragment(new p3c(6, null));
                                        break;
                                    }
                                    break;
                                case 2:
                                    iy9Var2.c2.setLoading(false);
                                    break;
                                default:
                                    iy9Var2.c2.setLoading(false);
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
                    ConnectionsManager.getInstance(iy9Var.a).sendRequest(new TL_account.getPassword(), new ck8((Object) iy9Var, (Object) twoStepVerificationActivity, (Object) user, (byte) 6), 8);
                    return;
                }
                if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.s0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    d S = LaunchActivity.S();
                    if (S != null) {
                        ij.e0(tL_error, S, hc2.V(iy9Var.S1), hc2.Y(iy9Var.S1), tL_channels_editCreator);
                        return;
                    }
                    return;
                }
                if (iy9Var.e2 != null && !y6c.h(j5.a(iy9Var.a).a).p()) {
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        new h26(5, iy9Var.a, null, iy9Var.e2, S2);
                        return;
                    }
                    return;
                }
                d S3 = LaunchActivity.S();
                if (S3 != null) {
                    iy9Var.dismiss();
                    S3.presentFragment(new zsb(1));
                    return;
                }
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(iy9Var.e2);
            alertDialog$Builder2.a.S = k96.M0(2131751285, null);
            LinearLayout linearLayout = new LinearLayout(iy9Var.e2);
            linearLayout.setPadding(gl.L(24.0f), gl.L(2.0f), gl.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder2.n(linearLayout);
            TextView textView = new TextView(iy9Var.e2);
            int i2 = bkb.i5;
            zkb.X(textView, i2, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((k96.a0 ? 5 : 3) | 48);
            if (hc2.V(iy9Var.S1)) {
                de9.r(null, null, 2131751271, new Object[]{l7c.k(user, true)}, textView);
            } else {
                de9.r(null, null, 2131751289, new Object[]{l7c.k(user, true)}, textView);
            }
            linearLayout.addView(textView, nme.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(iy9Var.e2);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(iy9Var.e2);
            imageView.setImageResource(R.drawable.list_circle);
            imageView.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.s(imageView, i2, null, mode);
            TextView textView2 = new TextView(iy9Var.e2);
            zkb.X(textView2, i2, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((k96.a0 ? 5 : 3) | 48);
            textView2.setText(gl.S2(k96.M0(2131751288, null)));
            if (k96.a0) {
                linearLayout2.addView(textView2, nme.o(-1, -2));
                linearLayout2.addView(imageView, nme.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, nme.o(-2, -2));
                linearLayout2.addView(textView2, nme.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(iy9Var.e2);
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(iy9Var.e2);
            imageView2.setImageResource(R.drawable.list_circle);
            imageView2.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
            zkb.s(imageView2, i2, null, mode);
            TextView textView3 = new TextView(iy9Var.e2);
            zkb.X(textView3, i2, null);
            textView3.setTextSize(1, 16.0f);
            textView3.setGravity((k96.a0 ? 5 : 3) | 48);
            textView3.setText(gl.S2(k96.M0(2131751287, null)));
            if (k96.a0) {
                linearLayout3.addView(textView3, nme.o(-1, -2));
                i = 5;
                linearLayout3.addView(imageView2, nme.r(-2, -2, 5));
            } else {
                i = 5;
                linearLayout3.addView(imageView2, nme.o(-2, -2));
                linearLayout3.addView(textView3, nme.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                final byte b2 = 1;
                alertDialog$Builder2.j(k96.M0(2131751279, null), new ed() { // from class: zx9
                    @Override // ed
                    public final void u(hd hdVar2, int i22) {
                        byte b22 = b2;
                        iy9 iy9Var2 = iy9Var;
                        switch (b22) {
                            case 0:
                                iy9Var2.c2.setLoading(false);
                                break;
                            case 1:
                                d S4 = LaunchActivity.S();
                                if (S4 != null) {
                                    iy9Var2.dismiss();
                                    S4.presentFragment(new p3c(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                iy9Var2.c2.setLoading(false);
                                break;
                            default:
                                iy9Var2.c2.setLoading(false);
                                break;
                        }
                    }
                });
                final byte b3 = 2;
                alertDialog$Builder2.g(k96.M0(2131752577, null), new ed() { // from class: zx9
                    @Override // ed
                    public final void u(hd hdVar2, int i22) {
                        byte b22 = b3;
                        iy9 iy9Var2 = iy9Var;
                        switch (b22) {
                            case 0:
                                iy9Var2.c2.setLoading(false);
                                break;
                            case 1:
                                d S4 = LaunchActivity.S();
                                if (S4 != null) {
                                    iy9Var2.dismiss();
                                    S4.presentFragment(new p3c(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                iy9Var2.c2.setLoading(false);
                                break;
                            default:
                                iy9Var2.c2.setLoading(false);
                                break;
                        }
                    }
                });
            } else {
                TextView textView4 = new TextView(iy9Var.e2);
                zkb.X(textView4, i2, null);
                textView4.setTextSize(1, 16.0f);
                de9.q(textView4, (k96.a0 ? i : 3) | 48, null, 2131751286);
                linearLayout.addView(textView4, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                final byte b4 = 3;
                alertDialog$Builder2.g(k96.M0(2131747638, null), new ed() { // from class: zx9
                    @Override // ed
                    public final void u(hd hdVar2, int i22) {
                        byte b22 = b4;
                        iy9 iy9Var2 = iy9Var;
                        switch (b22) {
                            case 0:
                                iy9Var2.c2.setLoading(false);
                                break;
                            case 1:
                                d S4 = LaunchActivity.S();
                                if (S4 != null) {
                                    iy9Var2.dismiss();
                                    S4.presentFragment(new p3c(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                iy9Var2.c2.setLoading(false);
                                break;
                            default:
                                iy9Var2.c2.setLoading(false);
                                break;
                        }
                    }
                });
            }
            alertDialog$Builder2.o();
        }
    }

    private final void e() {
        z3a z3aVar = (z3a) this.b;
        String str = (String) this.h;
        String str2 = (String) this.c;
        String str3 = (String) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        g0b g0bVar = (g0b) this.f;
        u3a u3aVar = new u3a(z3aVar);
        u3aVar.f = str;
        u3aVar.e = str2;
        u3aVar.g = str3;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s3a s3aVar = (s3a) arrayList.get(i);
            File file = new File(s3aVar.a);
            if (file.exists()) {
                long length = file.length();
                if (length != 0) {
                    u3aVar.h += length;
                    u3aVar.d.add(s3aVar);
                    u3aVar.a.put(s3aVar.a, s3aVar);
                    hashMap.put(s3aVar.a, u3aVar);
                }
            }
            if (i == 0) {
                gl.c3(new zk9(g0bVar, (byte) 26));
                return;
            }
        }
        gl.c3(new ex7((Object) z3aVar, (Object) u3aVar, (Object) hashMap, (Object) str2, (Object) g0bVar, (byte) 21));
    }

    private final void f() {
        z3a z3aVar = (z3a) this.b;
        TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
        k27 k27Var = (k27) this.d;
        File file = (File) this.f;
        k3a k3aVar = (k3a) this.e;
        String str = (String) this.h;
        if (tL_photo == null) {
            if (w01.a) {
                StringBuilder p = ug8.p("can't load image ", str, " to file ");
                p.append(file.toString());
                fa4.d(p.toString());
            }
            k3aVar.c();
            return;
        }
        TLRPC.Message message = k27Var.k;
        message.media.photo = tL_photo;
        message.attachPath = file.toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(k27Var.k);
        z3aVar.getMessagesStorage().g1(arrayList, false, true, false, 0, false, k27Var.r1 ? 1 : 0, 0L);
        z3aVar.getNotificationCenter().k(kk7.k0, k27Var.k);
        k3aVar.g = (TLRPC.PhotoSize) b00.f(1, tL_photo.sizes);
        k3aVar.h = tL_photo;
        k3aVar.l = null;
        if (k3aVar.e != 4) {
            z3aVar.L(k3aVar, -1);
        } else {
            k3aVar.p = true;
            z3aVar.L(k3aVar, k3aVar.x.indexOf(k27Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x0840, code lost:
    
        if (r8.creator == false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x083c, code lost:
    
        if ((r12 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L296;
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
        zjb zjbVar;
        HashMap<String, String> hashMap;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.ChatParticipants chatParticipants;
        boolean z;
        byte b;
        x79 x79Var;
        x79 x79Var2;
        u41 u41Var;
        byte b2 = 6;
        int i2 = 33;
        byte b3 = 2;
        Uri uri = null;
        r9 = null;
        TLRPC.PhotoSize photoSize = null;
        r9 = null;
        TLRPC.User user = null;
        uri = null;
        uri = null;
        uri = null;
        uri = null;
        byte b4 = 0;
        r11 = false;
        r11 = false;
        r11 = false;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                na7 na7Var = (na7) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) this.d;
                vjb vjbVar = (vjb) this.e;
                File file = (File) this.f;
                String str = (String) this.h;
                if (na7Var.J2 == null || na7Var.K2.s == null || wallPaper == null) {
                    return;
                }
                wallPaper.settings = tL_wallPaperSettings;
                wallPaper.flags |= 4;
                vjbVar.c = wallPaper.slug;
                akb akbVar = vjbVar.p;
                if (akbVar != null && ((zjbVar = vjbVar.q) != null ? zjbVar.y == vjbVar : akbVar.j0 == vjbVar)) {
                    vjbVar.c();
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(wallPaper);
                na7Var.getMessagesStorage().m1(2, arrayList3);
                TLRPC.PhotoSize w = ba4.w(wallPaper.document.thumbs, kk7.q5, false, null, false);
                if (w != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(w.location.volume_id);
                    sb.append("_");
                    fl5.z().O(Utilities.a(file.getAbsolutePath()) + "@100_100", de9.l(sb, w.location.local_id, "@100_100"), gl5.c(w, wallPaper.document));
                }
                kk7.e().k(kk7.h4, wallPaper.slug);
                ArrayList arrayList4 = na7Var.K2.s;
                if (arrayList4 == null || vjbVar.n == 0) {
                    return;
                }
                arrayList4.add(Integer.valueOf(je2.e(na7Var.currentAccount).s(vjbVar.n, str, vjbVar, null, null)));
                return;
            case 1:
                z3a z3aVar = (z3a) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f;
                ArrayList arrayList9 = (ArrayList) this.h;
                boolean z3 = true;
                z3aVar.getMessagesController().b4(arrayList5, true);
                z3aVar.getMessagesController().V3(arrayList6, true);
                z3aVar.getMessagesController().Y3(arrayList7);
                int size = arrayList8.size();
                int i3 = 0;
                while (i3 < size) {
                    k27 k27Var = new k27(z3aVar.currentAccount, (TLRPC.Message) arrayList8.get(i3), false, z3);
                    long c1 = k27Var.c1();
                    if (c1 != 0 && (hashMap = k27Var.k.params) != null && !hashMap.containsKey("final") && (i3 == size - 1 || ((TLRPC.Message) arrayList8.get(i3 + 1)).grouped_id != c1)) {
                        k27Var.k.params.put("final", "1");
                    }
                    z3aVar.j0(0L, k27Var, true);
                    i3++;
                    z3 = true;
                }
                if (arrayList9 != null) {
                    for (int i4 = 0; i4 < arrayList9.size(); i4++) {
                        k27 k27Var2 = new k27(z3aVar.currentAccount, (TLRPC.Message) arrayList9.get(i4), false, true);
                        k27Var2.r1 = true;
                        z3aVar.j0(0L, k27Var2, true);
                    }
                    return;
                }
                return;
            case 2:
                ((ci0) this.b).l((Activity) this.c, (j5) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f, (nfd) this.h, true);
                return;
            case 3:
                hv0 hv0Var = (hv0) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                String str2 = (String) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                String str3 = (String) this.f;
                wjb wjbVar = hv0Var.e;
                if (tLObject == null) {
                    if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            new u21(hv0Var, wjbVar).I(R.raw.error, k96.M0(2131753125, null), gl.L2(bkb.v0(bkb.wj, wjbVar), k96.a0(null, null, 2131753127, str3))).j();
                            return;
                        } else {
                            new u21(hv0Var, wjbVar).g0(tL_error, false);
                            return;
                        }
                    }
                    return;
                }
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    un7.b(false, hv0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, hv0Var);
                    return;
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    un7.b(false, hv0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, hv0Var);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                        ij.m0(hv0Var.getContext(), str2, false, true, true, false, 0L, null, null, null);
                        return;
                    }
                    return;
                }
            case 4:
                hv0 hv0Var2 = (hv0) this.b;
                File file2 = (File) this.f;
                hd hdVar = (hd) this.c;
                String str4 = (String) this.h;
                String str5 = (String) this.d;
                String str6 = (String) this.e;
                if (file2 == null) {
                    hdVar.b(500L);
                    return;
                } else {
                    int[] iArr = new int[11];
                    Utilities.e.c(new nn6(file2, iArr, new i87((Object) hv0Var2, (Object) iArr, (Object) file2, (Object) hdVar, (Object) str4, (Object) str5, (Object) str6, (byte) 4), (byte) 27));
                    return;
                }
            case 5:
                TLObject tLObject2 = (TLObject) this.b;
                String[] strArr = (String[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                l46 l46Var = (l46) this.e;
                fx0 fx0Var = (fx0) this.f;
                wjb wjbVar2 = (wjb) this.h;
                if (tLObject2 instanceof TL_phone.exportedGroupCallInvite) {
                    String str7 = ((TL_phone.exportedGroupCallInvite) tLObject2).link;
                    strArr[0] = str7;
                    if (str7.startsWith("https://")) {
                        str7 = str7.substring(8);
                    }
                    String str8 = str7;
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new c81(frameLayout, atomicBoolean, l46Var, str8, (byte) 0));
                    duration.addListener(new r81(atomicBoolean, l46Var, str8));
                    duration.start();
                    new u21(fx0Var.F, wjbVar2).I(R.raw.linkbroken, k96.M0(2131749283, null), k96.M0(2131749284, null)).j();
                    return;
                }
                return;
            case 6:
                nf1 nf1Var = (nf1) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                ArrayList arrayList12 = (ArrayList) this.f;
                pe1 pe1Var = (pe1) this.h;
                TLRPC.Chat chat = nf1Var.f;
                nf1Var.a0 = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (!hc2.T(chat)) {
                            TLRPC.ChatFull L0 = nf1Var.getMessagesController().L0(chat.id);
                            if (L0 != null && (chatParticipants = L0.participants) != null) {
                                int size2 = chatParticipants.participants.size();
                                while (b4 < size2) {
                                    TLRPC.ChatParticipant chatParticipant = L0.participants.participants.get(b4);
                                    i = i2;
                                    arrayList = arrayList11;
                                    if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                        if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                            break;
                                        }
                                    } else {
                                        i2 = i;
                                        arrayList11 = arrayList;
                                        b4++;
                                    }
                                }
                            }
                        } else {
                            na7 messagesController = nf1Var.getMessagesController();
                            long j = channelParticipant.peer.user_id;
                            vf6 vf6Var = (vf6) messagesController.q1.f(chat.id);
                            TLRPC.ChannelParticipant channelParticipant2 = vf6Var == null ? null : (TLRPC.ChannelParticipant) vf6Var.f(j);
                            if (channelParticipant2 != null && ((channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) || channelParticipant2.admin_rights.manage_call)) {
                                i = 33;
                                arrayList = arrayList11;
                                break;
                            }
                        }
                    }
                    i = i2;
                    arrayList = arrayList11;
                    if (hc2.x(chat, channelParticipant, 6) || hc2.x(chat, channelParticipant, 7)) {
                        arrayList2 = arrayList;
                        b00.r(null, 2131745870, arrayList10, R.drawable.msg_block2, arrayList2);
                        arrayList12.add(Integer.valueOf(i));
                    } else {
                        arrayList2 = arrayList;
                    }
                    b00.r(null, 2131753726, arrayList10, R.drawable.msg_block, arrayList2);
                    arrayList12.add(35);
                }
                pe1Var.run();
                return;
            case 7:
                mu1 mu1Var = (mu1) this.b;
                op1 op1Var = (op1) this.c;
                gb2 gb2Var = (gb2) this.d;
                String str9 = (String) this.h;
                TLObject tLObject3 = (TLObject) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                op1Var.c(false);
                cs5 J = cs5.J(mu1Var, gb2Var);
                tq9 tq9Var = new tq9(mu1Var.getParentActivity(), mu1Var.Ba);
                J.p = new zk1(tq9Var, b4);
                J.b(R.drawable.msg_copy, k96.M0(2131751754, null), new el1(mu1Var, tq9Var, str9, b3), false);
                if (tLObject3 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject3;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList13 = tL_payments_bankCardData.open_urls;
                    int size3 = arrayList13.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList13.get(i5);
                        i5++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        J.b(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new aj1(mu1Var, tL_bankCardOpenUrl2, (byte) 12), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        J.j();
                        J.o(13, gl.L(200.0f), tL_payments_bankCardData.title);
                    }
                }
                tq9Var.e(J);
                tq9Var.f(gb2Var, characterStyle, null, false);
                mu1Var.showDialog(tq9Var);
                return;
            case 8:
                c cVar = (c) this.b;
                yic yicVar = (yic) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view = (View) this.e;
                RectF rectF = (RectF) this.f;
                ae9 ae9Var = (ae9) this.h;
                cVar.getClass();
                yicVar.getLocationInWindow(new int[2]);
                frameLayout2.getLocationInWindow(new int[2]);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + r0[0]) - r7[0]);
                layoutParams.topMargin = Math.round((rectF.top + r0[1]) - r7[1]);
                view.setLayoutParams(layoutParams);
                view.post(new hn1(cVar, frameLayout2, view, ae9Var, (byte) 5));
                return;
            case 9:
                final tv4 tv4Var = (tv4) this.b;
                hd hdVar2 = (hd) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                i57 i57Var = (i57) this.e;
                final p8c p8cVar = (p8c) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                hdVar2.dismiss();
                if (tLObject4 instanceof TL_stars.checkCanSendGiftResultOk) {
                    i57Var.run();
                    return;
                }
                if (!(tLObject4 instanceof TL_stars.checkCanSendGiftResultFail)) {
                    if (tL_error2 != null) {
                        new u21(tv4Var.c, tv4Var.J0).g0(tL_error2, false);
                        return;
                    }
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tv4Var.J0, tv4Var.getContext());
                alertDialog$Builder.a.S = k96.M0(2131749735, null);
                alertDialog$Builder.a.U = k27.h0(((TL_stars.checkCanSendGiftResultFail) tLObject4).reason, false);
                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                final hd o = alertDialog$Builder.o();
                final bu3 bu3Var = o.n;
                if (bu3Var != null) {
                    bu3Var.setOnLinkPressListener(new k46() { // from class: cv4
                        @Override // k46
                        public final void a(ClickableSpan clickableSpan) {
                            o.dismiss();
                            p8c p8cVar2 = p8cVar;
                            if (p8cVar2 != null) {
                                p8cVar2.a(Boolean.FALSE);
                            }
                            tv4.this.dismiss();
                            clickableSpan.onClick(bu3Var);
                        }
                    });
                    return;
                }
                return;
            case 10:
                w25 w25Var = (w25) this.b;
                String str10 = (String) this.h;
                byte[] bArr = (byte[]) this.c;
                x15 x15Var = (x15) this.d;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
                t25 t25Var = (t25) this.f;
                org.telegram.ui.Wallet.c cVar2 = w25Var.b;
                if (!TextUtils.equals(str10, cVar2.x()) || !Arrays.equals(bArr, cVar2.D())) {
                    x15Var.a("Wallet or TON Connect session changed. Open the request again.");
                    return;
                }
                TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                tonconnectclosesession.session_id = tonconnectsession.id;
                tonconnectclosesession.body = t25Var.c;
                w25Var.f.sendRequestTyped(tonconnectclosesession, new hc((byte) 0), new ur4(x15Var, b2));
                return;
            case 11:
                w25 w25Var2 = (w25) this.b;
                String str11 = (String) this.h;
                byte[] bArr2 = (byte[]) this.c;
                t25 t25Var2 = (t25) this.d;
                byte[] bArr3 = t25Var2.b;
                ae2 ae2Var = (ae2) this.e;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f;
                org.telegram.ui.Wallet.c cVar3 = w25Var2.b;
                if (!TextUtils.equals(str11, cVar3.x()) || !Arrays.equals(bArr2, cVar3.D())) {
                    Arrays.fill(bArr3, (byte) 0);
                    ae2Var.a(null, "Wallet changed. Open the request again.");
                    return;
                }
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
                inputtonconnectoauthsession.session_id = tonconnectsession2.id;
                inputtonconnectoauthsession.challenge_answer = bArr3;
                inputtonconnectoauthsession.body = t25Var2.c;
                inputtonconnectoauthsession.proof = t25Var2.d;
                ae2Var.a(inputtonconnectoauthsession, null);
                return;
            case 12:
                w25 w25Var3 = (w25) this.b;
                String str12 = (String) this.h;
                p8c p8cVar2 = (p8c) this.c;
                s25 s25Var = (s25) this.d;
                y05 y05Var = (y05) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                if (str12 != null) {
                    p8cVar2.a(str12);
                    return;
                } else if (!w25Var3.A(s25Var) || w25Var3.i(s25Var)) {
                    p8cVar2.a("Request expired or wallet changed");
                    return;
                } else {
                    w25Var3.f.sendRequestTyped(sendtransfer, new hc((byte) 0), new jl1(w25Var3, p8cVar2, s25Var, y05Var, sendtransfer, (byte) 6));
                    return;
                }
            case 13:
                w25 w25Var4 = (w25) this.b;
                s25 s25Var2 = (s25) this.c;
                y05 y05Var2 = (y05) this.d;
                x15 x15Var2 = (x15) this.e;
                JSONObject jSONObject = (JSONObject) this.f;
                String str13 = (String) this.h;
                if (!w25Var4.A(s25Var2) || w25Var4.i(s25Var2)) {
                    w25Var4.y(s25Var2, y05Var2, null, 0, "Request expired or wallet changed", x15Var2);
                    return;
                } else {
                    w25Var4.y(s25Var2, y05Var2, jSONObject, jSONObject != null ? -1 : 0, str13, x15Var2);
                    return;
                }
            case 14:
                j35 j35Var = (j35) this.b;
                int[] iArr2 = (int[]) this.c;
                TextView textView = (TextView) this.d;
                hn1 hn1Var = (hn1) this.e;
                org.telegram.ui.Wallet.c cVar4 = (org.telegram.ui.Wallet.c) this.f;
                v25 v25Var = (v25) this.h;
                if (j35Var.e || j35Var.d) {
                    return;
                }
                iArr2[0] = 0;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                spannableStringBuilder.setSpan(new u86(gl.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
                textView.setText(k96.V(null, null, 2131742876, spannableStringBuilder));
                hn1Var.run();
                WalletEngine2 walletEngine2 = cVar4.b;
                if (walletEngine2 != null) {
                    walletEngine2.previewTonConnect(v25Var, new v15((Object) j35Var, (Object) iArr2, (Object) cVar4, (Object) textView, (Object) v25Var, (Object) hn1Var, (byte) 4));
                    return;
                }
                iArr2[0] = 3;
                textView.setText(k96.M0(2131742723, null));
                hn1Var.run();
                return;
            case 15:
                ra6 ra6Var = (ra6) this.b;
                String str14 = (String) this.h;
                String str15 = (String) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = (TLRPC.TL_messageMediaVenue) this.e;
                Location location = (Location) this.f;
                eb6.R.remove(ra6Var);
                ra6Var.K(str14, str15, tL_messageMediaVenue, tL_messageMediaVenue2, location);
                return;
            case 16:
                File file3 = (File) this.f;
                File file4 = (File) this.b;
                boolean[] zArr = (boolean[]) this.c;
                p8c p8cVar3 = (p8c) this.d;
                hd hdVar3 = (hd) this.e;
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
                    fa4.g(e, z4);
                    b = z4;
                    if (z2) {
                    }
                    if (hdVar3 != null) {
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    String p0 = gl.p0(0, "jpg");
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
                    if (z2 && p8cVar3 != null) {
                        gl.c3(new hl6(p8cVar3, uri, b));
                    }
                    if (hdVar3 != null) {
                        gl.c3(new dl6(hdVar3, zArr2, (byte) 3));
                        return;
                    }
                    return;
                }
                z = true;
                File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                file5.mkdirs();
                File file6 = new File(file5, gl.p0(0, "jpg"));
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
                        gl.d(file6.getAbsoluteFile());
                        uri = Uri.fromFile(file6);
                        z2 = true;
                    }
                    b = z;
                    if (z2) {
                        gl.c3(new hl6(p8cVar3, uri, b));
                    }
                    if (hdVar3 != null) {
                    }
                } finally {
                }
            case 17:
                dz6 dz6Var = (dz6) this.c;
                String str16 = (String) this.h;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                na7 na7Var2 = (na7) this.b;
                ad7 ad7Var = (ad7) this.f;
                kz6 kz6Var = dz6Var.e;
                String str17 = kz6Var.r0;
                if (str17 == null || !str17.equals(str16)) {
                    return;
                }
                if (tL_error3 == null) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                        TLRPC.User user2 = tL_contacts_resolvedPeer.users.get(0);
                        na7Var2.a4(user2, false, false);
                        ad7Var.j1(tL_contacts_resolvedPeer.users, null, true, true);
                        user = user2;
                    }
                }
                kz6Var.R(user);
                kz6Var.u0 = 0;
                return;
            case 18:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                wjb wjbVar3 = (wjb) this.d;
                u41 u41Var2 = (u41) this.e;
                i61 i61Var = (i61) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tL_error4 != null) {
                    new u21(f11.a(context), wjbVar3).g0(tL_error4, false);
                    return;
                }
                u41Var2.setLoading(false);
                i61Var.dismiss();
                ir2.v(null, 2131746762, new u21(f11.a(context), wjbVar3), R.raw.chats_infotip, 36);
                runnable.run();
                return;
            case 19:
                na7 na7Var3 = (na7) this.b;
                hd hdVar4 = (hd) this.c;
                pp1 pp1Var = (pp1) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                d dVar = (d) this.f;
                Bundle bundle = (Bundle) this.h;
                if (hdVar4 != null) {
                    try {
                        hdVar4.dismiss();
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                }
                if (pp1Var != null) {
                    pp1Var.c(false);
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject6;
                na7Var3.b4(messages_messages.users, false);
                na7Var3.V3(messages_messages.chats, false);
                na7Var3.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                dVar.presentFragment(new mu1(bundle), true);
                return;
            case 20:
                ((vx7) this.b).x1((TLRPC.TL_error) this.c, (String) this.h, (bx7) this.d, (TLObject) this.e, (TL_account.sendVerifyPhoneCode) this.f);
                return;
            case 21:
                b89 b89Var = (b89) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                byte[] bArr4 = (byte[]) this.f;
                String str18 = (String) this.h;
                vq1 vq1Var = b89Var.l1;
                if ((vq1Var.getCurrentView() instanceof a89) && (u41Var = ((a89) vq1Var.getCurrentView()).s) != null) {
                    u41Var.setLoading(false);
                }
                if (tLObject7 == null) {
                    if (tL_error5 != null) {
                        if (!b89Var.o1 && "MESSAGE_ID_REQUIRED".equals(tL_error5.text)) {
                            long j2 = b89Var.t1;
                            String charSequence2 = charSequence.toString();
                            int i6 = mu1.nd;
                            d S = LaunchActivity.S();
                            if (S != null) {
                                Bundle bundle2 = new Bundle();
                                if (cf3.D(j2)) {
                                    bundle2.putLong("user_id", j2);
                                } else {
                                    bundle2.putLong("chat_id", -j2);
                                }
                                bundle2.putString("reportTitle", charSequence2);
                                bundle2.putByteArray("reportOption", bArr4);
                                bundle2.putString("reportMessage", str18);
                                S.presentFragment(new mu1(bundle2));
                            }
                        } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error5.text)) {
                            x79 x79Var3 = b89Var.u1;
                            if (x79Var3 != null) {
                                x79Var3.j();
                            }
                        } else if ("AD_EXPIRED".equals(tL_error5.text) && (x79Var = b89Var.u1) != null) {
                            x79Var.d();
                        }
                        b89Var.dismiss();
                        return;
                    }
                    return;
                }
                boolean z5 = tLObject7 instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
                if (!z5 && !(tLObject7 instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject7 instanceof TLRPC.TL_reportResultAddComment)) {
                    if (tLObject7 instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        na7.q1(b89Var.a).l0(false);
                        x79 x79Var4 = b89Var.u1;
                        if (x79Var4 != null) {
                            x79Var4.g();
                            b89Var.dismiss();
                            return;
                        }
                        return;
                    }
                    if (((tLObject7 instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject7 instanceof TLRPC.TL_reportResultReported)) && (x79Var2 = b89Var.u1) != null) {
                        x79Var2.d();
                        b89Var.dismiss();
                        return;
                    }
                    return;
                }
                vq1Var.E(vq1Var.b + 1);
                a89 a89Var = (a89) vq1Var.getViewPages()[1];
                if (a89Var != null) {
                    q5c q5cVar = a89Var.f;
                    if (tLObject7 instanceof TLRPC.TL_reportResultChooseOption) {
                        a89Var.b = null;
                        a89Var.c = (TLRPC.TL_reportResultChooseOption) tLObject7;
                        a89Var.d = null;
                        q5cVar.g3.O(false);
                    } else if (tLObject7 instanceof TLRPC.TL_reportResultAddComment) {
                        a89Var.b((TLRPC.TL_reportResultAddComment) tLObject7);
                    } else if (z5) {
                        a89Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject7;
                        a89Var.c = null;
                        a89Var.d = null;
                        q5cVar.g3.O(false);
                    }
                    if (charSequence != null) {
                        jo0 jo0Var = a89Var.h;
                        ((TextView) jo0Var.b).setText(charSequence);
                        ((TextView) jo0Var.b).getText();
                        jo0Var.measure(View.MeasureSpec.makeMeasureSpec(gl.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(120.0f), TLObject.FLAG_31));
                        if (q5cVar != null) {
                            q5cVar.g3.O(true);
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
                wjb wjbVar4 = (wjb) this.d;
                byte[] bArr5 = (byte[]) this.e;
                d dVar2 = (d) this.f;
                tj9 tj9Var = (tj9) this.h;
                b89 b89Var2 = new b89(context2, wjbVar4, 0L, bArr5);
                b89Var2.H0(tL_channels_sponsoredMessageReportResultChooseOption);
                b89Var2.u1 = new wtc(dVar2, context2, wjbVar4, tj9Var);
                b89Var2.show();
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
                z3a z3aVar2 = (z3a) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) this.d;
                k3a k3aVar = (k3a) this.e;
                String str19 = (String) this.h;
                k27 k27Var3 = (k27) this.f;
                if (!(tLObject8 instanceof TLRPC.TL_messageMediaPhoto)) {
                    k3aVar.c();
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
                k3aVar.j = null;
                k3aVar.i = null;
                HashMap hashMap2 = k3aVar.E;
                if (hashMap2 != null) {
                    hashMap2.remove(str19 + "_ct");
                }
                int indexOf = k3aVar.x.indexOf(k27Var3);
                ArrayList arrayList14 = k3aVar.A;
                if (arrayList14 != null && indexOf >= 0 && indexOf < arrayList14.size()) {
                    TLRPC.InputMedia inputMedia2 = (TLRPC.InputMedia) k3aVar.A.get(indexOf);
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                        inputMedia2.flags |= 64;
                        inputMedia2.video_cover = tL_inputPhoto;
                    }
                }
                HashMap hashMap3 = k3aVar.E;
                if (hashMap3 != null) {
                    if (hashMap3.containsKey(str19 + "_t")) {
                        photoSize = (TLRPC.PhotoSize) k3aVar.E.get(str19 + "_t");
                    }
                }
                k3aVar.g = photoSize;
                if (inputMedia.thumb != null || photoSize == null || photoSize.location == null) {
                    z3aVar2.s0(k3aVar, false);
                    return;
                } else {
                    k3aVar.p = true;
                    z3aVar2.L(k3aVar, indexOf);
                    return;
                }
        }
    }

    public /* synthetic */ e57(hv0 hv0Var, File file, hd hdVar, String str, String str2, String str3) {
        this.a = (byte) 4;
        this.b = hv0Var;
        this.f = file;
        this.c = hdVar;
        this.h = str;
        this.d = str2;
        this.e = str3;
    }

    public /* synthetic */ e57(gk7 gk7Var, Object obj, Object obj2, String str, TLObject tLObject, Object obj3, byte b) {
        this.a = b;
        this.b = gk7Var;
        this.c = obj;
        this.d = obj2;
        this.h = str;
        this.e = tLObject;
        this.f = obj3;
    }

    public /* synthetic */ e57(vx7 vx7Var, TLRPC.TL_error tL_error, String str, bx7 bx7Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = (byte) 20;
        this.b = vx7Var;
        this.c = tL_error;
        this.h = str;
        this.d = bx7Var;
        this.e = tLObject;
        this.f = sendverifyphonecode;
    }

    public /* synthetic */ e57(z3a z3aVar, TLObject tLObject, TLRPC.InputMedia inputMedia, k3a k3aVar, String str, k27 k27Var) {
        this.a = (byte) 29;
        this.b = z3aVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = k3aVar;
        this.h = str;
        this.f = k27Var;
    }

    public /* synthetic */ e57(z3a z3aVar, TLRPC.TL_photo tL_photo, k27 k27Var, File file, k3a k3aVar, String str) {
        this.a = (byte) 28;
        this.b = z3aVar;
        this.c = tL_photo;
        this.d = k27Var;
        this.f = file;
        this.e = k3aVar;
        this.h = str;
    }

    public /* synthetic */ e57(File file, File file2, boolean[] zArr, p8c p8cVar, hd hdVar, boolean[] zArr2) {
        this.a = (byte) 16;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = p8cVar;
        this.e = hdVar;
        this.h = zArr2;
    }

    public /* synthetic */ e57(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ e57(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.h = str;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
