// default package

import android.animation.Animator;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c;
import org.telegram.ui.Components.f;
import org.telegram.ui.Components.l;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dy1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dy1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                ((mnc) this.b).a((cm3) this.c);
                break;
            case 1:
                c cVar = (c) this.b;
                tnc tncVar = (tnc) this.c;
                cVar.getClass();
                hl.B2(tncVar);
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                chatActivityEnterView.t1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    break;
                }
                break;
            case 2:
                ((f) this.b).onAnimationEnd((Animator) this.c);
                break;
            case 3:
                l lVar = (l) this.b;
                go1 go1Var = (go1) this.c;
                ChatActivityEnterView chatActivityEnterView2 = lVar.U0;
                chatActivityEnterView2.X1 = chatActivityEnterView2.i1.getAudioRightMs() - chatActivityEnterView2.i1.getAudioLeftMs();
                MediaController z = MediaController.z();
                long audioLeftMs = chatActivityEnterView2.i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView2.i1.getAudioRightMs();
                if (z.I1) {
                    v20 v20Var = z.G1;
                    if (v20Var != null) {
                        i30 i30Var = v20Var.b;
                        i30Var.getClass();
                        i30.q();
                        if (i30Var.G == 5) {
                            long j = i30Var.j();
                            long max = Math.max(0L, Math.min(j, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j, audioRightMs));
                            if (max2 - max >= Math.min(i30Var.c, j)) {
                                i30Var.r = max;
                                i30Var.s = max2;
                                s64 s64Var = i30Var.A;
                                if (s64Var != null) {
                                    s64Var.k1(max);
                                }
                                i30Var.f.getClass();
                                i30Var.m();
                                hl.c3(go1Var);
                                break;
                            }
                        }
                    }
                    ik8.q(audioRightMs, ik8.o(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    hl.c3(go1Var);
                } else if (z.k1 == null) {
                    hl.c3(go1Var);
                    break;
                } else {
                    z.N1.c(new hv4((Object) z, (Serializable) new vn6(xb4.z(1), System.currentTimeMillis() + "_" + xb4.r(null, z.g1), (byte) 0), audioLeftMs, audioRightMs, (Object) go1Var, (byte) 5));
                    break;
                }
            case 4:
                ((n12) this.b).b.removeView((kg5) this.c);
                break;
            case 5:
                n12 n12Var = (n12) this.b;
                e eVar = (e) this.c;
                n12Var.a(true);
                if (eVar != null) {
                    eVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 6:
                n12 n12Var2 = (n12) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!n12Var2.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    hl.E3(editTextBoldCursor);
                    break;
                }
                break;
            case 7:
                n12 n12Var3 = (n12) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((g12) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                n12Var3.y1(tL_attachMenuBot.bot_id, null, false, true);
                ls6 d0 = ls6.d0(n12Var3.G3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
                if (tL_attachMenuBots != null) {
                    d0.getMessagesStorage().a.c(new r77((Object) d0, (Object) tL_attachMenuBots, d0.a, d0.e, (byte) 7));
                    break;
                }
                break;
            case 8:
                n12 n12Var4 = (n12) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                ls6.d0(n12Var4.G3).G0(false, true, null);
                if (n12Var4.v2 == n12Var4.u2.get(tL_attachMenuBot2.bot_id)) {
                    n12Var4.B1(n12Var4.d2);
                    break;
                }
                break;
            case 9:
                x12 x12Var = (x12) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                x12Var.H = false;
                x12Var.I = arrayList;
                x12Var.S();
                break;
            case 10:
                j22 j22Var = (j22) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (!j22Var.U) {
                    if (tL_error != null) {
                        j22Var.b.dismiss();
                        break;
                    } else {
                        hl.d3(j22Var.V, 60000L);
                        break;
                    }
                }
                break;
            case 11:
                j22 j22Var2 = (j22) this.b;
                v21 Q = new d31(j22Var2.b.c, j22Var2.a).Q(R.raw.contact_check, 36, hl.S2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                break;
            case 12:
                hl.c3(new dy1((a32) this.b, ((z22) this.c).run(), (byte) 13));
                break;
            case 13:
                ((a32) this.b).setStatus((CharSequence) this.c);
                break;
            case 14:
                t32 t32Var = (t32) this.b;
                String str = (String) this.c;
                t32Var.getClass();
                ArrayList arrayList2 = new ArrayList(t32Var.Y.w.e);
                if (t32Var.Y.w.f.isEmpty()) {
                    arrayList2.addAll(0, (ArrayList) t32Var.Y.w.h);
                }
                Utilities.g.c(new lg((Object) t32Var, (Object) str, !t32Var.S.isEmpty(), (Object) arrayList2, (byte) 8));
                break;
            case 15:
                t32 t32Var2 = (t32) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                u32 u32Var = t32Var2.Y;
                boolean z2 = u32Var.c0;
                i32 i32Var = u32Var.r;
                if (z2) {
                    j79 adapter = i32Var.getAdapter();
                    t32 t32Var3 = u32Var.E;
                    if (adapter != t32Var3) {
                        i32Var.setAdapter(t32Var3);
                    }
                }
                t32Var2.s = arrayList3;
                t32Var2.f();
                break;
            case 16:
                h42 h42Var = (h42) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                n12 n12Var5 = h42Var.b;
                n12Var5.dismiss();
                n12Var5.Z1.presentFragment(zu1.ha(user.id));
                break;
            case 17:
                bs2.v(null, 2131742852, new d31((h42) this.b, (vnb) this.c), R.raw.copy, 36);
                break;
            case 18:
                s42 s42Var = (s42) this.b;
                float[] fArr = (float[]) this.c;
                s42Var.f0(fArr[0], fArr[1]);
                break;
            case 19:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                f12 f12Var = (f12) this.c;
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                int currentItemTop = f12Var.getCurrentItemTop();
                int listTopPadding = f12Var.getListTopPadding();
                i52 i52Var = chatAttachAlertPhotoLayout.F;
                if (currentItemTop > hl.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                i52Var.scrollBy(0, listTopPadding);
                break;
            case 20:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                r52 r52Var = chatAttachAlertPhotoLayout2.Q;
                if (r52Var != null) {
                    r52Var.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 21:
                c62 c62Var = (c62) this.b;
                f12 f12Var2 = (f12) this.c;
                int currentItemTop2 = f12Var2.getCurrentItemTop();
                int listTopPadding2 = f12Var2.getListTopPadding();
                gu guVar = c62Var.r;
                if (currentItemTop2 > hl.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                guVar.scrollBy(0, listTopPadding2);
                break;
            case 22:
                t82 t82Var = (t82) this.b;
                hm hmVar = (hm) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t82Var.h.getText());
                for (hm hmVar2 : (hm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hm.class)) {
                    if (hmVar2 == hmVar) {
                        int editTextSelectionEnd = t82Var.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(hmVar2);
                        int spanStart = spannableStringBuilder.getSpanStart(hmVar2);
                        t82Var.h.getText().delete(spanStart, spanEnd);
                        int i = spanEnd - spanStart;
                        q82 q82Var = t82Var.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i;
                        }
                        q82Var.setSelection(editTextSelectionEnd);
                        break;
                    }
                }
                break;
            case 23:
                t82 t82Var2 = (t82) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (t82Var2.X == null || !tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    String str2 = tL_error2.text;
                    if (str2.equals("REACTIONS_TOO_MANY")) {
                        str2 = ob6.G(t82Var2.O, "ReactionMaxCountError", new Object[0]);
                    }
                    d31.b0(t82Var2).t(str2, null).j();
                    break;
                } else {
                    z49.f(-t82Var2.T, t82Var2.Y, t82Var2.X);
                    break;
                }
                break;
            case 24:
                r82 r82Var = (r82) this.b;
                hm hmVar3 = (hm) this.c;
                t82 t82Var3 = r82Var.g2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(t82Var3.h.getText());
                for (hm hmVar4 : (hm[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), hm.class)) {
                    if (hmVar4 == hmVar3) {
                        int editTextSelectionEnd2 = t82Var3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(hmVar4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(hmVar4);
                        t82Var3.h.getText().delete(spanStart2, spanEnd2);
                        int i2 = spanEnd2 - spanStart2;
                        q82 q82Var2 = t82Var3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i2;
                        }
                        q82Var2.setSelection(editTextSelectionEnd2);
                        break;
                    }
                }
                break;
            case 25:
                g92 g92Var = (g92) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                g92Var.getClass();
                g92Var.presentFragment(w1b.d0(chat, true));
                break;
            case 26:
                v92 v92Var = (v92) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                boolean z5 = tL_error3 == null || !tL_error3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                v92Var.d0 = z5;
                if (!z5 && v92Var.getUserConfig().p() && !v92Var.e0 && v92Var.y != null) {
                    v92Var.e0 = true;
                    v92Var.g0();
                    v92Var.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new h92(v92Var, b));
                    break;
                }
                break;
            case 27:
                v92 v92Var2 = (v92) this.b;
                String str3 = (String) this.c;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str3;
                tL_channels_checkUsername.channel = v92Var2.getMessagesController().h1(v92Var2.a0);
                v92Var2.i0 = v92Var2.getConnectionsManager().sendRequest(tL_channels_checkUsername, new fn0((Object) v92Var2, (Object) str3, (Object) tL_channels_checkUsername, (byte) 18), 2);
                break;
            case 28:
                w92 w92Var = (w92) this.b;
                z31 z31Var = (z31) this.c;
                w92Var.c.d();
                z31Var.run();
                break;
            default:
                ((na2) this.b).Y((id[]) this.c);
                break;
        }
    }
}
