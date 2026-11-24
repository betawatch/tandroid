// default package

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hh2 extends d {
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int a0 = -7;
    public static final int b0 = -8;
    public static final int c0 = -9;
    public static final int d0 = -10;
    public static final int e0 = -11;
    public static final int f0 = -12;
    public static final int g0 = -13;
    public static final int h0 = -14;
    public static final int i0 = -15;
    public static final int j0 = -16;
    public static final int k0 = -17;
    public static final int l0 = -18;
    public static final int m0 = -19;
    public static final int n0 = -20;
    public static final int o0 = -21;
    public String E;
    public int F;
    public final ah2 G;
    public TL_account.connectedBots H;
    public TL_account.TL_connectedBot I;
    public boolean J;
    public TL_account.TL_businessBotRights K;
    public boolean L;
    public boolean M;
    public TLRPC.User N;
    public final LongSparseArray O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public uja a;
    public gh2 b;
    public q7c c;
    public bu9 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public a6 n;
    public TextView r;
    public ImageView s;
    public t51 w;
    public boolean x;
    public boolean y;

    public hh2() {
        super(null);
        this.F = 0;
        this.G = new ah2(this, (byte) 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public final void Z(int i, boolean z, final Runnable runnable) {
        final byte b = 1;
        final byte b2 = 0;
        if (!this.L && i == h0 && z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = jb6.M0(2131752740, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = gm.S2(jb6.a0(null, null, 2131752741, m9c.p(this.N)));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.j(jb6.M0(2131754249, null), new ee(this) { // from class: eh2
                public final /* synthetic */ hh2 b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i2) {
                    byte b3 = b2;
                    Runnable runnable2 = runnable;
                    hh2 hh2Var = this.b;
                    switch (b3) {
                        case 0:
                            hh2Var.L = true;
                            runnable2.run();
                            break;
                        default:
                            hh2Var.M = true;
                            runnable2.run();
                            break;
                    }
                }
            });
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
            return;
        }
        if (this.M || !z || (i != k0 && i != l0 && i != m0 && i != n0)) {
            runnable.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M02 = jb6.M0(2131752740, null);
        he heVar2 = alertDialog$Builder2.a;
        heVar2.S = M02;
        heVar2.U = gm.S2(jb6.a0(null, null, 2131752754, m9c.p(this.N)));
        alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder2.j(jb6.M0(2131754249, null), new ee(this) { // from class: eh2
            public final /* synthetic */ hh2 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar22, int i2) {
                byte b3 = b;
                Runnable runnable2 = runnable;
                hh2 hh2Var = this.b;
                switch (b3) {
                    case 0:
                        hh2Var.L = true;
                        runnable2.run();
                        break;
                    default:
                        hh2Var.M = true;
                        runnable2.run();
                        break;
                }
            }
        });
        alertDialog$Builder2.c(-1);
        alertDialog$Builder2.o();
    }

    public final void a0(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.a(b0(), z);
    }

    public final boolean b0() {
        t51 t51Var;
        if (this.U) {
            TLRPC.User user = this.N;
            boolean z = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.I;
            if (z == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) != (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) || (user != null && (!this.K.equals(tL_connectedBot.rights) || ((t51Var = this.w) != null && t51Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ void c0(TLObject tLObject) {
        oc7.r1(this.currentAccount).T3((TLRPC.Updates) tLObject, false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131752736, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 0));
        this.a = this.simpleActionBar.s(jb6.M0(2131745680, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        anb.D(this.f, cmb.G6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i = cmb.F6;
        anb.X(editTextBoldCursor2, i, null);
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        byte b = 5;
        byte b2 = 3;
        this.f.setGravity((jb6.a0 ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(jb6.M0(2131752769, null));
        anb.v(this.f, i, null);
        this.f.setCursorSize(gm.L(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new j(this, (byte) 9));
        this.f.addTextChangedListener(new b7(this, (byte) 14));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, qoe.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i2 = cmb.c6;
        anb.h(i2, getResourceProvider(), frameLayout3);
        View view = new View(context);
        this.h = view;
        anb.h(cmb.c7, getResourceProvider(), view);
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f = 1.0f / gm.p;
        boolean z = jb6.a0;
        frameLayout4.addView(view2, qoe.d(-1, f, 87, z ? 0 : 21, 0.0f, z ? 21 : 0, 0.0f));
        a6 a6Var = new a6(context, (byte) 6);
        this.n = a6Var;
        anb.h(i2, getResourceProvider(), a6Var);
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(jb6.M0(2131752764, null));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i3 = cmb.y6;
        anb.X(textView2, i3, getResourceProvider());
        this.n.addView(this.r, qoe.e(-2, -2, 17));
        this.s = new ImageView(context);
        gh2 gh2Var = new gh2(getThemedColor(i3));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(gh2Var);
        this.b = gh2Var;
        this.n.addView(this.s, qoe.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(gm.L(8.0f));
        bu9 bu9Var = new bu9(true);
        this.d = bu9Var;
        bu9Var.a = new k6d(this, (byte) 21);
        t51 t51Var = new t51(this, new ah2(this, b2));
        this.w = t51Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        t51Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        q7c q7cVar = new q7c(this, new h92(this, b), new dh2(this, b2), null);
        this.c = q7cVar;
        q7cVar.r1();
        this.c.setSectionsDrawBackground(true);
        q7c q7cVar2 = this.c;
        q7cVar2.g3.r = false;
        frameLayout.addView(q7cVar2, qoe.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        d S;
        if (tL_error != null) {
            this.a.b(false);
            c41.e0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            this.a.b(false);
            mlb.y(null, 2131743566, c41.b0(this), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.d.c(new ra2(this, tLObject, (byte) 20));
        }
        int i = iArr[0] + 1;
        iArr[0] = i;
        if (i == arrayList.size()) {
            x41.a(this.currentAccount).b();
            oc7 messagesController = getMessagesController();
            messagesController.i1.clear();
            messagesController.p1.clear();
            finishFragment();
            if (!z || user == null) {
                if (user == null || (S = LaunchActivity.S()) == null) {
                    return;
                }
                c41.b0(S).Q(R.raw.contact_check, 36, jb6.a0(null, null, 2131752737, m9c.r(user))).j();
                return;
            }
            d S2 = LaunchActivity.S();
            if (S2 != null) {
                c41.b0(S2).Q(R.raw.contact_check, 36, jb6.a0(null, null, 2131752770, m9c.r(user))).j();
            }
        }
    }

    public final void e0(c6c c6cVar, final View view) {
        if (!c6cVar.g || this.w.h(c6cVar)) {
            return;
        }
        int i = c6cVar.d;
        final byte b = 1;
        if (i == -1) {
            t51 t51Var = this.w;
            this.J = true;
            t51Var.h = true;
            this.c.g3.O(true);
            a0(true);
            return;
        }
        final byte b2 = 0;
        if (i == V) {
            t51 t51Var2 = this.w;
            this.J = false;
            t51Var2.h = false;
            this.c.g3.O(true);
            a0(true);
            return;
        }
        if (i == W) {
            this.N = null;
            this.c.g3.O(true);
            a0(true);
            return;
        }
        if (c6cVar.a == 13) {
            TLRPC.User user = (TLRPC.User) this.O.get(c6cVar.y);
            if (user != null) {
                if (user.bot_business) {
                    this.N = user;
                    gm.t1(this.f);
                    this.c.g3.O(true);
                    a0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                String M0 = jb6.M0(2131752762, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = gm.S2(jb6.M0(2131752763, null));
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                showDialog(heVar);
                return;
            }
            return;
        }
        if (i == X) {
            boolean z = !this.Q;
            this.Q = z;
            ((ajb) view).setChecked(z);
            this.c.g3.O(true);
            return;
        }
        if (i == Y) {
            int i2 = -this.P;
            this.P = i2;
            gm.A3(i2, view, null);
            return;
        }
        if (i == Z) {
            TL_account.TL_businessBotRights tL_businessBotRights = this.K;
            boolean z2 = !tL_businessBotRights.reply;
            tL_businessBotRights.reply = z2;
            ((oh2) view).c(z2, true);
            this.c.g3.O(true);
            a0(true);
            return;
        }
        if (i == a0) {
            TL_account.TL_businessBotRights tL_businessBotRights2 = this.K;
            boolean z3 = !tL_businessBotRights2.read_messages;
            tL_businessBotRights2.read_messages = z3;
            ((oh2) view).c(z3, true);
            this.c.g3.O(true);
            a0(true);
            return;
        }
        if (i == b0) {
            TL_account.TL_businessBotRights tL_businessBotRights3 = this.K;
            boolean z4 = !tL_businessBotRights3.delete_sent_messages;
            tL_businessBotRights3.delete_sent_messages = z4;
            ((oh2) view).c(z4, true);
            this.c.g3.O(true);
            a0(true);
            return;
        }
        if (i == c0) {
            TL_account.TL_businessBotRights tL_businessBotRights4 = this.K;
            boolean z5 = !tL_businessBotRights4.delete_received_messages;
            tL_businessBotRights4.delete_received_messages = z5;
            ((oh2) view).c(z5, true);
            this.c.g3.O(true);
            a0(true);
            return;
        }
        if (i == d0) {
            boolean z6 = !this.R;
            this.R = z6;
            ((ajb) view).setChecked(z6);
            this.c.g3.O(true);
            return;
        }
        if (i == e0) {
            TL_account.TL_businessBotRights tL_businessBotRights5 = this.K;
            boolean z7 = !tL_businessBotRights5.edit_name;
            tL_businessBotRights5.edit_name = z7;
            ((oh2) view).c(z7, true);
            this.c.g3.O(true);
            a0(true);
            return;
        }
        if (i == f0) {
            TL_account.TL_businessBotRights tL_businessBotRights6 = this.K;
            boolean z8 = !tL_businessBotRights6.edit_bio;
            tL_businessBotRights6.edit_bio = z8;
            ((oh2) view).c(z8, true);
            this.c.g3.O(true);
            a0(true);
            return;
        }
        if (i == g0) {
            TL_account.TL_businessBotRights tL_businessBotRights7 = this.K;
            boolean z9 = !tL_businessBotRights7.edit_profile_photo;
            tL_businessBotRights7.edit_profile_photo = z9;
            ((oh2) view).c(z9, true);
            this.c.g3.O(true);
            a0(true);
            return;
        }
        if (i == h0) {
            final byte b3 = 5;
            Z(i, !this.K.edit_username, new Runnable(this) { // from class: zg2
                public final /* synthetic */ hh2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b4 = b3;
                    View view2 = view;
                    hh2 hh2Var = this.b;
                    hh2Var.getClass();
                    switch (b4) {
                        case 0:
                            TL_account.TL_businessBotRights tL_businessBotRights8 = hh2Var.K;
                            boolean z10 = !tL_businessBotRights8.view_gifts;
                            tL_businessBotRights8.view_gifts = z10;
                            ((oh2) view2).c(z10, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 1:
                            TL_account.TL_businessBotRights tL_businessBotRights9 = hh2Var.K;
                            boolean z11 = !tL_businessBotRights9.sell_gifts;
                            tL_businessBotRights9.sell_gifts = z11;
                            ((oh2) view2).c(z11, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 2:
                            TL_account.TL_businessBotRights tL_businessBotRights10 = hh2Var.K;
                            boolean z12 = !tL_businessBotRights10.change_gift_settings;
                            tL_businessBotRights10.change_gift_settings = z12;
                            ((oh2) view2).c(z12, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 3:
                            TL_account.TL_businessBotRights tL_businessBotRights11 = hh2Var.K;
                            boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                            tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                            ((oh2) view2).c(z13, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 4:
                            TL_account.TL_businessBotRights tL_businessBotRights12 = hh2Var.K;
                            boolean z14 = !tL_businessBotRights12.transfer_stars;
                            tL_businessBotRights12.transfer_stars = z14;
                            ((oh2) view2).c(z14, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        default:
                            TL_account.TL_businessBotRights tL_businessBotRights13 = hh2Var.K;
                            boolean z15 = !tL_businessBotRights13.edit_username;
                            tL_businessBotRights13.edit_username = z15;
                            ((oh2) view2).c(z15, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i == i0) {
            boolean z10 = !this.S;
            this.S = z10;
            ((ajb) view).setChecked(z10);
            this.c.g3.O(true);
            return;
        }
        if (i == j0) {
            Z(i, !this.K.view_gifts, new Runnable(this) { // from class: zg2
                public final /* synthetic */ hh2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b4 = b2;
                    View view2 = view;
                    hh2 hh2Var = this.b;
                    hh2Var.getClass();
                    switch (b4) {
                        case 0:
                            TL_account.TL_businessBotRights tL_businessBotRights8 = hh2Var.K;
                            boolean z102 = !tL_businessBotRights8.view_gifts;
                            tL_businessBotRights8.view_gifts = z102;
                            ((oh2) view2).c(z102, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 1:
                            TL_account.TL_businessBotRights tL_businessBotRights9 = hh2Var.K;
                            boolean z11 = !tL_businessBotRights9.sell_gifts;
                            tL_businessBotRights9.sell_gifts = z11;
                            ((oh2) view2).c(z11, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 2:
                            TL_account.TL_businessBotRights tL_businessBotRights10 = hh2Var.K;
                            boolean z12 = !tL_businessBotRights10.change_gift_settings;
                            tL_businessBotRights10.change_gift_settings = z12;
                            ((oh2) view2).c(z12, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 3:
                            TL_account.TL_businessBotRights tL_businessBotRights11 = hh2Var.K;
                            boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                            tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                            ((oh2) view2).c(z13, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 4:
                            TL_account.TL_businessBotRights tL_businessBotRights12 = hh2Var.K;
                            boolean z14 = !tL_businessBotRights12.transfer_stars;
                            tL_businessBotRights12.transfer_stars = z14;
                            ((oh2) view2).c(z14, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        default:
                            TL_account.TL_businessBotRights tL_businessBotRights13 = hh2Var.K;
                            boolean z15 = !tL_businessBotRights13.edit_username;
                            tL_businessBotRights13.edit_username = z15;
                            ((oh2) view2).c(z15, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i == k0) {
            Z(i, !this.K.sell_gifts, new Runnable(this) { // from class: zg2
                public final /* synthetic */ hh2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b4 = b;
                    View view2 = view;
                    hh2 hh2Var = this.b;
                    hh2Var.getClass();
                    switch (b4) {
                        case 0:
                            TL_account.TL_businessBotRights tL_businessBotRights8 = hh2Var.K;
                            boolean z102 = !tL_businessBotRights8.view_gifts;
                            tL_businessBotRights8.view_gifts = z102;
                            ((oh2) view2).c(z102, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 1:
                            TL_account.TL_businessBotRights tL_businessBotRights9 = hh2Var.K;
                            boolean z11 = !tL_businessBotRights9.sell_gifts;
                            tL_businessBotRights9.sell_gifts = z11;
                            ((oh2) view2).c(z11, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 2:
                            TL_account.TL_businessBotRights tL_businessBotRights10 = hh2Var.K;
                            boolean z12 = !tL_businessBotRights10.change_gift_settings;
                            tL_businessBotRights10.change_gift_settings = z12;
                            ((oh2) view2).c(z12, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 3:
                            TL_account.TL_businessBotRights tL_businessBotRights11 = hh2Var.K;
                            boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                            tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                            ((oh2) view2).c(z13, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 4:
                            TL_account.TL_businessBotRights tL_businessBotRights12 = hh2Var.K;
                            boolean z14 = !tL_businessBotRights12.transfer_stars;
                            tL_businessBotRights12.transfer_stars = z14;
                            ((oh2) view2).c(z14, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        default:
                            TL_account.TL_businessBotRights tL_businessBotRights13 = hh2Var.K;
                            boolean z15 = !tL_businessBotRights13.edit_username;
                            tL_businessBotRights13.edit_username = z15;
                            ((oh2) view2).c(z15, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i == l0) {
            final byte b4 = 2;
            Z(i, !this.K.change_gift_settings, new Runnable(this) { // from class: zg2
                public final /* synthetic */ hh2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b42 = b4;
                    View view2 = view;
                    hh2 hh2Var = this.b;
                    hh2Var.getClass();
                    switch (b42) {
                        case 0:
                            TL_account.TL_businessBotRights tL_businessBotRights8 = hh2Var.K;
                            boolean z102 = !tL_businessBotRights8.view_gifts;
                            tL_businessBotRights8.view_gifts = z102;
                            ((oh2) view2).c(z102, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 1:
                            TL_account.TL_businessBotRights tL_businessBotRights9 = hh2Var.K;
                            boolean z11 = !tL_businessBotRights9.sell_gifts;
                            tL_businessBotRights9.sell_gifts = z11;
                            ((oh2) view2).c(z11, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 2:
                            TL_account.TL_businessBotRights tL_businessBotRights10 = hh2Var.K;
                            boolean z12 = !tL_businessBotRights10.change_gift_settings;
                            tL_businessBotRights10.change_gift_settings = z12;
                            ((oh2) view2).c(z12, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 3:
                            TL_account.TL_businessBotRights tL_businessBotRights11 = hh2Var.K;
                            boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                            tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                            ((oh2) view2).c(z13, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 4:
                            TL_account.TL_businessBotRights tL_businessBotRights12 = hh2Var.K;
                            boolean z14 = !tL_businessBotRights12.transfer_stars;
                            tL_businessBotRights12.transfer_stars = z14;
                            ((oh2) view2).c(z14, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        default:
                            TL_account.TL_businessBotRights tL_businessBotRights13 = hh2Var.K;
                            boolean z15 = !tL_businessBotRights13.edit_username;
                            tL_businessBotRights13.edit_username = z15;
                            ((oh2) view2).c(z15, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i == m0) {
            final byte b5 = 3;
            Z(i, !this.K.transfer_and_upgrade_gifts, new Runnable(this) { // from class: zg2
                public final /* synthetic */ hh2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b42 = b5;
                    View view2 = view;
                    hh2 hh2Var = this.b;
                    hh2Var.getClass();
                    switch (b42) {
                        case 0:
                            TL_account.TL_businessBotRights tL_businessBotRights8 = hh2Var.K;
                            boolean z102 = !tL_businessBotRights8.view_gifts;
                            tL_businessBotRights8.view_gifts = z102;
                            ((oh2) view2).c(z102, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 1:
                            TL_account.TL_businessBotRights tL_businessBotRights9 = hh2Var.K;
                            boolean z11 = !tL_businessBotRights9.sell_gifts;
                            tL_businessBotRights9.sell_gifts = z11;
                            ((oh2) view2).c(z11, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 2:
                            TL_account.TL_businessBotRights tL_businessBotRights10 = hh2Var.K;
                            boolean z12 = !tL_businessBotRights10.change_gift_settings;
                            tL_businessBotRights10.change_gift_settings = z12;
                            ((oh2) view2).c(z12, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 3:
                            TL_account.TL_businessBotRights tL_businessBotRights11 = hh2Var.K;
                            boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                            tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                            ((oh2) view2).c(z13, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 4:
                            TL_account.TL_businessBotRights tL_businessBotRights12 = hh2Var.K;
                            boolean z14 = !tL_businessBotRights12.transfer_stars;
                            tL_businessBotRights12.transfer_stars = z14;
                            ((oh2) view2).c(z14, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        default:
                            TL_account.TL_businessBotRights tL_businessBotRights13 = hh2Var.K;
                            boolean z15 = !tL_businessBotRights13.edit_username;
                            tL_businessBotRights13.edit_username = z15;
                            ((oh2) view2).c(z15, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                    }
                }
            });
        } else if (i == n0) {
            final byte b6 = 4;
            Z(i, !this.K.transfer_stars, new Runnable(this) { // from class: zg2
                public final /* synthetic */ hh2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b42 = b6;
                    View view2 = view;
                    hh2 hh2Var = this.b;
                    hh2Var.getClass();
                    switch (b42) {
                        case 0:
                            TL_account.TL_businessBotRights tL_businessBotRights8 = hh2Var.K;
                            boolean z102 = !tL_businessBotRights8.view_gifts;
                            tL_businessBotRights8.view_gifts = z102;
                            ((oh2) view2).c(z102, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 1:
                            TL_account.TL_businessBotRights tL_businessBotRights9 = hh2Var.K;
                            boolean z11 = !tL_businessBotRights9.sell_gifts;
                            tL_businessBotRights9.sell_gifts = z11;
                            ((oh2) view2).c(z11, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 2:
                            TL_account.TL_businessBotRights tL_businessBotRights10 = hh2Var.K;
                            boolean z12 = !tL_businessBotRights10.change_gift_settings;
                            tL_businessBotRights10.change_gift_settings = z12;
                            ((oh2) view2).c(z12, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 3:
                            TL_account.TL_businessBotRights tL_businessBotRights11 = hh2Var.K;
                            boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                            tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                            ((oh2) view2).c(z13, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        case 4:
                            TL_account.TL_businessBotRights tL_businessBotRights12 = hh2Var.K;
                            boolean z14 = !tL_businessBotRights12.transfer_stars;
                            tL_businessBotRights12.transfer_stars = z14;
                            ((oh2) view2).c(z14, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                        default:
                            TL_account.TL_businessBotRights tL_businessBotRights13 = hh2Var.K;
                            boolean z15 = !tL_businessBotRights13.edit_username;
                            tL_businessBotRights13.edit_username = z15;
                            ((oh2) view2).c(z15, true);
                            hh2Var.c.g3.O(true);
                            hh2Var.a0(true);
                            break;
                    }
                }
            });
        } else if (i == o0) {
            Z(i, !this.K.manage_stories, new ah2(this, b2));
        }
    }

    public final void f0() {
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.a.y.f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        if (this.w.k(this.c)) {
            TLRPC.User user2 = this.N;
            boolean z = user2 != null && ((tL_connectedBot = this.I) == null || tL_connectedBot.bot_id != user2.id);
            ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot2 = this.I;
            if (tL_connectedBot2 != null && ((user = this.N) == null || tL_connectedBot2.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().n1(this.I.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.N != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.K;
                updateconnectedbot2.bot = getMessagesController().p1(this.N);
                updateconnectedbot2.recipients = this.w.b();
                arrayList.add(updateconnectedbot2);
                TL_account.TL_connectedBot tL_connectedBot3 = this.I;
                if (tL_connectedBot3 != null) {
                    tL_connectedBot3.bot_id = this.N.id;
                    tL_connectedBot3.recipients = this.w.c();
                    this.I.rights = this.K;
                }
            }
            if (arrayList.isEmpty()) {
                finishFragment();
                return;
            }
            int[] iArr = {0};
            for (int i = 0; i < arrayList.size(); i++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i), new bh2(this, iArr, arrayList, z, user2));
            }
        }
    }

    public final void g0() {
        boolean z = this.x;
        boolean e = this.d.e();
        boolean z2 = true;
        LongSparseArray longSparseArray = this.O;
        if (z != (e || this.y || longSparseArray.size() > 0)) {
            if (!this.d.e() && !this.y && longSparseArray.size() <= 0) {
                z2 = false;
            }
            this.x = z2;
            ViewPropertyAnimator duration = this.r.animate().alpha(z2 ? 0.0f : 1.0f).translationY(z2 ? -gm.L(8.0f) : 0.0f).setDuration(320L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).start();
            this.s.animate().alpha(z2 ? 1.0f : 0.0f).translationY(z2 ? 0.0f : gm.L(8.0f)).setDuration(320L).setInterpolator(d53Var).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        byte b = 0;
        if (b0()) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131743522, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131752739, null);
                alertDialog$Builder.j(jb6.M0(2131754181, null), new dh2(this, b));
                alertDialog$Builder.g(jb6.M0(2131747313, null), new dh2(this, (byte) 1));
                showDialog(heVar);
                return false;
            }
        } else {
            if (this.N != null || b0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z);
            }
            if (z) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = jb6.M0(2131752765, null);
                he heVar2 = alertDialog$Builder2.a;
                heVar2.S = M02;
                heVar2.U = jb6.M0(2131752766, null);
                alertDialog$Builder2.j(jb6.M0(2131752767, null), new dh2(this, (byte) 2));
                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                showDialog(heVar2);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            x41.a(this.currentAccount).c(new mf2(this, (byte) 24));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            gh2 gh2Var = this.b;
            if (gh2Var != null) {
                gh2Var.b(getThemedColor(cmb.y6));
                ImageView imageView = this.s;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
