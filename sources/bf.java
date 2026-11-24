// default package

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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bf implements ed, wi3, gj8, jnb, ResultCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bf(int i, long j, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.a = (byte) 2;
        this.b = i;
        this.c = j;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override // wi3
    public final boolean G() {
        return false;
    }

    @Override // gj8
    public final void a(wk4 wk4Var) {
        boolean z;
        pj2 pj2Var = (pj2) this.d;
        long j = this.c;
        mj2 mj2Var = (mj2) this.e;
        int i = this.b;
        synchronized (qj2.d) {
            Spannable spannable = (Spannable) pj2Var.a.get();
            if (spannable == null || pj2Var.b.get(Long.valueOf(j)) != mj2Var) {
                return;
            }
            if (!(spannable instanceof kj2) || ((kj2) spannable).a) {
                z = false;
            } else {
                qj2.a(spannable, i, (f06) wk4Var.b);
                z = true;
            }
            gl.c3(new gj2(pj2Var, j, mj2Var, i, z, wk4Var));
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        anb anbVar = (anb) this.d;
        wd2 wd2Var = (wd2) this.e;
        Pair pair = (Pair) obj;
        if (pair == null || ((Long) pair.first).longValue() != this.c) {
            return;
        }
        Drawable drawable = wd2Var.b;
        if (drawable instanceof ye7) {
            ye7 ye7Var = (ye7) drawable;
            ye7Var.r(this.b >= 0 ? 100 : -100, anb.e((Bitmap) pair.second));
            ye7Var.s(anbVar.M);
        }
        anbVar.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wi3
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        boolean z3;
        Activity activity;
        String str;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.Chat chat2;
        cj3 cj3Var2 = (cj3) this.d;
        final TL_bots.BotVerifierSettings botVerifierSettings = (TL_bots.BotVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j = ((zc7) arrayList.get(0)).a;
        Activity parentActivity = cj3Var2.getParentActivity();
        final int i3 = this.b;
        final it0 it0Var = new it0(qvbVar, cj3Var2, j, i3);
        if (parentActivity == null) {
            return true;
        }
        na7 q1 = na7.q1(i3);
        final long j2 = this.c;
        q1.V1(Long.valueOf(j2));
        if (j >= 0) {
            TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(j));
            str = l7c.l(V1);
            z3 = true;
            if (V1.bot_verification_icon == botVerifierSettings.icon) {
                nt0.a(parentActivity, i3, j2, j, botVerifierSettings, it0Var);
                return true;
            }
            activity = parentActivity;
            user = V1;
            chat = null;
            chat2 = V1;
        } else {
            z3 = true;
            activity = parentActivity;
            TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-j));
            str = K0 == null ? "" : K0.title;
            if (K0.bot_verification_icon == botVerifierSettings.icon) {
                nt0.a(activity, i3, j2, j, botVerifierSettings, it0Var);
                return true;
            }
            i3 = i3;
            chat = K0;
            user = null;
            chat2 = K0;
        }
        boolean z4 = z3;
        final fx0 i4 = ug8.i(activity, z4, z4 ? 1 : 0, null);
        LinearLayout m = ir2.m(activity, z4 ? 1 : 0);
        TLRPC.User user2 = user;
        TLRPC.Chat chat3 = chat;
        m.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(8.0f));
        m.setClipChildren(false);
        m.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = gl.L(28.0f);
        int L2 = gl.L(28.0f);
        int i5 = bkb.Si;
        ShapeDrawable c0 = bkb.c0(L, L2, bkb.w0(null, i5, false));
        vkb M = zkb.M(i5);
        frameLayout.setBackground(c0);
        zkb.j(frameLayout, c0, M, null, null);
        be0 be0Var = new be0(activity);
        be0Var.setRoundRadius(gl.L(28.0f));
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(chat2);
        be0Var.f(chat2, pb0Var);
        frameLayout.addView(be0Var, nme.e(28, 28, 51));
        be0 be0Var2 = new be0(activity);
        be0Var2.setEmojiColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.y9, false), PorterDuff.Mode.SRC_IN));
        be0Var2.setAnimatedEmojiDrawable(vl.m(i3, botVerifierSettings.icon, null, 3));
        frameLayout.addView(be0Var2, nme.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        jia jiaVar = new jia(activity);
        zkb.W(jiaVar, bkb.i5, null);
        jiaVar.setTextSize(13);
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.l(str, false);
        jiaVar.setWidthWrapContent(true);
        frameLayout.addView(jiaVar, nme.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        m.addView(frameLayout, nme.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i6 = bkb.F6;
        zkb.X(textView, i6, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (l7c.v(user2)) {
            textView.setText(k96.M0(2131752916, null));
        } else if (user2 != null) {
            textView.setText(k96.M0(2131752909, null));
        } else if (hc2.V(chat3)) {
            textView.setText(k96.M0(2131752915, null));
        } else {
            textView.setText(k96.M0(2131752911, null));
        }
        textView.setTypeface(gl.o());
        m.addView(textView, nme.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        zkb.X(textView2, i6, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        kk7.i(textView2);
        textView2.setText(vu3.m(gl.S2(k96.a0(null, null, 2131752910, str)), textView2.getPaint().getFontMetricsInt(), false, null, 0));
        m.addView(textView2, nme.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int f = na7.q1(i3).k4.F2.f();
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final er7 er7Var = new er7(activity, null);
        er7Var.setForceForceUseCenter(true);
        er7Var.setText(k96.M0(2131752914, null));
        er7Var.setLeftPadding(gl.L(2.0f));
        zkb.X(editTextBoldCursor, i6, null);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        zkb.C(editTextBoldCursor, bkb.kg, null);
        zkb.l(editTextBoldCursor, 36, bkb.lg, null);
        editTextBoldCursor.setGravity(k96.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new jt0(er7Var, editTextBoldCursor, (byte) 0));
        er7Var.e(editTextBoldCursor);
        er7Var.addView(editTextBoldCursor, nme.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        m.addView(er7Var, nme.o(-1, -2));
        editTextBoldCursor.addTextChangedListener(new fi());
        editTextBoldCursor.addTextChangedListener(new mt0(editTextBoldCursor, f, er7Var));
        TLRPC.TL_textWithEntities tL_textWithEntities = botVerifierSettings.custom_description;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            editTextBoldCursor.setText(botVerifierSettings.custom_description.text);
            if (!botVerifierSettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botVerifierSettings.can_modify_custom_description) {
            er7Var.setVisibility(8);
        }
        if (botVerifierSettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            zkb.X(textView3, bkb.A6, null);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(k96.M0(j >= 0 ? 2131752913 : 2131752912, null));
            textView3.setPadding(gl.L(14.0f), gl.L(7.0f), gl.L(14.0f), gl.L(27.0f));
            m.addView(textView3, nme.c(-2.0f, -1));
        } else {
            m.addView(new View(activity), nme.c(12.0f, -1));
        }
        final u41 u41Var = new u41(null, activity, true);
        u41Var.i(textView.getText(), false, true);
        m.addView(u41Var, nme.o(-1, 48));
        i4.O = m;
        u41Var.setOnClickListener(new View.OnClickListener() { // from class: kt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u41 u41Var2 = u41.this;
                if (u41Var2.R) {
                    return;
                }
                TL_bots.BotVerifierSettings botVerifierSettings2 = botVerifierSettings;
                boolean z5 = botVerifierSettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z5 && editTextBoldCursor2.getText().length() > f) {
                    er7 er7Var2 = er7Var;
                    er7Var2.a(1.0f);
                    gl.A3(-6.0f, er7Var2, null);
                    return;
                }
                u41Var2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags |= 1;
                int i7 = i3;
                setcustomverification.bot = na7.q1(i7).m1(j2);
                setcustomverification.peer = na7.q1(i7).h1(j);
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
                ConnectionsManager.getInstance(i7).sendRequest(setcustomverification, new en0((Object) u41Var2, (Object) i4, (Object) it0Var, (byte) 6));
            }
        });
        i4.Q0 = true;
        i4.R0 = true;
        i4.show();
        return true;
    }

    @Override // jnb
    public final void run() {
        fk6 fk6Var = (fk6) this.d;
        fk6Var.e1.set(((q93) fk6Var.c1).m(this.c, this.b, (ByteBuffer) this.e));
    }

    @Override // wi3
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        long j = this.c;
        int i2 = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j <= 0) {
                        long j2 = -j;
                        TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(j2));
                        String obj3 = editText.getText().toString();
                        String str = K0.title;
                        if (str != null && str.equals(obj3)) {
                            hdVar.dismiss();
                            break;
                        } else {
                            K0.title = obj3;
                            kk7.f(i2).k(2, 16);
                            na7.q1(i2).y(j2, obj3, null);
                            kk7.e().k(kk7.R4, 3, Long.valueOf(j));
                        }
                    } else {
                        TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
                        String obj4 = editText.getText().toString();
                        String obj5 = editText2.getText().toString();
                        String str2 = V1.first_name;
                        String str3 = V1.last_name;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2.equals(obj4) && str3.equals(obj5)) {
                            hdVar.dismiss();
                            break;
                        } else {
                            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                            updateprofile.flags = 3;
                            updateprofile.first_name = obj4;
                            V1.first_name = obj4;
                            updateprofile.last_name = obj5;
                            V1.last_name = obj5;
                            TLRPC.User V12 = na7.q1(i2).V1(Long.valueOf(y6c.h(i2).e()));
                            if (V12 != null) {
                                V12.first_name = updateprofile.first_name;
                                V12.last_name = updateprofile.last_name;
                            }
                            y6c.h(i2).u(true);
                            kk7.f(i2).k(46, new Object[0]);
                            kk7.f(i2).k(2, 1);
                            ConnectionsManager.getInstance(i2).sendRequest(updateprofile, new ce2(b2));
                            kk7.e().k(kk7.R4, 3, Long.valueOf(j));
                        }
                    }
                    hdVar.dismiss();
                    break;
                }
                break;
            default:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = na7.q1(i2).m1(j);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new vv0(i2, b2), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                kk7.f(i2).k(kk7.Y4, new Object[0]);
                hq6.d0(i2).k2(hq6.f2 ? 1 : 0, j);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public /* synthetic */ bf(cj3 cj3Var, int i, long j, TL_bots.BotVerifierSettings botVerifierSettings) {
        this.a = (byte) 1;
        this.d = cj3Var;
        this.b = i;
        this.c = j;
        this.e = botVerifierSettings;
    }

    public /* synthetic */ bf(fk6 fk6Var, ByteBuffer byteBuffer, long j, int i) {
        this.a = (byte) 4;
        this.d = fk6Var;
        this.e = byteBuffer;
        this.c = j;
        this.b = i;
    }

    public /* synthetic */ bf(EditText editText, long j, int i, EditText editText2) {
        this.a = (byte) 0;
        this.d = editText;
        this.c = j;
        this.b = i;
        this.e = editText2;
    }

    public /* synthetic */ bf(Object obj, long j, Object obj2, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.e = obj2;
        this.b = i;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(Throwable th) {
    }
}
