package hi;

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
import bi.bb;
import c8.ha;
import di.u5;
import java.util.ArrayList;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.qw;
import org.telegram.ui.w91;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements qw, org.telegram.ui.ActionBar.r1, ni.p, ResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n1(int i7, int i10, long j3, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.c = j3;
        this.e = obj2;
        this.b = i7;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        return false;
    }

    @Override // ni.p
    public void b(j2.n nVar) {
        boolean z9;
        ni.l lVar = (ni.l) this.d;
        long j3 = this.c;
        ni.i iVar = (ni.i) this.e;
        int i7 = this.b;
        synchronized (ni.m.d) {
            try {
                Spannable spannable = (Spannable) lVar.a.get();
                if (spannable != null && lVar.b.get(Long.valueOf(j3)) == iVar) {
                    if (!(spannable instanceof ni.g) || ((ni.g) spannable).a) {
                        z9 = false;
                    } else {
                        ni.m.a(spannable, i7, (com.google.android.gms.internal.play_billing.s0) nVar.b);
                        z9 = true;
                    }
                    org.telegram.messenger.g0.h3(new ni.b(lVar, j3, iVar, i7, z9, nVar));
                }
            } finally {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
                tL_messages_toggleBotInAttachMenu.bot = qp.s1(i11).o1(j3);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new g2(i11, i12), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                qs.f(i11).k(qs.W4, new Object[0]);
                ui.b0(i11).i2(ui.c2, j3);
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
                        TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(j10));
                        String obj3 = editText.getText().toString();
                        String str = M0.title;
                        if (str != null && str.equals(obj3)) {
                            u1Var.dismiss();
                            break;
                        } else {
                            M0.title = obj3;
                            qs.f(i11).k(2, 16);
                            qp.s1(i11).C(j10, obj3, null);
                            qs.e().k(qs.P4, 3, Long.valueOf(j3));
                        }
                    } else {
                        TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(j3));
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
                            u1Var.dismiss();
                            break;
                        } else {
                            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                            updateprofile.flags = 3;
                            updateprofile.first_name = obj4;
                            a22.first_name = obj4;
                            updateprofile.last_name = obj5;
                            a22.last_name = obj5;
                            TLRPC.User a23 = qp.s1(i11).a2(Long.valueOf(p10.i(i11).e()));
                            if (a23 != null) {
                                a23.first_name = updateprofile.first_name;
                                a23.last_name = updateprofile.last_name;
                            }
                            p10.i(i11).v(true);
                            qs.f(i11).k(46, new Object[0]);
                            qs.f(i11).k(2, 1);
                            ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new u5(18));
                            qs.e().k(qs.P4, 3, Long.valueOf(j3));
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
        zz0 zz0Var = (zz0) this.d;
        uo uoVar = (uo) this.e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.c) {
            return;
        }
        Drawable drawable = uoVar.b;
        if (drawable instanceof qa0) {
            qa0 qa0Var = (qa0) drawable;
            qa0Var.s(this.b >= 0 ? 100 : -100, zz0.e((Bitmap) pair.second));
            qa0Var.t(zz0Var.L);
        }
        zz0Var.invalidate();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
        int i11;
        String str;
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r42;
        TLRPC.Chat chat2;
        ww wwVar2 = (ww) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j3 = ((xr) arrayList.get(0)).a;
        Activity parentActivity = wwVar2.getParentActivity();
        final int i12 = this.b;
        final o1 o1Var = new o1(w91Var, wwVar2, j3, i12);
        if (parentActivity == null) {
            return true;
        }
        qp s12 = qp.s1(i12);
        final long j10 = this.c;
        s12.a2(Long.valueOf(j10));
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 >= 0) {
            TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(j3));
            str = t10.k(a22);
            i11 = i13;
            if (a22.bot_verification_icon == botVerifierSettings.icon) {
                s1.a(parentActivity, i12, j10, j3, botVerifierSettings, o1Var);
                return true;
            }
            o1Var = o1Var;
            r42 = 1;
            chat = null;
            user = a22;
            chat2 = a22;
        } else {
            i11 = i13;
            TLRPC.Chat M0 = qp.s1(i12).M0(Long.valueOf(-j3));
            str = M0 == null ? "" : M0.title;
            if (M0.bot_verification_icon == botVerifierSettings.icon) {
                s1.a(parentActivity, i12, j10, j3, botVerifierSettings, o1Var);
                return true;
            }
            parentActivity = parentActivity;
            user = null;
            chat = M0;
            r42 = 1;
            chat2 = M0;
        }
        final org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(parentActivity, r42, r42, null);
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
        l9 l9Var = new l9(parentActivity);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        w8 w8Var = new w8((f6) null);
        w8Var.l(chat2);
        l9Var.e(chat2, w8Var);
        frameLayout.addView(l9Var, ha.e(28, 28, 51));
        l9 l9Var2 = new l9(parentActivity);
        l9Var2.setEmojiColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.z9, false), PorterDuff.Mode.SRC_IN));
        l9Var2.setAnimatedEmojiDrawable(i5.m(i12, botVerifierSettings.icon, null, 3));
        frameLayout.addView(l9Var2, ha.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(parentActivity);
        r6.Y(k5Var, k6.j5, null);
        k5Var.setTextSize(13);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(str, false);
        k5Var.setWidthWrapContent(true);
        frameLayout.addView(k5Var, ha.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        e10.addView(frameLayout, ha.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(parentActivity);
        int i15 = k6.G6;
        r6.V(textView, i15, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (t10.t(user2)) {
            textView.setText(id.M0(2131752928, null));
        } else if (user2 != null) {
            textView.setText(id.M0(2131752921, null));
        } else if (org.telegram.messenger.t3.V(chat3)) {
            textView.setText(id.M0(2131752927, null));
        } else {
            textView.setText(id.M0(2131752923, null));
        }
        textView.setTypeface(org.telegram.messenger.g0.o());
        e10.addView(textView, ha.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(parentActivity);
        r6.V(textView2, i15, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        qs.i(textView2);
        textView2.setText(i6.m(org.telegram.messenger.g0.X2(id.a0(null, null, 2131752922, str)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        e10.addView(textView2, ha.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i16 = qp.s1(i12).j6;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        final lb0 lb0Var = new lb0(parentActivity, null);
        lb0Var.setForceForceUseCenter(true);
        lb0Var.setText(id.M0(2131752926, null));
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(2.0f));
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
        editTextBoldCursor.setGravity(id.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new bb(lb0Var, editTextBoldCursor, 1));
        lb0Var.e(editTextBoldCursor);
        lb0Var.addView(editTextBoldCursor, ha.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        e10.addView(lb0Var, ha.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.j3());
        editTextBoldCursor.addTextChangedListener(new r1(editTextBoldCursor, i16, lb0Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            lb0Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(parentActivity);
            r6.V(textView3, k6.B6, null);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(id.M0(i11 >= 0 ? 2131752925 : 2131752924, null));
            textView3.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(27.0f));
            e10.addView(textView3, ha.c(-2.0f, -1));
        } else {
            e10.addView(new View(parentActivity), ha.c(12.0f, -1));
        }
        final fi.d dVar = new fi.d(parentActivity, null, true);
        dVar.i(textView.getText(), false, true);
        e10.addView(dVar, ha.o(-1, 48));
        h.N = e10;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: hi.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.d dVar2 = fi.d.this;
                if (dVar2.Q) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z11 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z11 && editTextBoldCursor2.getText().length() > i16) {
                    lb0 lb0Var2 = lb0Var;
                    lb0Var2.a(1.0f);
                    org.telegram.messenger.g0.G3(-6.0f, lb0Var2, null);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i17 = i12;
                setcustomverification.bot = qp.s1(i17).o1(j10);
                setcustomverification.peer = qp.s1(i17).j1(j3);
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
                ConnectionsManager.getInstance(i17).sendRequest(setcustomverification, new bi.f2(dVar2, h, o1Var, 7));
            }
        });
        h.P0 = true;
        h.Q0 = true;
        h.show();
        return true;
    }

    public /* synthetic */ n1(int i7, long j3, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
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

    public /* synthetic */ n1(EditText editText, long j3, int i7, EditText editText2) {
        this.a = 3;
        this.d = editText;
        this.c = j3;
        this.b = i7;
        this.e = editText2;
    }

    public /* synthetic */ n1(ww wwVar, int i7, long j3, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = 0;
        this.d = wwVar;
        this.b = i7;
        this.c = j3;
        this.e = botVerifierSettings;
    }
}
