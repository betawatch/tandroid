package ki;

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
import c8.ja;
import di.o9;
import fi.m5;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements sw, org.telegram.ui.ActionBar.q1, ResultCallback, qi.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o1(int i7, int i10, long j3, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.c = j3;
        this.e = obj2;
        this.b = i7;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    @Override // qi.m
    public void a(ji.j jVar) {
        boolean z10;
        qi.i iVar = (qi.i) this.d;
        long j3 = this.c;
        qi.f fVar = (qi.f) this.e;
        int i7 = this.b;
        synchronized (qi.j.d) {
            try {
                Spannable spannable = (Spannable) iVar.a.get();
                if (spannable != null && iVar.b.get(Long.valueOf(j3)) == fVar) {
                    if (!(spannable instanceof qi.d) || ((qi.d) spannable).a) {
                        z10 = false;
                    } else {
                        qi.j.a(spannable, i7, (com.google.android.gms.internal.play_billing.s0) jVar.b);
                        z10 = true;
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.p(iVar, j3, fVar, i7, z10, jVar));
                }
            } finally {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.a;
        Object obj = this.e;
        int i11 = this.b;
        long j3 = this.c;
        Object obj2 = this.d;
        int i12 = 0;
        switch (i10) {
            case 1:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = np.s1(i11).o1(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new g2(i11, i12), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                ns.f(i11).k(ns.W4, new Object[0]);
                si.b0(i11).i2(si.d2, j3);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j3 <= 0) {
                        long j10 = -j3;
                        TLRPC.Chat M0 = np.s1(i11).M0(Long.valueOf(j10));
                        String obj3 = editText.getText().toString();
                        String str = M0.title;
                        if (str != null && str.equals(obj3)) {
                            t1Var.dismiss();
                            break;
                        } else {
                            M0.title = obj3;
                            ns.f(i11).k(2, 16);
                            np.s1(i11).C(j10, obj3, null);
                            ns.e().k(ns.P4, 3, Long.valueOf(j3));
                        }
                    } else {
                        TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(j3));
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
                            t1Var.dismiss();
                            break;
                        } else {
                            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                            updateprofile.flags = 3;
                            updateprofile.first_name = obj4;
                            a22.first_name = obj4;
                            updateprofile.last_name = obj5;
                            a22.last_name = obj5;
                            TLRPC.User a23 = np.s1(i11).a2(Long.valueOf(m10.i(i11).e()));
                            if (a23 != null) {
                                a23.first_name = updateprofile.first_name;
                                a23.last_name = updateprofile.last_name;
                            }
                            m10.i(i11).v(true);
                            ns.f(i11).k(46, new Object[0]);
                            ns.f(i11).k(2, 1);
                            ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new m5(18));
                            ns.e().k(ns.P4, 3, Long.valueOf(j3));
                        }
                    }
                    t1Var.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        b01 b01Var = (b01) this.d;
        dp dpVar = (dp) this.e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.c) {
            return;
        }
        Drawable drawable = dpVar.b;
        if (drawable instanceof ra0) {
            ra0 ra0Var = (ra0) drawable;
            ra0Var.s(this.b >= 0 ? 100 : -100, b01.e((Bitmap) pair.second));
            ra0Var.t(b01Var.M);
        }
        b01Var.invalidate();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        int i11;
        String str;
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r42;
        TLRPC.Chat chat2;
        yw ywVar2 = (yw) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((ur) arrayList.get(0)).a;
        Activity parentActivity = ywVar2.getParentActivity();
        final int i12 = this.b;
        final p1 p1Var = new p1(u91Var, ywVar2, j3, i12);
        if (parentActivity == null) {
            return true;
        }
        np s12 = np.s1(i12);
        final long j10 = this.c;
        s12.a2(Long.valueOf(j10));
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 >= 0) {
            TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(j3));
            str = q10.k(a22);
            i11 = i13;
            if (a22.bot_verification_icon == botVerifierSettings.icon) {
                t1.a(parentActivity, i12, j10, j3, botVerifierSettings, p1Var);
                return true;
            }
            p1Var = p1Var;
            r42 = 1;
            chat = null;
            user = a22;
            chat2 = a22;
        } else {
            i11 = i13;
            TLRPC.Chat M0 = np.s1(i12).M0(Long.valueOf(-j3));
            str = M0 == null ? "" : M0.title;
            if (M0.bot_verification_icon == botVerifierSettings.icon) {
                t1.a(parentActivity, i12, j10, j3, botVerifierSettings, p1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = M0;
            r42 = 1;
            chat2 = M0;
        }
        final org.telegram.ui.ActionBar.u2 i14 = i20.i(parentActivity, r42, r42, null);
        LinearLayout e10 = k5.e(parentActivity, r42);
        TLRPC.User user2 = user;
        TLRPC.Chat chat3 = chat;
        e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e10.setClipChildren(false);
        e10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i15 = j6.Ti;
        ShapeDrawable e02 = j6.e0(L, L2, j6.x0(null, i15, false));
        m6 M = q6.M(i15);
        frameLayout.setBackground(e02);
        q6.j(frameLayout, e02, M, null, null);
        i9 i9Var = new i9(parentActivity);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        t8 t8Var = new t8((e6) null);
        t8Var.l(chat2);
        i9Var.f(chat2, t8Var);
        frameLayout.addView(i9Var, ja.e(28, 28, 51));
        i9 i9Var2 = new i9(parentActivity);
        i9Var2.setEmojiColorFilter(new PorterDuffColorFilter(j6.x0(null, j6.z9, false), PorterDuff.Mode.SRC_IN));
        i9Var2.setAnimatedEmojiDrawable(g5.m(i12, botVerifierSettings.icon, null, 3));
        frameLayout.addView(i9Var2, ja.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        j5 j5Var = new j5(parentActivity);
        q6.X(j5Var, j6.j5, null);
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str, false);
        j5Var.setWidthWrapContent(true);
        frameLayout.addView(j5Var, ja.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        e10.addView(frameLayout, ja.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i16 = j6.G6;
        q6.U(textView, i16, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (q10.t(user2)) {
            textView.setText(hd.M0(2131752928, null));
        } else if (user2 != null) {
            textView.setText(hd.M0(2131752921, null));
        } else if (org.telegram.messenger.t3.V(chat3)) {
            textView.setText(hd.M0(2131752927, null));
        } else {
            textView.setText(hd.M0(2131752923, null));
        }
        textView.setTypeface(org.telegram.messenger.g0.o());
        e10.addView(textView, ja.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        q6.U(textView2, i16, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        ns.i(textView2);
        textView2.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752922, str)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        e10.addView(textView2, ja.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i17 = np.s1(i12).k6;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final mb0 mb0Var = new mb0(parentActivity, null);
        mb0Var.setForceForceUseCenter(true);
        mb0Var.setText(hd.M0(2131752926, null));
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(2.0f));
        q6.U(editTextBoldCursor, i16, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        q6.C(editTextBoldCursor, j6.lg, null);
        q6.l(editTextBoldCursor, 36, j6.mg, null);
        editTextBoldCursor.setGravity(hd.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new o9(mb0Var, editTextBoldCursor, 1));
        mb0Var.e(editTextBoldCursor);
        mb0Var.addView(editTextBoldCursor, ja.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        e10.addView(mb0Var, ja.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.j3());
        editTextBoldCursor.addTextChangedListener(new s1(editTextBoldCursor, i17, mb0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            mb0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            q6.U(textView3, j6.B6, null);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(hd.M0(i11 >= 0 ? 2131752925 : 2131752924, null));
            textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(27.0f));
            e10.addView(textView3, ja.c(-2.0f, -1));
        } else {
            e10.addView(new View(parentActivity), ja.c(12.0f, -1));
        }
        final hi.d dVar = new hi.d(parentActivity, null, true);
        dVar.i(textView.getText(), false, true);
        e10.addView(dVar, ja.o(-1, 48));
        i14.O = e10;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: ki.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.d dVar2 = hi.d.this;
                if (dVar2.R) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z12 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z12 && editTextBoldCursor2.getText().length() > i17) {
                    mb0 mb0Var2 = mb0Var;
                    mb0Var2.a(1.0f);
                    org.telegram.messenger.g0.F3(-6.0f, mb0Var2, null);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i18 = i12;
                setcustomverification.bot = np.s1(i18).o1(j10);
                setcustomverification.peer = np.s1(i18).j1(j3);
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
                ConnectionsManager.getInstance(i18).sendRequest(setcustomverification, new bi.j6(dVar2, i14, p1Var, 11));
            }
        });
        i14.Q0 = true;
        i14.R0 = true;
        i14.show();
        return true;
    }

    public /* synthetic */ o1(int i7, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.a = 1;
        this.b = i7;
        this.c = j3;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public /* synthetic */ o1(EditText editText, long j3, int i7, EditText editText2) {
        this.a = 2;
        this.d = editText;
        this.c = j3;
        this.b = i7;
        this.e = editText2;
    }

    public /* synthetic */ o1(yw ywVar, int i7, long j3, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = 0;
        this.d = ywVar;
        this.b = i7;
        this.c = j3;
        this.e = botVerifierSettings;
    }
}
