// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l0 implements r69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(int i, View view) {
        Paint.FontMetricsInt fontMetricsInt;
        String str;
        b27 b27Var = (b27) this.b;
        y17 y17Var = (y17) this.c;
        if (i == 0) {
            b27Var.getClass();
            return;
        }
        r17 adapter = b27Var.getAdapter();
        if (adapter.x0 == null || adapter.i0) {
            int i2 = i - 1;
            Object J = b27Var.getAdapter().J(i2);
            int i3 = b27Var.getAdapter().Y;
            int i4 = b27Var.getAdapter().Z;
            if (b27Var.getAdapter().G != null && i2 == 1) {
                TLRPC.Chat chat = b27Var.getAdapter().m0;
                if (chat == null && b27Var.getAdapter().H0 != null) {
                    chat = b27Var.getAdapter().H0.e;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(b27Var.getAdapter().G);
                if (chat != null) {
                    str = "@" + xc2.K(chat, false);
                } else {
                    str = "";
                }
                y17Var.H0(i3, i4, c00.k(sb, str, " "), false);
                return;
            }
            if (b27Var.getAdapter().G != null && i2 == 0) {
                y17Var.H0(i3, i4, c00.k(new StringBuilder(), b27Var.getAdapter().G, " "), false);
                return;
            }
            if (J instanceof TLRPC.TL_document) {
                if (view instanceof u2b) {
                    ((u2b) view).getSendAnimationData();
                }
                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                y17Var.m0(tL_document, r47.U(tL_document), b27Var.getAdapter().L(i2));
            } else if (J instanceof TLRPC.Chat) {
                String K = xc2.K((TLRPC.Chat) J, false);
                if (K != null) {
                    y17Var.H0(i3, i4, qd4.y("@", K, " "), false);
                }
            } else if (J instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) J;
                if (lbc.p(user) != null) {
                    y17Var.H0(i3, i4, "@" + lbc.p(user) + " ", false);
                } else {
                    SpannableString spannableString = new SpannableString(qd4.o(lbc.k(user, false), " "));
                    spannableString.setSpan(new i8c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                    y17Var.H0(i3, i4, spannableString, false);
                }
            } else if (J instanceof String) {
                y17Var.H0(i3, i4, J + " ", false);
            } else if (J instanceof hs6) {
                String str2 = ((hs6) J).a;
                y17Var.T0(str2);
                if (str2 != null) {
                    try {
                    } catch (Exception unused) {
                        y17Var.H0(i3, i4, str2, true);
                    }
                    if (str2.startsWith("animated_")) {
                        try {
                            fontMetricsInt = y17Var.w();
                        } catch (Exception e) {
                            cc4.g(e, false);
                            fontMetricsInt = null;
                        }
                        long parseLong = Long.parseLong(str2.substring(9));
                        TLRPC.Document e2 = wl.e(yac.t0, parseLong);
                        SpannableString spannableString2 = new SpannableString(r47.U(e2));
                        spannableString2.setSpan(e2 != null ? new hm(e2, fontMetricsInt) : new hm(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                        y17Var.H0(i3, i4, spannableString2, false);
                        b27Var.o(false);
                    }
                }
                y17Var.H0(i3, i4, str2, true);
                b27Var.o(false);
            }
            if (J instanceof TLRPC.BotInlineResult) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                    y17Var.s(botInlineResult, true, 0);
                    return;
                }
                ArrayList arrayList = new ArrayList(b27Var.getAdapter().S);
                b27Var.Q = arrayList;
                PhotoViewer.q0().T1(null, b27Var.h, b27Var.a);
                PhotoViewer.q0().o1(arrayList, b27Var.getAdapter().M(i2), 3, false, b27Var.R, null);
            }
        }
    }

    private final void b(int i, View view) {
        ui8 ui8Var = (ui8) this.b;
        Context context = (Context) this.c;
        HashSet hashSet = ui8Var.u1;
        qi8 qi8Var = ui8Var.m1;
        if (hl.C1(context)) {
            ArrayList arrayList = ui8Var.z1;
            if (arrayList == null || arrayList.isEmpty()) {
                int i2 = 0;
                if (view instanceof skb) {
                    int S = qi8Var.S(i) - 1;
                    int Q = qi8Var.Q(i) - 1;
                    if (Q <= 0 || S < 0) {
                        return;
                    }
                    ti8 ti8Var = (ti8) ui8Var.w1.get(S);
                    if (Q != ti8Var.b() || hashSet.contains(ti8Var)) {
                        return;
                    }
                    if (ti8Var.e && ti8Var.f < ti8Var.b.size()) {
                        int min = Math.min(ti8Var.f + 50, ti8Var.b.size());
                        ti8Var.f = min;
                        if (min == ti8Var.b.size()) {
                            ti8Var.e = false;
                        }
                        ui8Var.E0(null);
                        qi8Var.X(true);
                        return;
                    }
                    hashSet.add(ti8Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = ui8Var.t1;
                    tL_messages_getPollVotes.id = ui8Var.r1.e1();
                    tL_messages_getPollVotes.limit = 50;
                    int i3 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = ti8Var.d;
                    tL_messages_getPollVotes.flags = i3 | 3;
                    tL_messages_getPollVotes.offset = ti8Var.c;
                    ConnectionsManager.getInstance(ui8Var.a).sendRequest(tL_messages_getPollVotes, new ol7(ui8Var, ti8Var, (byte) 8));
                    return;
                }
                if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h == null && pollVotesAlert$UserCell.n == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    TLRPC.User user = pollVotesAlert$UserCell.h;
                    if (user != null) {
                        bundle.putLong("user_id", user.id);
                    } else {
                        bundle.putLong("chat_id", pollVotesAlert$UserCell.n.id);
                    }
                    ui8Var.dismiss();
                    e S2 = LaunchActivity.S();
                    if (S2 != null) {
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        if (S2 instanceof zu1) {
                            if (pollVotesAlert$UserCell.h != null) {
                                TLRPC.User h = ((zu1) S2).h();
                                ui8Var.l1.getChildAt(0);
                                if (h != null && h.id == pollVotesAlert$UserCell.h.id) {
                                    i2 = 1;
                                }
                                profileActivity.y3(i2);
                            } else {
                                TLRPC.Chat chat = ((zu1) S2).e;
                                if (chat != null && chat.id == pollVotesAlert$UserCell.n.id) {
                                    i2 = 1;
                                }
                                profileActivity.y3(i2);
                            }
                        }
                        S2.presentFragment(profileActivity);
                    }
                }
            }
        }
    }

    private final void c(int i, View view) {
        TLRPC.Message message;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        z3a z3aVar = (z3a) this.b;
        lcb lcbVar = (lcb) this.c;
        e eVar = lcbVar.f;
        v3a v3aVar = z3aVar.x;
        i3a i3aVar = z3aVar.r;
        if (i < 0 || i >= v3aVar.c.size()) {
            return;
        }
        s3a s3aVar = (s3a) v3aVar.c.get(i);
        TL_stories.StoryView storyView = s3aVar.b;
        TL_stories.StoryReaction storyReaction = s3aVar.c;
        if (storyView instanceof TL_stories.TL_storyView) {
            lcbVar.L(ProfileActivity.Q2(storyView.user_id));
            return;
        }
        if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
            eVar.createOverlayStoryViewer().J(z3aVar.getContext(), ((TL_stories.TL_storyViewPublicRepost) s3aVar.b).story, l6b.a(i3aVar));
            return;
        }
        if (storyReaction instanceof TL_stories.TL_storyReaction) {
            lcbVar.L(ProfileActivity.Q2(wf3.n(storyReaction.peer_id)));
            return;
        }
        if (!(storyReaction instanceof TL_stories.TL_storyReactionPublicRepost)) {
            if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                message = storyReaction.message;
            } else if (!(storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                return;
            } else {
                message = storyView.message;
            }
            Bundle bundle = new Bundle();
            long n = wf3.n(message.peer_id);
            if (n >= 0) {
                bundle.putLong("user_id", n);
            } else {
                bundle.putLong("chat_id", -n);
            }
            bundle.putInt("message_id", message.id);
            lcbVar.L(new zu1(bundle));
            return;
        }
        ArrayList arrayList = new ArrayList();
        y3a y3aVar = z3aVar.F;
        int i2 = 0;
        int i3 = -1;
        if (y3aVar != null) {
            int size = y3aVar.i.size();
            while (i2 < z3aVar.F.i.size()) {
                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) z3aVar.F.i.get(i2);
                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                    storyItem.dialogId = wf3.n(tL_storyReactionPublicRepost.peer_id);
                    if (storyReaction2 == storyReaction) {
                        i3 = arrayList.size();
                    }
                    arrayList.add(storyItem);
                }
                i2++;
            }
            i2 = size;
        }
        if (i3 < 0 || arrayList.size() <= 1) {
            z3aVar.H = null;
            eVar.createOverlayStoryViewer().J(z3aVar.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, l6b.a(i3aVar));
            return;
        }
        z3aVar.H = new w5b(z3aVar.w, arrayList);
        z3aVar.I = i2;
        y3a y3aVar2 = z3aVar.F;
        lcb createOverlayStoryViewer = eVar.createOverlayStoryViewer();
        Context context = z3aVar.getContext();
        w5b w5bVar = z3aVar.H;
        l6b a = l6b.a(i3aVar);
        a.e = new ye9(y3aVar2, (byte) 26);
        createOverlayStoryViewer.G(context, i3, w5bVar, a);
    }

    private final void d(int i, View view) {
        n0c n0cVar = (n0c) this.b;
        cs1 cs1Var = (cs1) this.c;
        EditText editText = n0cVar.w;
        long a = ((j0c) n0cVar.s.c.get(i)).a();
        zu1 zu1Var = cs1Var.a;
        if (zu1Var.d8()) {
            zu1Var.za(a);
        } else {
            l1c l1cVar = zu1Var.g2;
            if (l1cVar != null) {
                l1cVar.k(a, false);
            }
        }
        boolean h = n0cVar.h();
        n0cVar.V = 0L;
        n0cVar.W = null;
        if (editText.length() > 0) {
            editText.setText("");
        } else if (h) {
            n0cVar.l(false);
            n0cVar.n();
        }
        editText.clearFocus();
        n0cVar.d();
    }

    private final void f(int i, View view) {
        b4c b4cVar = (b4c) this.b;
        vnb vnbVar = (vnb) this.c;
        b8c G = b4cVar.e2.G(i - 1);
        if (G != null) {
            int i2 = G.d;
            if (i2 == 1) {
                CharSequence charSequence = b4cVar.X1;
                if (charSequence == null || b4cVar.W1) {
                    return;
                }
                hl.g(charSequence);
                return;
            }
            if (i2 == 2) {
                if (yac.h(b4cVar.a).p()) {
                    uc7.s1(b4cVar.a).i4.K(0L, !r4.A(0L));
                    b4cVar.dismiss();
                } else if (LaunchActivity.S() != null) {
                    new xk8(13, vnbVar, b4cVar.getContext()).show();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07f0  */
    @Override // r69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i, View view) {
        qx6 qx6Var;
        b8c G;
        int i2;
        Object O;
        iv2 iv2Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3;
        int i4;
        int size;
        me2 me2Var;
        s8b s8bVar;
        byte b = 12;
        String str6 = null;
        char c = 1;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.b;
                vnb vnbVar = (vnb) this.c;
                b8c G2 = s0Var.i2.G(i - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, s0Var.getContext());
                    alertDialog$Builder.a.S = ob6.M0(2131754995, null);
                    alertDialog$Builder.a.U = ob6.M0(2131754994, null);
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    alertDialog$Builder.j(ob6.M0(2131751563, null), new m0(s0Var, (byte) 0));
                    alertDialog$Builder.c(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 1:
                ao0 ao0Var = (ao0) this.b;
                e eVar = (e) this.c;
                ArrayList arrayList = ao0Var.Y1;
                if (view instanceof ogb) {
                    ogb ogbVar = (ogb) view;
                    int type = ogbVar.getType();
                    boolean z = ogbVar.e.h;
                    boolean z2 = !z;
                    ogbVar.setChecked(z2);
                    int i5 = ogb.M;
                    if (type == 0) {
                        ao0Var.s2 = z2;
                        ao0Var.g1(false, false);
                    } else if (type == 1) {
                        ogbVar.setDivider(z2);
                        ao0Var.r2 = z2;
                        ao0Var.g1(false, false);
                        km0 km0Var = ao0Var.b2;
                        int i6 = 0;
                        while (true) {
                            if (i6 < km0Var.e.size()) {
                                jm0 jm0Var = (jm0) km0Var.e.get(i6);
                                if (jm0Var.a == 15) {
                                    byte b2 = jm0Var.l;
                                    int i7 = ogb.M;
                                    if (b2 == 1) {
                                        int i8 = i6 + 1;
                                        if (z) {
                                            km0Var.s(i8);
                                        } else {
                                            km0Var.i(i8);
                                        }
                                    }
                                }
                                i6++;
                            }
                        }
                        ao0Var.b2.G();
                        boolean z3 = ao0Var.r2;
                        rn0 rn0Var = ao0Var.t2;
                        if (z3) {
                            hl.r(rn0Var);
                        } else {
                            hl.d3(rn0Var, 250L);
                        }
                    }
                }
                if (view instanceof if0) {
                    if (view instanceof pn0) {
                        int selectedType = ((pn0) view).getSelectedType();
                        int i9 = pn0.w;
                        if (selectedType == 2) {
                            if (ao0Var.c2 == selectedType) {
                                qx6 qx6Var2 = ao0Var.m2;
                                if (qx6Var2 != null) {
                                    ((t2a) qx6Var2.b).d1(1, arrayList);
                                    ((dn0) qx6Var2.c).l1.F(1);
                                    break;
                                }
                            }
                        } else if (selectedType != 3) {
                            if (selectedType == 1) {
                                qx6 qx6Var3 = ao0Var.m2;
                                if (qx6Var3 != null) {
                                    ((t2a) qx6Var3.b).d1(1, arrayList);
                                    ((dn0) qx6Var3.c).l1.F(1);
                                }
                            } else {
                                ao0Var.d2 = selectedType;
                                ao0Var.g1(true, true);
                                ao0Var.f1(true);
                                ao0Var.X0();
                            }
                        }
                        ao0Var.c2 = selectedType;
                        ao0Var.g1(true, true);
                        ao0Var.f1(true);
                        ao0Var.X0();
                    } else {
                        if0 if0Var = (if0) view;
                        d79 d79Var = ao0Var.n1;
                        if (if0Var.b()) {
                            for (int i10 = 0; i10 < d79Var.getChildCount(); i10++) {
                                View childAt = d79Var.getChildAt(i10);
                                if (childAt.getClass().isInstance(if0Var)) {
                                    ((if0) childAt).c(childAt == if0Var, true);
                                }
                            }
                        }
                    }
                }
                if (view instanceof ky7) {
                    int selectedType2 = ((ky7) view).getSelectedType();
                    if (ao0Var.e2 == selectedType2 && (qx6Var = ao0Var.m2) != null) {
                        ((t2a) qx6Var.b).d1(3, ao0Var.Z1);
                        ((dn0) qx6Var.c).l1.F(1);
                    }
                    ao0Var.e2 = selectedType2;
                    ao0Var.g1(false, false);
                    break;
                } else if (view instanceof cs3) {
                    ao0Var.g2 = ((TLRPC.TL_premiumGiftCodeOption) ((cs3) view).getGifCode()).months;
                    ao0Var.g1(false, false);
                    ao0Var.b2.G();
                    break;
                } else if (view instanceof e93) {
                    Context context = eVar.getContext();
                    long j = ao0Var.h2;
                    sn0 sn0Var = new sn0(ao0Var);
                    vnb vnbVar2 = ao0Var.J0;
                    gj gjVar = new gj(vnbVar2);
                    int i11 = gjVar.b;
                    z8d z8dVar = new z8d(context, vnbVar2);
                    ((nx0) z8dVar.b).w0 = false;
                    hq7 hq7Var = new hq7(context, vnbVar2);
                    int i12 = gjVar.a;
                    hq7Var.setTextColor(i12);
                    hq7Var.setTextOffset(hl.L(10.0f));
                    hq7Var.setItemCount(5);
                    wm0 wm0Var = new wm0(context, vnbVar2);
                    wm0Var.setWrapSelectorWheel(true);
                    wm0Var.setAllItemsCount(24);
                    wm0Var.setItemCount(5);
                    wm0Var.setTextColor(i12);
                    wm0Var.setTextOffset(-hl.L(10.0f));
                    wm0Var.setTag("HOUR");
                    xm0 xm0Var = new xm0(context, vnbVar2);
                    xm0Var.setWrapSelectorWheel(true);
                    xm0Var.setAllItemsCount(60);
                    xm0Var.setItemCount(5);
                    xm0Var.setTextColor(i12);
                    xm0Var.setTextOffset(-hl.L(34.0f));
                    ki kiVar = new ki(context, gjVar, hq7Var, wm0Var, xm0Var);
                    kiVar.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(context);
                    kiVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context);
                    textView.setText(ob6.M0(2131753280, "BoostingSelectDateTime"));
                    textView.setTextColor(i12);
                    bs2.t(textView, 1, 20.0f);
                    frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new q8((byte) 17));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    kiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                    long currentTimeMillis = System.currentTimeMillis();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(currentTimeMillis);
                    int i13 = calendar.get(1);
                    xb xbVar = new xb(context, (byte) 12);
                    long f = uc7.s1(yac.t0).k4.G0.f() * 1000;
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(f);
                    int i14 = calendar2.get(6);
                    calendar2.setTimeInMillis(System.currentTimeMillis());
                    calendar2.add(14, (int) f);
                    int i15 = calendar2.get(11);
                    int i16 = calendar.get(12);
                    linearLayout.addView(hq7Var, tre.l(0.5f, 0, jn7.s4));
                    hq7Var.setMinValue(0);
                    hq7Var.setMaxValue(i14 - 1);
                    hq7Var.setWrapSelectorWheel(false);
                    hq7Var.setTag("DAY");
                    hq7Var.setFormatter(new pm0(currentTimeMillis, calendar, i13, (byte) 0));
                    qm0 qm0Var = new qm0(kiVar, wm0Var, xm0Var, i15, i16, hq7Var);
                    hq7Var.setOnValueChangedListener(qm0Var);
                    wm0Var.setMinValue(0);
                    wm0Var.setMaxValue(23);
                    linearLayout.addView(wm0Var, tre.l(0.2f, 0, jn7.s4));
                    wm0Var.setFormatter(new xz((byte) 29));
                    wm0Var.setOnValueChangedListener(qm0Var);
                    xm0Var.setMinValue(0);
                    xm0Var.setMaxValue(11);
                    xm0Var.setValue(0);
                    xm0Var.setFormatter(new rm0((byte) 0));
                    linearLayout.addView(xm0Var, tre.l(0.3f, 0, jn7.s4));
                    xm0Var.setOnValueChangedListener(qm0Var);
                    if (j > 0) {
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j);
                        xm0Var.setValue(calendar.get(12) / 5);
                        wm0Var.setValue(calendar.get(11));
                        hq7Var.setValue(timeInMillis);
                        hq7Var.getValue();
                        qm0Var.i(hq7Var, hq7Var.getValue());
                        wm0Var.getValue();
                        qm0Var.i(wm0Var, wm0Var.getValue());
                    }
                    xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                    xbVar.setGravity(17);
                    xbVar.setTextColor(gjVar.g);
                    xbVar.setTextSize(1, 14.0f);
                    xbVar.setTypeface(hl.o());
                    xbVar.setBackground(rnb.e(gjVar.h, 8.0f));
                    xbVar.setText(ob6.M0(2131753536, "BoostingConfirm"));
                    kiVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
                    xbVar.setOnClickListener(new xf(calendar, hq7Var, wm0Var, xm0Var, sn0Var, z8dVar));
                    nx0 nx0Var = (nx0) z8dVar.b;
                    nx0Var.O = kiVar;
                    nx0Var.show();
                    nx0Var.s0(i11);
                    nx0Var.K(i11);
                    hl.l3(nx0Var, vm2.h(i11) > 0.699999988079071d);
                    break;
                } else if (view instanceof oa) {
                    qx6 qx6Var4 = ao0Var.m2;
                    if (qx6Var4 != null) {
                        ((t2a) qx6Var4.b).d1(2, ao0Var.X1);
                        ((dn0) qx6Var4.c).l1.F(1);
                        break;
                    }
                } else if (view instanceof ava) {
                    TL_stars.TL_starsGiveawayOption option = ((ava) view).getOption();
                    if (option != null) {
                        ao0Var.k2 = option.stars;
                        ao0Var.g1(true, true);
                        ao0Var.f1(true);
                        ao0Var.X0();
                        break;
                    }
                } else if (view instanceof xya) {
                    ao0Var.f2 = true;
                    ao0Var.g1(true, true);
                    break;
                }
                break;
            case 2:
                ((lo0) this.b).E0((Context) this.c, view, i);
                break;
            case 3:
                jr0 jr0Var = (jr0) this.b;
                te2 te2Var = (te2) this.c;
                l9c l9cVar = jr0Var.U1;
                if (l9cVar != null && (G = l9cVar.G(i - 1)) != null) {
                    Object obj = G.H;
                    if (obj instanceof t4c) {
                        te2Var.a(((t4c) obj).a);
                        jr0Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                ((ng1) this.b).E0((Context) this.c, i);
                break;
            case 5:
                ((wh1) this.b).W0((TLRPC.ChatFull) this.c, view, i);
                break;
            case 6:
                jh1 jh1Var = (jh1) this.b;
                nh1 nh1Var = (nh1) this.c;
                wh1 wh1Var = jh1Var.c;
                int i17 = nh1Var.d;
                qob qobVar = nh1Var.b;
                lc7 lc7Var = uc7.s1(i17).E3;
                if (lc7Var != null) {
                    ArrayList arrayList2 = lc7Var.c;
                    if (i >= 0 && i < arrayList2.size()) {
                        i2 = ((kc7) arrayList2.get(i)).c;
                        wh1Var.f = i2;
                        wh1Var.e1(true);
                        wh1Var.h1(true);
                        wh1Var.i1();
                        if (view.getLeft() >= hl.L(24.0f) + qobVar.getPaddingLeft()) {
                            qobVar.y0(-((hl.L(48.0f) + qobVar.getPaddingLeft()) - view.getLeft()), 0, null);
                            break;
                        } else if (view.getWidth() + view.getLeft() > (qobVar.getMeasuredWidth() - qobVar.getPaddingRight()) - hl.L(24.0f)) {
                            qobVar.y0(uh9.f(48.0f, qobVar.getMeasuredWidth() - qobVar.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                            break;
                        }
                    }
                }
                i2 = 0;
                wh1Var.f = i2;
                wh1Var.e1(true);
                wh1Var.h1(true);
                wh1Var.i1();
                if (view.getLeft() >= hl.L(24.0f) + qobVar.getPaddingLeft()) {
                }
                break;
            case 7:
                zu1 zu1Var = (zu1) this.b;
                TLObject tLObject = (TLObject) ((a67) this.c).c.get(i);
                if (tLObject != null) {
                    zu1Var.M5(true);
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    zu1Var.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 8:
                n12 n12Var = (n12) this.b;
                vnb vnbVar3 = (vnb) this.c;
                n02 n02Var = n12Var.v3;
                f12[] f12VarArr = n12Var.t2;
                e eVar2 = n12Var.Z1;
                e Q = eVar2 == null ? LaunchActivity.Q() : eVar2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof h12) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (n12Var.I3 || n12Var.J3 || !n12Var.G0()) {
                                if (!n12Var.I3 && !n12Var.J3) {
                                    w72 w72Var = new w72(1, n12Var, vnbVar3, n12Var.getContext());
                                    n12Var.N1 = w72Var;
                                    n12Var.B1(w72Var);
                                }
                                n12Var.B1(n12Var.d2);
                            }
                        } else if (intValue == 17) {
                            if (n12Var.q2 == null && (eVar2 instanceof zu1)) {
                                TLRPC.User h = ((zu1) eVar2).h();
                                if (n12.c1(h)) {
                                    h42 h42Var = new h42(n12Var, n12Var.getContext(), n12Var.G3, h, vnbVar3);
                                    n12Var.q2 = h42Var;
                                    f12VarArr[11] = h42Var;
                                }
                            }
                            f12 f12Var = n12Var.q2;
                            if (f12Var != null) {
                                n12Var.B1(f12Var);
                            }
                        } else if (intValue == 3) {
                            if (n12Var.K3 || !n12Var.G0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    hl.W(n12Var.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                n12Var.l1(true);
                            }
                        } else if (intValue == 4) {
                            if (n12Var.H3 || !n12Var.G0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    hl.W(n12Var.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                n12Var.n1(true);
                            }
                        } else if (intValue == 5) {
                            if (n12Var.N3 || !n12Var.G0()) {
                                if (n12Var.N3 && n12Var.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                    hl.W(n12Var.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                    break;
                                } else {
                                    n12Var.m1();
                                }
                            }
                        } else if (intValue == 6) {
                            if ((n12Var.N3 || !n12Var.G0()) && hl.H1(eVar2)) {
                                if (n12Var.N3) {
                                    if (n12Var.i2 == null) {
                                        s42 s42Var = new s42(n12Var, n12Var.getContext(), vnbVar3, (n12Var.B1 || n12Var.O3) ? false : true);
                                        n12Var.i2 = s42Var;
                                        f12VarArr[5] = s42Var;
                                        r42 r42Var = n12Var.t4;
                                        if (r42Var != null) {
                                            s42Var.setDelegate(r42Var);
                                        } else {
                                            s42Var.setDelegate(new xz1(n12Var, b));
                                        }
                                    }
                                    n12Var.B1(n12Var.i2);
                                } else {
                                    w72 w72Var2 = new w72(6, n12Var, vnbVar3, n12Var.getContext());
                                    n12Var.N1 = w72Var2;
                                    n12Var.B1(w72Var2);
                                }
                            }
                        } else if (intValue == 9) {
                            if (n12Var.L3 || !n12Var.G0()) {
                                if (n12Var.L3) {
                                    n12Var.D1(true, null);
                                } else {
                                    w72 w72Var3 = new w72(9, n12Var, vnbVar3, n12Var.getContext());
                                    n12Var.N1 = w72Var3;
                                    n12Var.B1(w72Var3);
                                }
                            }
                        } else if (intValue == 11) {
                            if (n12Var.m2 == null) {
                                f72 f72Var = new f72(n12Var, n12Var.J0, n12Var.getContext());
                                n12Var.m2 = f72Var;
                                f12VarArr[7] = f72Var;
                                f72Var.setupBlurredSearchField(n12Var.E4);
                            }
                            n12Var.B1(n12Var.m2);
                        } else if (intValue == 12) {
                            if (n12Var.M3 || !n12Var.G0()) {
                                if (n12Var.M3) {
                                    if (n12Var.h2 == null) {
                                        a72 a72Var = new a72(n12Var, n12Var.getContext(), true, vnbVar3, null);
                                        n12Var.h2 = a72Var;
                                        f12VarArr[1] = a72Var;
                                        a72Var.setDelegate(new xz1(n12Var, (byte) 13));
                                    }
                                    n12Var.B1(n12Var.h2);
                                } else {
                                    w72 w72Var4 = new w72(9, n12Var, vnbVar3, n12Var.getContext());
                                    n12Var.N1 = w72Var4;
                                    n12Var.B1(w72Var4);
                                }
                            }
                        } else if (intValue == 13) {
                            if (n12Var.o2 == null) {
                                v32 v32Var = new v32(n12Var, n12Var.getContext(), vnbVar3, true);
                                n12Var.o2 = v32Var;
                                f12VarArr[8] = v32Var;
                                v32Var.setDelegate(n12Var.X3);
                            }
                            n12Var.B1(n12Var.o2);
                        } else if (intValue == 14) {
                            if (n12Var.n2 == null) {
                                v32 v32Var2 = new v32(n12Var, n12Var.getContext(), vnbVar3, false);
                                n12Var.n2 = v32Var2;
                                f12VarArr[9] = v32Var2;
                                v32Var2.setDelegate(n12Var.X3);
                            }
                            n12Var.B1(n12Var.n2);
                        } else if (intValue == 16) {
                            v72 v72Var = n12Var.p2;
                            if (v72Var == null) {
                                v72Var = new v72(n12Var.G3, n12Var, vnbVar3, n12Var.getContext());
                                n12Var.p2 = v72Var;
                                f12VarArr[10] = v72Var;
                            }
                            n12Var.B1(v72Var);
                        } else if (view.getTag() instanceof Integer) {
                            n12Var.W3.z0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, n12Var.b1(), false, 0L);
                        }
                    } else if (view instanceof g12) {
                        g12 g12Var = (g12) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = g12Var.c;
                        if (tL_attachMenuBot == null) {
                            n12Var.W3.i0(g12Var.b);
                            n12Var.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            exc.a(n12Var.getContext(), new rx1((Object) n12Var, (Object) g12Var, (byte) (c == true ? 1 : 0)), null);
                        } else {
                            n12Var.y1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = hl.L(70.0f);
                    int i18 = left - L;
                    if (i18 < 0) {
                        n02Var.y0(i18, 0, null);
                        break;
                    } else {
                        int i19 = right + L;
                        if (i19 > n02Var.getMeasuredWidth()) {
                            n02Var.y0(i19 - n02Var.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                b32 b32Var = (b32) this.b;
                vnb vnbVar4 = (vnb) this.c;
                v22 v22Var = b32Var.F;
                j79 adapter = b32Var.s.getAdapter();
                x22 x22Var = b32Var.G;
                if (adapter == x22Var) {
                    O = x22Var.E(i);
                } else {
                    int S = v22Var.S(i);
                    int Q2 = v22Var.Q(i);
                    if (Q2 >= 0 && S >= 0) {
                        O = v22Var.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (b32Var.x.isEmpty()) {
                        if (O instanceof iv2) {
                            iv2 iv2Var2 = (iv2) O;
                            TLRPC.User user = iv2Var2.m;
                            if (user != null) {
                                str3 = user.first_name;
                                str4 = user.last_name;
                            } else {
                                str3 = iv2Var2.i;
                                str4 = iv2Var2.j;
                            }
                            iv2Var = iv2Var2;
                            str2 = str4;
                            str = str3;
                        } else {
                            TLRPC.User user2 = (TLRPC.User) O;
                            iv2 iv2Var3 = new iv2();
                            String str7 = user2.first_name;
                            iv2Var3.i = str7;
                            String str8 = user2.last_name;
                            iv2Var3.j = str8;
                            iv2Var3.e.add(user2.phone);
                            iv2Var3.m = user2;
                            iv2Var = iv2Var3;
                            str = str7;
                            str2 = str8;
                        }
                        r78 r78Var = new r78(b32Var.b.Z1, iv2Var, null, null, null, null, str, str2, vnbVar4);
                        r78Var.E1 = new n22(b32Var);
                        r78Var.show();
                        break;
                    } else {
                        b32Var.P((a32) view, O);
                        break;
                    }
                }
                break;
            case 10:
                ((pd2) this.b).i0((Context) this.c, view, i);
                break;
            case 11:
                ad3 ad3Var = (ad3) this.b;
                e eVar3 = (e) this.c;
                ne2 ne2Var = (ne2) ad3Var.c.d.get(i);
                znb i20 = ne2Var.a.i(ad3Var.r);
                dpb dpbVar = ne2Var.a.c;
                if (dpbVar == null) {
                    str5 = null;
                } else {
                    str5 = dpbVar.b;
                    if (str5 == null) {
                        str5 = dpbVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    dpb dpbVar2 = ne2Var.a.c;
                    if (dpbVar2 != null && (str6 = dpbVar2.b) == null) {
                        str6 = dpbVar2.a;
                    }
                    if (!str6.equals("🎨")) {
                        i3 = -1;
                        if (i20 == null) {
                            TLRPC.TL_theme tL_theme = ((dz3) ne2Var.a.f.get(ad3Var.r)).b;
                            znb O0 = aob.O0(aob.q0(tL_theme.settings.get(((dz3) ne2Var.a.f.get(ad3Var.r)).d)));
                            if (O0 != null) {
                                ynb ynbVar = (ynb) O0.d0.get(tL_theme.id);
                                if (ynbVar == null) {
                                    ynbVar = O0.d(tL_theme, eVar3.getCurrentAccount(), 0);
                                }
                                i3 = ynbVar.a;
                                O0.u(i3);
                            }
                            i20 = O0;
                        }
                        aob.I1(i20, false, i3, view);
                        ad3Var.h = i;
                        i4 = 0;
                        while (true) {
                            size = ad3Var.c.d.size();
                            me2Var = ad3Var.c;
                            if (i4 < size) {
                                me2Var.E(ad3Var.h);
                                for (int i21 = 0; i21 < ad3Var.a.getChildCount(); i21++) {
                                    zqb zqbVar = (zqb) ad3Var.a.getChildAt(i21);
                                    if (zqbVar != view && (s8bVar = zqbVar.K) != null) {
                                        hl.r(s8bVar);
                                        zqbVar.K.run();
                                    }
                                }
                                ((zqb) view).d();
                                if (i20 != null) {
                                    SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
                                    edit.putString((ad3Var.n == 1 || i20.o()) ? "lastDarkTheme" : "lastDayTheme", i20.k());
                                    edit.commit();
                                }
                                aob.K1(eVar3);
                                break;
                            } else {
                                ((ne2) me2Var.d.get(i4)).d = i4 == ad3Var.h;
                                i4++;
                            }
                        }
                    }
                }
                i3 = ((dz3) ne2Var.a.f.get(ad3Var.r)).e;
                if (i20 == null) {
                }
                aob.I1(i20, false, i3, view);
                ad3Var.h = i;
                i4 = 0;
                while (true) {
                    size = ad3Var.c.d.size();
                    me2Var = ad3Var.c;
                    if (i4 < size) {
                    }
                    ((ne2) me2Var.d.get(i4)).d = i4 == ad3Var.h;
                    i4++;
                }
                break;
            case 12:
                ((ru3) this.b).c0((Context) this.c, i);
                break;
            case 13:
                ((rc5) this.b).o0((Context) this.c, view, i);
                break;
            case 14:
                bw5 bw5Var = (bw5) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                xv5 xv5Var = bw5Var.p1;
                ArrayList arrayList3 = bw5Var.s1;
                if (!bw5Var.A1 && arrayList3.get(i) != bw5Var.w1) {
                    bw5Var.w1 = (TLRPC.Peer) arrayList3.get(i);
                    boolean z4 = view instanceof bd5;
                    if (z4) {
                        ((bd5) view).c(true, true);
                    } else if (view instanceof nea) {
                        ((nea) view).b(true, true);
                        view.invalidate();
                    }
                    int childCount = xv5Var.getChildCount();
                    for (int i22 = 0; i22 < childCount; i22++) {
                        View childAt2 = xv5Var.getChildAt(i22);
                        if (childAt2 != view) {
                            if (z4) {
                                ((bd5) childAt2).c(false, true);
                            } else if (view instanceof nea) {
                                ((nea) childAt2).b(false, true);
                            }
                        }
                    }
                    if (bw5Var.v1 != 0) {
                        bw5Var.H0(chat, true);
                        break;
                    }
                }
                break;
            case 15:
                ck6 ck6Var = (ck6) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = ck6Var.l0;
                if (i == ck6Var.R) {
                    TLRPC.User user3 = (TLRPC.User) hashMap.get(Long.valueOf(ck6Var.e.admin_id));
                    if (user3 != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user3.id);
                        uc7.s1(yac.t0).i4(user3, false, false);
                        ck6Var.presentFragment(new ProfileActivity(bundle2, null));
                        break;
                    }
                } else if (i == ck6Var.y) {
                    v56 v56Var = new v56(0, ck6Var.n);
                    v56Var.T = ck6Var.t0;
                    ck6Var.presentFragment(v56Var);
                    break;
                } else {
                    int i23 = ck6Var.E;
                    if (i < i23 || i >= ck6Var.F) {
                        int i24 = ck6Var.I;
                        if (i < i24 || i >= ck6Var.J) {
                            if (i == ck6Var.O) {
                                if (!ck6Var.d0) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ck6Var.getParentActivity());
                                    alertDialog$Builder2.a.S = ob6.M0(2131751540, null);
                                    alertDialog$Builder2.a.U = ob6.M0(2131751541, null);
                                    alertDialog$Builder2.j(ob6.M0(2131751563, null), new qj6(ck6Var));
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    ck6Var.showDialog(alertDialog$Builder2.a);
                                    break;
                                }
                            } else {
                                int i25 = ck6Var.V;
                                if (i >= i25 && i < ck6Var.W) {
                                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ck6Var.n0.get(i - i25);
                                    if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                        ck6Var.getMessagesController().i4((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                                    }
                                    ck6 ck6Var2 = new ck6(ck6Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                                    ck6Var2.l0(ck6Var.d, null);
                                    ck6Var.presentFragment(ck6Var2);
                                    break;
                                }
                            }
                        } else {
                            bt5 bt5Var = new bt5(context2, (TLRPC.TL_chatInviteExported) ck6Var.k0.get(i - i24), ck6Var.d, hashMap, ck6Var, ck6Var.n, false, ck6Var.h);
                            ck6Var.m0 = bt5Var;
                            bt5Var.show();
                            break;
                        }
                    } else {
                        bt5 bt5Var2 = new bt5(context2, (TLRPC.TL_chatInviteExported) ck6Var.j0.get(i - i23), ck6Var.d, hashMap, ck6Var, ck6Var.n, false, ck6Var.h);
                        ck6Var.m0 = bt5Var2;
                        bt5Var2.e2 = ck6Var.q0;
                        bt5Var2.show();
                        break;
                    }
                }
                break;
            case 16:
                a(i, view);
                break;
            case 17:
                ((aq7) this.b).d0((Context) this.c, view, i);
                break;
            case 18:
                b(i, view);
                break;
            case 19:
                ((PrivacySettingsActivity) this.b).C0((Context) this.c, view, i);
                break;
            case 20:
                j59 j59Var = (j59) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList4 = j59Var.S1;
                if (view instanceof e3a) {
                    e3a e3aVar = (e3a) view;
                    if (e3aVar.getBoost().cooldown_until_date > 0) {
                        new d31(j59Var.c, j59Var.J0).G(R.raw.chats_infotip, 5, hl.S2(ob6.G(on0.b(), "BoostingWaitWarningPlural", new Object[0]))).k(true);
                        break;
                    } else {
                        if (arrayList4.contains(e3aVar.getBoost())) {
                            arrayList4.remove(e3aVar.getBoost());
                        } else {
                            arrayList4.add(e3aVar.getBoost());
                        }
                        e3aVar.c(arrayList4.contains(e3aVar.getBoost()), true);
                        j59Var.Z0(true);
                        j59Var.W1.a(arrayList4, chat2);
                        break;
                    }
                }
                break;
            case 21:
                c(i, view);
                break;
            case 22:
                d(i, view);
                break;
            case 23:
                f(i, view);
                break;
            default:
                ((UsersSelectActivity) this.b).a0((Context) this.c, view, i);
                break;
        }
    }
}
