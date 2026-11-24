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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements c39 {
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
        uz6 uz6Var = (uz6) this.b;
        rz6 rz6Var = (rz6) this.c;
        if (i == 0) {
            uz6Var.getClass();
            return;
        }
        kz6 adapter = uz6Var.getAdapter();
        if (adapter.x0 == null || adapter.i0) {
            int i2 = i - 1;
            Object J = uz6Var.getAdapter().J(i2);
            int i3 = uz6Var.getAdapter().Y;
            int i4 = uz6Var.getAdapter().Z;
            if (uz6Var.getAdapter().G != null && i2 == 1) {
                TLRPC.Chat chat = uz6Var.getAdapter().m0;
                if (chat == null && uz6Var.getAdapter().H0 != null) {
                    chat = uz6Var.getAdapter().H0.e;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(uz6Var.getAdapter().G);
                if (chat != null) {
                    str = "@" + hc2.K(chat, false);
                } else {
                    str = "";
                }
                rz6Var.k(i3, i4, b00.j(sb, str, " "), false);
                return;
            }
            if (uz6Var.getAdapter().G != null && i2 == 0) {
                rz6Var.k(i3, i4, b00.j(new StringBuilder(), uz6Var.getAdapter().G, " "), false);
                return;
            }
            if (J instanceof TLRPC.TL_document) {
                if (view instanceof uya) {
                    ((uya) view).getSendAnimationData();
                }
                TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                rz6Var.h(tL_document, k27.U(tL_document), uz6Var.getAdapter().L(i2));
            } else if (J instanceof TLRPC.Chat) {
                String K = hc2.K((TLRPC.Chat) J, false);
                if (K != null) {
                    rz6Var.k(i3, i4, tb4.y("@", K, " "), false);
                }
            } else if (J instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) J;
                if (l7c.p(user) != null) {
                    rz6Var.k(i3, i4, "@" + l7c.p(user) + " ", false);
                } else {
                    SpannableString spannableString = new SpannableString(tb4.o(l7c.k(user, false), " "));
                    spannableString.setSpan(new j4c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                    rz6Var.k(i3, i4, spannableString, false);
                }
            } else if (J instanceof String) {
                rz6Var.k(i3, i4, J + " ", false);
            } else if (J instanceof dq6) {
                String str2 = ((dq6) J).a;
                rz6Var.m(str2);
                if (str2 != null) {
                    try {
                    } catch (Exception unused) {
                        rz6Var.k(i3, i4, str2, true);
                    }
                    if (str2.startsWith("animated_")) {
                        try {
                            fontMetricsInt = rz6Var.d();
                        } catch (Exception e) {
                            fa4.g(e, false);
                            fontMetricsInt = null;
                        }
                        long parseLong = Long.parseLong(str2.substring(9));
                        TLRPC.Document e2 = vl.e(y6c.t0, parseLong);
                        SpannableString spannableString2 = new SpannableString(k27.U(e2));
                        spannableString2.setSpan(e2 != null ? new gm(e2, fontMetricsInt) : new gm(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                        rz6Var.k(i3, i4, spannableString2, false);
                        uz6Var.o(false);
                    }
                }
                rz6Var.k(i3, i4, str2, true);
                uz6Var.o(false);
            }
            if (J instanceof TLRPC.BotInlineResult) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                    rz6Var.c(botInlineResult, true, 0);
                    return;
                }
                ArrayList arrayList = new ArrayList(uz6Var.getAdapter().S);
                uz6Var.Q = arrayList;
                PhotoViewer.r0().T1(null, uz6Var.h, uz6Var.a);
                PhotoViewer.r0().o1(arrayList, uz6Var.getAdapter().M(i2), 3, false, uz6Var.R, null);
            }
        }
    }

    private final void b(int i, View view) {
        gf8 gf8Var = (gf8) this.b;
        Context context = (Context) this.c;
        HashSet hashSet = gf8Var.u1;
        cf8 cf8Var = gf8Var.m1;
        if (gl.C1(context)) {
            ArrayList arrayList = gf8Var.z1;
            if (arrayList == null || arrayList.isEmpty()) {
                int i2 = 0;
                if (view instanceof wgb) {
                    int S = cf8Var.S(i) - 1;
                    int Q = cf8Var.Q(i) - 1;
                    if (Q <= 0 || S < 0) {
                        return;
                    }
                    ff8 ff8Var = (ff8) gf8Var.w1.get(S);
                    if (Q != ff8Var.b() || hashSet.contains(ff8Var)) {
                        return;
                    }
                    if (ff8Var.e && ff8Var.f < ff8Var.b.size()) {
                        int min = Math.min(ff8Var.f + 50, ff8Var.b.size());
                        ff8Var.f = min;
                        if (min == ff8Var.b.size()) {
                            ff8Var.e = false;
                        }
                        gf8Var.D0(null);
                        cf8Var.X(true);
                        return;
                    }
                    hashSet.add(ff8Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = gf8Var.t1;
                    tL_messages_getPollVotes.id = gf8Var.r1.e1();
                    tL_messages_getPollVotes.limit = 50;
                    int i3 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = ff8Var.d;
                    tL_messages_getPollVotes.flags = i3 | 3;
                    tL_messages_getPollVotes.offset = ff8Var.c;
                    ConnectionsManager.getInstance(gf8Var.a).sendRequest(tL_messages_getPollVotes, new hj7(gf8Var, ff8Var, (byte) 7));
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
                    gf8Var.dismiss();
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        if (S2 instanceof mu1) {
                            if (pollVotesAlert$UserCell.h != null) {
                                TLRPC.User h = ((mu1) S2).h();
                                gf8Var.l1.getChildAt(0);
                                if (h != null && h.id == pollVotesAlert$UserCell.h.id) {
                                    i2 = 1;
                                }
                                profileActivity.x3(i2);
                            } else {
                                TLRPC.Chat chat = ((mu1) S2).e;
                                if (chat != null && chat.id == pollVotesAlert$UserCell.n.id) {
                                    i2 = 1;
                                }
                                profileActivity.x3(i2);
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
        g0a g0aVar = (g0a) this.b;
        m8b m8bVar = (m8b) this.c;
        d dVar = m8bVar.f;
        c0a c0aVar = g0aVar.x;
        oz9 oz9Var = g0aVar.r;
        if (i < 0 || i >= c0aVar.c.size()) {
            return;
        }
        yz9 yz9Var = (yz9) c0aVar.c.get(i);
        TL_stories.StoryView storyView = yz9Var.b;
        TL_stories.StoryReaction storyReaction = yz9Var.c;
        if (storyView instanceof TL_stories.TL_storyView) {
            m8bVar.L(ProfileActivity.P2(storyView.user_id));
            return;
        }
        if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
            dVar.createOverlayStoryViewer().J(g0aVar.getContext(), ((TL_stories.TL_storyViewPublicRepost) yz9Var.b).story, p2b.a(oz9Var));
            return;
        }
        if (storyReaction instanceof TL_stories.TL_storyReaction) {
            m8bVar.L(ProfileActivity.P2(cf3.n(storyReaction.peer_id)));
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
            long n = cf3.n(message.peer_id);
            if (n >= 0) {
                bundle.putLong("user_id", n);
            } else {
                bundle.putLong("chat_id", -n);
            }
            bundle.putInt("message_id", message.id);
            m8bVar.L(new mu1(bundle));
            return;
        }
        ArrayList arrayList = new ArrayList();
        f0a f0aVar = g0aVar.F;
        int i2 = 0;
        int i3 = -1;
        if (f0aVar != null) {
            int size = f0aVar.i.size();
            while (i2 < g0aVar.F.i.size()) {
                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) g0aVar.F.i.get(i2);
                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                    storyItem.dialogId = cf3.n(tL_storyReactionPublicRepost.peer_id);
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
            g0aVar.H = null;
            dVar.createOverlayStoryViewer().J(g0aVar.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, p2b.a(oz9Var));
            return;
        }
        g0aVar.H = new a2b(g0aVar.w, arrayList);
        g0aVar.I = i2;
        f0a f0aVar2 = g0aVar.F;
        m8b createOverlayStoryViewer = dVar.createOverlayStoryViewer();
        Context context = g0aVar.getContext();
        a2b a2bVar = g0aVar.H;
        p2b a = p2b.a(oz9Var);
        a.e = new wh9(f0aVar2, (byte) 13);
        createOverlayStoryViewer.G(context, i3, a2bVar, a);
    }

    private final void e(int i, View view) {
        lwb lwbVar = (lwb) this.b;
        or1 or1Var = (or1) this.c;
        EditText editText = lwbVar.w;
        long a = ((hwb) lwbVar.s.c.get(i)).a();
        mu1 mu1Var = or1Var.a;
        if (mu1Var.U7()) {
            mu1Var.oa(a);
        } else {
            kxb kxbVar = mu1Var.g2;
            if (kxbVar != null) {
                kxbVar.k(a, false);
            }
        }
        boolean h = lwbVar.h();
        lwbVar.V = 0L;
        lwbVar.W = null;
        if (editText.length() > 0) {
            editText.setText("");
        } else if (h) {
            lwbVar.l(false);
            lwbVar.n();
        }
        editText.clearFocus();
        lwbVar.d();
    }

    private final void f(int i, View view) {
        c0c c0cVar = (c0c) this.b;
        wjb wjbVar = (wjb) this.c;
        c4c G = c0cVar.e2.G(i - 1);
        if (G != null) {
            int i2 = G.d;
            if (i2 == 1) {
                CharSequence charSequence = c0cVar.X1;
                if (charSequence == null || c0cVar.W1) {
                    return;
                }
                gl.g(charSequence);
                return;
            }
            if (i2 == 2) {
                if (y6c.h(c0cVar.a).p()) {
                    na7.q1(c0cVar.a).i4.K(0L, !r4.A(0L));
                    c0cVar.dismiss();
                } else if (LaunchActivity.S() != null) {
                    new jh8(13, wjbVar, c0cVar.getContext()).show();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07f1  */
    @Override // c39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, View view) {
        lv6 lv6Var;
        c4c G;
        int i2;
        Object O;
        nu2 nu2Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3;
        int i4;
        int size;
        vd2 vd2Var;
        cib cibVar;
        byte b = 12;
        String str6 = null;
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.b;
                wjb wjbVar = (wjb) this.c;
                c4c G2 = r0Var.i2.G(i - 1);
                if (G2 != null && G2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, r0Var.getContext());
                    alertDialog$Builder.a.S = k96.M0(2131754998, null);
                    alertDialog$Builder.a.U = k96.M0(2131754997, null);
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    alertDialog$Builder.j(k96.M0(2131751586, null), new l0(r0Var, (byte) 0));
                    alertDialog$Builder.c(-1);
                    alertDialog$Builder.o();
                    break;
                }
                break;
            case 1:
                ao0 ao0Var = (ao0) this.b;
                d dVar = (d) this.c;
                ArrayList arrayList = ao0Var.Y1;
                if (view instanceof scb) {
                    scb scbVar = (scb) view;
                    int type = scbVar.getType();
                    boolean z = scbVar.e.h;
                    boolean z2 = !z;
                    scbVar.setChecked(z2);
                    int i5 = scb.M;
                    if (type == 0) {
                        ao0Var.s2 = z2;
                        ao0Var.f1(false, false);
                    } else if (type == 1) {
                        scbVar.setDivider(z2);
                        ao0Var.r2 = z2;
                        ao0Var.f1(false, false);
                        km0 km0Var = ao0Var.b2;
                        int i6 = 0;
                        while (true) {
                            if (i6 < km0Var.e.size()) {
                                jm0 jm0Var = (jm0) km0Var.e.get(i6);
                                if (jm0Var.a == 15) {
                                    byte b2 = jm0Var.l;
                                    int i7 = scb.M;
                                    if (b2 == 1) {
                                        int i8 = i6 + 1;
                                        if (z) {
                                            km0Var.r(i8);
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
                            gl.r(rn0Var);
                        } else {
                            gl.d3(rn0Var, 250L);
                        }
                    }
                }
                if (view instanceof gf0) {
                    if (view instanceof pn0) {
                        int selectedType = ((pn0) view).getSelectedType();
                        int i9 = pn0.w;
                        if (selectedType == 2) {
                            if (ao0Var.c2 == selectedType) {
                                lv6 lv6Var2 = ao0Var.m2;
                                if (lv6Var2 != null) {
                                    ((zy9) lv6Var2.b).c1(1, arrayList);
                                    ((dn0) lv6Var2.c).l1.E(1);
                                    break;
                                }
                            }
                        } else if (selectedType != 3) {
                            if (selectedType == 1) {
                                lv6 lv6Var3 = ao0Var.m2;
                                if (lv6Var3 != null) {
                                    ((zy9) lv6Var3.b).c1(1, arrayList);
                                    ((dn0) lv6Var3.c).l1.E(1);
                                }
                            } else {
                                ao0Var.d2 = selectedType;
                                ao0Var.f1(true, true);
                                ao0Var.e1(true);
                                ao0Var.W0();
                            }
                        }
                        ao0Var.c2 = selectedType;
                        ao0Var.f1(true, true);
                        ao0Var.e1(true);
                        ao0Var.W0();
                    } else {
                        gf0 gf0Var = (gf0) view;
                        o39 o39Var = ao0Var.n1;
                        if (gf0Var.b()) {
                            for (int i10 = 0; i10 < o39Var.getChildCount(); i10++) {
                                View childAt = o39Var.getChildAt(i10);
                                if (childAt.getClass().isInstance(gf0Var)) {
                                    ((gf0) childAt).c(childAt == gf0Var, true);
                                }
                            }
                        }
                    }
                }
                if (view instanceof dv7) {
                    int selectedType2 = ((dv7) view).getSelectedType();
                    if (ao0Var.e2 == selectedType2 && (lv6Var = ao0Var.m2) != null) {
                        ((zy9) lv6Var.b).c1(3, ao0Var.Z1);
                        ((dn0) lv6Var.c).l1.E(1);
                    }
                    ao0Var.e2 = selectedType2;
                    ao0Var.f1(false, false);
                    break;
                } else if (view instanceof kr3) {
                    ao0Var.g2 = ((TLRPC.TL_premiumGiftCodeOption) ((kr3) view).getGifCode()).months;
                    ao0Var.f1(false, false);
                    ao0Var.b2.G();
                    break;
                } else if (view instanceof l83) {
                    Context context = dVar.getContext();
                    long j = ao0Var.h2;
                    sn0 sn0Var = new sn0(ao0Var);
                    wjb wjbVar2 = ao0Var.J0;
                    fj fjVar = new fj(wjbVar2);
                    int i11 = fjVar.b;
                    i4d i4dVar = new i4d(context, wjbVar2);
                    ((fx0) i4dVar.a).w0 = false;
                    hn7 hn7Var = new hn7(context, wjbVar2);
                    int i12 = fjVar.a;
                    hn7Var.setTextColor(i12);
                    hn7Var.setTextOffset(gl.L(10.0f));
                    hn7Var.setItemCount(5);
                    wm0 wm0Var = new wm0(context, wjbVar2);
                    wm0Var.setWrapSelectorWheel(true);
                    wm0Var.setAllItemsCount(24);
                    wm0Var.setItemCount(5);
                    wm0Var.setTextColor(i12);
                    wm0Var.setTextOffset(-gl.L(10.0f));
                    wm0Var.setTag("HOUR");
                    xm0 xm0Var = new xm0(context, wjbVar2);
                    xm0Var.setWrapSelectorWheel(true);
                    xm0Var.setAllItemsCount(60);
                    xm0Var.setItemCount(5);
                    xm0Var.setTextColor(i12);
                    xm0Var.setTextOffset(-gl.L(34.0f));
                    ji jiVar = new ji(context, fjVar, hn7Var, wm0Var, xm0Var);
                    jiVar.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(context);
                    jiVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context);
                    textView.setText(k96.M0(2131753284, "BoostingSelectDateTime"));
                    textView.setTextColor(i12);
                    ir2.t(textView, 1, 20.0f);
                    frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new p8((byte) 17));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    jiVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                    long currentTimeMillis = System.currentTimeMillis();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(currentTimeMillis);
                    int i13 = calendar.get(1);
                    wb wbVar = new wb(context, (byte) 12);
                    long f = na7.q1(y6c.t0).k4.y0.f() * 1000;
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(f);
                    int i14 = calendar2.get(6);
                    calendar2.setTimeInMillis(System.currentTimeMillis());
                    calendar2.add(14, (int) f);
                    int i15 = calendar2.get(11);
                    int i16 = calendar.get(12);
                    linearLayout.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
                    hn7Var.setMinValue(0);
                    hn7Var.setMaxValue(i14 - 1);
                    hn7Var.setWrapSelectorWheel(false);
                    hn7Var.setTag("DAY");
                    hn7Var.setFormatter(new om0(currentTimeMillis, calendar, i13, (byte) 0));
                    pm0 pm0Var = new pm0(jiVar, wm0Var, xm0Var, i15, i16, hn7Var);
                    hn7Var.setOnValueChangedListener(pm0Var);
                    wm0Var.setMinValue(0);
                    wm0Var.setMaxValue(23);
                    linearLayout.addView(wm0Var, nme.l(0.2f, 0, kk7.s4));
                    wm0Var.setFormatter(new wz((byte) 28));
                    wm0Var.setOnValueChangedListener(pm0Var);
                    xm0Var.setMinValue(0);
                    xm0Var.setMaxValue(11);
                    xm0Var.setValue(0);
                    xm0Var.setFormatter(new wz((byte) 29));
                    linearLayout.addView(xm0Var, nme.l(0.3f, 0, kk7.s4));
                    xm0Var.setOnValueChangedListener(pm0Var);
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
                        hn7Var.setValue(timeInMillis);
                        hn7Var.getValue();
                        pm0Var.i(hn7Var, hn7Var.getValue());
                        wm0Var.getValue();
                        pm0Var.i(wm0Var, wm0Var.getValue());
                    }
                    wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                    wbVar.setGravity(17);
                    wbVar.setTextColor(fjVar.g);
                    wbVar.setTextSize(1, 14.0f);
                    wbVar.setTypeface(gl.o());
                    wbVar.setBackground(sjb.e(fjVar.h, 8.0f));
                    wbVar.setText(k96.M0(2131753540, "BoostingConfirm"));
                    jiVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
                    wbVar.setOnClickListener(new ff(calendar, hn7Var, wm0Var, xm0Var, sn0Var, i4dVar));
                    fx0 fx0Var = (fx0) i4dVar.a;
                    fx0Var.O = jiVar;
                    fx0Var.show();
                    fx0Var.s0(i11);
                    fx0Var.L(i11);
                    gl.l3(fx0Var, bm2.h(i11) > 0.699999988079071d);
                    break;
                } else if (view instanceof na) {
                    lv6 lv6Var4 = ao0Var.m2;
                    if (lv6Var4 != null) {
                        ((zy9) lv6Var4.b).c1(2, ao0Var.X1);
                        ((dn0) lv6Var4.c).l1.E(1);
                        break;
                    }
                } else if (view instanceof zqa) {
                    TL_stars.TL_starsGiveawayOption option = ((zqa) view).getOption();
                    if (option != null) {
                        ao0Var.k2 = option.stars;
                        ao0Var.f1(true, true);
                        ao0Var.e1(true);
                        ao0Var.W0();
                        break;
                    }
                } else if (view instanceof tua) {
                    ao0Var.f2 = true;
                    ao0Var.f1(true, true);
                    break;
                }
                break;
            case 2:
                ((lo0) this.b).D0((Context) this.c, view, i);
                break;
            case 3:
                jr0 jr0Var = (jr0) this.b;
                be2 be2Var = (be2) this.c;
                l5c l5cVar = jr0Var.U1;
                if (l5cVar != null && (G = l5cVar.G(i - 1)) != null) {
                    Object obj = G.H;
                    if (obj instanceof u0c) {
                        be2Var.a(((u0c) obj).a);
                        jr0Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                ((eg1) this.b).D0((Context) this.c, i);
                break;
            case 5:
                ((nh1) this.b).V0((TLRPC.ChatFull) this.c, view, i);
                break;
            case 6:
                ah1 ah1Var = (ah1) this.b;
                eh1 eh1Var = (eh1) this.c;
                nh1 nh1Var = ah1Var.c;
                int i17 = eh1Var.d;
                rkb rkbVar = eh1Var.b;
                ea7 ea7Var = na7.q1(i17).E3;
                if (ea7Var != null) {
                    ArrayList arrayList2 = ea7Var.c;
                    if (i >= 0 && i < arrayList2.size()) {
                        i2 = ((da7) arrayList2.get(i)).c;
                        nh1Var.f = i2;
                        nh1Var.d1(true);
                        nh1Var.g1(true);
                        nh1Var.h1();
                        if (view.getLeft() >= gl.L(24.0f) + rkbVar.getPaddingLeft()) {
                            rkbVar.x0(-((gl.L(48.0f) + rkbVar.getPaddingLeft()) - view.getLeft()), 0, null);
                            break;
                        } else if (view.getWidth() + view.getLeft() > (rkbVar.getMeasuredWidth() - rkbVar.getPaddingRight()) - gl.L(24.0f)) {
                            rkbVar.x0(de9.f(48.0f, rkbVar.getMeasuredWidth() - rkbVar.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                            break;
                        }
                    }
                }
                i2 = 0;
                nh1Var.f = i2;
                nh1Var.d1(true);
                nh1Var.g1(true);
                nh1Var.h1();
                if (view.getLeft() >= gl.L(24.0f) + rkbVar.getPaddingLeft()) {
                }
                break;
            case 7:
                mu1 mu1Var = (mu1) this.b;
                TLObject tLObject = (TLObject) ((t37) this.c).c.get(i);
                if (tLObject != null) {
                    mu1Var.G5(true);
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    mu1Var.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 8:
                x02 x02Var = (x02) this.b;
                wjb wjbVar3 = (wjb) this.c;
                xz1 xz1Var = x02Var.v3;
                p02[] p02VarArr = x02Var.t2;
                d dVar2 = x02Var.Z1;
                d Q = dVar2 == null ? LaunchActivity.Q() : dVar2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof r02) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (x02Var.I3 || x02Var.J3 || !x02Var.F0()) {
                                if (!x02Var.I3 && !x02Var.J3) {
                                    f72 f72Var = new f72(1, x02Var, wjbVar3, x02Var.getContext());
                                    x02Var.N1 = f72Var;
                                    x02Var.A1(f72Var);
                                }
                                x02Var.A1(x02Var.d2);
                            }
                        } else if (intValue == 17) {
                            if (x02Var.q2 == null && (dVar2 instanceof mu1)) {
                                TLRPC.User h = ((mu1) dVar2).h();
                                if (x02.b1(h)) {
                                    r32 r32Var = new r32(x02Var, x02Var.getContext(), x02Var.G3, h, wjbVar3);
                                    x02Var.q2 = r32Var;
                                    p02VarArr[11] = r32Var;
                                }
                            }
                            r32 r32Var2 = x02Var.q2;
                            if (r32Var2 != null) {
                                x02Var.A1(r32Var2);
                            }
                        } else if (intValue == 3) {
                            if (x02Var.K3 || !x02Var.F0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    gl.W(x02Var.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                x02Var.k1(true);
                            }
                        } else if (intValue == 4) {
                            if (x02Var.H3 || !x02Var.F0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    gl.W(x02Var.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                x02Var.m1(true);
                            }
                        } else if (intValue == 5) {
                            if (x02Var.N3 || !x02Var.F0()) {
                                if (x02Var.N3 && x02Var.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                    gl.W(x02Var.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                    break;
                                } else {
                                    x02Var.l1();
                                }
                            }
                        } else if (intValue == 6) {
                            if ((x02Var.N3 || !x02Var.F0()) && gl.H1(dVar2)) {
                                if (x02Var.N3) {
                                    if (x02Var.i2 == null) {
                                        c42 c42Var = new c42(x02Var, x02Var.getContext(), wjbVar3, (x02Var.B1 || x02Var.O3) ? false : true);
                                        x02Var.i2 = c42Var;
                                        p02VarArr[5] = c42Var;
                                        b42 b42Var = x02Var.t4;
                                        if (b42Var != null) {
                                            c42Var.setDelegate(b42Var);
                                        } else {
                                            c42Var.setDelegate(new fz1(x02Var, b));
                                        }
                                    }
                                    x02Var.A1(x02Var.i2);
                                } else {
                                    f72 f72Var2 = new f72(6, x02Var, wjbVar3, x02Var.getContext());
                                    x02Var.N1 = f72Var2;
                                    x02Var.A1(f72Var2);
                                }
                            }
                        } else if (intValue == 9) {
                            if (x02Var.L3 || !x02Var.F0()) {
                                if (x02Var.L3) {
                                    x02Var.C1(true, null);
                                } else {
                                    f72 f72Var3 = new f72(9, x02Var, wjbVar3, x02Var.getContext());
                                    x02Var.N1 = f72Var3;
                                    x02Var.A1(f72Var3);
                                }
                            }
                        } else if (intValue == 11) {
                            if (x02Var.m2 == null) {
                                p62 p62Var = new p62(x02Var, x02Var.J0, x02Var.getContext());
                                x02Var.m2 = p62Var;
                                p02VarArr[7] = p62Var;
                                p62Var.setupBlurredSearchField(x02Var.E4);
                            }
                            x02Var.A1(x02Var.m2);
                        } else if (intValue == 12) {
                            if (x02Var.M3 || !x02Var.F0()) {
                                if (x02Var.M3) {
                                    if (x02Var.h2 == null) {
                                        k62 k62Var = new k62(x02Var, x02Var.getContext(), true, wjbVar3, null);
                                        x02Var.h2 = k62Var;
                                        p02VarArr[1] = k62Var;
                                        k62Var.setDelegate(new fz1(x02Var, (byte) 13));
                                    }
                                    x02Var.A1(x02Var.h2);
                                } else {
                                    f72 f72Var4 = new f72(9, x02Var, wjbVar3, x02Var.getContext());
                                    x02Var.N1 = f72Var4;
                                    x02Var.A1(f72Var4);
                                }
                            }
                        } else if (intValue == 13) {
                            if (x02Var.o2 == null) {
                                e32 e32Var = new e32(x02Var, x02Var.getContext(), wjbVar3, true);
                                x02Var.o2 = e32Var;
                                p02VarArr[8] = e32Var;
                                e32Var.setDelegate(x02Var.X3);
                            }
                            x02Var.A1(x02Var.o2);
                        } else if (intValue == 14) {
                            if (x02Var.n2 == null) {
                                e32 e32Var2 = new e32(x02Var, x02Var.getContext(), wjbVar3, false);
                                x02Var.n2 = e32Var2;
                                p02VarArr[9] = e32Var2;
                                e32Var2.setDelegate(x02Var.X3);
                            }
                            x02Var.A1(x02Var.n2);
                        } else if (intValue == 16) {
                            e72 e72Var = x02Var.p2;
                            if (e72Var == null) {
                                e72Var = new e72(x02Var.G3, x02Var, wjbVar3, x02Var.getContext());
                                x02Var.p2 = e72Var;
                                p02VarArr[10] = e72Var;
                            }
                            x02Var.A1(e72Var);
                        } else if (view.getTag() instanceof Integer) {
                            x02Var.W3.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, x02Var.a1(), false, 0L);
                        }
                    } else if (view instanceof q02) {
                        q02 q02Var = (q02) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = q02Var.c;
                        if (tL_attachMenuBot == null) {
                            x02Var.W3.g1(q02Var.b);
                            x02Var.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            psc.a(x02Var.getContext(), new pz1((Object) x02Var, (Object) q02Var, (byte) 0), null);
                        } else {
                            x02Var.x1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = gl.L(70.0f);
                    int i18 = left - L;
                    if (i18 < 0) {
                        xz1Var.x0(i18, 0, null);
                        break;
                    } else {
                        int i19 = right + L;
                        if (i19 > xz1Var.getMeasuredWidth()) {
                            xz1Var.x0(i19 - xz1Var.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                k22 k22Var = (k22) this.b;
                wjb wjbVar4 = (wjb) this.c;
                e22 e22Var = k22Var.F;
                w39 adapter = k22Var.s.getAdapter();
                g22 g22Var = k22Var.G;
                if (adapter == g22Var) {
                    O = g22Var.E(i);
                } else {
                    int S = e22Var.S(i);
                    int Q2 = e22Var.Q(i);
                    if (Q2 >= 0 && S >= 0) {
                        O = e22Var.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (k22Var.x.isEmpty()) {
                        if (O instanceof nu2) {
                            nu2 nu2Var2 = (nu2) O;
                            TLRPC.User user = nu2Var2.m;
                            if (user != null) {
                                str3 = user.first_name;
                                str4 = user.last_name;
                            } else {
                                str3 = nu2Var2.i;
                                str4 = nu2Var2.j;
                            }
                            nu2Var = nu2Var2;
                            str2 = str4;
                            str = str3;
                        } else {
                            TLRPC.User user2 = (TLRPC.User) O;
                            nu2 nu2Var3 = new nu2();
                            String str7 = user2.first_name;
                            nu2Var3.i = str7;
                            String str8 = user2.last_name;
                            nu2Var3.j = str8;
                            nu2Var3.e.add(user2.phone);
                            nu2Var3.m = user2;
                            nu2Var = nu2Var3;
                            str = str7;
                            str2 = str8;
                        }
                        b48 b48Var = new b48(k22Var.b.Z1, nu2Var, null, null, null, null, str, str2, wjbVar4);
                        b48Var.E1 = new w12(k22Var);
                        b48Var.show();
                        break;
                    } else {
                        k22Var.Q((j22) view, O);
                        break;
                    }
                }
                break;
            case 10:
                ((zc2) this.b).i0((Context) this.c, view, i);
                break;
            case 11:
                hc3 hc3Var = (hc3) this.b;
                d dVar3 = (d) this.c;
                wd2 wd2Var = (wd2) hc3Var.c.d.get(i);
                akb i20 = wd2Var.a.i(hc3Var.r);
                elb elbVar = wd2Var.a.c;
                if (elbVar == null) {
                    str5 = null;
                } else {
                    str5 = elbVar.b;
                    if (str5 == null) {
                        str5 = elbVar.a;
                    }
                }
                if (!str5.equals("🏠")) {
                    elb elbVar2 = wd2Var.a.c;
                    if (elbVar2 != null && (str6 = elbVar2.b) == null) {
                        str6 = elbVar2.a;
                    }
                    if (!str6.equals("🎨")) {
                        i3 = -1;
                        if (i20 == null) {
                            TLRPC.TL_theme tL_theme = ((iy3) wd2Var.a.f.get(hc3Var.r)).b;
                            akb O0 = bkb.O0(bkb.q0(tL_theme.settings.get(((iy3) wd2Var.a.f.get(hc3Var.r)).d)));
                            if (O0 != null) {
                                zjb zjbVar = (zjb) O0.d0.get(tL_theme.id);
                                if (zjbVar == null) {
                                    zjbVar = O0.d(tL_theme, dVar3.getCurrentAccount(), 0);
                                }
                                i3 = zjbVar.a;
                                O0.u(i3);
                            }
                            i20 = O0;
                        }
                        bkb.I1(i20, false, i3, view);
                        hc3Var.h = i;
                        i4 = 0;
                        while (true) {
                            size = hc3Var.c.d.size();
                            vd2Var = hc3Var.c;
                            if (i4 < size) {
                                vd2Var.E(hc3Var.h);
                                for (int i21 = 0; i21 < hc3Var.a.getChildCount(); i21++) {
                                    anb anbVar = (anb) hc3Var.a.getChildAt(i21);
                                    if (anbVar != view && (cibVar = anbVar.K) != null) {
                                        gl.r(cibVar);
                                        anbVar.K.run();
                                    }
                                }
                                ((anb) view).d();
                                if (i20 != null) {
                                    SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
                                    edit.putString((hc3Var.n == 1 || i20.o()) ? "lastDarkTheme" : "lastDayTheme", i20.k());
                                    edit.commit();
                                }
                                bkb.K1(dVar3);
                                break;
                            } else {
                                ((wd2) vd2Var.d.get(i4)).d = i4 == hc3Var.h;
                                i4++;
                            }
                        }
                    }
                }
                i3 = ((iy3) wd2Var.a.f.get(hc3Var.r)).e;
                if (i20 == null) {
                }
                bkb.I1(i20, false, i3, view);
                hc3Var.h = i;
                i4 = 0;
                while (true) {
                    size = hc3Var.c.d.size();
                    vd2Var = hc3Var.c;
                    if (i4 < size) {
                    }
                    ((wd2) vd2Var.d.get(i4)).d = i4 == hc3Var.h;
                    i4++;
                }
                break;
            case 12:
                ((zt3) this.b).c0((Context) this.c, i);
                break;
            case 13:
                ((qa5) this.b).o0((Context) this.c, view, i);
                break;
            case 14:
                xt5 xt5Var = (xt5) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                tt5 tt5Var = xt5Var.p1;
                ArrayList arrayList3 = xt5Var.s1;
                if (!xt5Var.A1 && arrayList3.get(i) != xt5Var.w1) {
                    xt5Var.w1 = (TLRPC.Peer) arrayList3.get(i);
                    boolean z4 = view instanceof za5;
                    if (z4) {
                        ((za5) view).c(true, true);
                    } else if (view instanceof waa) {
                        ((waa) view).b(true, true);
                        view.invalidate();
                    }
                    int childCount = tt5Var.getChildCount();
                    for (int i22 = 0; i22 < childCount; i22++) {
                        View childAt2 = tt5Var.getChildAt(i22);
                        if (childAt2 != view) {
                            if (z4) {
                                ((za5) childAt2).c(false, true);
                            } else if (view instanceof waa) {
                                ((waa) childAt2).b(false, true);
                            }
                        }
                    }
                    if (xt5Var.v1 != 0) {
                        xt5Var.G0(chat, true);
                        break;
                    }
                }
                break;
            case 15:
                yh6 yh6Var = (yh6) this.b;
                Context context2 = (Context) this.c;
                HashMap hashMap = yh6Var.l0;
                if (i == yh6Var.R) {
                    TLRPC.User user3 = (TLRPC.User) hashMap.get(Long.valueOf(yh6Var.e.admin_id));
                    if (user3 != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user3.id);
                        na7.q1(y6c.t0).a4(user3, false, false);
                        yh6Var.presentFragment(new ProfileActivity(bundle2, null));
                        break;
                    }
                } else if (i == yh6Var.y) {
                    s36 s36Var = new s36(0, yh6Var.n);
                    s36Var.T = yh6Var.t0;
                    yh6Var.presentFragment(s36Var);
                    break;
                } else {
                    int i23 = yh6Var.E;
                    if (i < i23 || i >= yh6Var.F) {
                        int i24 = yh6Var.I;
                        if (i < i24 || i >= yh6Var.J) {
                            if (i == yh6Var.O) {
                                if (!yh6Var.d0) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yh6Var.getParentActivity());
                                    alertDialog$Builder2.a.S = k96.M0(2131751563, null);
                                    alertDialog$Builder2.a.U = k96.M0(2131751564, null);
                                    alertDialog$Builder2.j(k96.M0(2131751586, null), new kh6(yh6Var));
                                    alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                    yh6Var.showDialog(alertDialog$Builder2.a);
                                    break;
                                }
                            } else {
                                int i25 = yh6Var.V;
                                if (i >= i25 && i < yh6Var.W) {
                                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) yh6Var.n0.get(i - i25);
                                    if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                        yh6Var.getMessagesController().a4((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                                    }
                                    yh6 yh6Var2 = new yh6(yh6Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                                    yh6Var2.l0(yh6Var.d, null);
                                    yh6Var.presentFragment(yh6Var2);
                                    break;
                                }
                            }
                        } else {
                            zq5 zq5Var = new zq5(context2, (TLRPC.TL_chatInviteExported) yh6Var.k0.get(i - i24), yh6Var.d, hashMap, yh6Var, yh6Var.n, false, yh6Var.h);
                            yh6Var.m0 = zq5Var;
                            zq5Var.show();
                            break;
                        }
                    } else {
                        zq5 zq5Var2 = new zq5(context2, (TLRPC.TL_chatInviteExported) yh6Var.j0.get(i - i23), yh6Var.d, hashMap, yh6Var, yh6Var.n, false, yh6Var.h);
                        yh6Var.m0 = zq5Var2;
                        zq5Var2.e2 = yh6Var.q0;
                        zq5Var2.show();
                        break;
                    }
                }
                break;
            case 16:
                a(i, view);
                break;
            case 17:
                ((an7) this.b).d0((Context) this.c, view, i);
                break;
            case 18:
                b(i, view);
                break;
            case 19:
                ((PrivacySettingsActivity) this.b).B0((Context) this.c, view, i);
                break;
            case 20:
                u19 u19Var = (u19) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList4 = u19Var.S1;
                if (view instanceof kz9) {
                    kz9 kz9Var = (kz9) view;
                    if (kz9Var.getBoost().cooldown_until_date > 0) {
                        new u21(u19Var.c, u19Var.J0).G(R.raw.chats_infotip, 5, gl.S2(k96.G(on0.b(), "BoostingWaitWarningPlural", new Object[0]))).k(true);
                        break;
                    } else {
                        if (arrayList4.contains(kz9Var.getBoost())) {
                            arrayList4.remove(kz9Var.getBoost());
                        } else {
                            arrayList4.add(kz9Var.getBoost());
                        }
                        kz9Var.c(arrayList4.contains(kz9Var.getBoost()), true);
                        u19Var.Y0(true);
                        u19Var.W1.a(arrayList4, chat2);
                        break;
                    }
                }
                break;
            case 21:
                c(i, view);
                break;
            case 22:
                e(i, view);
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
