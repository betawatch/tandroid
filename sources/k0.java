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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements f59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(int i, View view) {
        Paint.FontMetricsInt fontMetricsInt;
        String str;
        u17 u17Var = (u17) this.b;
        r17 r17Var = (r17) this.c;
        if (i == 0) {
            u17Var.getClass();
            return;
        }
        k17 adapter = u17Var.getAdapter();
        if (adapter.x0 == null || adapter.i0) {
            int i2 = i - 1;
            Object J = u17Var.getAdapter().J(i2);
            int i3 = u17Var.getAdapter().Y;
            int i4 = u17Var.getAdapter().Z;
            if (u17Var.getAdapter().G != null && i2 == 1) {
                TLRPC.Chat chat = u17Var.getAdapter().m0;
                if (chat == null && u17Var.getAdapter().H0 != null) {
                    chat = u17Var.getAdapter().H0.e;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(u17Var.getAdapter().G);
                if (chat != null) {
                    str = "@" + sd2.K(chat, false);
                } else {
                    str = "";
                }
                r17Var.Y0(i3, i4, b10.j(sb, str, " "), false);
                return;
            }
            if (u17Var.getAdapter().G != null && i2 == 0) {
                r17Var.Y0(i3, i4, b10.j(new StringBuilder(), u17Var.getAdapter().G, " "), false);
                return;
            }
            if (J instanceof TLRPC.TL_document) {
                if (view instanceof v0b) {
                    ((v0b) view).getSendAnimationData();
                }
                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                r17Var.w0(tL_document, k47.U(tL_document), u17Var.getAdapter().L(i2));
            } else if (J instanceof TLRPC.Chat) {
                String K = sd2.K((TLRPC.Chat) J, false);
                if (K != null) {
                    r17Var.Y0(i3, i4, kt6.o("@", K, " "), false);
                }
            } else if (J instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) J;
                if (m9c.p(user) != null) {
                    r17Var.Y0(i3, i4, "@" + m9c.p(user) + " ", false);
                } else {
                    SpannableString spannableString = new SpannableString(td4.p(m9c.k(user, false), " "));
                    spannableString.setSpan(new j6c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                    r17Var.Y0(i3, i4, spannableString, false);
                }
            } else if (J instanceof String) {
                r17Var.Y0(i3, i4, J + " ", false);
            } else if (J instanceof ds6) {
                String str2 = ((ds6) J).a;
                r17Var.c1(str2);
                if (str2 != null) {
                    try {
                    } catch (Exception unused) {
                        r17Var.Y0(i3, i4, str2, true);
                    }
                    if (str2.startsWith("animated_")) {
                        try {
                            fontMetricsInt = r17Var.u0();
                        } catch (Exception e) {
                            fc4.g(e, false);
                            fontMetricsInt = null;
                        }
                        long parseLong = Long.parseLong(str2.substring(9));
                        TLRPC.Document e2 = vm.e(z8c.t0, parseLong);
                        SpannableString spannableString2 = new SpannableString(k47.U(e2));
                        spannableString2.setSpan(e2 != null ? new gn(e2, fontMetricsInt) : new gn(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                        r17Var.Y0(i3, i4, spannableString2, false);
                        u17Var.o(false);
                    }
                }
                r17Var.Y0(i3, i4, str2, true);
                u17Var.o(false);
            }
            if (J instanceof TLRPC.BotInlineResult) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                    r17Var.r(botInlineResult, true, 0);
                    return;
                }
                ArrayList arrayList = new ArrayList(u17Var.getAdapter().S);
                u17Var.Q = arrayList;
                PhotoViewer.r0().T1(null, u17Var.h, u17Var.a);
                PhotoViewer.r0().o1(arrayList, u17Var.getAdapter().M(i2), 3, false, u17Var.R, null);
            }
        }
    }

    private final void b(int i, View view) {
        ih8 ih8Var = (ih8) this.b;
        Context context = (Context) this.c;
        HashSet hashSet = ih8Var.u1;
        eh8 eh8Var = ih8Var.m1;
        if (gm.C1(context)) {
            ArrayList arrayList = ih8Var.z1;
            if (arrayList == null || arrayList.isEmpty()) {
                int i2 = 0;
                if (view instanceof xib) {
                    int S = eh8Var.S(i) - 1;
                    int Q = eh8Var.Q(i) - 1;
                    if (Q <= 0 || S < 0) {
                        return;
                    }
                    hh8 hh8Var = (hh8) ih8Var.w1.get(S);
                    if (Q != hh8Var.b() || hashSet.contains(hh8Var)) {
                        return;
                    }
                    if (hh8Var.e && hh8Var.f < hh8Var.b.size()) {
                        int min = Math.min(hh8Var.f + 50, hh8Var.b.size());
                        hh8Var.f = min;
                        if (min == hh8Var.b.size()) {
                            hh8Var.e = false;
                        }
                        ih8Var.D0(null);
                        eh8Var.X(true);
                        return;
                    }
                    hashSet.add(hh8Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = ih8Var.t1;
                    tL_messages_getPollVotes.id = ih8Var.r1.e1();
                    tL_messages_getPollVotes.limit = 50;
                    int i3 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = hh8Var.d;
                    tL_messages_getPollVotes.flags = i3 | 3;
                    tL_messages_getPollVotes.offset = hh8Var.c;
                    ConnectionsManager.getInstance(ih8Var.a).sendRequest(tL_messages_getPollVotes, new jl7(ih8Var, hh8Var, (byte) 7));
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
                    ih8Var.dismiss();
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        if (S2 instanceof yv1) {
                            if (pollVotesAlert$UserCell.h != null) {
                                TLRPC.User h = ((yv1) S2).h();
                                ih8Var.l1.getChildAt(0);
                                if (h != null && h.id == pollVotesAlert$UserCell.h.id) {
                                    i2 = 1;
                                }
                                profileActivity.B3(i2);
                            } else {
                                TLRPC.Chat chat = ((yv1) S2).e;
                                if (chat != null && chat.id == pollVotesAlert$UserCell.n.id) {
                                    i2 = 1;
                                }
                                profileActivity.B3(i2);
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
        i2a i2aVar = (i2a) this.b;
        oab oabVar = (oab) this.c;
        d dVar = oabVar.f;
        e2a e2aVar = i2aVar.x;
        q1a q1aVar = i2aVar.r;
        if (i < 0 || i >= e2aVar.c.size()) {
            return;
        }
        a2a a2aVar = (a2a) e2aVar.c.get(i);
        TL_stories.StoryView storyView = a2aVar.b;
        TL_stories.StoryReaction storyReaction = a2aVar.c;
        if (storyView instanceof TL_stories.TL_storyView) {
            oabVar.L(ProfileActivity.S2(storyView.user_id));
            return;
        }
        if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
            dVar.createOverlayStoryViewer().J(i2aVar.getContext(), ((TL_stories.TL_storyViewPublicRepost) a2aVar.b).story, q4b.a(q1aVar));
            return;
        }
        if (storyReaction instanceof TL_stories.TL_storyReaction) {
            oabVar.L(ProfileActivity.S2(pg3.n(storyReaction.peer_id)));
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
            long n = pg3.n(message.peer_id);
            if (n >= 0) {
                bundle.putLong("user_id", n);
            } else {
                bundle.putLong("chat_id", -n);
            }
            bundle.putInt("message_id", message.id);
            oabVar.L(new yv1(bundle));
            return;
        }
        ArrayList arrayList = new ArrayList();
        h2a h2aVar = i2aVar.F;
        int i2 = 0;
        int i3 = -1;
        if (h2aVar != null) {
            int size = h2aVar.i.size();
            while (i2 < i2aVar.F.i.size()) {
                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) i2aVar.F.i.get(i2);
                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                    storyItem.dialogId = pg3.n(tL_storyReactionPublicRepost.peer_id);
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
            i2aVar.H = null;
            dVar.createOverlayStoryViewer().J(i2aVar.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, q4b.a(q1aVar));
            return;
        }
        i2aVar.H = new b4b(i2aVar.w, arrayList);
        i2aVar.I = i2;
        h2a h2aVar2 = i2aVar.F;
        oab createOverlayStoryViewer = dVar.createOverlayStoryViewer();
        Context context = i2aVar.getContext();
        b4b b4bVar = i2aVar.H;
        q4b a = q4b.a(q1aVar);
        a.e = new yf9(h2aVar2, (byte) 17);
        createOverlayStoryViewer.G(context, i3, b4bVar, a);
    }

    private final void d(int i, View view) {
        oyb oybVar = (oyb) this.b;
        bt1 bt1Var = (bt1) this.c;
        EditText editText = oybVar.w;
        long a = ((kyb) oybVar.s.c.get(i)).a();
        yv1 yv1Var = bt1Var.a;
        if (yv1Var.d8()) {
            yv1Var.ya(a);
        } else {
            mzb mzbVar = yv1Var.g2;
            if (mzbVar != null) {
                mzbVar.k(a, false);
            }
        }
        boolean h = oybVar.h();
        oybVar.V = 0L;
        oybVar.W = null;
        if (editText.length() > 0) {
            editText.setText("");
        } else if (h) {
            oybVar.l(false);
            oybVar.n();
        }
        editText.clearFocus();
        oybVar.d();
    }

    private final void e(int i, View view) {
        c2c c2cVar = (c2c) this.b;
        ylb ylbVar = (ylb) this.c;
        c6c G = c2cVar.e2.G(i - 1);
        if (G != null) {
            int i2 = G.d;
            if (i2 == 1) {
                CharSequence charSequence = c2cVar.X1;
                if (charSequence == null || c2cVar.W1) {
                    return;
                }
                gm.g(charSequence);
                return;
            }
            if (i2 == 2) {
                if (z8c.h(c2cVar.a).p()) {
                    oc7.r1(c2cVar.a).i4.K(0L, !r4.A(0L));
                    c2cVar.dismiss();
                } else if (LaunchActivity.S() != null) {
                    new kj8(13, ylbVar, c2cVar.getContext()).show();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07f0  */
    @Override // f59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, View view) {
        hi2 hi2Var;
        c6c G;
        int i2;
        Object O;
        yv2 yv2Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3;
        int i4;
        int size;
        gf2 gf2Var;
        zcb zcbVar;
        byte b = 12;
        String str6 = null;
        char c = 1;
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.b;
                ylb ylbVar = (ylb) this.c;
                c6c G2 = r0Var.i2.G(i - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, r0Var.getContext());
                    alertDialog$Builder.a.S = jb6.M0(2131754998, null);
                    alertDialog$Builder.a.U = jb6.M0(2131754997, null);
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    alertDialog$Builder.j(jb6.M0(2131751535, null), new l0(r0Var, (byte) 0));
                    alertDialog$Builder.c(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 1:
                ap0 ap0Var = (ap0) this.b;
                d dVar = (d) this.c;
                ArrayList arrayList = ap0Var.Y1;
                if (view instanceof ueb) {
                    ueb uebVar = (ueb) view;
                    int type = uebVar.getType();
                    boolean z = uebVar.e.h;
                    boolean z2 = !z;
                    uebVar.setChecked(z2);
                    int i5 = ueb.M;
                    if (type == 0) {
                        ap0Var.s2 = z2;
                        ap0Var.f1(false, false);
                    } else if (type == 1) {
                        uebVar.setDivider(z2);
                        ap0Var.r2 = z2;
                        ap0Var.f1(false, false);
                        kn0 kn0Var = ap0Var.b2;
                        int i6 = 0;
                        while (true) {
                            if (i6 < kn0Var.e.size()) {
                                jn0 jn0Var = (jn0) kn0Var.e.get(i6);
                                if (jn0Var.a == 15) {
                                    byte b2 = jn0Var.l;
                                    int i7 = ueb.M;
                                    if (b2 == 1) {
                                        int i8 = i6 + 1;
                                        if (z) {
                                            kn0Var.s(i8);
                                        } else {
                                            kn0Var.i(i8);
                                        }
                                    }
                                }
                                i6++;
                            }
                        }
                        ap0Var.b2.G();
                        boolean z3 = ap0Var.r2;
                        ro0 ro0Var = ap0Var.t2;
                        if (z3) {
                            gm.r(ro0Var);
                        } else {
                            gm.d3(ro0Var, 250L);
                        }
                    }
                }
                if (view instanceof gg0) {
                    if (view instanceof po0) {
                        int selectedType = ((po0) view).getSelectedType();
                        int i9 = po0.w;
                        if (selectedType == 2) {
                            if (ap0Var.c2 == selectedType) {
                                hi2 hi2Var2 = ap0Var.m2;
                                if (hi2Var2 != null) {
                                    ((b1a) hi2Var2.b).c1(1, arrayList);
                                    ((do0) hi2Var2.c).l1.E(1);
                                    break;
                                }
                            }
                        } else if (selectedType != 3) {
                            if (selectedType == 1) {
                                hi2 hi2Var3 = ap0Var.m2;
                                if (hi2Var3 != null) {
                                    ((b1a) hi2Var3.b).c1(1, arrayList);
                                    ((do0) hi2Var3.c).l1.E(1);
                                }
                            } else {
                                ap0Var.d2 = selectedType;
                                ap0Var.f1(true, true);
                                ap0Var.e1(true);
                                ap0Var.W0();
                            }
                        }
                        ap0Var.c2 = selectedType;
                        ap0Var.f1(true, true);
                        ap0Var.e1(true);
                        ap0Var.W0();
                    } else {
                        gg0 gg0Var = (gg0) view;
                        r59 r59Var = ap0Var.n1;
                        if (gg0Var.b()) {
                            for (int i10 = 0; i10 < r59Var.getChildCount(); i10++) {
                                View childAt = r59Var.getChildAt(i10);
                                if (childAt.getClass().isInstance(gg0Var)) {
                                    ((gg0) childAt).c(childAt == gg0Var, true);
                                }
                            }
                        }
                    }
                }
                if (view instanceof ex7) {
                    int selectedType2 = ((ex7) view).getSelectedType();
                    if (ap0Var.e2 == selectedType2 && (hi2Var = ap0Var.m2) != null) {
                        ((b1a) hi2Var.b).c1(3, ap0Var.Z1);
                        ((do0) hi2Var.c).l1.E(1);
                    }
                    ap0Var.e2 = selectedType2;
                    ap0Var.f1(false, false);
                    break;
                } else if (view instanceof us3) {
                    ap0Var.g2 = ((TLRPC.TL_premiumGiftCodeOption) ((us3) view).getGifCode()).months;
                    ap0Var.f1(false, false);
                    ap0Var.b2.G();
                    break;
                } else if (view instanceof x93) {
                    Context context = dVar.getContext();
                    long j = ap0Var.h2;
                    so0 so0Var = new so0(ap0Var);
                    ylb ylbVar2 = ap0Var.J0;
                    fk fkVar = new fk(ylbVar2);
                    int i11 = fkVar.b;
                    k6d k6dVar = new k6d(context, ylbVar2);
                    ((my0) k6dVar.b).w0 = false;
                    lp7 lp7Var = new lp7(context, ylbVar2);
                    int i12 = fkVar.a;
                    lp7Var.setTextColor(i12);
                    lp7Var.setTextOffset(gm.L(10.0f));
                    lp7Var.setItemCount(5);
                    wn0 wn0Var = new wn0(context, ylbVar2);
                    wn0Var.setWrapSelectorWheel(true);
                    wn0Var.setAllItemsCount(24);
                    wn0Var.setItemCount(5);
                    wn0Var.setTextColor(i12);
                    wn0Var.setTextOffset(-gm.L(10.0f));
                    wn0Var.setTag("HOUR");
                    xn0 xn0Var = new xn0(context, ylbVar2);
                    xn0Var.setWrapSelectorWheel(true);
                    xn0Var.setAllItemsCount(60);
                    xn0Var.setItemCount(5);
                    xn0Var.setTextColor(i12);
                    xn0Var.setTextOffset(-gm.L(34.0f));
                    jj jjVar = new jj(context, fkVar, lp7Var, wn0Var, xn0Var);
                    jjVar.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(context);
                    jjVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context);
                    textView.setText(jb6.M0(2131753252, "BoostingSelectDateTime"));
                    textView.setTextColor(i12);
                    ts2.s(textView, 1, 20.0f);
                    frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new p8((byte) 17));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    jjVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                    long currentTimeMillis = System.currentTimeMillis();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(currentTimeMillis);
                    int i13 = calendar.get(1);
                    wb wbVar = new wb(context, (byte) 12);
                    long f = oc7.r1(z8c.t0).l4.y0.f() * 1000;
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(f);
                    int i14 = calendar2.get(6);
                    calendar2.setTimeInMillis(System.currentTimeMillis());
                    calendar2.add(14, (int) f);
                    int i15 = calendar2.get(11);
                    int i16 = calendar.get(12);
                    linearLayout.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
                    lp7Var.setMinValue(0);
                    lp7Var.setMaxValue(i14 - 1);
                    lp7Var.setWrapSelectorWheel(false);
                    lp7Var.setTag("DAY");
                    lp7Var.setFormatter(new on0(currentTimeMillis, calendar, i13, (byte) 0));
                    pn0 pn0Var = new pn0(jjVar, wn0Var, xn0Var, i15, i16, lp7Var);
                    lp7Var.setOnValueChangedListener(pn0Var);
                    wn0Var.setMinValue(0);
                    wn0Var.setMaxValue(23);
                    linearLayout.addView(wn0Var, qoe.l(0.2f, 0, nm7.s4));
                    wn0Var.setFormatter(new w00((byte) 28));
                    wn0Var.setOnValueChangedListener(pn0Var);
                    xn0Var.setMinValue(0);
                    xn0Var.setMaxValue(11);
                    xn0Var.setValue(0);
                    xn0Var.setFormatter(new w00((byte) 29));
                    linearLayout.addView(xn0Var, qoe.l(0.3f, 0, nm7.s4));
                    xn0Var.setOnValueChangedListener(pn0Var);
                    if (j > 0) {
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j);
                        xn0Var.setValue(calendar.get(12) / 5);
                        wn0Var.setValue(calendar.get(11));
                        lp7Var.setValue(timeInMillis);
                        lp7Var.getValue();
                        pn0Var.g(lp7Var, lp7Var.getValue());
                        wn0Var.getValue();
                        pn0Var.g(wn0Var, wn0Var.getValue());
                    }
                    wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                    wbVar.setGravity(17);
                    wbVar.setTextColor(fkVar.g);
                    wbVar.setTextSize(1, 14.0f);
                    wbVar.setTypeface(gm.o());
                    wbVar.setBackground(ulb.e(fkVar.h, 8.0f));
                    wbVar.setText(jb6.M0(2131753508, "BoostingConfirm"));
                    jjVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                    wbVar.setOnClickListener(new gg(calendar, lp7Var, wn0Var, xn0Var, so0Var, k6dVar));
                    my0 my0Var = (my0) k6dVar.b;
                    my0Var.O = jjVar;
                    my0Var.show();
                    my0Var.s0(i11);
                    my0Var.K(i11);
                    gm.l3(my0Var, on2.h(i11) > 0.699999988079071d);
                    break;
                } else if (view instanceof na) {
                    hi2 hi2Var4 = ap0Var.m2;
                    if (hi2Var4 != null) {
                        ((b1a) hi2Var4.b).c1(2, ap0Var.X1);
                        ((do0) hi2Var4.c).l1.E(1);
                        break;
                    }
                } else if (view instanceof ata) {
                    TL_stars.TL_starsGiveawayOption option = ((ata) view).getOption();
                    if (option != null) {
                        ap0Var.k2 = option.stars;
                        ap0Var.f1(true, true);
                        ap0Var.e1(true);
                        ap0Var.W0();
                        break;
                    }
                } else if (view instanceof xwa) {
                    ap0Var.f2 = true;
                    ap0Var.f1(true, true);
                    break;
                }
                break;
            case 2:
                ((lp0) this.b).E0((Context) this.c, view, i);
                break;
            case 3:
                js0 js0Var = (js0) this.b;
                mf2 mf2Var = (mf2) this.c;
                l7c l7cVar = js0Var.U1;
                if (l7cVar != null && (G = l7cVar.G(i - 1)) != null) {
                    Object obj = G.H;
                    if (obj instanceof u2c) {
                        mf2Var.a(((u2c) obj).a);
                        js0Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                ((mh1) this.b).E0((Context) this.c, i);
                break;
            case 5:
                ((vi1) this.b).W0((TLRPC.ChatFull) this.c, view, i);
                break;
            case 6:
                ii1 ii1Var = (ii1) this.b;
                mi1 mi1Var = (mi1) this.c;
                vi1 vi1Var = ii1Var.c;
                int i17 = mi1Var.d;
                smb smbVar = mi1Var.b;
                fc7 fc7Var = oc7.r1(i17).E3;
                if (fc7Var != null) {
                    ArrayList arrayList2 = fc7Var.c;
                    if (i >= 0 && i < arrayList2.size()) {
                        i2 = ((ec7) arrayList2.get(i)).c;
                        vi1Var.f = i2;
                        vi1Var.e1(true);
                        vi1Var.h1(true);
                        vi1Var.i1();
                        if (view.getLeft() >= gm.L(24.0f) + smbVar.getPaddingLeft()) {
                            smbVar.x0(-((gm.L(48.0f) + smbVar.getPaddingLeft()) - view.getLeft()), 0, null);
                            break;
                        } else if (view.getWidth() + view.getLeft() > (smbVar.getMeasuredWidth() - smbVar.getPaddingRight()) - gm.L(24.0f)) {
                            smbVar.x0(hg9.f(48.0f, smbVar.getMeasuredWidth() - smbVar.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                            break;
                        }
                    }
                }
                i2 = 0;
                vi1Var.f = i2;
                vi1Var.e1(true);
                vi1Var.h1(true);
                vi1Var.i1();
                if (view.getLeft() >= gm.L(24.0f) + smbVar.getPaddingLeft()) {
                }
                break;
            case 7:
                yv1 yv1Var = (yv1) this.b;
                TLObject tLObject = (TLObject) ((t57) this.c).c.get(i);
                if (tLObject != null) {
                    yv1Var.N5(true);
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    yv1Var.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 8:
                i22 i22Var = (i22) this.b;
                ylb ylbVar3 = (ylb) this.c;
                i12 i12Var = i22Var.v3;
                a22[] a22VarArr = i22Var.t2;
                d dVar2 = i22Var.Z1;
                d Q = dVar2 == null ? LaunchActivity.Q() : dVar2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof c22) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (i22Var.I3 || i22Var.J3 || !i22Var.F0()) {
                                if (!i22Var.I3 && !i22Var.J3) {
                                    q82 q82Var = new q82(1, i22Var, ylbVar3, i22Var.getContext());
                                    i22Var.N1 = q82Var;
                                    i22Var.A1(q82Var);
                                }
                                i22Var.A1(i22Var.d2);
                            }
                        } else if (intValue == 17) {
                            if (i22Var.q2 == null && (dVar2 instanceof yv1)) {
                                TLRPC.User h = ((yv1) dVar2).h();
                                if (i22.b1(h)) {
                                    c52 c52Var = new c52(i22Var, i22Var.getContext(), i22Var.G3, h, ylbVar3);
                                    i22Var.q2 = c52Var;
                                    a22VarArr[11] = c52Var;
                                }
                            }
                            a22 a22Var = i22Var.q2;
                            if (a22Var != null) {
                                i22Var.A1(a22Var);
                            }
                        } else if (intValue == 3) {
                            if (i22Var.K3 || !i22Var.F0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    gm.W(i22Var.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                i22Var.k1(true);
                            }
                        } else if (intValue == 4) {
                            if (i22Var.H3 || !i22Var.F0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    gm.W(i22Var.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                i22Var.m1(true);
                            }
                        } else if (intValue == 5) {
                            if (i22Var.N3 || !i22Var.F0()) {
                                if (i22Var.N3 && i22Var.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                    gm.W(i22Var.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                    break;
                                } else {
                                    i22Var.l1();
                                }
                            }
                        } else if (intValue == 6) {
                            if ((i22Var.N3 || !i22Var.F0()) && gm.H1(dVar2)) {
                                if (i22Var.N3) {
                                    if (i22Var.i2 == null) {
                                        n52 n52Var = new n52(i22Var, i22Var.getContext(), ylbVar3, (i22Var.B1 || i22Var.O3) ? false : true);
                                        i22Var.i2 = n52Var;
                                        a22VarArr[5] = n52Var;
                                        m52 m52Var = i22Var.t4;
                                        if (m52Var != null) {
                                            n52Var.setDelegate(m52Var);
                                        } else {
                                            n52Var.setDelegate(new s02(i22Var, b));
                                        }
                                    }
                                    i22Var.A1(i22Var.i2);
                                } else {
                                    q82 q82Var2 = new q82(6, i22Var, ylbVar3, i22Var.getContext());
                                    i22Var.N1 = q82Var2;
                                    i22Var.A1(q82Var2);
                                }
                            }
                        } else if (intValue == 9) {
                            if (i22Var.L3 || !i22Var.F0()) {
                                if (i22Var.L3) {
                                    i22Var.C1(true, null);
                                } else {
                                    q82 q82Var3 = new q82(9, i22Var, ylbVar3, i22Var.getContext());
                                    i22Var.N1 = q82Var3;
                                    i22Var.A1(q82Var3);
                                }
                            }
                        } else if (intValue == 11) {
                            if (i22Var.m2 == null) {
                                a82 a82Var = new a82(i22Var, i22Var.J0, i22Var.getContext());
                                i22Var.m2 = a82Var;
                                a22VarArr[7] = a82Var;
                                a82Var.setupBlurredSearchField(i22Var.E4);
                            }
                            i22Var.A1(i22Var.m2);
                        } else if (intValue == 12) {
                            if (i22Var.M3 || !i22Var.F0()) {
                                if (i22Var.M3) {
                                    if (i22Var.h2 == null) {
                                        v72 v72Var = new v72(i22Var, i22Var.getContext(), true, ylbVar3, null);
                                        i22Var.h2 = v72Var;
                                        a22VarArr[1] = v72Var;
                                        v72Var.setDelegate(new s02(i22Var, (byte) 13));
                                    }
                                    i22Var.A1(i22Var.h2);
                                } else {
                                    q82 q82Var4 = new q82(9, i22Var, ylbVar3, i22Var.getContext());
                                    i22Var.N1 = q82Var4;
                                    i22Var.A1(q82Var4);
                                }
                            }
                        } else if (intValue == 13) {
                            if (i22Var.o2 == null) {
                                q42 q42Var = new q42(i22Var, i22Var.getContext(), ylbVar3, true);
                                i22Var.o2 = q42Var;
                                a22VarArr[8] = q42Var;
                                q42Var.setDelegate(i22Var.X3);
                            }
                            i22Var.A1(i22Var.o2);
                        } else if (intValue == 14) {
                            if (i22Var.n2 == null) {
                                q42 q42Var2 = new q42(i22Var, i22Var.getContext(), ylbVar3, false);
                                i22Var.n2 = q42Var2;
                                a22VarArr[9] = q42Var2;
                                q42Var2.setDelegate(i22Var.X3);
                            }
                            i22Var.A1(i22Var.n2);
                        } else if (intValue == 16) {
                            p82 p82Var = i22Var.p2;
                            if (p82Var == null) {
                                p82Var = new p82(i22Var.G3, i22Var, ylbVar3, i22Var.getContext());
                                i22Var.p2 = p82Var;
                                a22VarArr[10] = p82Var;
                            }
                            i22Var.A1(p82Var);
                        } else if (view.getTag() instanceof Integer) {
                            i22Var.W3.E0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, i22Var.a1(), false, 0L);
                        }
                    } else if (view instanceof b22) {
                        b22 b22Var = (b22) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = b22Var.c;
                        if (tL_attachMenuBot == null) {
                            i22Var.W3.z0(b22Var.b);
                            i22Var.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            quc.a(i22Var.getContext(), new qy1((Object) i22Var, (Object) b22Var, (byte) (c == true ? 1 : 0)), null);
                        } else {
                            i22Var.x1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = gm.L(70.0f);
                    int i18 = left - L;
                    if (i18 < 0) {
                        i12Var.x0(i18, 0, null);
                        break;
                    } else {
                        int i19 = right + L;
                        if (i19 > i12Var.getMeasuredWidth()) {
                            i12Var.x0(i19 - i12Var.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                w32 w32Var = (w32) this.b;
                ylb ylbVar4 = (ylb) this.c;
                q32 q32Var = w32Var.F;
                y59 adapter = w32Var.s.getAdapter();
                s32 s32Var = w32Var.G;
                if (adapter == s32Var) {
                    O = s32Var.E(i);
                } else {
                    int S = q32Var.S(i);
                    int Q2 = q32Var.Q(i);
                    if (Q2 >= 0 && S >= 0) {
                        O = q32Var.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (w32Var.x.isEmpty()) {
                        if (O instanceof yv2) {
                            yv2 yv2Var2 = (yv2) O;
                            TLRPC.User user = yv2Var2.m;
                            if (user != null) {
                                str3 = user.first_name;
                                str4 = user.last_name;
                            } else {
                                str3 = yv2Var2.i;
                                str4 = yv2Var2.j;
                            }
                            yv2Var = yv2Var2;
                            str2 = str4;
                            str = str3;
                        } else {
                            TLRPC.User user2 = (TLRPC.User) O;
                            yv2 yv2Var3 = new yv2();
                            String str7 = user2.first_name;
                            yv2Var3.i = str7;
                            String str8 = user2.last_name;
                            yv2Var3.j = str8;
                            yv2Var3.e.add(user2.phone);
                            yv2Var3.m = user2;
                            yv2Var = yv2Var3;
                            str = str7;
                            str2 = str8;
                        }
                        d68 d68Var = new d68(w32Var.b.Z1, yv2Var, null, null, null, null, str, str2, ylbVar4);
                        d68Var.E1 = new i32(w32Var);
                        d68Var.show();
                        break;
                    } else {
                        w32Var.P((v32) view, O);
                        break;
                    }
                }
                break;
            case 10:
                ((ke2) this.b).j0((Context) this.c, view, i);
                break;
            case 11:
                ud3 ud3Var = (ud3) this.b;
                d dVar3 = (d) this.c;
                hf2 hf2Var = (hf2) ud3Var.c.d.get(i);
                bmb i20 = hf2Var.a.i(ud3Var.r);
                fnb fnbVar = hf2Var.a.c;
                if (fnbVar == null) {
                    str5 = null;
                } else {
                    str5 = fnbVar.b;
                    if (str5 == null) {
                        str5 = fnbVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    fnb fnbVar2 = hf2Var.a.c;
                    if (fnbVar2 != null && (str6 = fnbVar2.b) == null) {
                        str6 = fnbVar2.a;
                    }
                    if (!str6.equals("🎨")) {
                        i3 = -1;
                        if (i20 == null) {
                            TLRPC.TL_theme tL_theme = ((sz3) hf2Var.a.f.get(ud3Var.r)).b;
                            bmb O0 = cmb.O0(cmb.q0(tL_theme.settings.get(((sz3) hf2Var.a.f.get(ud3Var.r)).d)));
                            if (O0 != null) {
                                amb ambVar = (amb) O0.d0.get(tL_theme.id);
                                if (ambVar == null) {
                                    ambVar = O0.d(tL_theme, dVar3.getCurrentAccount(), 0);
                                }
                                i3 = ambVar.a;
                                O0.u(i3);
                            }
                            i20 = O0;
                        }
                        cmb.I1(i20, false, i3, view);
                        ud3Var.h = i;
                        i4 = 0;
                        while (true) {
                            size = ud3Var.c.d.size();
                            gf2Var = ud3Var.c;
                            if (i4 < size) {
                                gf2Var.E(ud3Var.h);
                                for (int i21 = 0; i21 < ud3Var.a.getChildCount(); i21++) {
                                    bpb bpbVar = (bpb) ud3Var.a.getChildAt(i21);
                                    if (bpbVar != view && (zcbVar = bpbVar.K) != null) {
                                        gm.r(zcbVar);
                                        bpbVar.K.run();
                                    }
                                }
                                ((bpb) view).d();
                                if (i20 != null) {
                                    SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
                                    edit.putString((ud3Var.n == 1 || i20.o()) ? "lastDarkTheme" : "lastDayTheme", i20.k());
                                    edit.commit();
                                }
                                cmb.K1(dVar3);
                                break;
                            } else {
                                ((hf2) gf2Var.d.get(i4)).d = i4 == ud3Var.h;
                                i4++;
                            }
                        }
                    }
                }
                i3 = ((sz3) hf2Var.a.f.get(ud3Var.r)).e;
                if (i20 == null) {
                }
                cmb.I1(i20, false, i3, view);
                ud3Var.h = i;
                i4 = 0;
                while (true) {
                    size = ud3Var.c.d.size();
                    gf2Var = ud3Var.c;
                    if (i4 < size) {
                    }
                    ((hf2) gf2Var.d.get(i4)).d = i4 == ud3Var.h;
                    i4++;
                }
                break;
            case 12:
                ((kv3) this.b).d0((Context) this.c, i);
                break;
            case 13:
                ((oc5) this.b).p0((Context) this.c, view, i);
                break;
            case 14:
                wv5 wv5Var = (wv5) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                sv5 sv5Var = wv5Var.p1;
                ArrayList arrayList3 = wv5Var.s1;
                if (!wv5Var.A1 && arrayList3.get(i) != wv5Var.w1) {
                    wv5Var.w1 = (TLRPC.Peer) arrayList3.get(i);
                    boolean z4 = view instanceof xc5;
                    if (z4) {
                        ((xc5) view).c(true, true);
                    } else if (view instanceof wca) {
                        ((wca) view).b(true, true);
                        view.invalidate();
                    }
                    int childCount = sv5Var.getChildCount();
                    for (int i22 = 0; i22 < childCount; i22++) {
                        View childAt2 = sv5Var.getChildAt(i22);
                        if (childAt2 != view) {
                            if (z4) {
                                ((xc5) childAt2).c(false, true);
                            } else if (view instanceof wca) {
                                ((wca) childAt2).b(false, true);
                            }
                        }
                    }
                    if (wv5Var.v1 != 0) {
                        wv5Var.G0(chat, true);
                        break;
                    }
                }
                break;
            case 15:
                ak6 ak6Var = (ak6) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = ak6Var.l0;
                if (i == ak6Var.R) {
                    TLRPC.User user3 = (TLRPC.User) hashMap.get(Long.valueOf(ak6Var.e.admin_id));
                    if (user3 != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user3.id);
                        oc7.r1(z8c.t0).c4(user3, false, false);
                        ak6Var.presentFragment(new ProfileActivity(bundle2, null));
                        break;
                    }
                } else if (i == ak6Var.y) {
                    s56 s56Var = new s56(0, ak6Var.n);
                    s56Var.T = ak6Var.t0;
                    ak6Var.presentFragment(s56Var);
                    break;
                } else {
                    int i23 = ak6Var.E;
                    if (i < i23 || i >= ak6Var.F) {
                        int i24 = ak6Var.I;
                        if (i < i24 || i >= ak6Var.J) {
                            if (i == ak6Var.O) {
                                if (!ak6Var.d0) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ak6Var.getParentActivity());
                                    alertDialog$Builder2.a.S = jb6.M0(2131751512, null);
                                    alertDialog$Builder2.a.U = jb6.M0(2131751513, null);
                                    alertDialog$Builder2.j(jb6.M0(2131751535, null), new nj6(ak6Var));
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                    ak6Var.showDialog(alertDialog$Builder2.a);
                                    break;
                                }
                            } else {
                                int i25 = ak6Var.V;
                                if (i >= i25 && i < ak6Var.W) {
                                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ak6Var.n0.get(i - i25);
                                    if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                        ak6Var.getMessagesController().c4((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                                    }
                                    ak6 ak6Var2 = new ak6(ak6Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                                    ak6Var2.m0(ak6Var.d, null);
                                    ak6Var.presentFragment(ak6Var2);
                                    break;
                                }
                            }
                        } else {
                            xs5 xs5Var = new xs5(context2, (TLRPC.TL_chatInviteExported) ak6Var.k0.get(i - i24), ak6Var.d, hashMap, ak6Var, ak6Var.n, false, ak6Var.h);
                            ak6Var.m0 = xs5Var;
                            xs5Var.show();
                            break;
                        }
                    } else {
                        xs5 xs5Var2 = new xs5(context2, (TLRPC.TL_chatInviteExported) ak6Var.j0.get(i - i23), ak6Var.d, hashMap, ak6Var, ak6Var.n, false, ak6Var.h);
                        ak6Var.m0 = xs5Var2;
                        xs5Var2.e2 = ak6Var.q0;
                        xs5Var2.show();
                        break;
                    }
                }
                break;
            case 16:
                a(i, view);
                break;
            case 17:
                ((ep7) this.b).e0((Context) this.c, view, i);
                break;
            case 18:
                b(i, view);
                break;
            case 19:
                ((PrivacySettingsActivity) this.b).C0((Context) this.c, view, i);
                break;
            case 20:
                y39 y39Var = (y39) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList4 = y39Var.S1;
                if (view instanceof m1a) {
                    m1a m1aVar = (m1a) view;
                    if (m1aVar.getBoost().cooldown_until_date > 0) {
                        new c41(y39Var.c, y39Var.J0).G(R.raw.chats_infotip, 5, gm.S2(jb6.G(oo0.b(), "BoostingWaitWarningPlural", new Object[0]))).k(true);
                        break;
                    } else {
                        if (arrayList4.contains(m1aVar.getBoost())) {
                            arrayList4.remove(m1aVar.getBoost());
                        } else {
                            arrayList4.add(m1aVar.getBoost());
                        }
                        m1aVar.c(arrayList4.contains(m1aVar.getBoost()), true);
                        y39Var.Y0(true);
                        y39Var.W1.a(arrayList4, chat2);
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
                e(i, view);
                break;
            default:
                ((UsersSelectActivity) this.b).b0((Context) this.c, view, i);
                break;
        }
    }
}
