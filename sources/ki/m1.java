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
import c8.ma;
import fi.k5;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.sr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.cx;
import org.telegram.ui.ww;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements ww, org.telegram.ui.ActionBar.r1, ResultCallback, qi.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m1(int i7, int i10, long j3, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.c = j3;
        this.e = obj2;
        this.b = i7;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
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
                    org.telegram.messenger.g0.g3(new org.telegram.messenger.voip.p(iVar, j3, fVar, i7, z10, jVar));
                }
            } finally {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
                tL_messages_toggleBotInAttachMenu.bot = mp.u1(i11).q1(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new c2(i11, i12), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                ks.f(i11).k(ks.Z4, new Object[0]);
                ri.d0(i11).n2(ri.f2, j3);
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
                        TLRPC.Chat O0 = mp.u1(i11).O0(Long.valueOf(j10));
                        String obj3 = editText.getText().toString();
                        String str = O0.title;
                        if (str != null && str.equals(obj3)) {
                            u1Var.dismiss();
                            break;
                        } else {
                            O0.title = obj3;
                            ks.f(i11).k(2, 16);
                            mp.u1(i11).C(j10, obj3, null);
                            ks.e().k(ks.S4, 3, Long.valueOf(j3));
                        }
                    } else {
                        TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(j3));
                        String obj4 = editText.getText().toString();
                        String obj5 = editText2.getText().toString();
                        String str2 = c22.first_name;
                        String str3 = c22.last_name;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2.equals(obj4) && str3.equals(obj5)) {
                            u1Var.dismiss();
                            break;
                        } else {
                            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                            updateprofile.flags = 3;
                            updateprofile.first_name = obj4;
                            c22.first_name = obj4;
                            updateprofile.last_name = obj5;
                            c22.last_name = obj5;
                            TLRPC.User c23 = mp.u1(i11).c2(Long.valueOf(j10.i(i11).e()));
                            if (c23 != null) {
                                c23.first_name = updateprofile.first_name;
                                c23.last_name = updateprofile.last_name;
                            }
                            j10.i(i11).v(true);
                            ks.f(i11).k(46, new Object[0]);
                            ks.f(i11).k(2, 1);
                            ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new k5(18));
                            ks.e().k(ks.S4, 3, Long.valueOf(j3));
                        }
                    }
                    u1Var.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        j01 j01Var = (j01) this.d;
        kp kpVar = (kp) this.e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.c) {
            return;
        }
        Drawable drawable = kpVar.b;
        if (drawable instanceof bb0) {
            bb0 bb0Var = (bb0) drawable;
            bb0Var.s(this.b >= 0 ? 100 : -100, j01.e((Bitmap) pair.second));
            bb0Var.t(j01Var.M);
        }
        j01Var.invalidate();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11;
        String str;
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r42;
        TLRPC.Chat chat2;
        cx cxVar2 = (cx) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((sr) arrayList.get(0)).a;
        Activity parentActivity = cxVar2.getParentActivity();
        final int i12 = this.b;
        final bi.r3 r3Var = new bi.r3(y91Var, cxVar2, j3, i12);
        if (parentActivity == null) {
            return true;
        }
        mp u12 = mp.u1(i12);
        final long j10 = this.c;
        u12.c2(Long.valueOf(j10));
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 >= 0) {
            TLRPC.User c22 = mp.u1(i12).c2(Long.valueOf(j3));
            str = o10.l(c22);
            i11 = i13;
            if (c22.bot_verification_icon == botVerifierSettings.icon) {
                p1.a(parentActivity, i12, j10, j3, botVerifierSettings, r3Var);
                return true;
            }
            r3Var = r3Var;
            r42 = 1;
            chat = null;
            user = c22;
            chat2 = c22;
        } else {
            i11 = i13;
            TLRPC.Chat O0 = mp.u1(i12).O0(Long.valueOf(-j3));
            str = O0 == null ? "" : O0.title;
            if (O0.bot_verification_icon == botVerifierSettings.icon) {
                p1.a(parentActivity, i12, j10, j3, botVerifierSettings, r3Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = O0;
            r42 = 1;
            chat2 = O0;
        }
        final org.telegram.ui.ActionBar.x2 j11 = n10.j(parentActivity, r42, r42, null);
        LinearLayout f10 = org.telegram.messenger.f3.f(parentActivity, r42);
        TLRPC.User user2 = user;
        TLRPC.Chat chat3 = chat;
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i14 = n6.Ti;
        ShapeDrawable e02 = n6.e0(L, L2, n6.x0(null, i14, false));
        q6 M = u6.M(i14);
        frameLayout.setBackground(e02);
        u6.j(frameLayout, e02, M, null, null);
        q9 q9Var = new q9(parentActivity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        b9 b9Var = new b9((i6) null);
        b9Var.l(chat2);
        q9Var.f(chat2, b9Var);
        frameLayout.addView(q9Var, ma.e(28, 28, 51));
        q9 q9Var2 = new q9(parentActivity);
        q9Var2.setEmojiColorFilter(new PorterDuffColorFilter(n6.x0(null, n6.z9, false), PorterDuff.Mode.SRC_IN));
        q9Var2.setAnimatedEmojiDrawable(o5.m(i12, botVerifierSettings.icon, null, 3));
        frameLayout.addView(q9Var2, ma.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        n5 n5Var = new n5(parentActivity);
        u6.X(n5Var, n6.j5, null);
        n5Var.setTextSize(13);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(str, false);
        n5Var.setWidthWrapContent(true);
        frameLayout.addView(n5Var, ma.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        f10.addView(frameLayout, ma.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i15 = n6.G6;
        u6.U(textView, i15, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (o10.u(user2)) {
            textView.setText(gd.M0(2131752917, null));
        } else if (user2 != null) {
            textView.setText(gd.M0(2131752910, null));
        } else if (org.telegram.messenger.v3.V(chat3)) {
            textView.setText(gd.M0(2131752916, null));
        } else {
            textView.setText(gd.M0(2131752912, null));
        }
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, ma.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        u6.U(textView2, i15, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        ks.i(textView2);
        textView2.setText(j6.m(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752911, str)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        f10.addView(textView2, ma.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i16 = mp.u1(i12).m6;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final xb0 xb0Var = new xb0(parentActivity, null);
        xb0Var.setForceForceUseCenter(true);
        xb0Var.setText(gd.M0(2131752915, null));
        xb0Var.setLeftPadding(org.telegram.messenger.g0.L(2.0f));
        u6.U(editTextBoldCursor, i15, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        u6.C(editTextBoldCursor, n6.lg, null);
        u6.l(editTextBoldCursor, 36, n6.mg, null);
        editTextBoldCursor.setGravity(gd.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new di.q9(xb0Var, editTextBoldCursor, 1));
        xb0Var.e(editTextBoldCursor);
        xb0Var.addView(editTextBoldCursor, ma.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        f10.addView(xb0Var, ma.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.k3());
        editTextBoldCursor.addTextChangedListener(new o1(editTextBoldCursor, i16, xb0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            xb0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            u6.U(textView3, n6.B6, null);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(gd.M0(i11 >= 0 ? 2131752914 : 2131752913, null));
            textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(27.0f));
            f10.addView(textView3, ma.c(-2.0f, -1));
        } else {
            f10.addView(new View(parentActivity), ma.c(12.0f, -1));
        }
        final hi.d dVar = new hi.d(parentActivity, null, true);
        dVar.i(textView.getText(), false, true);
        f10.addView(dVar, ma.o(-1, 48));
        j11.O = f10;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: ki.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.d dVar2 = hi.d.this;
                if (dVar2.R) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z12 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z12 && editTextBoldCursor2.getText().length() > i16) {
                    xb0 xb0Var2 = xb0Var;
                    xb0Var2.a(1.0f);
                    org.telegram.messenger.g0.E3(-6.0f, xb0Var2, null);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i17 = i12;
                setcustomverification.bot = mp.u1(i17).q1(j10);
                setcustomverification.peer = mp.u1(i17).l1(j3);
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
                ConnectionsManager.getInstance(i17).sendRequest(setcustomverification, new bi.m1(dVar2, j11, r3Var, 13));
            }
        });
        j11.Q0 = true;
        j11.R0 = true;
        j11.show();
        return true;
    }

    public /* synthetic */ m1(int i7, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
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

    public /* synthetic */ m1(EditText editText, long j3, int i7, EditText editText2) {
        this.a = 2;
        this.d = editText;
        this.c = j3;
        this.b = i7;
        this.e = editText2;
    }

    public /* synthetic */ m1(cx cxVar, int i7, long j3, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = 0;
        this.d = cxVar;
        this.b = i7;
        this.c = j3;
        this.e = botVerifierSettings;
    }
}
