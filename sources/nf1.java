// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nf1 extends d implements gk7 {
    public static int Q0 = 10;
    public static final int[] R0 = {kk7.S, kk7.r, kk7.s, kk7.C, kk7.F0};
    public HashMap A0;
    public boolean B0;
    public final bf1 C0;
    public ef1 D0;
    public cu6 E;
    public final ArrayList E0;
    public kf1 F;
    public final vf6 F0;
    public TextView G;
    public ze1 G0;
    public su1 H;
    public int H0;
    public FrameLayout I;
    public te1 I0;
    public o72 J;
    public gb2 J0;
    public LinearLayout K;
    public int K0;
    public ImageView L;
    public final mf1 L0;
    public wb M;
    public long M0;
    public uk1 N;
    public int N0;
    public r7 O;
    public int O0;
    public long P;
    public final RectF P0;
    public boolean Q;
    public boolean R;
    public AnimatorSet S;
    public boolean T;
    public final int[] U;
    public boolean V;
    public boolean W;
    public ry1 X;
    public lf1 Y;
    public k27 Z;
    public final mx4 a;
    public TLRPC.ChannelParticipant a0;
    public final kl0 b;
    public FrameLayout b0;
    public final kl0 c;
    public ImageView c0;
    public final cq3 d;
    public jia d0;
    public final int e;
    public yc e0;
    public final TLRPC.Chat f;
    public ix f0;
    public TextureView g0;
    public final ArrayList h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final vf6 l0;
    public final vf6 m0;
    public FrameLayout n;
    public final HashMap n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final HashSet q0;
    public View r;
    public boolean r0;
    public RadialProgressView s;
    public boolean s0;
    public boolean t0;
    public ArrayList u0;
    public TLRPC.TL_channelAdminLogEventsFilter v0;
    public fu w;
    public String w0;
    public UndoView x;
    public vf6 x0;
    public zr y;
    public final on y0;
    public final HashMap z0;

    public nf1(TLRPC.Chat chat) {
        super(null);
        this.h = new ArrayList();
        this.U = new int[]{2};
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = true;
        this.k0 = false;
        this.l0 = new vf6();
        this.m0 = new vf6();
        this.n0 = new HashMap();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new HashSet();
        this.v0 = null;
        this.w0 = "";
        this.y0 = new on(R0);
        this.z0 = new HashMap();
        this.C0 = new bf1(this);
        this.E0 = new ArrayList();
        this.F0 = new vf6();
        this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.L0 = new mf1(this);
        this.N0 = -1;
        this.P0 = new RectF();
        qw4 qw4Var = this.glassEngine;
        qw4Var.a = new ue1(this);
        qw4Var.d = new ax4(gl.L(48.0f));
        mx4 mx4Var = new mx4();
        this.a = mx4Var;
        kl0 kl0Var = new kl0(mx4Var, mx4Var, mx4Var);
        this.b = kl0Var;
        kl0Var.j = this.glassEngine;
        if (Build.VERSION.SDK_INT < 31 || !gba.f()) {
            this.d = null;
            this.e = 0;
            kl0 kl0Var2 = new kl0(mx4Var, mx4Var, mx4Var);
            this.c = kl0Var2;
            kl0Var2.j = this.glassEngine;
        } else {
            cq3 cq3Var = new cq3(false);
            this.d = cq3Var;
            this.glassEngine.a(cq3Var);
            lx4 lx4Var = new lx4(mx4Var);
            lx4Var.d = cq3Var;
            lx4Var.e = -3;
            lx4Var.f = mx4Var;
            if (e66.e(262144)) {
                lx4 lx4Var2 = new lx4(mx4Var);
                lx4Var2.d = cq3Var;
                lx4Var2.e = -2;
                lx4Var2.f = mx4Var;
                kl0 kl0Var3 = new kl0(lx4Var2, lx4Var2, lx4Var2);
                this.c = kl0Var3;
                kl0Var3.j = this.glassEngine;
                int L = e66.e(262144) ? gl.L(8.0f) : gl.L(48.0f);
                kl0Var3.d = L;
                kl0Var3.e = L;
                kl0Var3.k = true;
                this.e = 0;
            } else {
                kl0 kl0Var4 = new kl0(lx4Var, lx4Var, lx4Var);
                this.c = kl0Var4;
                kl0Var4.j = this.glassEngine;
                int L2 = e66.e(262144) ? gl.L(8.0f) : gl.L(48.0f);
                kl0Var4.d = L2;
                kl0Var4.e = L2;
                this.e = gl.L(48.0f);
            }
        }
        this.f = chat;
    }

    public static uo8 O0(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (cm2 cm2Var : (cm2[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), cm2.class)) {
            if (cm2Var != null) {
                Drawable drawable = cm2Var.c;
                if (drawable instanceof uo8) {
                    return (uo8) drawable;
                }
            }
        }
        return null;
    }

    public static void c1(int i, k27 k27Var) {
        if (k27Var == null) {
            return;
        }
        if (i <= 0) {
            TLRPC.ReplyMarkup replyMarkup = k27Var.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = k27Var.k.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            k27Var.k.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = k96.G(i, "EventLogExpandMore", new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        k27Var.h5();
    }

    public static CharSequence e1(SpannableStringBuilder spannableStringBuilder) {
        int t = gl.t(spannableStringBuilder, "\n\n");
        if (t >= 0 && Build.VERSION.SDK_INT >= 29) {
            mk1.j();
            spannableStringBuilder.setSpan(mk1.g(gl.L(8.0f)), t + 1, t + 2, 33);
        }
        return spannableStringBuilder;
    }

    public final k27 H0(long j, long j2, ArrayList arrayList, boolean z, boolean z2) {
        k27 k27Var;
        byte b = 0;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.p0;
            if (i >= arrayList2.size()) {
                k27Var = null;
                break;
            }
            k27Var = (k27) arrayList2.get(i);
            if (k27Var != null && k27Var.U == 1 && k27Var.J0 == j) {
                break;
            }
            i++;
        }
        if (k27Var == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.f.id;
            tL_message.id = -1;
            try {
                tL_message.date = ((k27) arrayList.get(0)).k.date;
            } catch (Exception e) {
                fa4.g(e, true);
            }
            k27Var = new k27(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j2));
        k27Var.U = 1;
        if (!z2 || arrayList.size() <= 1) {
            k27Var.J0 = -1L;
        } else {
            k27Var.J0 = j;
        }
        byte b2 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k27.D5(k96.G(arrayList.size(), z2 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", TextUtils.join(", ", Collection.-EL.stream(arrayList).map(new xz(b2)).distinct().map(new ve1(this, b)).filter(new sd(b2)).limit(4L).toArray())), "un1", V1));
        if (z2 && arrayList.size() > 1) {
            uo8 O0 = O0(k27Var.v);
            if (O0 == null) {
                O0 = new uo8(k96.M0(z ? 2131751024 : 2131751023, null));
                Typeface o = gl.o();
                gn gnVar = O0.a;
                gnVar.x(o);
                gnVar.w(gl.L(10.0f));
                if (O0.c != -1) {
                    O0.c = -1;
                    O0.invalidateSelf();
                }
                O0.a(503316480);
            } else {
                O0.a.t(k96.M0(z ? 2131751024 : 2131751023, null), false, true);
            }
            O0.setBounds(0, 0, O0.getIntrinsicWidth(), gl.L(17.33f));
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new cm2(0, O0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        k27Var.v = spannableStringBuilder;
        k27 k27Var2 = arrayList.size() > 0 ? (k27) b00.f(1, arrayList) : null;
        if (k27Var2 != null) {
            long j3 = k27Var2.T;
            vf6 vf6Var = this.F0;
            if (!vf6Var.d(j3)) {
                long j4 = k27Var2.T;
                int i2 = Q0;
                Q0 = i2 + 1;
                vf6Var.k(Integer.valueOf(i2), j4);
            }
            k27Var.m1 = ((Integer) vf6Var.f(k27Var2.T)).intValue();
        }
        return k27Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r6.putLong("ban_chat_id", r0.id);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(Bundle bundle, long j) {
        TLRPC.Chat chat = this.f;
        if (!chat.megagroup || this.u0 == null || !hc2.w(2, chat)) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.u0.size()) {
                break;
            }
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.u0.get(i);
            if (k27.B1(channelParticipant.peer) != j) {
                i++;
            } else if (!channelParticipant.can_edit) {
                return;
            }
        }
    }

    public final void J0(k27 k27Var) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(R.string.AppName, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        if (k27Var.D == 3) {
            hdVar.U = k96.M0(2131747986, null);
        } else {
            hdVar.U = k96.a0(null, null, 2131748013, k27Var.F0().mime_type);
        }
        showDialog(hdVar);
    }

    public final void K0(boolean z) {
        zr zrVar = this.y;
        if (zrVar == null || this.j0) {
            return;
        }
        int K0 = zrVar.K0();
        if ((K0 == -1 ? 0 : Math.abs(this.y.M0() - K0) + 1) > 0) {
            this.F.getClass();
            if (K0 > (z ? 4 : 1) || this.s0 || this.r0) {
                return;
            }
            W0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x018c, code lost:
    
        if (hq6.d0(r1.currentAccount).D0(r10.id, true) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01a5, code lost:
    
        r10 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01a3, code lost:
    
        if (hq6.d0(r1.currentAccount).O.containsKey(r10.short_name) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L0(View view, float f, float f2) {
        Integer num;
        Integer num2;
        char c;
        boolean z;
        String str;
        Integer num3;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        Integer num4;
        String str2;
        TLRPC.Message message;
        TLRPC.User V1;
        nf1 nf1Var = this;
        Integer valueOf = Integer.valueOf(R.drawable.msg_gif);
        Integer valueOf2 = Integer.valueOf(R.drawable.msg_copy);
        Integer valueOf3 = Integer.valueOf(R.drawable.msg_gallery);
        Integer valueOf4 = Integer.valueOf(R.drawable.msg_download);
        Integer valueOf5 = Integer.valueOf(R.drawable.msg_share);
        k27 messageObject = view instanceof gb2 ? ((gb2) view).getMessageObject() : view instanceof uk1 ? ((uk1) view).getMessageObject() : null;
        if (messageObject == null) {
            return false;
        }
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = messageObject.L1;
        int i = messageObject.D;
        if (i != 6) {
            if (i == 10 || i == 11 || i == 16) {
                num = 5;
                num2 = 10;
                if (messageObject.e1() != 0) {
                    c = 1;
                }
            } else {
                if (k27.Q4(messageObject.k)) {
                    num = 5;
                } else if (messageObject.s4() || messageObject.J2()) {
                    num = 5;
                    TLRPC.InputStickerSet j1 = k27.j1(messageObject.k);
                    if (j1 instanceof TLRPC.TL_inputStickerSetID) {
                        num2 = 10;
                    } else {
                        num2 = 10;
                        if (j1 instanceof TLRPC.TL_inputStickerSetShortName) {
                        }
                        c = 2;
                    }
                } else {
                    if (messageObject.g4()) {
                        if (messageObject.g4()) {
                            boolean z2 = w01.a;
                        }
                        if (messageObject.D != 12) {
                            num = 5;
                            num2 = 10;
                            c = '\b';
                        } else {
                            num = 5;
                            num2 = 10;
                            if (messageObject.F3()) {
                                c = 3;
                            }
                            c = 2;
                        }
                    }
                    if ((messageObject.k.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.F0() != null || messageObject.I3() || k27.K4(messageObject.k)) {
                        String str3 = messageObject.k.attachPath;
                        boolean z3 = (str3 == null || str3.length() == 0 || !new File(messageObject.k.attachPath).exists()) ? false : true;
                        if (z3) {
                            num = 5;
                            z = z3;
                        } else {
                            ba4 fileLoader = nf1Var.getFileLoader();
                            z = z3;
                            TLRPC.Message message2 = messageObject.k;
                            fileLoader.getClass();
                            num = 5;
                            if (ba4.M(message2, false, true).exists()) {
                                z = true;
                            }
                        }
                        if (z) {
                            if (messageObject.F0() != null && (str = messageObject.F0().mime_type) != null) {
                                if (messageObject.I0().toLowerCase().endsWith("attheme")) {
                                    num2 = 10;
                                    c = '\n';
                                } else if (str.endsWith("/xml")) {
                                    num2 = 10;
                                    c = 5;
                                } else if (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) {
                                    num2 = 10;
                                    c = 6;
                                }
                            }
                            num2 = 10;
                            c = 4;
                        }
                    }
                    if (messageObject.D != 12) {
                    }
                }
                num2 = 10;
                c = 2;
            }
            nf1Var.Z = messageObject;
            if (nf1Var.getParentActivity() != null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            k27 k27Var = messageObject;
            TLRPC.Chat chat = nf1Var.f;
            if (chat == null || tL_channelAdminLogEvent2 == null) {
                num3 = valueOf4;
            } else {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                num3 = valueOf4;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                    TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                    if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                        zq5 zq5Var = new zq5(getParentActivity(), tL_channelAdminLogEventActionParticipantJoinByInvite.invite, getMessagesController().L0(chat.id), null, this, chat.id, false, hc2.V(chat));
                        zq5Var.e2 = false;
                        zq5Var.show();
                        return true;
                    }
                }
                nf1Var = this;
            }
            if (tL_channelAdminLogEvent2 != null) {
                num4 = 4;
                if ((!(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || tL_channelAdminLogEvent2.user_id != nf1Var.getMessagesController().L3) && !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam)) {
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                } else {
                    if (view instanceof uk1) {
                        SpannableString spannableString = new SpannableString(">");
                        Drawable mutate = nf1Var.getParentActivity().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(nf1Var.getThemedColor(bkb.wj), PorterDuff.Mode.MULTIPLY));
                        mutate.setBounds(0, 0, gl.L(10.0f), gl.L(10.0f));
                        spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) k96.M0(2131750983, null)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) k96.M0(2131752505, null));
                        spannableStringBuilder.setSpan(new r21(nf1Var, (byte) 2), 0, spannableStringBuilder.length(), 33);
                        m21 I = u21.b0(nf1Var).I(R.raw.msg_antispam, k96.M0(2131752448, null), gl.H2(k96.M0(2131752449, null), spannableStringBuilder, "%s"));
                        I.j = 5000;
                        I.j();
                        return true;
                    }
                    tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                    b00.r(null, 2131746026, arrayList, R.drawable.msg_notspam, arrayList3);
                    arrayList2.add(34);
                    arrayList.add(null);
                    arrayList3.add(null);
                    arrayList2.add(null);
                }
            } else {
                tL_channelAdminLogEvent = tL_channelAdminLogEvent2;
                num4 = 4;
            }
            k27 k27Var2 = nf1Var.Z;
            if (k27Var2.D == 0 || k27Var2.z != null) {
                b00.s(null, 2131751755, arrayList, arrayList3, valueOf2);
                arrayList2.add(3);
            }
            if (c == 1) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3 = nf1Var.Z.L1;
                if (tL_channelAdminLogEvent3 != null) {
                    TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                    if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                        TLRPC.TL_channelAdminLogEventActionChangeStickerSet tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                        TLRPC.InputStickerSet inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                        if (inputStickerSet == null || (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                            inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                        }
                        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
                        if (inputStickerSet2 != null) {
                            showDialog(new u0b(getParentActivity(), this, inputStickerSet2, null, null, null));
                            return true;
                        }
                    } else if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) {
                        mb5 mb5Var = new mb5(chat.id, 0);
                        TLRPC.ChatFull L0 = nf1Var.getMessagesController().L0(chat.id);
                        if (L0 != null) {
                            mb5Var.i0(L0);
                            nf1Var.presentFragment(mb5Var);
                        }
                    } else if ((channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && hc2.y(13, chat)) {
                        di2 di2Var = new di2(nf1Var.getParentActivity(), chat);
                        di2Var.v1 = new xe1(nf1Var);
                        nf1Var.showDialog(di2Var);
                    }
                }
            } else if (c == 3) {
                TLRPC.MessageMedia messageMedia = nf1Var.Z.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && k27.M3(messageMedia.webpage.document)) {
                    b00.s(null, 2131745738, arrayList, arrayList3, valueOf);
                    arrayList2.add(11);
                }
            } else if (c != 4) {
                Integer num5 = num2;
                Integer num6 = num3;
                if (c == 5) {
                    b00.r(null, 2131754214, arrayList, R.drawable.msg_language, arrayList3);
                    arrayList2.add(num);
                    arrayList.add(k96.M0(2131745739, null));
                    arrayList3.add(num6);
                    arrayList2.add(num5);
                    arrayList.add(k96.M0(2131745267, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num7 = num;
                    if (c == '\n') {
                        b00.r(null, 2131754212, arrayList, R.drawable.msg_theme, arrayList3);
                        arrayList2.add(num7);
                        arrayList.add(k96.M0(2131745739, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(k96.M0(2131745267, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c == 6) {
                        b00.s(null, 2131745737, arrayList, arrayList3, valueOf3);
                        arrayList2.add(7);
                        arrayList.add(k96.M0(2131745739, null));
                        arrayList3.add(num6);
                        arrayList2.add(num5);
                        arrayList.add(k96.M0(2131745267, null));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else if (c == 7) {
                        TLRPC.Message message3 = nf1Var.Z.k;
                        if (k27.n1(message3) == null || !k27.E3(k27.n1(message3).document)) {
                            arrayList.add(k96.M0(2131754366, null));
                        } else {
                            arrayList.add(k96.M0(2131754368, null));
                        }
                        arrayList3.add(Integer.valueOf(R.drawable.msg_sticker));
                        arrayList2.add(9);
                    } else if (c == '\b') {
                        long j = nf1Var.Z.k.media.user_id;
                        TLRPC.User V12 = j != 0 ? na7.q1(nf1Var.currentAccount).V1(Long.valueOf(j)) : null;
                        if (V12 != null && V12.id != y6c.h(nf1Var.currentAccount).e() && qu2.r(nf1Var.currentAccount).g0.get(Long.valueOf(V12.id)) == null) {
                            b00.r(null, 2131754441, arrayList, R.drawable.msg_addcontact, arrayList3);
                            arrayList2.add(15);
                        }
                        if (!TextUtils.isEmpty(nf1Var.Z.k.media.phone_number)) {
                            b00.s(null, 2131751755, arrayList, arrayList3, valueOf2);
                            arrayList2.add(16);
                            arrayList.add(k96.M0(2131752622, null));
                            arrayList3.add(Integer.valueOf(R.drawable.msg_calls));
                            arrayList2.add(17);
                        }
                    }
                }
            } else if (k27.K4(nf1Var.Z.k)) {
                b00.s(null, 2131745737, arrayList, arrayList3, valueOf3);
                arrayList2.add(num4);
                arrayList.add(k96.M0(2131745267, null));
                arrayList3.add(valueOf5);
                arrayList2.add(6);
            } else {
                Integer num8 = num4;
                if (nf1Var.Z.I3()) {
                    b00.s(null, 2131745719, arrayList, arrayList3, num3);
                    arrayList2.add(num2);
                    arrayList.add(k96.M0(2131745267, null));
                    arrayList3.add(valueOf5);
                    arrayList2.add(6);
                } else {
                    Integer num9 = num2;
                    Integer num10 = num3;
                    if (nf1Var.Z.F0() != null) {
                        if (k27.M3(nf1Var.Z.F0())) {
                            str2 = null;
                            b00.s(null, 2131745738, arrayList, arrayList3, valueOf);
                            arrayList2.add(11);
                        } else {
                            str2 = null;
                        }
                        b00.s(str2, 2131745739, arrayList, arrayList3, num10);
                        arrayList2.add(num9);
                        arrayList.add(k96.M0(2131745267, str2));
                        arrayList3.add(valueOf5);
                        arrayList2.add(6);
                    } else {
                        b00.s(null, 2131745737, arrayList, arrayList3, valueOf3);
                        arrayList2.add(num8);
                    }
                }
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4 = tL_channelAdminLogEvent;
            pe1 pe1Var = new pe1(nf1Var, arrayList2, arrayList, arrayList3, view, f, f2);
            if (hc2.w(2, chat) && tL_channelAdminLogEvent4 != null) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                if (((channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = k27Var.k) != null && message.from_id != null && (V1 = nf1Var.getMessagesController().V1(Long.valueOf(nf1Var.Z.k.from_id.user_id))) != null && !l7c.C(V1)) {
                    nf1Var.getMessagesController().I0(chat, V1, new yt0(nf1Var, arrayList, arrayList3, arrayList2, pe1Var, (byte) 2));
                    return true;
                }
            }
            pe1Var.run();
            return true;
        }
        num = 5;
        num2 = 10;
        c = 65535;
        nf1Var.Z = messageObject;
        if (nf1Var.getParentActivity() != null) {
        }
    }

    public final TextureView M0(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.e0 == null) {
            yc ycVar = new yc((byte) 7, (Context) getParentActivity(), (Object) this);
            this.e0 = ycVar;
            ycVar.setOutlineProvider(new xi((byte) 2));
            this.e0.setClipToOutline(true);
            this.e0.setWillNotDraw(false);
            this.e0.setVisibility(4);
            ix ixVar = new ix(getParentActivity());
            this.f0 = ixVar;
            ixVar.setBackgroundColor(0);
            if (z) {
                this.e0.addView(this.f0, nme.c(-1.0f, -1));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.g0 = textureView;
            textureView.setOpaque(false);
            this.f0.addView(this.g0, nme.c(-1.0f, -1));
        }
        if (this.e0.getParent() == null) {
            lf1 lf1Var = this.Y;
            yc ycVar2 = this.e0;
            int i = gl.u;
            lf1Var.addView(ycVar2, 1, new FrameLayout.LayoutParams(i, i));
        }
        this.e0.setVisibility(4);
        this.f0.setDrawingReady(false);
        return this.g0;
    }

    public final void N0() {
        ArrayList arrayList;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.E0.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList4 = this.o0;
            if (i >= arrayList4.size()) {
                ArrayList arrayList5 = this.p0;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                return;
            }
            k27 k27Var = (k27) arrayList4.get(i);
            long j = (k27Var == null || (tL_channelAdminLogEvent2 = k27Var.L1) == null || !(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent2.user_id;
            if (k27Var.m1 <= 0) {
                int i2 = Q0;
                Q0 = i2 + 1;
                k27Var.m1 = i2;
            }
            int i3 = i + 1;
            k27 k27Var2 = i3 < arrayList4.size() ? (k27) arrayList4.get(i3) : null;
            long j2 = (k27Var2 == null || (tL_channelAdminLogEvent = k27Var2.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) ? 0L : tL_channelAdminLogEvent.user_id;
            if (j != 0) {
                arrayList3.add(k27Var);
            } else {
                arrayList2.add(k27Var);
            }
            if (j == j2 || arrayList3.isEmpty()) {
                arrayList = arrayList3;
            } else {
                TLRPC.ReplyMarkup replyMarkup = k27Var.k.reply_markup;
                boolean z = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList2.size();
                ArrayList arrayList6 = new ArrayList();
                for (int size2 = arrayList3.size() - 1; size2 >= 0 && ((k27) arrayList3.get(size2)).U == 1; size2--) {
                    arrayList6.add((k27) arrayList3.remove(size2));
                }
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    k27 k27Var3 = (k27) b00.f(1, arrayList3);
                    boolean z2 = TextUtils.isEmpty(this.w0) && arrayList3.size() > 3;
                    Long valueOf = Long.valueOf(k27Var3.T);
                    HashSet hashSet = this.q0;
                    if (hashSet.contains(valueOf) || !z2) {
                        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                            c1(0, (k27) arrayList3.get(i4));
                        }
                        arrayList2.addAll(arrayList3);
                    } else {
                        c1(arrayList3.size() - 1, k27Var3);
                        arrayList2.add(k27Var3);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = k27Var3.k.reply_markup;
                    if (z != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        k27Var3.M1 = true;
                        this.F.g((z ? arrayList3.size() - 1 : 0) + size);
                        this.F.g(size + (z ? arrayList3.size() - 1 : 0) + 1);
                    }
                    long j3 = k27Var.T;
                    k27 H0 = H0(j3, k27Var.L1.user_id, arrayList3, hashSet.contains(Long.valueOf(j3)), z2);
                    arrayList = arrayList3;
                    arrayList2.add(H0);
                }
                if (!arrayList6.isEmpty()) {
                    k27 k27Var4 = (k27) b00.f(1, arrayList6);
                    arrayList2.addAll(arrayList6);
                    arrayList2.add(H0(k27Var4.T, k27Var4.L1.user_id, arrayList6, true, false));
                }
                arrayList.clear();
            }
            i = i3;
            arrayList3 = arrayList;
        }
    }

    public final void P0(boolean z) {
        if (this.N.getTag() == null || this.Q) {
            return;
        }
        if (!this.T || this.R) {
            this.N.setTag(null);
            if (!z) {
                AnimatorSet animatorSet = this.S;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.S = null;
                }
                this.N.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S = animatorSet2;
            animatorSet2.setDuration(150L);
            this.S.playTogether(ObjectAnimator.ofFloat(this.N, "alpha", 0.0f));
            this.S.addListener(new bb1((Object) this, (byte) 2));
            this.S.setStartDelay(500L);
            this.S.start();
        }
    }

    public final void Q0(int i) {
        cq3 cq3Var;
        if (Build.VERSION.SDK_INT < 31 || (cq3Var = this.d) == null) {
            return;
        }
        if (fod.a(i, 4)) {
            zw4 e = this.glassEngine.e();
            e.b(this.w.getY(), this.Y.getWidth(), this.w.getY() + this.w.getHeight());
            cq3Var.h(e);
        }
        lf1 lf1Var = this.Y;
        Objects.requireNonNull(lf1Var);
        cq3Var.e(new vw0(lf1Var, (byte) 1), this.Y.getWidth(), this.Y.getHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x036a, code lost:
    
        if (r0.exists() == false) goto L127;
     */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [k27, org.telegram.tgnet.TLRPC$ChannelParticipant] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(int i, ArrayList arrayList, Integer num) {
        TLRPC.Chat K0;
        File file;
        TLRPC.User V1;
        if (this.Z == null || i >= arrayList.size()) {
            return;
        }
        int intValue = num.intValue();
        ze1 ze1Var = this.G0;
        if (ze1Var != null) {
            ze1Var.dismiss();
        }
        k27 k27Var = this.Z;
        if (k27Var != null) {
            ?? r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            if (intValue != 3) {
                if (intValue == 4) {
                    String str = k27Var.k.attachPath;
                    if (str != null && str.length() > 0 && !oo1.t(str)) {
                        str = null;
                    }
                    if (str == null || str.length() == 0) {
                        ba4 fileLoader = getFileLoader();
                        TLRPC.Message message = this.Z.k;
                        fileLoader.getClass();
                        str = ba4.M(message, false, true).toString();
                    }
                    int i2 = this.Z.D;
                    if (i2 == 3 || i2 == 1) {
                        if ((Build.VERSION.SDK_INT <= 28 || w01.b) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                            getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                            this.Z = null;
                            this.a0 = null;
                            return;
                        }
                        MediaController.d0(str, getParentActivity(), this.Z.D != 3 ? 0 : 1, null, null, null);
                        r8 = 0;
                    }
                } else if (intValue == 5) {
                    String str2 = k27Var.k.attachPath;
                    if (str2 != null && str2.length() != 0) {
                        file = new File(this.Z.k.attachPath);
                    }
                    file = null;
                    if (file == null) {
                        ba4 fileLoader2 = getFileLoader();
                        TLRPC.Message message2 = this.Z.k;
                        fileLoader2.getClass();
                        File M = ba4.M(message2, false, true);
                        if (M.exists()) {
                            file = M;
                        }
                    }
                    if (file != null) {
                        if (file.getName().toLowerCase().endsWith("attheme")) {
                            zr zrVar = this.y;
                            if (zrVar != null) {
                                if (zrVar.M0() < this.y.A() - 1) {
                                    int K02 = this.y.K0();
                                    this.h0 = K02;
                                    y29 y29Var = (y29) this.w.K(K02);
                                    if (y29Var != null) {
                                        this.i0 = y29Var.a.getTop();
                                    } else {
                                        this.h0 = -1;
                                    }
                                } else {
                                    this.h0 = -1;
                                }
                            }
                            akb u = bkb.u(file, this.Z.I0(), null, true);
                            if (u != null) {
                                presentFragment(new qmb(u));
                            } else {
                                this.h0 = -1;
                                if (getParentActivity() == null) {
                                    this.Z = null;
                                    this.a0 = null;
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                                String M0 = k96.M0(R.string.AppName, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131749008, null);
                                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                showDialog(hdVar);
                            }
                        } else if (k96.D0().e(file, this.currentAccount)) {
                            presentFragment(new LanguageSelectActivity());
                        } else {
                            if (getParentActivity() == null) {
                                this.Z = null;
                                this.a0 = null;
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                            String M02 = k96.M0(R.string.AppName, null);
                            hd hdVar2 = alertDialog$Builder2.a;
                            hdVar2.S = M02;
                            hdVar2.U = k96.M0(2131749009, null);
                            alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                            showDialog(hdVar2);
                        }
                    }
                } else if (intValue == 6) {
                    String str3 = k27Var.k.attachPath;
                    if (str3 != null && str3.length() > 0 && !oo1.t(str3)) {
                        str3 = null;
                    }
                    if (str3 == null || str3.length() == 0) {
                        ba4 fileLoader3 = getFileLoader();
                        TLRPC.Message message3 = this.Z.k;
                        fileLoader3.getClass();
                        str3 = ba4.M(message3, false, true).toString();
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType(this.Z.F0().mime_type);
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            Activity parentActivity = getParentActivity();
                            a.d();
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", new File(str3)));
                            intent.setFlags(1);
                        } catch (Exception unused) {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                        }
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str3)));
                    }
                    try {
                        getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131745267, null)), 500);
                    } catch (Exception unused2) {
                    }
                } else if (intValue != 7) {
                    byte b = 2;
                    switch (intValue) {
                        case 9:
                            showDialog(new u0b(getParentActivity(), this, k27.j1(this.Z.k), null, null, null));
                            break;
                        case 10:
                            if ((Build.VERSION.SDK_INT > 28 && !w01.b) || getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                                String B = ba4.B(this.Z.F0());
                                if (TextUtils.isEmpty(B)) {
                                    B = this.Z.S0();
                                }
                                String str4 = B;
                                String str5 = this.Z.k.attachPath;
                                if (str5 != null && str5.length() > 0 && !oo1.t(str5)) {
                                    str5 = null;
                                }
                                if (str5 == null || str5.length() == 0) {
                                    ba4 fileLoader4 = getFileLoader();
                                    TLRPC.Message message4 = this.Z.k;
                                    fileLoader4.getClass();
                                    str5 = ba4.M(message4, false, true).toString();
                                }
                                MediaController.d0(str5, getParentActivity(), this.Z.I3() ? 3 : 2, str4, this.Z.F0() != null ? this.Z.F0().mime_type : "", null);
                                break;
                            } else {
                                getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                this.Z = null;
                                this.a0 = null;
                                return;
                            }
                            break;
                        case 11:
                            na7.q1(this.currentAccount).v4(this.Z, k27Var.F0());
                            break;
                        default:
                            switch (intValue) {
                                case 15:
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", this.Z.k.media.user_id);
                                    bundle.putString("phone", this.Z.k.media.phone_number);
                                    bundle.putBoolean("addContact", true);
                                    presentFragment(new it2(bundle));
                                    break;
                                case 16:
                                    gl.g(k27Var.k.media.phone_number);
                                    u21.b0(this).i(k96.M0(2131747102, null)).j();
                                    break;
                                case 17:
                                    try {
                                        Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.Z.k.media.phone_number));
                                        intent2.addFlags(TLObject.FLAG_28);
                                        getParentActivity().startActivityForResult(intent2, 500);
                                        break;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        break;
                                    }
                                default:
                                    TLRPC.Chat chat = this.f;
                                    switch (intValue) {
                                        case 33:
                                            if (this.a0 != null) {
                                                TLRPC.User V12 = getMessagesController().V1(Long.valueOf(cf3.n(this.a0.peer)));
                                                TLRPC.ChannelParticipant channelParticipant = this.a0;
                                                if (channelParticipant.banned_rights == null) {
                                                    channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                                }
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.a0.banned_rights;
                                                tL_chatBannedRights.send_plain = true;
                                                tL_chatBannedRights.send_messages = true;
                                                tL_chatBannedRights.send_media = true;
                                                tL_chatBannedRights.send_stickers = true;
                                                tL_chatBannedRights.send_gifs = true;
                                                tL_chatBannedRights.send_games = true;
                                                tL_chatBannedRights.send_inline = true;
                                                tL_chatBannedRights.send_polls = true;
                                                tL_chatBannedRights.send_photos = true;
                                                tL_chatBannedRights.send_videos = true;
                                                tL_chatBannedRights.send_roundvideos = true;
                                                tL_chatBannedRights.send_audios = true;
                                                tL_chatBannedRights.send_voices = true;
                                                tL_chatBannedRights.send_docs = true;
                                                tL_chatBannedRights.send_reactions = true;
                                                getMessagesController().R4(chat.id, V12, null, this.a0.banned_rights, true, getFragmentForAlert(1), new q21(this, V12, (byte) 18));
                                                break;
                                            }
                                            break;
                                        case 34:
                                            TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                            tL_channels_reportAntiSpamFalsePositive.channel = getMessagesController().f1(chat.id);
                                            tL_channels_reportAntiSpamFalsePositive.msg_id = this.Z.L1();
                                            getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new se1(this, b));
                                            break;
                                        case 35:
                                            getMessagesController().a0(chat.id, getMessagesController().k1(this.Z.k.from_id), false, new te1(this, b));
                                            if ((this.Z.k.from_id instanceof TLRPC.TL_peerUser) && u21.a(this) && (V1 = getMessagesController().V1(Long.valueOf(this.Z.k.from_id.user_id))) != null) {
                                                u21.D(this, V1, chat.title).j();
                                                break;
                                            }
                                            break;
                                    }
                            }
                    }
                } else {
                    String str6 = k27Var.k.attachPath;
                    if (str6 != null && str6.length() > 0 && !oo1.t(str6)) {
                        str6 = null;
                    }
                    if (str6 == null || str6.length() == 0) {
                        ba4 fileLoader5 = getFileLoader();
                        TLRPC.Message message5 = this.Z.k;
                        fileLoader5.getClass();
                        str6 = ba4.M(message5, false, true).toString();
                    }
                    if ((Build.VERSION.SDK_INT <= 28 || w01.b) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        this.Z = null;
                        this.a0 = null;
                        return;
                    }
                    MediaController.d0(str6, getParentActivity(), 0, null, null, null);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long Z0 = k27Var.Z0();
                if (0 != Z0) {
                    if (Z0 > 0) {
                        TLRPC.User V13 = na7.q1(this.currentAccount).V1(Long.valueOf(Z0));
                        if (V13 != null) {
                            spannableStringBuilder.append((CharSequence) qu2.m(0, V13.first_name, V13.last_name)).append((CharSequence) ":\n");
                        }
                    } else if (Z0 < 0 && (K0 = na7.q1(this.currentAccount).K0(Long.valueOf(-Z0))) != null) {
                        spannableStringBuilder.append((CharSequence) K0.title).append((CharSequence) ":\n");
                    }
                }
                if (TextUtils.isEmpty(k27Var.v)) {
                    spannableStringBuilder.append((CharSequence) k27Var.k.message);
                } else {
                    spannableStringBuilder.append(k27Var.v);
                }
                gl.g(spannableStringBuilder);
                u21.b0(this).i(k96.M0(2131748397, null)).j();
            }
            this.Z = r8;
            this.a0 = r8;
        }
    }

    public final void S0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        int i;
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || getParentActivity() == null) {
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, getResourceProvider(), getParentActivity());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(gl.L(200.0f));
        Rect rect = new Rect();
        getParentActivity().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate().getPadding(rect);
        zkb.h(bkb.F8, getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            if (arrayList4.get(i2) == null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new j8(getParentActivity(), getResourceProvider()), nme.o(-1, 8));
            } else {
                a8 a8Var = new a8(0, getResourceProvider(), getParentActivity(), i2 == 0, i2 == size + (-1));
                a8Var.setMinimumWidth(gl.L(200.0f));
                a8Var.j((CharSequence) arrayList2.get(i2), ((Integer) arrayList3.get(i2)).intValue(), null);
                if (((Integer) arrayList4.get(i2)).intValue() == 35) {
                    a8Var.d(getThemedColor(bkb.p7), getThemedColor(bkb.o7));
                }
                Integer num = (Integer) arrayList4.get(i2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                a8Var.setOnClickListener(new og((Object) this, i2, (Object) arrayList4, (Object) num, (byte) 1));
            }
            i2++;
            arrayList4 = arrayList;
        }
        ye1 ye1Var = new ye1(this, this.Y.getContext(), (byte) 0);
        ye1Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, nme.u(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        ye1Var.setPopupWindowLayout(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ze1 ze1Var = new ze1(this, ye1Var);
        this.G0 = ze1Var;
        ze1Var.e = true;
        ze1Var.c = (short) 220;
        ze1Var.setOutsideTouchable(true);
        this.G0.setClippingEnabled(true);
        this.G0.setAnimationStyle(R.style.PopupContextAnimation);
        this.G0.setFocusable(true);
        ye1Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
        this.G0.setInputMethodMode(2);
        this.G0.setSoftInputMode(48);
        this.G0.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f)) - ye1Var.getMeasuredWidth()) + rect.left) - gl.L(28.0f);
        if (left < gl.L(6.0f)) {
            left = gl.L(6.0f);
        } else if (left > (this.w.getMeasuredWidth() - gl.L(6.0f)) - ye1Var.getMeasuredWidth()) {
            left = (this.w.getMeasuredWidth() - gl.L(6.0f)) - ye1Var.getMeasuredWidth();
        }
        if (gl.O1()) {
            int[] iArr = new int[2];
            this.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = this.Y.getHeight();
        int L = gl.L(48.0f) + ye1Var.getMeasuredHeight();
        int Q = this.Y.Q();
        if (Q > gl.L(20.0f)) {
            height += Q;
        }
        if (L < height) {
            i = (int) (this.w.getY() + view.getTop() + f2);
            if ((L - rect.top) - rect.bottom > gl.L(240.0f)) {
                i += gl.L(240.0f) - L;
            }
            if (i < this.w.getY() + gl.L(24.0f)) {
                i = (int) (this.w.getY() + gl.L(24.0f));
            } else {
                int i3 = height - L;
                if (i > i3 - gl.L(8.0f)) {
                    i = i3 - gl.L(8.0f);
                }
            }
        } else {
            i = this.inBubbleMode ? 0 : gl.m;
        }
        ye1Var.setMaxHeight(height - i);
        this.G0.showAtLocation(this.w, 51, left, i);
        this.G0.b();
    }

    public final void T0(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.ChatFull L0;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            getMessagesController().a4(tL_channels_channelParticipants.users, false);
            getMessagesController().U3(tL_channels_channelParticipants.chats, false);
            this.u0 = tL_channels_channelParticipants.participants;
            TLRPC.Chat chat = this.f;
            if (chat != null && (L0 = getMessagesController().L0(chat.id)) != null && L0.antispam) {
                af1 af1Var = new af1();
                af1Var.user_id = getMessagesController().L3;
                af1Var.peer = getMessagesController().w1(af1Var.user_id);
                long j = getMessagesController().L3;
                if (getMessagesController().V1(Long.valueOf(j)) == null) {
                    TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                    tL_inputUser.user_id = j;
                    tL_users_getUsers.id.add(tL_inputUser);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new se1(this, (byte) 1));
                }
                this.u0.add(0, af1Var);
            }
            Dialog dialog = this.visibleDialog;
            if (dialog instanceof ib) {
                ((ib) dialog).Z0(this.u0);
            }
        }
    }

    public final void U0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        byte b;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        k27 k27Var;
        int i = 0;
        this.D0.N = false;
        Z0(false);
        na7.q1(this.currentAccount).a4(tL_channels_adminLogResults.users, false);
        na7.q1(this.currentAccount).U3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = this.o0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            b = 1;
            if (i2 >= tL_channels_adminLogResults.events.size()) {
                break;
            }
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i2);
            long j = tL_channelAdminLogEvent.id;
            vf6 vf6Var = this.l0;
            if (vf6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent.id);
                k27 k27Var2 = new k27(this.currentAccount, tL_channelAdminLogEvent, arrayList, this.n0, this.f, this.U, false);
                if (k27Var2.U >= 0) {
                    vf6Var.k(k27Var2, tL_channelAdminLogEvent.id);
                }
                z = true;
            }
            i2++;
        }
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            k27 k27Var3 = (k27) arrayList.get(size);
            if (k27Var3 != null && k27Var3.U != 0 && k27Var3.L1() >= 0) {
                this.m0.k(k27Var3, k27Var3.L1());
            }
            if (k27Var3 != null && (message = k27Var3.k) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            k27Var = null;
                            break;
                        }
                        if (size != i3) {
                            k27Var = (k27) arrayList.get(i3);
                            if (k27Var.U != 1 && k27Var.L1() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i3++;
                    }
                    if (k27Var != null) {
                        k27Var3.C = k27Var;
                    }
                }
                arrayList2.add(k27Var3);
            }
        }
        if (!arrayList2.isEmpty()) {
            hq6.d0(this.currentAccount).Y0(arrayList2, -this.f.id, 0, 0L, new te1(this, b), getClassGuid(), null);
        }
        N0();
        this.s0 = false;
        if (!z) {
            this.r0 = true;
        }
        gl.U3(this.n, false, 0.3f, true, true);
        this.w.setEmptyView(this.I);
        kf1 kf1Var = this.F;
        if (kf1Var != null) {
            kf1Var.f();
        }
        r7 r7Var = this.O;
        if (r7Var != null) {
            if (this.p0.isEmpty() && TextUtils.isEmpty(this.w0)) {
                i = 8;
            }
            r7Var.setVisibility(i);
        }
    }

    public final void V0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        this.t0 = false;
        this.D0.N = false;
        Z0(false);
        na7.q1(this.currentAccount).a4(tL_channels_adminLogResults.users, false);
        na7.q1(this.currentAccount).U3(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < tL_channels_adminLogResults.events.size(); i++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i);
            long j = tL_channelAdminLogEvent2.id;
            vf6 vf6Var = this.l0;
            if (vf6Var.h(j) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) && !(tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                    }
                }
                this.P = Math.min(this.P, tL_channelAdminLogEvent2.id);
                k27 k27Var = new k27(this.currentAccount, tL_channelAdminLogEvent2, arrayList, hashMap, this.f, this.U, false);
                if (k27Var.U >= 0 && (((tL_channelAdminLogEvent = k27Var.L1) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !vf6Var.d(tL_channelAdminLogEvent2.id))) {
                    this.o0.add(0, k27Var);
                    vf6Var.k(k27Var, tL_channelAdminLogEvent2.id);
                    z = true;
                }
            }
        }
        if (this.F == null || !z) {
            return;
        }
        N0();
        this.F.f();
    }

    public final void W0(boolean z) {
        kf1 kf1Var;
        if (this.s0) {
            return;
        }
        ArrayList arrayList = this.o0;
        if (z) {
            this.P = Long.MAX_VALUE;
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                gl.U3(frameLayout, true, 0.3f, true, true);
                this.I.setVisibility(4);
                this.w.setEmptyView(null);
            }
            this.l0.b();
            arrayList.clear();
            this.n0.clear();
            N0();
        }
        this.s0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = na7.g1(this.f);
        tL_channels_getAdminLog.q = this.w0;
        tL_channels_getAdminLog.limit = 50;
        if (z || arrayList.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.P;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags |= 1;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.x0.m(); i++) {
                tL_channels_getAdminLog.admins.add(na7.q1(this.currentAccount).o1((TLRPC.User) this.x0.n(i)));
            }
        }
        f1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new se1(this, (byte) 3));
        if (!z || (kf1Var = this.F) == null) {
            return;
        }
        kf1Var.f();
    }

    public final void X0() {
        if (this.w == null || this.o0.isEmpty()) {
            return;
        }
        this.y.g1(this.p0.size() - 1, (-100000) - this.w.getPaddingTop());
    }

    public final void Y0() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = na7.g1(this.f);
        tL_channels_getAdminLog.q = this.w0;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.v0;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags |= 1;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        byte b = 0;
        if (this.x0 != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.x0.m(); i++) {
                tL_channels_getAdminLog.admins.add(na7.q1(this.currentAccount).o1((TLRPC.User) this.x0.n(i)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new se1(this, b));
    }

    public final void Z0(boolean z) {
        fu fuVar = this.w;
        if (fuVar == null || this.y == null || fuVar.getChildCount() <= 0) {
            return;
        }
        int i = z ? ConnectionsManager.DEFAULT_DATACENTER_ID : TLObject.FLAG_31;
        View view = null;
        int i2 = -1;
        for (int i3 = 0; i3 < this.w.getChildCount(); i3++) {
            View childAt = this.w.getChildAt(i3);
            this.w.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                int top = childAt.getTop();
                if (z) {
                    if (top >= i) {
                    }
                    i = childAt.getTop();
                    view = childAt;
                    i2 = R;
                } else {
                    if (top <= i) {
                    }
                    i = childAt.getTop();
                    view = childAt;
                    i2 = R;
                }
            }
        }
        if (view != null) {
            this.M0 = view instanceof gb2 ? ((gb2) view).getMessageObject().T : view instanceof uk1 ? ((uk1) view).getMessageObject().T : 0L;
            this.N0 = i2;
            this.O0 = (this.w.getMeasuredHeight() - view.getBottom()) - this.w.getPaddingBottom();
        }
    }

    public final int a1(k27 k27Var) {
        gb2 gb2Var = this.J0;
        if (gb2Var != null) {
            gb2Var.td = 0;
            gb2Var.ud = null;
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.wj));
        hashSet.add(Integer.valueOf(bkb.vj));
        hashSet.add(Integer.valueOf(bkb.vf));
        hashSet.add(Integer.valueOf(bkb.uf));
        hashSet.add(Integer.valueOf(bkb.Fc));
        hashSet.add(Integer.valueOf(bkb.gf));
        hashSet.add(Integer.valueOf(bkb.Hc));
        hashSet.add(Integer.valueOf(bkb.Gc));
        hashSet.add(Integer.valueOf(bkb.jf));
        hashSet.add(Integer.valueOf(bkb.hf));
        hashSet.add(Integer.valueOf(bkb.ld));
        hashSet.add(Integer.valueOf(bkb.Ze));
        hashSet.add(Integer.valueOf(bkb.kd));
        hashSet.add(Integer.valueOf(bkb.Ye));
        hashSet.add(Integer.valueOf(bkb.Gb));
        hashSet.add(Integer.valueOf(bkb.Ec));
        hashSet.add(Integer.valueOf(bkb.Fb));
        hashSet.add(Integer.valueOf(bkb.Dc));
        hashSet.add(Integer.valueOf(bkb.Qb));
        hashSet.add(Integer.valueOf(bkb.Kd));
        hashSet.add(Integer.valueOf(bkb.Ae));
        hashSet.add(Integer.valueOf(bkb.Bc));
        hashSet.add(Integer.valueOf(bkb.ze));
        hashSet.add(Integer.valueOf(bkb.Ac));
        hashSet.add(Integer.valueOf(bkb.ye));
        hashSet.add(Integer.valueOf(bkb.zc));
        hashSet.add(Integer.valueOf(bkb.xe));
        hashSet.add(Integer.valueOf(bkb.yc));
        hashSet.add(Integer.valueOf(bkb.we));
        hashSet.add(Integer.valueOf(bkb.xc));
        hashSet.add(Integer.valueOf(bkb.ve));
        hashSet.add(Integer.valueOf(bkb.wc));
        hashSet.add(Integer.valueOf(bkb.ue));
        hashSet.add(Integer.valueOf(bkb.vc));
        hashSet.add(Integer.valueOf(bkb.te));
        hashSet.add(Integer.valueOf(bkb.uc));
        hashSet.add(Integer.valueOf(bkb.se));
        hashSet.add(Integer.valueOf(bkb.tc));
        hashSet.add(Integer.valueOf(bkb.re));
        hashSet.add(Integer.valueOf(bkb.sc));
        hashSet.add(Integer.valueOf(bkb.qe));
        hashSet.add(Integer.valueOf(bkb.rc));
        hashSet.add(Integer.valueOf(bkb.pe));
        hashSet.add(Integer.valueOf(bkb.qc));
        hashSet.add(Integer.valueOf(bkb.oe));
        hashSet.add(Integer.valueOf(bkb.pc));
        hashSet.add(Integer.valueOf(bkb.le));
        hashSet.add(Integer.valueOf(bkb.ne));
        hashSet.add(Integer.valueOf(bkb.me));
        hashSet.add(Integer.valueOf(bkb.ke));
        hashSet.add(Integer.valueOf(bkb.lc));
        hashSet.add(Integer.valueOf(bkb.je));
        hashSet.add(Integer.valueOf(bkb.kc));
        hashSet.add(Integer.valueOf(bkb.ie));
        hashSet.add(Integer.valueOf(bkb.jc));
        hashSet.add(Integer.valueOf(bkb.he));
        hashSet.add(Integer.valueOf(bkb.bc));
        hashSet.add(Integer.valueOf(bkb.fe));
        hashSet.add(Integer.valueOf(bkb.dc));
        hashSet.add(Integer.valueOf(bkb.ee));
        hashSet.add(Integer.valueOf(bkb.ic));
        hashSet.add(Integer.valueOf(bkb.de));
        hashSet.add(Integer.valueOf(bkb.ae));
        hashSet.add(Integer.valueOf(bkb.hc));
        hashSet.add(Integer.valueOf(bkb.Zd));
        hashSet.add(Integer.valueOf(bkb.gc));
        hashSet.add(Integer.valueOf(bkb.Yd));
        hashSet.add(Integer.valueOf(bkb.Xd));
        hashSet.add(Integer.valueOf(bkb.Xb));
        hashSet.add(Integer.valueOf(bkb.Td));
        hashSet.add(Integer.valueOf(bkb.Wb));
        hashSet.add(Integer.valueOf(bkb.Sd));
        hashSet.add(Integer.valueOf(bkb.Rd));
        hashSet.add(Integer.valueOf(bkb.Vb));
        hashSet.add(Integer.valueOf(bkb.Qd));
        hashSet.add(Integer.valueOf(bkb.Ub));
        hashSet.add(Integer.valueOf(bkb.Pd));
        hashSet.add(Integer.valueOf(bkb.Tb));
        hashSet.add(Integer.valueOf(bkb.Od));
        hashSet.add(Integer.valueOf(bkb.Nd));
        hashSet.add(Integer.valueOf(bkb.Ld));
        hashSet.add(Integer.valueOf(bkb.Hd));
        hashSet.add(Integer.valueOf(bkb.Pb));
        hashSet.add(Integer.valueOf(bkb.Gd));
        hashSet.add(Integer.valueOf(bkb.Ob));
        hashSet.add(Integer.valueOf(bkb.Ed));
        hashSet.add(Integer.valueOf(bkb.Dd));
        hashSet.add(Integer.valueOf(bkb.Cd));
        hashSet.add(Integer.valueOf(bkb.Bd));
        hashSet.add(Integer.valueOf(bkb.Nb));
        hashSet.add(Integer.valueOf(bkb.Ad));
        hashSet.add(Integer.valueOf(bkb.zd));
        hashSet.add(Integer.valueOf(bkb.yd));
        hashSet.add(Integer.valueOf(bkb.wd));
        hashSet.add(Integer.valueOf(bkb.vd));
        hashSet.add(Integer.valueOf(bkb.pa));
        hashSet.add(Integer.valueOf(bkb.q7));
        hashSet.add(Integer.valueOf(bkb.yb));
        hashSet.add(Integer.valueOf(bkb.ud));
        hashSet.add(Integer.valueOf(bkb.td));
        hashSet.add(Integer.valueOf(bkb.Mb));
        hashSet.add(Integer.valueOf(bkb.Lb));
        hashSet.add(Integer.valueOf(bkb.sd));
        hashSet.add(Integer.valueOf(bkb.rd));
        hashSet.add(Integer.valueOf(bkb.qd));
        hashSet.add(Integer.valueOf(bkb.Kb));
        hashSet.add(Integer.valueOf(bkb.Jb));
        hashSet.add(Integer.valueOf(bkb.pd));
        hashSet.add(Integer.valueOf(bkb.od));
        hashSet.add(Integer.valueOf(bkb.nd));
        hashSet.add(Integer.valueOf(bkb.Ib));
        hashSet.add(Integer.valueOf(bkb.Hb));
        hashSet.add(Integer.valueOf(bkb.id));
        hashSet.add(Integer.valueOf(bkb.Cb));
        hashSet.add(Integer.valueOf(bkb.Bb));
        hashSet.add(Integer.valueOf(bkb.Ab));
        hashSet.add(Integer.valueOf(bkb.zb));
        hashSet.add(Integer.valueOf(bkb.Xc));
        hashSet.add(Integer.valueOf(bkb.Wc));
        hashSet.add(Integer.valueOf(bkb.Vc));
        hashSet.add(Integer.valueOf(bkb.Uc));
        hashSet.add(Integer.valueOf(bkb.cd));
        hashSet.add(Integer.valueOf(bkb.bd));
        hashSet.add(Integer.valueOf(bkb.ad));
        hashSet.add(Integer.valueOf(bkb.Zc));
        hashSet.add(Integer.valueOf(bkb.rb));
        hashSet.add(Integer.valueOf(bkb.vb));
        hashSet.add(Integer.valueOf(bkb.ub));
        hashSet.add(Integer.valueOf(bkb.tb));
        hashSet.add(Integer.valueOf(bkb.qb));
        hashSet.add(Integer.valueOf(bkb.sb));
        hashSet.add(Integer.valueOf(bkb.sa));
        hashSet.add(Integer.valueOf(bkb.Tc));
        hashSet.add(Integer.valueOf(bkb.qa));
        hashSet.add(Integer.valueOf(bkb.n8));
        hashSet.add(Integer.valueOf(bkb.m8));
        hashSet.add(Integer.valueOf(bkb.l8));
        hashSet.add(Integer.valueOf(bkb.k8));
        hashSet.add(Integer.valueOf(bkb.j8));
        hashSet.add(Integer.valueOf(bkb.i8));
        hashSet.add(Integer.valueOf(bkb.h8));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.A8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[LOOP:1: B:31:0x0096->B:42:0x011f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(k27 k27Var) {
        int i;
        int i2;
        int indexOf;
        int r0;
        k27 messageObject;
        ArrayList arrayList = this.p0;
        if (arrayList.size() > 0) {
            int M0 = this.y.M0();
            for (int K0 = this.y.K0(); K0 <= M0; K0++) {
                kf1 kf1Var = this.F;
                int i3 = kf1Var.f;
                if (K0 >= i3 && K0 < kf1Var.h) {
                    k27 k27Var2 = (k27) arrayList.get(K0 - i3);
                    if (k27Var2.U != 1 && k27Var2.L1() != 0 && !k27Var2.q4()) {
                        i2 = K0 - this.F.f;
                        i = (k27Var2.L1() < k27Var.L1() ? 1 : 0) ^ 1;
                        this.E.b = i;
                        indexOf = arrayList.indexOf(k27Var);
                        if (indexOf == -1) {
                            if (i2 > 0) {
                                i = i2 > indexOf ? 0 : 1;
                                this.E.b = i;
                            }
                            te1 te1Var = this.I0;
                            if (te1Var != null) {
                                gl.r(te1Var);
                                this.I0 = null;
                            }
                            this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.H0 = k27Var.L1();
                            int indexOf2 = arrayList.indexOf(k27Var) + this.F.f;
                            h1();
                            int childCount = this.w.getChildCount();
                            int i4 = 0;
                            boolean z = false;
                            while (true) {
                                if (i4 >= childCount) {
                                    break;
                                }
                                View childAt = this.w.getChildAt(i4);
                                if (childAt instanceof gb2) {
                                    k27 messageObject2 = ((gb2) childAt).getMessageObject();
                                    if (messageObject2 != null && messageObject2.L1() == k27Var.L1()) {
                                        childAt.sendAccessibilityEvent(8);
                                        a1(messageObject2);
                                        z = true;
                                    }
                                    if (z) {
                                        i4++;
                                    } else {
                                        int top = childAt.getTop() - Math.max(-gl.L(2.0f), (this.w.getMeasuredHeight() - childAt.getHeight()) / 2);
                                        int computeVerticalScrollRange = (this.w.computeVerticalScrollRange() - this.w.computeVerticalScrollOffset()) - this.w.computeVerticalScrollExtent();
                                        if (computeVerticalScrollRange < 0) {
                                            computeVerticalScrollRange = 0;
                                        }
                                        if (top > computeVerticalScrollRange) {
                                            top = computeVerticalScrollRange;
                                        }
                                        if (top != 0) {
                                            this.w.x0(0, top, null);
                                            this.w.setOverScrollMode(2);
                                        }
                                    }
                                } else {
                                    if ((childAt instanceof uk1) && (messageObject = ((uk1) childAt).getMessageObject()) != null && messageObject.L1() == k27Var.L1()) {
                                        childAt.sendAccessibilityEvent(8);
                                        z = true;
                                    }
                                    if (z) {
                                    }
                                }
                            }
                            if (z) {
                                return;
                            }
                            if (getParentActivity() == null) {
                                r0 = 0;
                            } else {
                                gb2 gb2Var = this.J0;
                                if (gb2Var == null) {
                                    gb2Var = new gb2(getParentActivity(), this.currentAccount);
                                    this.J0 = gb2Var;
                                }
                                TLRPC.Chat chat = this.f;
                                gb2Var.f6 = chat != null;
                                gb2Var.k6 = hc2.T(chat) && chat.megagroup;
                                r0 = this.J0.r0(k27Var, null, false);
                            }
                            int max = Math.max(-gl.L(2.0f), (this.w.getMeasuredHeight() - r0) / 2);
                            a1(k27Var);
                            mf1 mf1Var = this.L0;
                            mf1Var.a = k27Var;
                            mf1Var.e = max;
                            cu6 cu6Var = this.E;
                            cu6Var.b = i;
                            mf1Var.b = indexOf2;
                            mf1Var.d = max;
                            mf1Var.c = false;
                            cu6Var.k(indexOf2, max, false, false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i = -1;
        i2 = 0;
        this.E.b = i;
        indexOf = arrayList.indexOf(k27Var);
        if (indexOf == -1) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        ArrayList arrayList = this.h;
        final byte b = 0;
        if (arrayList.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                arrayList.add(new gb2(context, this.currentAccount));
            }
        }
        this.V = false;
        final byte b2 = 1;
        this.hasOwnBackground = true;
        bkb.J(context, false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!gl.O1());
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 19));
        o72 o72Var = new o72(context, null, false, null);
        this.J = o72Var;
        zr1 zr1Var = o72Var.h;
        if (zr1Var != null) {
            zr1Var.setTextSizePx(gl.L(17.5f));
        }
        zr1 zr1Var2 = o72Var.r;
        if (zr1Var2 != null) {
            zr1Var2.setTextSizePx(gl.L(13.5f));
        }
        o72Var.m0 = true;
        this.J.setOccupyStatusBar(!gl.O1());
        this.actionBar.addView(this.J, 0, nme.d(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        r7 a = this.actionBar.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q10(this, b2);
        this.O = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.O.setSearchPaddingStart(7);
        this.J.setEnabled(false);
        o72 o72Var2 = this.J;
        TLRPC.Chat chat = this.f;
        o72Var2.setTitle(chat.title);
        this.J.setSubtitle(k96.M0(2131751062, null));
        this.J.setChatAvatar(chat);
        df1 df1Var = new df1(this, context);
        this.fragmentView = df1Var;
        this.Y = df1Var;
        df1Var.setOccupyStatusBar(!gl.O1());
        this.Y.U(bkb.r0());
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        pl0 o = nod.o(this.resourceProvider);
        kl0 kl0Var = this.c;
        aVar.P(kl0Var, o, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.setVisibility(4);
        this.Y.addView(this.I, nme.e(-1, -2, 17));
        this.I.setOnTouchListener(new p8((byte) 24));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setBackground(new qjb(this.M, this.Y, gl.L(12.0f), bkb.e2));
        this.K.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.L.setImageResource(R.drawable.large_log_actions);
        this.L.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.L.setVisibility(8);
        this.K.addView(this.L, nme.t(54, 54, 17, 16, 20, 16, -4));
        wb wbVar = new wb(context, (byte) 14);
        this.M = wbVar;
        wbVar.setTextSize(1, 14.0f);
        this.M.setGravity(17);
        wb wbVar2 = this.M;
        int i2 = bkb.Yc;
        zkb.X(wbVar2, i2, null);
        this.M.setPadding(gl.L(8.0f), gl.L(5.0f), gl.L(8.0f), gl.L(5.0f));
        this.K.addView(this.M, nme.t(-2, -2, 17, 0, 0, 0, 0));
        this.I.addView(this.K, nme.d(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        fu fuVar = new fu((byte) 5, context, (Object) this);
        this.w = fuVar;
        fuVar.setOnItemClickListener(new l69(this, (byte) 16));
        this.w.setTag(1);
        this.w.setVerticalScrollBarEnabled(true);
        fu fuVar2 = this.w;
        kf1 kf1Var = new kf1(this, context);
        this.F = kf1Var;
        fuVar2.setAdapter(kf1Var);
        this.w.setClipToPadding(false);
        fu fuVar3 = this.w;
        int i3 = gl.m;
        int i4 = this.e;
        fuVar3.setPadding(0, gl.L(4.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i3 + i4, 0, gl.L(60.0f) + i4 + gl.n);
        fu fuVar4 = this.w;
        ef1 ef1Var = new ef1(this, this.w, this.resourceProvider);
        this.D0 = ef1Var;
        fuVar4.setItemAnimator(ef1Var);
        this.D0.Q = true;
        this.w.setLayoutAnimation(null);
        zr zrVar = new zr(this);
        this.y = zrVar;
        zrVar.i1(1);
        this.y.k1(true);
        this.w.setLayoutManager(this.y);
        cu6 cu6Var = new cu6(this.w, this.y);
        this.E = cu6Var;
        cu6Var.n = new ue1(this);
        cu6Var.r = this.L0;
        this.Y.addView(this.w, nme.c(-1.0f, -1));
        this.w.setOnScrollListener(new y(this));
        this.glassEngine.b(this.w);
        int i5 = this.h0;
        if (i5 != -1) {
            this.y.g1(i5, this.i0);
            this.h0 = -1;
        }
        ry1 ry1Var = new ry1(context);
        this.X = ry1Var;
        ry1Var.setup(this.b);
        this.X.setFadeZoneTop(gl.L(2.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.m);
        this.X.setFadeHeightTop(gl.L(60.0f));
        this.X.setFadeZoneBottom(gl.L(7.0f) + gl.L(44.0f) + gl.L(9.0f) + gl.n);
        this.X.setFadeHeightBottom(gl.L(60.0f));
        this.Y.addView(this.X, nme.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setVisibility(4);
        this.Y.addView(this.n, nme.e(-1, -1, 51));
        View view = new View(context);
        this.r = view;
        view.setBackground(new qjb(this.r, this.Y, gl.L(18.0f), bkb.e2));
        this.n.addView(this.r, nme.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(gl.L(28.0f));
        this.s.setProgressColor(bkb.w0(null, i2, false));
        this.n.addView(this.s, nme.e(32, 32, 17));
        uk1 uk1Var = new uk1(context);
        this.N = uk1Var;
        uk1Var.setAlpha(0.0f);
        final byte b3 = 2;
        this.N.setImportantForAccessibility(2);
        this.Y.addView(this.N, nme.d(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.Y.addView(this.actionBar);
        wjb wjbVar = this.resourceProvider;
        su1 su1Var = new su1(context, wjbVar, nod.b(wjbVar), kl0Var);
        this.H = su1Var;
        su1Var.setTotalVisibilityFactor(1.0f);
        this.H.setTranslationY(-gl.n);
        this.H.c(4, true, false);
        su1 su1Var2 = this.H;
        il0 c = su1Var2.n.c(su1Var2, null, false);
        c.p(su1Var2.r);
        ug8.r(c, gl.L(22.0f), 6.0f);
        su1Var2.s = c;
        this.Y.addView(this.H, nme.d(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: we1
            public final /* synthetic */ nf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b;
                nf1 nf1Var = this.b;
                switch (b4) {
                    case 0:
                        if (nf1Var.getParentActivity() != null) {
                            ib ibVar = new ib(nf1Var, nf1Var.v0, nf1Var.x0, nf1Var.f.megagroup);
                            ibVar.Z0(nf1Var.u0);
                            ibVar.b2 = new ue1(nf1Var);
                            nf1Var.showDialog(ibVar);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf1Var.getParentActivity());
                        boolean z = nf1Var.f.megagroup;
                        hd hdVar = alertDialog$Builder.a;
                        if (z) {
                            hdVar.U = gl.T2(k96.M0(2131750965, null));
                        } else {
                            hdVar.U = gl.T2(k96.M0(2131750964, null));
                        }
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        hdVar.S = k96.M0(2131750963, null);
                        nf1Var.showDialog(hdVar);
                        break;
                    default:
                        if (nf1Var.getParentActivity() != null) {
                            gl.t1(nf1Var.O.getSearchField());
                            nf1Var.showDialog((fx0) ij.o(nf1Var.getParentActivity(), new re1(nf1Var, (byte) 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        this.G.setTextSize(1, 15.0f);
        this.G.setTypeface(gl.o());
        zkb.X(this.G, bkb.rf, null);
        this.G.setText(k96.M0(2131745791, null));
        this.G.setPadding(gl.L(24.0f), 0, gl.L(24.0f), 0);
        this.H.getContainer().addView(this.G, nme.e(-2, -2, 17));
        this.H.f.add(this.G);
        this.H.d(false);
        this.H.b[4] = new View.OnClickListener(this) { // from class: we1
            public final /* synthetic */ nf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b2;
                nf1 nf1Var = this.b;
                switch (b4) {
                    case 0:
                        if (nf1Var.getParentActivity() != null) {
                            ib ibVar = new ib(nf1Var, nf1Var.v0, nf1Var.x0, nf1Var.f.megagroup);
                            ibVar.Z0(nf1Var.u0);
                            ibVar.b2 = new ue1(nf1Var);
                            nf1Var.showDialog(ibVar);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf1Var.getParentActivity());
                        boolean z = nf1Var.f.megagroup;
                        hd hdVar = alertDialog$Builder.a;
                        if (z) {
                            hdVar.U = gl.T2(k96.M0(2131750965, null));
                        } else {
                            hdVar.U = gl.T2(k96.M0(2131750964, null));
                        }
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        hdVar.S = k96.M0(2131750963, null);
                        nf1Var.showDialog(hdVar);
                        break;
                    default:
                        if (nf1Var.getParentActivity() != null) {
                            gl.t1(nf1Var.O.getSearchField());
                            nf1Var.showDialog((fx0) ij.o(nf1Var.getParentActivity(), new re1(nf1Var, (byte) 0), null).a);
                            break;
                        }
                        break;
                }
            }
        };
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.b0.setVisibility(4);
        this.b0.setFocusable(true);
        this.b0.setFocusableInTouchMode(true);
        this.b0.setClickable(true);
        this.b0.setPadding(0, gl.L(3.0f), 0, 0);
        this.Y.addView(this.b0, nme.e(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        imageView2.setScaleType(scaleType);
        this.c0.setImageResource(R.drawable.msg_calendar);
        zkb.s(this.c0, bkb.of, null, PorterDuff.Mode.MULTIPLY);
        this.b0.addView(this.c0, nme.e(48, 48, 53));
        this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: we1
            public final /* synthetic */ nf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b3;
                nf1 nf1Var = this.b;
                switch (b4) {
                    case 0:
                        if (nf1Var.getParentActivity() != null) {
                            ib ibVar = new ib(nf1Var, nf1Var.v0, nf1Var.x0, nf1Var.f.megagroup);
                            ibVar.Z0(nf1Var.u0);
                            ibVar.b2 = new ue1(nf1Var);
                            nf1Var.showDialog(ibVar);
                            break;
                        }
                        break;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf1Var.getParentActivity());
                        boolean z = nf1Var.f.megagroup;
                        hd hdVar = alertDialog$Builder.a;
                        if (z) {
                            hdVar.U = gl.T2(k96.M0(2131750965, null));
                        } else {
                            hdVar.U = gl.T2(k96.M0(2131750964, null));
                        }
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        hdVar.S = k96.M0(2131750963, null);
                        nf1Var.showDialog(hdVar);
                        break;
                    default:
                        if (nf1Var.getParentActivity() != null) {
                            gl.t1(nf1Var.O.getSearchField());
                            nf1Var.showDialog((fx0) ij.o(nf1Var.getParentActivity(), new re1(nf1Var, (byte) 0), null).a);
                            break;
                        }
                        break;
                }
            }
        });
        jia jiaVar = new jia(context);
        this.d0 = jiaVar;
        zkb.W(jiaVar, bkb.pf, null);
        this.d0.setTextSize(15);
        this.d0.setTypeface(gl.o());
        this.b0.addView(this.d0, nme.d(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.F.D(true);
        if (this.s0 && this.o0.isEmpty()) {
            gl.U3(this.n, true, 0.3f, true, true);
            this.w.setEmptyView(null);
        } else {
            gl.U3(this.n, false, 0.3f, true, true);
            this.w.setEmptyView(this.I);
        }
        fu fuVar5 = this.w;
        fuVar5.X1 = true;
        fuVar5.Y1 = true;
        UndoView undoView = new UndoView(context);
        this.x = undoView;
        undoView.setAdditionalTranslationY(gl.L(51.0f));
        this.Y.addView(this.x, nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        f1();
        return this.fragmentView;
    }

    public final void d1(TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap hashMap) {
        na7 messagesController = getMessagesController();
        TLRPC.Chat chat = this.f;
        TLRPC.ChatFull L0 = messagesController.L0(chat.id);
        zq5 zq5Var = new zq5(this.Y.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, L0, hashMap, this, L0.id, false, hc2.T(chat));
        zq5Var.d2 = new cf1(this);
        zq5Var.show();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        gb2 gb2Var;
        k27 messageObject;
        gb2 gb2Var2;
        k27 messageObject2;
        gb2 gb2Var3;
        k27 messageObject3;
        boolean z;
        if (i == kk7.k4) {
            fu fuVar = this.w;
            if (fuVar != null) {
                fuVar.h1();
                return;
            }
            return;
        }
        if (i != kk7.g2) {
            if (i == kk7.e2 || i == kk7.f2) {
                fu fuVar2 = this.w;
                if (fuVar2 != null) {
                    int childCount = fuVar2.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = this.w.getChildAt(i3);
                        if ((childAt instanceof gb2) && (messageObject = (gb2Var = (gb2) childAt).getMessageObject()) != null) {
                            if (k27.Q4(messageObject.k) || messageObject.I3()) {
                                gb2Var.R3(false, true, false);
                            } else if (messageObject.g4() && !MediaController.w().D(messageObject)) {
                                gb2Var.p0(null, true);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (i != kk7.d2) {
                if (i != kk7.B4 || this.fragmentView == null) {
                    return;
                }
                this.Y.U(bkb.r0());
                this.r.invalidate();
                wb wbVar = this.M;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                this.w.h1();
                return;
            }
            Integer num = (Integer) objArr[0];
            fu fuVar3 = this.w;
            if (fuVar3 != null) {
                int childCount2 = fuVar3.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.w.getChildAt(i4);
                    if ((childAt2 instanceof gb2) && (messageObject2 = (gb2Var2 = (gb2) childAt2).getMessageObject()) != null && messageObject2.e1() == num.intValue()) {
                        k27 k27Var = MediaController.w().v0;
                        if (k27Var != null) {
                            messageObject2.b0 = k27Var.b0;
                            messageObject2.i0 = k27Var.i0;
                            messageObject2.j0 = k27Var.j0;
                            gb2Var2.W3();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((k27) objArr[0]).g4()) {
            MediaController.w().o0(M0(true), this.f0, this.e0, true);
            int childCount3 = this.w.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount3) {
                    z = false;
                    break;
                }
                View childAt3 = this.w.getChildAt(i5);
                if (childAt3 instanceof gb2) {
                    gb2 gb2Var4 = (gb2) childAt3;
                    k27 messageObject4 = gb2Var4.getMessageObject();
                    if (this.e0 != null && messageObject4.g4() && MediaController.w().D(messageObject4)) {
                        ImageReceiver photoImage = gb2Var4.getPhotoImage();
                        this.e0.setTranslationX(photoImage.L0);
                        this.e0.setTranslationY(gb2Var4.getTop() + this.fragmentView.getPaddingTop() + photoImage.M0);
                        this.fragmentView.invalidate();
                        this.e0.invalidate();
                        z = true;
                        break;
                    }
                }
                i5++;
            }
            if (this.e0 != null) {
                k27 k27Var2 = MediaController.w().v0;
                if (z) {
                    MediaController.w().j0(true);
                } else {
                    this.e0.setTranslationY((-gl.u) - 100);
                    this.fragmentView.invalidate();
                    if (k27Var2 != null && k27Var2.g4() && (this.W || PipRoundVideoView.G != null)) {
                        MediaController.w().j0(false);
                    }
                }
            }
        }
        fu fuVar4 = this.w;
        if (fuVar4 != null) {
            int childCount4 = fuVar4.getChildCount();
            for (int i6 = 0; i6 < childCount4; i6++) {
                View childAt4 = this.w.getChildAt(i6);
                if ((childAt4 instanceof gb2) && (messageObject3 = (gb2Var3 = (gb2) childAt4).getMessageObject()) != null) {
                    if (k27.Q4(messageObject3.k) || messageObject3.I3()) {
                        gb2Var3.R3(false, true, false);
                    } else if (messageObject3.g4()) {
                        gb2Var3.p0(null, false);
                        if (!MediaController.w().D(messageObject3) && messageObject3.b0 != 0.0f) {
                            messageObject3.F5();
                            gb2Var3.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f1() {
        if (this.M == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.w0)) {
            this.L.setVisibility(8);
            this.M.setPadding(gl.L(8.0f), gl.L(3.0f), gl.L(8.0f), gl.L(3.0f));
            this.M.setText(gl.T2(k96.M0(2131748009, null)));
            return;
        }
        if (this.x0 != null || this.v0 != null) {
            this.L.setVisibility(8);
            this.M.setPadding(gl.L(8.0f), gl.L(3.0f), gl.L(8.0f), gl.L(3.0f));
            this.M.setText(gl.T2(k96.M0(2131748008, null)));
            return;
        }
        this.L.setVisibility(0);
        this.M.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        boolean z = this.f.megagroup;
        wb wbVar = this.M;
        if (z) {
            SpannableStringBuilder T2 = gl.T2(k96.M0(2131751000, null));
            e1(T2);
            wbVar.setText(T2);
        } else {
            SpannableStringBuilder T22 = gl.T2(k96.M0(2131750999, null));
            e1(T22);
            wbVar.setText(T22);
        }
    }

    public final void g1() {
        fu fuVar = this.w;
        if (fuVar == null) {
            return;
        }
        int childCount = fuVar.getChildCount();
        int measuredHeight = this.w.getMeasuredHeight();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        boolean z2 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.w.getChildAt(i3);
            if (childAt instanceof ob2) {
                ob2 ob2Var = (ob2) childAt;
                float y = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY();
                int backgroundSizeY = this.Y.getBackgroundSizeY();
                ob2Var.f = y;
                ob2Var.h = backgroundSizeY;
            } else if (childAt instanceof gb2) {
                gb2 gb2Var = (gb2) childAt;
                int top = gb2Var.getTop();
                gb2Var.getBottom();
                int i4 = top >= 0 ? 0 : -top;
                int measuredHeight2 = gb2Var.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i4 + measuredHeight;
                }
                gb2Var.D3(i4, measuredHeight2 - i4, (this.Y.getHeightWithKeyboard() - gl.L(48.0f)) - this.w.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getMeasuredWidth(), this.Y.getBackgroundSizeY(), 0, 0, 0);
                k27 messageObject = gb2Var.getMessageObject();
                if (this.e0 != null && messageObject.g4() && MediaController.w().D(messageObject)) {
                    ImageReceiver photoImage = gb2Var.getPhotoImage();
                    this.e0.setTranslationX(photoImage.L0);
                    this.e0.setTranslationY(this.fragmentView.getPaddingTop() + top + photoImage.M0);
                    this.fragmentView.invalidate();
                    this.e0.invalidate();
                    z2 = true;
                }
            } else if (childAt instanceof uk1) {
                uk1 uk1Var = (uk1) childAt;
                uk1Var.k0((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.Y.getBackgroundTranslationY(), this.Y.getBackgroundSizeY());
                if (uk1Var.T()) {
                    uk1Var.invalidate();
                }
            }
            if (childAt.getBottom() > this.w.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i) {
                    if ((childAt instanceof gb2) || (childAt instanceof uk1)) {
                        view = childAt;
                    }
                    i = bottom;
                    view3 = childAt;
                }
                ef1 ef1Var = this.D0;
                if ((ef1Var == null || (!ef1Var.Z(childAt) && !this.D0.Y(childAt))) && (childAt instanceof uk1) && ((uk1) childAt).getMessageObject().l0) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i2) {
                        i2 = bottom;
                        view2 = childAt;
                    }
                }
            }
        }
        yc ycVar = this.e0;
        if (ycVar != null) {
            if (z2) {
                MediaController.w().j0(true);
            } else {
                ycVar.setTranslationY((-gl.u) - 100);
                this.fragmentView.invalidate();
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null && k27Var.g4() && this.W) {
                    MediaController.w().j0(false);
                }
            }
        }
        if (view != null) {
            this.N.i0((view instanceof gb2 ? ((gb2) view).getMessageObject() : ((uk1) view).getMessageObject()).k.date, false, true);
        }
        this.Q = false;
        if (!(view3 instanceof gb2) && !(view3 instanceof uk1)) {
            z = true;
        }
        this.R = z;
        if (view2 == null) {
            P0(true);
            this.N.setTranslationY(0.0f);
            return;
        }
        if (view2.getTop() > this.w.getPaddingTop() || this.R) {
            if (view2.getAlpha() != 1.0f) {
                view2.setAlpha(1.0f);
            }
            P0(!this.R);
        } else {
            if (view2.getAlpha() != 0.0f) {
                view2.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.S;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.S = null;
            }
            if (this.N.getTag() == null) {
                this.N.setTag(1);
            }
            if (this.N.getAlpha() != 1.0f) {
                this.N.setAlpha(1.0f);
            }
            this.Q = true;
        }
        int bottom2 = view2.getBottom() - this.w.getPaddingTop();
        if (bottom2 <= this.N.getMeasuredHeight() || bottom2 >= (this.N.getMeasuredHeight() << 1)) {
            this.N.setTranslationY(0.0f);
        } else {
            this.N.setTranslationY(((-r0.getMeasuredHeight()) << 1) + bottom2);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.De));
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F8));
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.D8));
        arrayList.add(new blb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.E8));
        arrayList.add(new blb(this.J.getTitleTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.z8));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Rb));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Md));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sb));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ud));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Yb));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vd));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Zb));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.mc));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.oc));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.nc));
        arrayList.add(new blb(this.w, 0, new Class[]{gb2.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ff));
        arrayList.add(new blb(this.w, 131072, new Class[]{ke2.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (alb) null, bkb.wf));
        View view = this.r;
        int i = bkb.bd;
        arrayList.add(new blb(view, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.M, TLObject.FLAG_29, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        return arrayList;
    }

    public final void h1() {
        fu fuVar = this.w;
        if (fuVar != null) {
            int childCount = fuVar.getChildCount();
            byte b = 0;
            for (int i = 0; i < childCount; i++) {
                View childAt = this.w.getChildAt(i);
                if (childAt instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt;
                    k27 messageObject = gb2Var.getMessageObject();
                    if (messageObject != null) {
                        if (!this.actionBar.y()) {
                            gb2Var.setDrawSelectionBackground(false);
                            gb2Var.m3(false, true);
                            gb2Var.o3(false, false, true);
                        }
                        gb2Var.setHighlighted(this.H0 != Integer.MAX_VALUE && messageObject.L1() == this.H0);
                        if (this.H0 != Integer.MAX_VALUE) {
                            te1 te1Var = this.I0;
                            if (te1Var != null) {
                                gl.r(te1Var);
                            }
                            te1 te1Var2 = new te1(this, b);
                            this.I0 = te1Var2;
                            gl.e3(te1Var2, 1000L);
                        }
                        if (TextUtils.isEmpty(this.w0)) {
                            gb2Var.v3(null);
                        } else {
                            gb2Var.v3(this.w0);
                        }
                        gb2Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
                    }
                } else if (childAt instanceof uk1) {
                    uk1 uk1Var = (uk1) childAt;
                    uk1Var.setMessageObject(uk1Var.getMessageObject());
                    uk1Var.setSpoilersSuppressed(this.w.getScrollState() != 0);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        kk7.e().b(this, kk7.k4);
        kk7.f(this.currentAccount).b(this, kk7.g2);
        kk7.f(this.currentAccount).b(this, kk7.f2);
        kk7.f(this.currentAccount).b(this, kk7.e2);
        kk7.f(this.currentAccount).b(this, kk7.d2);
        kk7.e().b(this, kk7.B4);
        W0(true);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = na7.g1(this.f);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = kk7.d3;
        byte b = 4;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new se1(this, b)), this.classGuid);
        setBulletinDelegate(new oy(b));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.e().n(this, kk7.k4);
        kk7.f(this.currentAccount).n(this, kk7.g2);
        kk7.f(this.currentAccount).n(this, kk7.f2);
        kk7.f(this.currentAccount).n(this, kk7.e2);
        kk7.f(this.currentAccount).n(this, kk7.d2);
        kk7.e().n(this, kk7.B4);
        this.y0.e();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        lf1 lf1Var = this.Y;
        if (lf1Var != null) {
            brc brcVar = lf1Var.w;
            if (brcVar != null) {
                brcVar.b(false);
            }
            lf1Var.G = true;
        }
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.j0 = true;
        this.k0 = true;
        xf4 xf4Var = xf4.f;
        if (xf4Var == null || !xf4Var.a) {
            return;
        }
        xf4 t = xf4.t();
        if (t.a) {
            rb0 rb0Var = (rb0) t.d;
            int i = bc0.G;
            rb0Var.b(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRemoveFromParent() {
        MediaController.w().o0(this.g0, null, null, false);
        super.onRemoveFromParent();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
        lf1 lf1Var = this.Y;
        if (lf1Var != null) {
            brc brcVar = lf1Var.w;
            if (brcVar != null) {
                brcVar.b(true);
            }
            lf1Var.G = false;
        }
        this.j0 = false;
        K0(false);
        if (this.k0) {
            this.k0 = false;
            kf1 kf1Var = this.F;
            if (kf1Var != null) {
                kf1Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.s;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(bkb.w0(null, bkb.Yc, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.y0.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        if (z) {
            this.y0.d();
        }
    }
}
