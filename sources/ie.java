// default package

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ie implements n7, fq7, o69, nt2, fd, z28, u69, ez5, hj, m39, wb0, oj3, r42, ef7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ie(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // oj3
    public final boolean E() {
        return false;
    }

    @Override // ez5
    public final void a(String str) {
        zu1 zu1Var = (zu1) this.b;
        eq0 eq0Var = (eq0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = ob6.D0().y.getLanguage();
        if (str == null || ((str.equals(language) && !str.equals("und")) || ee9.b0().contains(str))) {
            eq0Var.setClickable(false);
        } else {
            eq0Var.setOnClickListener(new nh(zu1Var, str, language, charSequence, eq0Var, (byte) 4));
        }
    }

    @Override // r42
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        v72 v72Var = (v72) this.b;
        mk0 mk0Var = (mk0) this.c;
        n12 n12Var = (n12) this.d;
        pi9 pi9Var = v72Var.r;
        if (messageMedia == null || messageMedia.geo == null) {
            return;
        }
        ch9 ch9Var = pi9Var.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) mk0Var.b;
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
            pageblockmap.w = 600;
            pageblockmap.h = 400;
        }
        ch9 ch9Var2 = pi9Var.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        v72Var.Y(true);
        n12Var.a(true);
        pi9Var.post(new g72(v72Var, mk0Var, (byte) 0));
    }

    @Override // z28
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 7:
                sw0 sw0Var = (sw0) obj3;
                mu7 mu7Var = (mu7) obj2;
                String str = (String) obj;
                if (i != 3) {
                    mu7Var.dismiss();
                }
                sw0Var.d.E.D(str, qu6.C(i).toLowerCase(Locale.ROOT), false);
                break;
            default:
                mu7 mu7Var2 = (mu7) obj3;
                j22 j22Var = (j22) obj2;
                String str2 = (String) obj;
                if (i != 3) {
                    mu7Var2.dismiss();
                }
                j22Var.getWebViewContainer().D(str2, qu6.C(i).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override // u69
    public final boolean d(float f, float f2, int i, final View view) {
        String str;
        final h71 h71Var = (h71) this.b;
        d79 d79Var = (d79) this.c;
        e eVar = (e) this.d;
        w71 w71Var = h71Var.f;
        i71 i71Var = (i71) d79Var.getAdapter();
        final p71 p71Var = (p71) i71Var.e.get(i);
        final byte b = 1;
        if (!(view instanceof n71) && !(view instanceof jja)) {
            l71 l71Var = w71Var.G;
            if (l71Var != null) {
                l71Var.g(p71Var.c, p71Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w71Var.getContext(), null);
        if (view instanceof jja) {
            s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, ob6.M0(2131752629, null), false, null).setOnClickListener(new nh(h71Var, p71Var, i71Var, d79Var, view, (byte) 2));
            str = null;
        } else {
            final byte b2 = 0;
            if (((n71) view).b.getChildAt(0) instanceof vea) {
                str = null;
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, ob6.M0(2131746947, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: f71
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b2;
                        View view3 = view;
                        p71 p71Var2 = p71Var;
                        h71 h71Var2 = h71Var;
                        switch (b3) {
                            case 0:
                                h71Var2.f.b(p71Var2.d, (n71) view3);
                                n8 n8Var = h71Var2.a;
                                if (n8Var != null) {
                                    n8Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                h71Var2.f.b(p71Var2.d, (n71) view3);
                                n8 n8Var2 = h71Var2.a;
                                if (n8Var2 != null) {
                                    n8Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                str = null;
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, ob6.M0(2131752629, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: f71
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b;
                        View view3 = view;
                        p71 p71Var2 = p71Var;
                        h71 h71Var2 = h71Var;
                        switch (b3) {
                            case 0:
                                h71Var2.f.b(p71Var2.d, (n71) view3);
                                n8 n8Var = h71Var2.a;
                                if (n8Var != null) {
                                    n8Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                h71Var2.f.b(p71Var2.d, (n71) view3);
                                n8 n8Var2 = h71Var2.a;
                                if (n8Var2 != null) {
                                    n8Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        c71 c71Var = p71Var.d;
        if (c71Var.b != 0 && c71Var.g != 0) {
            s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, ob6.M0(2131743204, str), false, null).setOnClickListener(new c0(h71Var, p71Var, eVar, (byte) 12));
        }
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, ob6.M0(!w71Var.h.j.contains(p71Var.d) ? 2131745400 : 2131751423, str), false, null).setOnClickListener(new t(h71Var, p71Var, (byte) 28));
        h71Var.a = jj.N(eVar, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f, (int) f2);
        w71Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // nt2
    public final void e(gi0 gi0Var) {
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = (TLRPC.InputStorePaymentPurpose) this.b;
        Purchase purchase = (Purchase) this.c;
        Runnable runnable = (Runnable) this.d;
        StringBuilder sb = new StringBuilder("BillingController consumeGiftPurchase ");
        sb.append(inputStorePaymentPurpose);
        sb.append(" ");
        sb.append(purchase.a());
        sb.append(" ");
        sb.append(purchase.b());
        sb.append(" done: ");
        int i = gi0Var.a;
        sb.append(i == 0 ? "OK" : Integer.valueOf(i));
        sb.append(" ");
        uh9.s(gi0Var.c, sb);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // n7
    public final void g(int i) {
        hj hjVar = (hj) this.b;
        boolean[] zArr = (boolean[]) this.c;
        z8d z8dVar = (z8d) this.d;
        if (i == 1) {
            hjVar.y(2147483646, 0, zArr[0]);
            ((nx0) z8dVar.b).y0.run();
        }
    }

    @Override // fq7
    public final void i(hq7 hq7Var, int i) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                jj.g(null, null, 0L, 0L, 0, (hq7) obj3, (fi) obj2, (hi) obj);
                break;
            default:
                jj.g(null, null, 0L, 0L, 0, (hq7) obj3, (oi) obj2, (pi) obj);
                break;
        }
    }

    @Override // wb0
    public final void j(ec0 ec0Var) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        ju1 ju1Var = (ju1) this.b;
        switch (b) {
            case 15:
                wb2 wb2Var = (wb2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                int ordinal = ec0Var.ordinal();
                if (ordinal == 0) {
                    ju1Var.o(user, false);
                    break;
                } else if (ordinal == 3) {
                    ju1Var.k(wb2Var, user);
                    break;
                } else if (ordinal == 4) {
                    ju1Var.c(user);
                    break;
                } else if (ordinal == 5) {
                    ju1Var.a.Da(user);
                    break;
                }
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                wb2 wb2Var2 = (wb2) obj;
                int ordinal2 = ec0Var.ordinal();
                if (ordinal2 == 0) {
                    ju1Var.n(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        ju1Var.a(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        ju1Var.a.Ba(chat);
                        break;
                    }
                } else {
                    ju1Var.j(wb2Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override // m39
    public final void k(o39 o39Var, int i) {
        int i2;
        FrameLayout frameLayout = (FrameLayout) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (frameLayout != null) {
            int measuredWidth = frameLayout.getMeasuredWidth();
            int measuredHeight = frameLayout.getMeasuredHeight();
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(o39Var.getMeasuredWidth(), TLObject.FLAG_30), 0);
            i2 = frameLayout.getMeasuredHeight() + hl.L(8.0f);
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i2 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], uh9.w(52.0f, i2, i), true);
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
        r47 r47Var = (r47) this.c;
        TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
        int i3 = ChatActivityEnterView.X7;
        zu1 zu1Var = chatActivityEnterView.E3;
        TLRPC.Message message = r47Var.k;
        long j = message.from_id.user_id;
        long j2 = message.via_bot_id;
        if (j2 != 0) {
            j = j2;
        }
        TLRPC.User X1 = uc7.s1(chatActivityEnterView.S.a).X1(Long.valueOf(j));
        if (X1 == null) {
            uj3Var.finishFragment();
            return true;
        }
        long j3 = ((if7) arrayList.get(0)).a;
        ls6.d0(chatActivityEnterView.R).T1(j3, 0L, "@" + lbc.p(X1) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
        if (j3 == chatActivityEnterView.F3) {
            uj3Var.finishFragment();
            return true;
        }
        if (wf3.B(j3)) {
            uj3Var.finishFragment();
            return true;
        }
        Bundle bundle = new Bundle();
        if (wf3.D(j3)) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        if (uc7.s1(chatActivityEnterView.S.a).C(bundle, uj3Var, null, null)) {
            if (!zu1Var.presentFragment(new zu1(bundle), true)) {
                uj3Var.finishFragment();
                return true;
            }
            if (!hl.O1()) {
                zu1Var.removeSelfFromStack();
            }
        }
        return true;
    }

    @Override // o69
    public final int run() {
        e eVar = (e) this.b;
        String str = (String) this.c;
        d79 d79Var = (d79) this.d;
        int i = -1;
        try {
            Field declaredField = eVar.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            x46 x46Var = (x46) d79Var.getLayoutManager();
            i = declaredField.getInt(eVar);
            x46Var.g1(i, hl.L(60.0f));
            declaredField.setAccessible(false);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 5:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                yt0 yt0Var = (yt0) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                yt0Var.a(bool, bool);
                break;
            case 6:
                boolean[] zArr2 = (boolean[]) this.c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.b;
                xt3 xt3Var = (xt3) this.d;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.confirm(xt3Var.getText().toString());
                    break;
                }
                break;
            case 8:
                boolean[] zArr3 = (boolean[]) this.c;
                pcc pccVar = (pcc) this.b;
                id[] idVarArr = (id[]) this.d;
                zArr3[0] = true;
                pccVar.a(Boolean.FALSE);
                idVarArr[0].dismiss();
                break;
            case 17:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                r47 r47Var = (r47) this.c;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                int i2 = ChatActivityEnterView.X7;
                Activity activity2 = chatActivityEnterView.D3;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    r7a.B(chatActivityEnterView.R).n0(r47Var, keyboardButtonProto);
                    break;
                } else {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.X3 = r47Var;
                    chatActivityEnterView.Y3 = keyboardButtonProto;
                    break;
                }
            case 20:
                n12 n12Var = (n12) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i3 = n12Var.G3;
                if (tL_attachMenuBot == null) {
                    ls6.d0(i3).O1(user.id);
                    break;
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = uc7.s1(i3).q1(user);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new ql(n12Var, tL_attachMenuBot, (byte) 19), 66);
                    break;
                }
            case 22:
                h42 h42Var = (h42) this.b;
                f42 f42Var = (f42) this.c;
                sg2 sg2Var = (sg2) this.d;
                TextView textView = h42Var.V;
                if (f42Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = f42Var.getText().toString().trim();
                    h42Var.t0 = TextUtils.isEmpty(trim) ? null : trim;
                    h42Var.u0 = !sg2Var.b();
                    if (TextUtils.isEmpty(h42Var.t0)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(h42Var.t0);
                        textView.setVisibility(0);
                    }
                    h42Var.j0();
                    idVar.dismiss();
                    h42Var.X();
                    break;
                } else {
                    int i4 = -h42Var.w0;
                    h42Var.w0 = i4;
                    hl.A3(i4, f42Var, null);
                    break;
                }
            case 25:
                a72 a72Var = (a72) this.b;
                View view = (View) this.c;
                zh8 zh8Var = (zh8) this.d;
                view.setTag(null);
                a72Var.W(view, zh8Var, false);
                break;
            case 27:
                s92 s92Var = (s92) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view2 = (View) this.d;
                v92 v92Var = s92Var.a.i3;
                if (tL_username.editable) {
                    if (v92Var.s0 == null) {
                        v92Var.s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = v92Var.Y;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z = tL_username.active;
                    tL_channels_toggleUsername.active = !z;
                    v92Var.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new si1((Object) s92Var, (Object) tL_channels_toggleUsername, (Object) tL_username, z, (byte) 2));
                    v92Var.Q.add(tL_username.username);
                    ((re1) view2).setLoading(true);
                }
                v92Var.a0();
                break;
            default:
                na2 na2Var = (na2) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                if (chatFull.hidden_prehistory) {
                    na2Var.getMessagesController().p5(chat2.id, false);
                }
                na2Var.c0(chat2, null);
                break;
        }
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 11:
                ((zu1) obj3).y9((m47) obj2, (r47) obj, i, i2);
                break;
            case 12:
                zu1 zu1Var = (zu1) obj3;
                zu1Var.getClass();
                zu1Var.zb((TLRPC.BotInlineResult) obj2, z, i, ((Long) obj).longValue());
                break;
            case 13:
                zu1 zu1Var2 = (zu1) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                r47 r47Var = (r47) obj;
                if (z) {
                    oj m = oj.m(suggestedPost != null ? suggestedPost.price : null);
                    long j = i;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (m != null && !m.l()) {
                        suggestedPost2.price = m.q();
                    }
                    if (j > 0) {
                        suggestedPost2.schedule_date = (int) j;
                        suggestedPost2.flags |= 1;
                    }
                    if (r47Var != null && r47Var.k != null) {
                        zu1Var2.getMessagesController().e(r47Var, suggestedPost2);
                        break;
                    }
                }
                break;
            case 23:
                s42 s42Var = (s42) obj3;
                s42Var.o0.b((TLRPC.TL_messageMediaGeo) obj2, s42Var.p0, z, i, ((Long) obj).longValue());
                s42Var.b.a(true);
                break;
            default:
                a72 a72Var = (a72) obj3;
                a72Var.k0.a((TLRPC.TL_messageMediaToDo) obj2, null, null, null, z, i, ((Long) obj).longValue());
                a72Var.b.a(true);
                break;
        }
    }

    public /* synthetic */ ie(boolean[] zArr, Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = zArr;
        this.b = obj;
        this.d = obj2;
    }

    @Override // u69
    public final void f() {
    }

    @Override // u69
    public final void h(float f) {
    }

    @Override // ef7
    public final void run(long j) {
        ((pd2) this.b).j0((TLRPC.TL_inputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j);
    }
}
