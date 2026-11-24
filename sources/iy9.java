// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class iy9 extends fy0 {
    public TLRPC.Chat S1;
    public final TLRPC.User T1;
    public final eg U1;
    public TLObject V1;
    public final FrameLayout W1;
    public final ay9 X1;
    public final cy9 Y1;
    public final hy9 Z1;
    public final hy9 a2;
    public final hy9 b2;
    public final u41 c2;
    public l5c d2;
    public Context e2;

    public iy9(Activity activity, TLRPC.Chat chat, TLRPC.User user, eg egVar, wjb wjbVar) {
        super(2, wjbVar, (Context) activity, true);
        this.E1 = gl.L(12.0f);
        this.Q0 = true;
        this.S1 = chat;
        this.T1 = user;
        this.V1 = user;
        this.U1 = egVar;
        y6c.h(this.a).f();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.W1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = gl.L(20.0f);
        int i = bkb.N5;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, this.J0));
        vkb M = zkb.M(i);
        frameLayout2.setBackground(b0);
        zkb.j(frameLayout2, b0, M, null, wjbVar);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i2 = bkb.O5;
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, nme.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ay9 ay9Var = new ay9(activity);
        this.X1 = ay9Var;
        zkb.X(ay9Var, bkb.Q5, wjbVar);
        zkb.D(ay9Var, i2, wjbVar);
        ay9Var.setTextSize(1, 15.0f);
        ay9Var.setSingleLine(true);
        ay9Var.setBackground(null);
        ay9Var.setCursorWidth(1.5f);
        ay9Var.setGravity(kk7.w1);
        ay9Var.setClipToPadding(true);
        ay9Var.setPadding(gl.L(46.0f), 0, gl.L(16.0f), 0);
        ay9Var.setTranslationY(-gl.L(0.66f));
        ay9Var.setInputType(ay9Var.getInputType() | TLObject.FLAG_19);
        ay9Var.setImeOptions(33554435);
        ay9Var.setTextIsSelectable(false);
        ay9Var.setOnEditorActionListener(new j(this, (byte) 23));
        ay9Var.addTextChangedListener(new by9(this));
        ay9Var.setHint(k96.M0(2131745565, null));
        frameLayout2.addView(ay9Var, nme.e(-1, -1, kk7.D1));
        frameLayout.addView(frameLayout2, nme.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.o1));
        float f = this.u0 / gl.p;
        viewGroup.addView(frameLayout, max, nme.d(-1, 64.0f, 55, f, 0.0f, f, 0.0f));
        cy9 cy9Var = new cy9(activity);
        this.Y1 = cy9Var;
        be0 be0Var = new be0(activity);
        be0Var.setImageDrawable(new oy8(R.raw.utyan_empty, gl.L(130.0f), gl.L(130.0f)));
        cy9Var.addView(be0Var, nme.e(kk7.N1, kk7.N1, 17));
        hy9 hy9Var = new hy9(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        byte b = 21;
        hy9Var.e.add(new zk9(this, b));
        this.Z1 = hy9Var;
        hy9 hy9Var2 = new hy9(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        hy9Var2.e.add(new zk9(this, b));
        this.a2 = hy9Var2;
        hy9 hy9Var3 = new hy9(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        hy9Var3.e.add(new zk9(this, b));
        this.b2 = hy9Var3;
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, gl.L(68.0f));
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new f09(this, (byte) 4));
        dy9 dy9Var = new dy9(this);
        dy9Var.m = false;
        dy9Var.C = false;
        dy9Var.o(s33.h);
        dy9Var.n(350L);
        this.n1.setItemAnimator(dy9Var);
        this.n1.addOnLayoutChangeListener(new ey9(this));
        this.n1.j(new fy9(this));
        this.b.addView(new gy9(this, getContext()), nme.e(-1, 68, 87));
        u41 u41Var = new u41(wjbVar, getContext(), true);
        u41Var.setRoundRadius(24);
        this.c2 = u41Var;
        u41Var.setColor(bkb.v0(bkb.q7, this.J0));
        Z0(false);
        ViewGroup viewGroup2 = this.b;
        float f2 = (this.u0 / gl.p) + 10.0f;
        viewGroup2.addView(u41Var, nme.d(-1, 48.0f, 87, f2, 10.0f, f2, 10.0f));
        u41Var.setOnClickListener(new ik8(this, (byte) 20));
        l5c l5cVar = this.d2;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
        hy9Var.b();
        hy9Var2.b();
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, false, new tf8(this, (byte) 16), this.J0);
        this.d2 = l5cVar;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return k96.M0(2131754207, null);
    }

    public final void Y0(TLRPC.User user, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.e2 = getContext();
        }
        if (this.e2 != null) {
            if (tL_inputCheckPasswordSRP != null && !hc2.T(this.S1)) {
                d S = LaunchActivity.S();
                if (S == null) {
                    return;
                }
                na7.q1(this.a).P(this.e2, this.S1.id, S, new lt((Object) this, (Object) user, (Object) tL_inputCheckPasswordSRP, (Object) twoStepVerificationActivity, (byte) 19), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (hc2.T(this.S1)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.S1;
                tL_inputChannel.channel_id = chat.id;
                tL_inputChannel.access_hash = chat.access_hash;
            } else {
                tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
            }
            tL_channels_editCreator.password = tL_inputCheckPasswordSRP != null ? tL_inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
            tL_channels_editCreator.user_id = na7.q1(this.a).o1(user);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_editCreator, new fn0((Object) this, (Object) tL_inputCheckPasswordSRP, (Object) user, (Object) twoStepVerificationActivity, (Object) tL_channels_editCreator, (byte) 15));
        }
    }

    public final void Z0(boolean z) {
        int i = hc2.V(this.S1) ? 2131748811 : 2131748802;
        float L = gl.L(32.0f);
        u41 u41Var = this.c2;
        float max = Math.max(L, ((u41Var.getWidth() > 0 ? u41Var.getWidth() : gl.q.x - gl.L(20.0f)) - gl.L(16.0f)) - u41Var.getTextPaint().measureText(k96.M0(i, null)));
        TLObject tLObject = this.V1;
        u41Var.i(k96.a0(null, null, i, TextUtils.ellipsize(tLObject instanceof TLRPC.User ? l7c.l((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "", u41Var.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z, true);
    }

    public final void a1() {
        float f = -gl.L(64.0f);
        int i = 0;
        while (true) {
            o39 o39Var = this.n1;
            if (i >= o39Var.getChildCount()) {
                break;
            }
            View childAt = o39Var.getChildAt(i);
            if (childAt.getId() == 3) {
                f = childAt.getY();
                break;
            }
            i++;
        }
        this.W1.setTranslationY(f);
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        this.Z1.a();
        this.a2.a();
        this.b2.a();
    }

    @Override // fx0
    public final void p0() {
        try {
            super.p0();
            u41 u41Var = this.c2;
            if (u41Var != null) {
                u41Var.setColor(bkb.v0(bkb.q7, this.J0));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
