// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fu5 extends fx0 {
    public static final /* synthetic */ int t1 = 0;
    public int l1;
    public final String m1;
    public final d n1;
    public final TLRPC.ChatInvite o1;
    public final TLRPC.Chat p1;
    public final TextView q1;
    public final RadialProgressView r1;
    public u21 s1;

    /* JADX WARN: Removed duplicated region for block: B:100:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fu5(Context context, TLObject tLObject, String str, d dVar, wjb wjbVar) {
        super(1, wjbVar, context, false);
        String str2;
        final long j;
        long j2;
        TLRPC.ChatInvite chatInvite;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        String str3;
        String str4;
        gq9 gq9Var;
        final boolean z4;
        boolean isEmpty;
        int i2;
        String lowerCase;
        TLRPC.ChatInvite chatInvite2;
        float f;
        boolean z5;
        String format;
        String str5;
        this.w0 = false;
        this.v0 = false;
        M(bkb.c6);
        this.l1 = this.H0;
        this.n1 = dVar;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite3 = (TLRPC.ChatInvite) tLObject;
            this.o1 = chatInvite3;
            TLRPC.Chat chat = chatInvite3.chat;
            j2 = chat != null ? -chat.id : 0L;
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = str;
                j = 0;
                this.m1 = str2;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClickable(true);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(linearLayout);
                NestedScrollView nestedScrollView = new NestedScrollView(context);
                nestedScrollView.addView(frameLayout);
                this.O = nestedScrollView;
                ImageView imageView = new ImageView(context);
                imageView.setBackground(bkb.f0(bkb.v0(bkb.h6, this.J0), 1, -1));
                zkb.s(imageView, bkb.zj, wjbVar, PorterDuff.Mode.SRC_ATOP);
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new b95(this, (byte) 13));
                int L = gl.L(8.0f);
                imageView.setPadding(L, L, L, L);
                frameLayout.addView(imageView, nme.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                be0 be0Var = new be0(context);
                be0Var.setRoundRadius(gl.L(45.0f));
                linearLayout.addView(be0Var, nme.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.o1;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        pb0 pb0Var = new pb0(this.o1.chat);
                        TLRPC.ChatInvite chatInvite4 = this.o1;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        str5 = chat2.title;
                        i = chat2.participants_count;
                        be0Var.a.U(chat2, pb0Var, chatInvite4);
                        be0Var.e();
                    } else {
                        pb0 pb0Var2 = new pb0((wjb) null);
                        pb0Var2.j(0L, this.o1.title, null, null);
                        TLRPC.ChatInvite chatInvite5 = this.o1;
                        String str6 = chatInvite5.title;
                        i = chatInvite5.participants_count;
                        be0Var.m(gl5.i(ba4.w(chatInvite5.photo.sizes, 50, false, null, false), this.o1.photo), "50_50", pb0Var2, this.o1);
                        str5 = str6;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.o1;
                    str3 = chatInvite6.about;
                    z2 = chatInvite6.verified;
                    z3 = chatInvite6.fake;
                    z = chatInvite6.scam;
                    str4 = str5;
                } else if (this.p1 != null) {
                    pb0 pb0Var3 = new pb0(this.p1);
                    String str7 = this.p1.title;
                    TLRPC.ChatFull L0 = na7.q1(this.a).L0(this.p1.id);
                    String str8 = L0 != null ? L0.about : null;
                    i = Math.max(this.p1.participants_count, L0 != null ? L0.participants_count : 0);
                    TLRPC.Chat chat3 = this.p1;
                    be0Var.a.U(chat3, pb0Var3, chat3);
                    be0Var.e();
                    TLRPC.Chat chat4 = this.p1;
                    boolean z6 = chat4.verified;
                    z3 = chat4.fake;
                    z = chat4.scam;
                    z2 = z6;
                    str3 = str8;
                    str4 = str7;
                } else {
                    z = false;
                    z2 = false;
                    z3 = false;
                    i = 0;
                    str3 = null;
                    str4 = null;
                }
                jia jiaVar = new jia(context);
                jiaVar.setTypeface(gl.o());
                jiaVar.setTextSize(20);
                int i3 = bkb.i5;
                zkb.W(jiaVar, i3, wjbVar);
                jiaVar.l(str4, false);
                jiaVar.setGravity(17);
                linearLayout.addView(jiaVar, nme.t(-2, -2, 49, 10, 10, 10, i <= 0 ? 0 : 20));
                if (!z) {
                    gq9Var = bkb.f1;
                } else {
                    if (!z3) {
                        if (z2) {
                            jiaVar.i(new fm2(bkb.e1, bkb.h1));
                        }
                        TLRPC.ChatInvite chatInvite7 = this.o1;
                        z4 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || hc2.V(chatInvite7.chat))) || (hc2.T(this.p1) && !this.p1.megagroup);
                        isEmpty = TextUtils.isEmpty(str3);
                        TextView textView = new TextView(context);
                        textView.setTextSize(1, 13.0f);
                        int i4 = bkb.q5;
                        zkb.X(textView, i4, wjbVar);
                        textView.setSingleLine(true);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView.setEllipsize(truncateAt);
                        if (z4) {
                            lowerCase = k96.M0(2131752317, null).toLowerCase();
                            i2 = 20;
                        } else {
                            i2 = 20;
                            lowerCase = k96.M0(2131748449, null).toLowerCase();
                        }
                        textView.setText(lowerCase);
                        linearLayout.addView(textView, nme.t(-2, -2, 49, 10, 0, 10, !isEmpty ? 0 : i2));
                        if (!isEmpty) {
                            TextView textView2 = new TextView(context);
                            textView2.setGravity(17);
                            textView2.setText(str3);
                            zkb.X(textView2, i3, wjbVar);
                            textView2.setTextSize(1, 15.0f);
                            linearLayout.addView(textView2, nme.t(-1, -2, 48, 24, 10, 24, 20));
                        }
                        chatInvite2 = this.o1;
                        if (chatInvite2 != null || chatInvite2.request_needed) {
                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                            linearLayout.addView(frameLayout2, nme.o(-1, -2));
                            RadialProgressView radialProgressView = new RadialProgressView(getContext(), wjbVar);
                            this.r1 = radialProgressView;
                            int i5 = bkb.Ei;
                            radialProgressView.setProgressColorKey(i5);
                            radialProgressView.setSize(gl.L(32.0f));
                            radialProgressView.setVisibility(4);
                            frameLayout2.addView(radialProgressView, nme.e(48, 48, 17));
                            TextView textView3 = new TextView(getContext());
                            this.q1 = textView3;
                            int L2 = gl.L(24.0f);
                            int v0 = bkb.v0(i5, this.J0);
                            int i6 = bkb.Gi;
                            int v02 = bkb.v0(i6, this.J0);
                            ff0 i0 = bkb.i0(L2, L2, L2, L2, v0, v02, v02);
                            vkb M = zkb.M(i5);
                            vkb M2 = zkb.M(i6);
                            textView3.setBackground(i0);
                            zkb.j(textView3, i0, M, M2, wjbVar);
                            textView3.setEllipsize(truncateAt);
                            textView3.setGravity(17);
                            textView3.setSingleLine(true);
                            textView3.setText(k96.M0(z4 ? 2131745981 : 2131745977, null));
                            zkb.X(textView3, bkb.Ii, wjbVar);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setTypeface(gl.o());
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: cu5
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final fu5 fu5Var = fu5.this;
                                    TLRPC.Chat chat5 = fu5Var.p1;
                                    final byte b = 0;
                                    gl.d3(new Runnable() { // from class: du5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b2 = b;
                                            fu5 fu5Var2 = fu5Var;
                                            switch (b2) {
                                                case 0:
                                                    if (!fu5Var2.J) {
                                                        fu5Var2.q1.setVisibility(4);
                                                        fu5Var2.r1.setVisibility(0);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    fu5Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    TLRPC.ChatInvite chatInvite8 = fu5Var.o1;
                                    boolean z7 = z4;
                                    if (chatInvite8 != null || chat5 == null) {
                                        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                        tL_messages_importChatInvite.hash = fu5Var.m1;
                                        ConnectionsManager.getInstance(fu5Var.a).sendRequest(tL_messages_importChatInvite, new j67(fu5Var, j, z7, tL_messages_importChatInvite), 2);
                                    } else {
                                        final byte b2 = 1;
                                        na7.q1(fu5Var.a).j(chat5.id, y6c.h(fu5Var.a).f(), 0, null, null, true, new Runnable() { // from class: du5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b22 = b2;
                                                fu5 fu5Var2 = fu5Var;
                                                switch (b22) {
                                                    case 0:
                                                        if (!fu5Var2.J) {
                                                            fu5Var2.q1.setVisibility(4);
                                                            fu5Var2.r1.setVisibility(0);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        fu5Var2.dismiss();
                                                        break;
                                                }
                                            }
                                        }, new l41((byte) 8, fu5Var, z7), null);
                                    }
                                }
                            });
                            frameLayout2.addView(textView3, nme.t(-1, 48, 8388611, 14, 0, 14, 0));
                            TextView textView4 = new TextView(getContext());
                            textView4.setGravity(17);
                            textView4.setTextSize(1, 14.0f);
                            textView4.setText(k96.M0(z4 ? 2131745979 : 2131745975, null));
                            zkb.X(textView4, i4, wjbVar);
                            linearLayout.addView(textView4, nme.t(-1, -2, 48, 24, 17, 24, 15));
                        }
                        byte b = 3;
                        if (chatInvite2.participants.isEmpty()) {
                            f = 24.0f;
                            z5 = false;
                        } else {
                            int min = Math.min(this.o1.participants.size(), 3);
                            hc0 hc0Var = new hc0(context, false);
                            hc0Var.setAvatarsTextSize(gl.L(20.0f));
                            hc0Var.setSize(gl.L(38.0f));
                            hc0Var.setCount(min);
                            hc0Var.setStepFactor(0.65f);
                            for (int i7 = 0; i7 < min; i7++) {
                                hc0Var.b(i7, y6c.t0, this.o1.participants.get(i7));
                            }
                            hc0Var.a(false);
                            linearLayout.addView(hc0Var, nme.t((int) (((min - 1) * 25.699999f) + 38.0f), 44, 17, 0, 2, 0, 4));
                            TextView textView5 = new TextView(context);
                            textView5.setTextSize(1, 13.0f);
                            zkb.X(textView5, bkb.q5, wjbVar);
                            textView5.setGravity(17);
                            if (min == 1) {
                                z5 = false;
                                format = D0(textView5, this.o1, 0).toString();
                            } else {
                                z5 = false;
                                if (min == 2) {
                                    format = k96.a0("RequestToJoinMembersTwo", null, 2131745969, D0(textView5, this.o1, 0), D0(textView5, this.o1, 1));
                                } else {
                                    if (i == 3) {
                                        f = 24.0f;
                                        format = k96.a0("RequestToJoinMembersThree", null, 2131745970, D0(textView5, this.o1, 0), D0(textView5, this.o1, 1), D0(textView5, this.o1, 2));
                                        z5 = false;
                                    } else {
                                        f = 24.0f;
                                        int max = Math.max(i - min, 2);
                                        z5 = false;
                                        format = String.format(k96.J0(max, "RequestToJoinMembersAll"), D0(textView5, this.o1, 0), D0(textView5, this.o1, 1), Integer.valueOf(max));
                                    }
                                    textView5.setText(format);
                                    linearLayout.addView(textView5, nme.t(-2, -2, 49, 10, 0, 10, 24));
                                }
                            }
                            f = 24.0f;
                            textView5.setText(format);
                            linearLayout.addView(textView5, nme.t(-2, -2, 49, 10, 0, 10, 24));
                        }
                        TLRPC.ChatInvite chatInvite8 = this.o1;
                        if ((chatInvite8.channel && !chatInvite8.megagroup) || (hc2.T(chatInvite8.chat) && !this.o1.chat.megagroup)) {
                            z5 = true;
                        }
                        TextView textView6 = new TextView(getContext());
                        int L3 = gl.L(f);
                        int i8 = bkb.Ei;
                        int v03 = bkb.v0(i8, this.J0);
                        int i9 = bkb.Gi;
                        int v04 = bkb.v0(i9, this.J0);
                        ff0 i02 = bkb.i0(L3, L3, L3, L3, v03, v04, v04);
                        vkb M3 = zkb.M(i8);
                        vkb M4 = zkb.M(i9);
                        textView6.setBackground(i02);
                        zkb.j(textView6, i02, M3, M4, wjbVar);
                        ote.b(textView6, 0.02f, 1.2f);
                        textView6.setEllipsize(TextUtils.TruncateAt.END);
                        textView6.setGravity(17);
                        textView6.setSingleLine(true);
                        textView6.setText(k96.M0(z5 ? 2131746469 : 2131746468, null));
                        tb4.w(textView6, bkb.Ii, wjbVar, 1, 14.0f);
                        linearLayout.addView(textView6, nme.t(-1, 48, 8388611, 14, 0, 14, 14));
                        textView6.setOnClickListener(new ly(this, j, b));
                        return;
                    }
                    gq9Var = bkb.g1;
                }
                jiaVar.i(gq9Var);
                TLRPC.ChatInvite chatInvite72 = this.o1;
                if (chatInvite72 == null) {
                }
                isEmpty = TextUtils.isEmpty(str3);
                TextView textView7 = new TextView(context);
                textView7.setTextSize(1, 13.0f);
                int i42 = bkb.q5;
                zkb.X(textView7, i42, wjbVar);
                textView7.setSingleLine(true);
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                textView7.setEllipsize(truncateAt2);
                if (z4) {
                }
                textView7.setText(lowerCase);
                linearLayout.addView(textView7, nme.t(-2, -2, 49, 10, 0, 10, !isEmpty ? 0 : i2));
                if (!isEmpty) {
                }
                chatInvite2 = this.o1;
                if (chatInvite2 != null) {
                }
                FrameLayout frameLayout22 = new FrameLayout(getContext());
                linearLayout.addView(frameLayout22, nme.o(-1, -2));
                RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), wjbVar);
                this.r1 = radialProgressView2;
                int i52 = bkb.Ei;
                radialProgressView2.setProgressColorKey(i52);
                radialProgressView2.setSize(gl.L(32.0f));
                radialProgressView2.setVisibility(4);
                frameLayout22.addView(radialProgressView2, nme.e(48, 48, 17));
                TextView textView32 = new TextView(getContext());
                this.q1 = textView32;
                int L22 = gl.L(24.0f);
                int v05 = bkb.v0(i52, this.J0);
                int i62 = bkb.Gi;
                int v022 = bkb.v0(i62, this.J0);
                ff0 i03 = bkb.i0(L22, L22, L22, L22, v05, v022, v022);
                vkb M5 = zkb.M(i52);
                vkb M22 = zkb.M(i62);
                textView32.setBackground(i03);
                zkb.j(textView32, i03, M5, M22, wjbVar);
                textView32.setEllipsize(truncateAt2);
                textView32.setGravity(17);
                textView32.setSingleLine(true);
                textView32.setText(k96.M0(z4 ? 2131745981 : 2131745977, null));
                zkb.X(textView32, bkb.Ii, wjbVar);
                textView32.setTextSize(1, 14.0f);
                textView32.setTypeface(gl.o());
                textView32.setOnClickListener(new View.OnClickListener() { // from class: cu5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final fu5 fu5Var = fu5.this;
                        TLRPC.Chat chat5 = fu5Var.p1;
                        final byte b2 = 0;
                        gl.d3(new Runnable() { // from class: du5
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b22 = b2;
                                fu5 fu5Var2 = fu5Var;
                                switch (b22) {
                                    case 0:
                                        if (!fu5Var2.J) {
                                            fu5Var2.q1.setVisibility(4);
                                            fu5Var2.r1.setVisibility(0);
                                            break;
                                        }
                                        break;
                                    default:
                                        fu5Var2.dismiss();
                                        break;
                                }
                            }
                        }, 400L);
                        TLRPC.ChatInvite chatInvite82 = fu5Var.o1;
                        boolean z7 = z4;
                        if (chatInvite82 != null || chat5 == null) {
                            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                            tL_messages_importChatInvite.hash = fu5Var.m1;
                            ConnectionsManager.getInstance(fu5Var.a).sendRequest(tL_messages_importChatInvite, new j67(fu5Var, j, z7, tL_messages_importChatInvite), 2);
                        } else {
                            final byte b22 = 1;
                            na7.q1(fu5Var.a).j(chat5.id, y6c.h(fu5Var.a).f(), 0, null, null, true, new Runnable() { // from class: du5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b222 = b22;
                                    fu5 fu5Var2 = fu5Var;
                                    switch (b222) {
                                        case 0:
                                            if (!fu5Var2.J) {
                                                fu5Var2.q1.setVisibility(4);
                                                fu5Var2.r1.setVisibility(0);
                                                break;
                                            }
                                            break;
                                        default:
                                            fu5Var2.dismiss();
                                            break;
                                    }
                                }
                            }, new l41((byte) 8, fu5Var, z7), null);
                        }
                    }
                });
                frameLayout22.addView(textView32, nme.t(-1, 48, 8388611, 14, 0, 14, 0));
                TextView textView42 = new TextView(getContext());
                textView42.setGravity(17);
                textView42.setTextSize(1, 14.0f);
                textView42.setText(k96.M0(z4 ? 2131745979 : 2131745975, null));
                zkb.X(textView42, i42, wjbVar);
                linearLayout.addView(textView42, nme.t(-1, -2, 48, 24, 17, 24, 15));
            }
            TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
            this.p1 = chat5;
            j2 = chat5.id;
        }
        str2 = str;
        j = j2;
        this.m1 = str2;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setClickable(true);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView(linearLayout2);
        NestedScrollView nestedScrollView2 = new NestedScrollView(context);
        nestedScrollView2.addView(frameLayout3);
        this.O = nestedScrollView2;
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackground(bkb.f0(bkb.v0(bkb.h6, this.J0), 1, -1));
        zkb.s(imageView2, bkb.zj, wjbVar, PorterDuff.Mode.SRC_ATOP);
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new b95(this, (byte) 13));
        int L4 = gl.L(8.0f);
        imageView2.setPadding(L4, L4, L4, L4);
        frameLayout3.addView(imageView2, nme.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        be0 be0Var2 = new be0(context);
        be0Var2.setRoundRadius(gl.L(45.0f));
        linearLayout2.addView(be0Var2, nme.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.o1;
        if (chatInvite == null) {
        }
        jia jiaVar2 = new jia(context);
        jiaVar2.setTypeface(gl.o());
        jiaVar2.setTextSize(20);
        int i32 = bkb.i5;
        zkb.W(jiaVar2, i32, wjbVar);
        jiaVar2.l(str4, false);
        jiaVar2.setGravity(17);
        linearLayout2.addView(jiaVar2, nme.t(-2, -2, 49, 10, 10, 10, i <= 0 ? 0 : 20));
        if (!z) {
        }
        jiaVar2.i(gq9Var);
        TLRPC.ChatInvite chatInvite722 = this.o1;
        if (chatInvite722 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView textView72 = new TextView(context);
        textView72.setTextSize(1, 13.0f);
        int i422 = bkb.q5;
        zkb.X(textView72, i422, wjbVar);
        textView72.setSingleLine(true);
        TextUtils.TruncateAt truncateAt22 = TextUtils.TruncateAt.END;
        textView72.setEllipsize(truncateAt22);
        if (z4) {
        }
        textView72.setText(lowerCase);
        linearLayout2.addView(textView72, nme.t(-2, -2, 49, 10, 0, 10, !isEmpty ? 0 : i2));
        if (!isEmpty) {
        }
        chatInvite2 = this.o1;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout222 = new FrameLayout(getContext());
        linearLayout2.addView(frameLayout222, nme.o(-1, -2));
        RadialProgressView radialProgressView22 = new RadialProgressView(getContext(), wjbVar);
        this.r1 = radialProgressView22;
        int i522 = bkb.Ei;
        radialProgressView22.setProgressColorKey(i522);
        radialProgressView22.setSize(gl.L(32.0f));
        radialProgressView22.setVisibility(4);
        frameLayout222.addView(radialProgressView22, nme.e(48, 48, 17));
        TextView textView322 = new TextView(getContext());
        this.q1 = textView322;
        int L222 = gl.L(24.0f);
        int v052 = bkb.v0(i522, this.J0);
        int i622 = bkb.Gi;
        int v0222 = bkb.v0(i622, this.J0);
        ff0 i032 = bkb.i0(L222, L222, L222, L222, v052, v0222, v0222);
        vkb M52 = zkb.M(i522);
        vkb M222 = zkb.M(i622);
        textView322.setBackground(i032);
        zkb.j(textView322, i032, M52, M222, wjbVar);
        textView322.setEllipsize(truncateAt22);
        textView322.setGravity(17);
        textView322.setSingleLine(true);
        textView322.setText(k96.M0(z4 ? 2131745981 : 2131745977, null));
        zkb.X(textView322, bkb.Ii, wjbVar);
        textView322.setTextSize(1, 14.0f);
        textView322.setTypeface(gl.o());
        textView322.setOnClickListener(new View.OnClickListener() { // from class: cu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final fu5 fu5Var = fu5.this;
                TLRPC.Chat chat52 = fu5Var.p1;
                final byte b2 = 0;
                gl.d3(new Runnable() { // from class: du5
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b222 = b2;
                        fu5 fu5Var2 = fu5Var;
                        switch (b222) {
                            case 0:
                                if (!fu5Var2.J) {
                                    fu5Var2.q1.setVisibility(4);
                                    fu5Var2.r1.setVisibility(0);
                                    break;
                                }
                                break;
                            default:
                                fu5Var2.dismiss();
                                break;
                        }
                    }
                }, 400L);
                TLRPC.ChatInvite chatInvite82 = fu5Var.o1;
                boolean z7 = z4;
                if (chatInvite82 != null || chat52 == null) {
                    TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                    tL_messages_importChatInvite.hash = fu5Var.m1;
                    ConnectionsManager.getInstance(fu5Var.a).sendRequest(tL_messages_importChatInvite, new j67(fu5Var, j, z7, tL_messages_importChatInvite), 2);
                } else {
                    final byte b22 = 1;
                    na7.q1(fu5Var.a).j(chat52.id, y6c.h(fu5Var.a).f(), 0, null, null, true, new Runnable() { // from class: du5
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b222 = b22;
                            fu5 fu5Var2 = fu5Var;
                            switch (b222) {
                                case 0:
                                    if (!fu5Var2.J) {
                                        fu5Var2.q1.setVisibility(4);
                                        fu5Var2.r1.setVisibility(0);
                                        break;
                                    }
                                    break;
                                default:
                                    fu5Var2.dismiss();
                                    break;
                            }
                        }
                    }, new l41((byte) 8, fu5Var, z7), null);
                }
            }
        });
        frameLayout222.addView(textView322, nme.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView422 = new TextView(getContext());
        textView422.setGravity(17);
        textView422.setTextSize(1, 14.0f);
        textView422.setText(k96.M0(z4 ? 2131745979 : 2131745975, null));
        zkb.X(textView422, i422, wjbVar);
        linearLayout2.addView(textView422, nme.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static CharSequence D0(TextView textView, TLRPC.ChatInvite chatInvite, int i) {
        String str = chatInvite.participants.get(i).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), gl.L(120.0f), TextUtils.TruncateAt.END);
    }

    public static void E0(Context context, d dVar, u21 u21Var, boolean z) {
        if (context == null) {
            if (dVar != null) {
                dVar.getContext();
                return;
            }
            return;
        }
        if (u21Var == null) {
            u21Var = u21.b0(dVar);
        }
        j21 j21Var = new j21(context, dVar.getResourceProvider());
        j21Var.a.f(R.raw.timer_3, 28, 28, null);
        j21Var.b.setText(k96.M0(2131745968, null));
        j21Var.c.setText(z ? k96.M0(2131745978, null) : k96.M0(2131745974, null));
        u21Var.b(j21Var, 2750).j();
    }

    @Override // fx0
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.H0 != this.l1 || (v0 = bkb.v0(bkb.c6, this.J0)) == this.H0) {
                return;
            }
            L(v0);
            this.l1 = this.H0;
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
