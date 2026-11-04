package ii;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.y9;
import ei.u5;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.pr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements nw, org.telegram.ui.ActionBar.p1, oi.n, ResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o1(int i3, int i10, long j10, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.c = j10;
        this.e = obj2;
        this.b = i3;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        return false;
    }

    @Override // oi.n
    public void e(mi.h0 h0Var) {
        boolean z10;
        oi.j jVar = (oi.j) this.d;
        long j10 = this.c;
        oi.g gVar = (oi.g) this.e;
        int i3 = this.b;
        synchronized (oi.k.d) {
            try {
                Spannable spannable = (Spannable) jVar.a.get();
                if (spannable != null && jVar.b.get(Long.valueOf(j10)) == gVar) {
                    if (!(spannable instanceof oi.e) || ((oi.e) spannable).a) {
                        z10 = false;
                    } else {
                        oi.k.a(spannable, i3, (com.google.android.gms.internal.play_billing.s0) h0Var.b);
                        z10 = true;
                    }
                    org.telegram.messenger.g0.h3(new oi.a(jVar, j10, gVar, i3, z10, h0Var));
                }
            } finally {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.a;
        Object obj = this.e;
        int i11 = this.b;
        long j10 = this.c;
        Object obj2 = this.d;
        int i12 = 0;
        switch (i10) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = hp.s1(i11).o1(j10);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new g2(i11, i12), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                hs.f(i11).k(hs.W4, new Object[0]);
                li.b0(i11).i2(li.d2, j10);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j10 <= 0) {
                        long j11 = -j10;
                        TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(j11));
                        String obj3 = editText.getText().toString();
                        String str = M0.title;
                        if (str != null && str.equals(obj3)) {
                            s1Var.dismiss();
                            break;
                        } else {
                            M0.title = obj3;
                            hs.f(i11).k(2, 16);
                            hp.s1(i11).C(j11, obj3, null);
                            hs.e().k(hs.P4, 3, Long.valueOf(j10));
                        }
                    } else {
                        TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(j10));
                        String obj4 = editText.getText().toString();
                        String obj5 = editText2.getText().toString();
                        String str2 = a22.first_name;
                        String str3 = a22.last_name;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2.equals(obj4) && str3.equals(obj5)) {
                            s1Var.dismiss();
                            break;
                        } else {
                            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                            updateprofile.flags = 3;
                            updateprofile.first_name = obj4;
                            a22.first_name = obj4;
                            updateprofile.last_name = obj5;
                            a22.last_name = obj5;
                            TLRPC.User a23 = hp.s1(i11).a2(Long.valueOf(h10.i(i11).e()));
                            if (a23 != null) {
                                a23.first_name = updateprofile.first_name;
                                a23.last_name = updateprofile.last_name;
                            }
                            h10.i(i11).v(true);
                            hs.f(i11).k(46, new Object[0]);
                            hs.f(i11).k(2, 1);
                            ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new u5(18));
                            hs.e().k(hs.P4, 3, Long.valueOf(j10));
                        }
                    }
                    s1Var.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        yz0 yz0Var = (yz0) this.d;
        uo uoVar = (uo) this.e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.c) {
            return;
        }
        Drawable drawable = uoVar.b;
        if (drawable instanceof la0) {
            la0 la0Var = (la0) drawable;
            la0Var.s(yz0.e((Bitmap) pair.second), this.b >= 0 ? 100 : -100);
            la0Var.t(yz0Var.M);
        }
        yz0Var.invalidate();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        int i11;
        String str;
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r42;
        TLRPC.Chat chat2;
        uw uwVar2 = (uw) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((pr) arrayList.get(0)).a;
        Activity parentActivity = uwVar2.getParentActivity();
        final int i12 = this.b;
        final p1 p1Var = new p1(m91Var, uwVar2, j10, i12);
        if (parentActivity == null) {
            return true;
        }
        hp s12 = hp.s1(i12);
        final long j11 = this.c;
        s12.a2(Long.valueOf(j11));
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 >= 0) {
            TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(j10));
            str = l10.k(a22);
            i11 = i13;
            if (a22.bot_verification_icon == botVerifierSettings.icon) {
                t1.a(parentActivity, i12, j11, j10, botVerifierSettings, p1Var);
                return true;
            }
            p1Var = p1Var;
            r42 = 1;
            chat = null;
            user = a22;
            chat2 = a22;
        } else {
            i11 = i13;
            TLRPC.Chat M0 = hp.s1(i12).M0(Long.valueOf(-j10));
            str = M0 == null ? "" : M0.title;
            if (M0.bot_verification_icon == botVerifierSettings.icon) {
                t1.a(parentActivity, i12, j11, j10, botVerifierSettings, p1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = M0;
            r42 = 1;
            chat2 = M0;
        }
        final org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(parentActivity, r42, r42, null);
        LinearLayout e10 = k5.e(parentActivity, r42);
        TLRPC.User user2 = user;
        TLRPC.Chat chat3 = chat;
        e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e10.setClipChildren(false);
        e10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i14 = k6.Qi;
        ShapeDrawable e02 = k6.e0(L, L2, k6.x0(null, i14, false));
        n6 N = r6.N(i14);
        frameLayout.setBackground(e02);
        r6.k(frameLayout, e02, N, null, null);
        k9 k9Var = new k9(parentActivity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        u8 u8Var = new u8((e6) null);
        u8Var.l(chat2);
        k9Var.e(chat2, u8Var);
        frameLayout.addView(k9Var, mf.e(28, 28, 51));
        k9 k9Var2 = new k9(parentActivity);
        k9Var2.setEmojiColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.z9, false), PorterDuff.Mode.SRC_IN));
        k9Var2.setAnimatedEmojiDrawable(g5.m(i12, botVerifierSettings.icon, null, 3));
        frameLayout.addView(k9Var2, mf.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(parentActivity);
        r6.Y(k5Var, k6.j5, null);
        k5Var.setTextSize(13);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(str, false);
        k5Var.setWidthWrapContent(true);
        frameLayout.addView(k5Var, mf.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        e10.addView(frameLayout, mf.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i15 = k6.G6;
        r6.V(textView, i15, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (l10.t(user2)) {
            textView.setText(bd.M0(2131752928, null));
        } else if (user2 != null) {
            textView.setText(bd.M0(2131752921, null));
        } else if (org.telegram.messenger.t3.V(chat3)) {
            textView.setText(bd.M0(2131752927, null));
        } else {
            textView.setText(bd.M0(2131752923, null));
        }
        textView.setTypeface(org.telegram.messenger.g0.o());
        e10.addView(textView, mf.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        r6.V(textView2, i15, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        hs.i(textView2);
        textView2.setText(i6.m(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752922, str)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        e10.addView(textView2, mf.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i16 = hp.s1(i12).j6;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final gb0 gb0Var = new gb0(parentActivity, null);
        gb0Var.setForceForceUseCenter(true);
        gb0Var.setText(bd.M0(2131752926, null));
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(2.0f));
        r6.V(editTextBoldCursor, i15, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        r6.D(editTextBoldCursor, k6.ig, null);
        r6.m(editTextBoldCursor, 36, k6.jg, null);
        editTextBoldCursor.setGravity(bd.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new y9(gb0Var, editTextBoldCursor, 1));
        gb0Var.e(editTextBoldCursor);
        gb0Var.addView(editTextBoldCursor, mf.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        e10.addView(gb0Var, mf.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.j3());
        editTextBoldCursor.addTextChangedListener(new s1(editTextBoldCursor, i16, gb0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            gb0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            r6.V(textView3, k6.B6, null);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(bd.M0(i11 >= 0 ? 2131752925 : 2131752924, null));
            textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(27.0f));
            e10.addView(textView3, mf.c(-2.0f, -1));
        } else {
            e10.addView(new View(parentActivity), mf.c(12.0f, -1));
        }
        final gi.d dVar = new gi.d(parentActivity, null, true);
        dVar.i(textView.getText(), false, true);
        e10.addView(dVar, mf.o(-1, 48));
        h.O = e10;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: ii.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.d dVar2 = gi.d.this;
                if (dVar2.R) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z12 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z12 && editTextBoldCursor2.getText().length() > i16) {
                    gb0 gb0Var2 = gb0Var;
                    gb0Var2.a(1.0f);
                    org.telegram.messenger.g0.G3(-6.0f, gb0Var2, null);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i17 = i12;
                setcustomverification.bot = hp.s1(i17).o1(j11);
                setcustomverification.peer = hp.s1(i17).j1(j10);
                if (botVerifierSettings2.can_modify_custom_description) {
                    String obj = editTextBoldCursor2.getText().toString();
                    if (!TextUtils.isEmpty(obj)) {
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        setcustomverification.custom_description = tL_textWithEntities2;
                        tL_textWithEntities2.text = obj;
                    }
                } else {
                    setcustomverification.custom_description = botVerifierSettings2.custom_description;
                }
                ConnectionsManager.getInstance(i17).sendRequest(setcustomverification, new ai.r6(dVar2, h, p1Var, 8));
            }
        });
        h.Q0 = true;
        h.R0 = true;
        h.show();
        return true;
    }

    public /* synthetic */ o1(int i3, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.a = 1;
        this.b = i3;
        this.c = j10;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public /* synthetic */ o1(EditText editText, long j10, int i3, EditText editText2) {
        this.a = 3;
        this.d = editText;
        this.c = j10;
        this.b = i3;
        this.e = editText2;
    }

    public /* synthetic */ o1(uw uwVar, int i3, long j10, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = 0;
        this.d = uwVar;
        this.b = i3;
        this.c = j10;
        this.e = botVerifierSettings;
    }
}
