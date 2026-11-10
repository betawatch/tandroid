package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e51 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean A0;
    public r41 B0;
    public di.r6 C0;
    public q41 D;
    public int D0;
    public q41 E;
    public final m4 E0;
    public q41 F;
    public ab.b0 F0;
    public a51 G;
    public PorterDuffColorFilter G0;
    public q41 H;
    public int H0;
    public q41 I;
    public q41 J;
    public q41 K;
    public q41 L;
    public q41 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.jn R;
    public d41 S;
    public v4.b0 T;
    public final h2.j0 U;
    public org.telegram.ui.Components.ch0 V;
    public i41 W;
    public e41 X;
    public d51 Y;
    public lg.f Z;
    public TLRPC.ChatFull a;
    public LinearLayout a0;
    public final long b;
    public final boolean b0;
    public boolean c;
    public final boolean c0;
    public q41 d;
    public final boolean d0;
    public q41 e;
    public long e0;
    public z41 f;
    public long f0;
    public final org.telegram.ui.ActionBar.u1[] g0;
    public q41 h;
    public b41 h0;
    public tb i0;
    public zd j0;
    public View k0;
    public FrameLayout l0;
    public te.a m0;
    public q41 n;
    public final boolean n0;
    public oe0 o0;
    public FrameLayout p0;
    public qh.b[] q0;
    public q41 r;
    public int r0;
    public q41 s;
    public final SparseIntArray s0;
    public final SparseIntArray t0;
    public final ArrayList u0;
    public final ArrayList v0;
    public q41 w;
    public final ArrayList w0;
    public q41 x;
    public final ArrayList x0;
    public q41 y;
    public final ArrayList y0;
    public boolean z0;

    public e51(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = new h2.j0(50, 2);
        this.g0 = new org.telegram.ui.ActionBar.u1[1];
        this.r0 = -1;
        this.s0 = new SparseIntArray();
        this.t0 = new SparseIntArray();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.A0 = true;
        this.E0 = new m4(this, 15);
        long j3 = bundle.getLong("chat_id");
        this.b = j3;
        this.b0 = bundle.getBoolean("is_megagroup", false);
        this.c0 = bundle.getBoolean("start_from_boosts", false);
        this.d0 = bundle.getBoolean("start_from_monetization", false);
        this.n0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().N0(j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v53 */
    public static void Z(final e51 e51Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r15;
        ArrayList arrayList3;
        int i7;
        String str5;
        ArrayList arrayList4;
        String str6;
        ArrayList arrayList5 = e51Var.N;
        ArrayList arrayList6 = e51Var.O;
        ArrayList arrayList7 = e51Var.u0;
        String str7 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final q41[] q41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.id.M0(2131749273, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.id.M0(2131750610, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.id.M0(2131744033, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.id.M0(2131743530, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.id.M0(2131749375, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.id.M0(2131743529, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.id.M0(2131748274, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.id.M0(2131749041, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.id.M0(2131747920, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.id.M0(2131746385, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.id.M0(2131744659, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.id.M0(2131744504, "StoryReactionsByEmotionChartTitle"), 2, false)};
            q41 q41Var = q41VarArr[2];
            if (q41Var != null) {
                q41Var.n = true;
            }
            z41 z41Var = new z41();
            ab.b0 a10 = z41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            z41Var.o = org.telegram.messenger.id.M0(2131746378, "ReactionsPerPost");
            z41Var.p = (String) a10.b;
            z41Var.q = (String) a10.e;
            z41Var.r = ((Boolean) a10.c).booleanValue();
            z41Var.s = ((Boolean) a10.d).booleanValue();
            ab.b0 a11 = z41.a(tL_broadcastStats.reactions_per_story);
            z41Var.t = org.telegram.messenger.id.M0(2131746377, "ReactionsPerStory");
            z41Var.u = (String) a11.b;
            z41Var.v = (String) a11.e;
            z41Var.w = ((Boolean) a11.c).booleanValue();
            z41Var.x = ((Boolean) a11.d).booleanValue();
            ab.b0 a12 = z41.a(tL_broadcastStats.views_per_story);
            z41Var.y = org.telegram.messenger.id.M0(2131743527, "ViewsPerStory");
            z41Var.z = (String) a12.b;
            z41Var.A = (String) a12.e;
            z41Var.B = ((Boolean) a12.c).booleanValue();
            z41Var.C = ((Boolean) a12.d).booleanValue();
            ab.b0 a13 = z41.a(tL_broadcastStats.shares_per_story);
            z41Var.D = org.telegram.messenger.id.M0(2131745397, "SharesPerStory");
            z41Var.E = (String) a13.b;
            z41Var.F = (String) a13.e;
            z41Var.G = ((Boolean) a13.c).booleanValue();
            z41Var.H = ((Boolean) a13.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str8 = "GrowthChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i11 = (int) (d - d2);
            float abs = d2 == 0.0d ? 0.0f : Math.abs((i11 / ((float) d2)) * 100.0f);
            z41Var.a = org.telegram.messenger.id.M0(2131750610, "FollowersChartTitle");
            z41Var.b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs == 0.0f) {
                i7 = i11;
                z41Var.c = "";
            } else {
                int i12 = (int) abs;
                if (abs == i12) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11 > 0 ? str4 : "");
                    sb2.append(org.telegram.messenger.g0.o0(i11, 0));
                    z41Var.c = sb2.toString() + " (" + i12 + "%)";
                    i7 = i11;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i11 > 0 ? str4 : "");
                    sb3.append(org.telegram.messenger.g0.o0(i11, 0));
                    i7 = i11;
                    z41Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            z41Var.d = i7 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d10 = tL_statsAbsValueAndPrev2.current;
            double d11 = tL_statsAbsValueAndPrev2.previous;
            int i13 = (int) (d10 - d11);
            float abs2 = d11 == 0.0d ? 0.0f : Math.abs((i13 / ((float) d11)) * 100.0f);
            z41Var.i = org.telegram.messenger.id.M0(2131745398, "SharesPerPost");
            z41Var.j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i13 == 0 || abs2 == 0.0f) {
                z41Var.k = "";
            } else {
                int i14 = (int) abs2;
                if (abs2 == i14) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i13 > 0 ? str4 : "");
                    sb4.append(org.telegram.messenger.g0.o0(i13, 0));
                    z41Var.k = sb4.toString() + " (" + i14 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i13 > 0 ? str4 : "");
                    sb5.append(org.telegram.messenger.g0.o0(i13, 0));
                    z41Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            z41Var.l = i13 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            float abs3 = d13 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d13)) * 100.0f);
            z41Var.e = org.telegram.messenger.id.M0(2131743528, "ViewsPerPost");
            z41Var.f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i15 == 0 || abs3 == 0.0f) {
                z41Var.g = "";
            } else {
                int i16 = (int) abs3;
                if (abs3 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i15 > 0 ? str4 : "");
                    sb6.append(org.telegram.messenger.g0.o0(i15, 0));
                    z41Var.g = sb6.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i15 > 0 ? str4 : "");
                    sb7.append(org.telegram.messenger.g0.o0(i15, 0));
                    z41Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            z41Var.h = i15 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            z41Var.m = org.telegram.messenger.id.M0(2131751143, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                z41Var.n = com.google.android.recaptcha.internal.a.i(i17, "%");
            } else {
                z41Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            e51Var.f = z41Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            e51Var.e0 = tL_statsDateRangeDays.max_date * 1000;
            e51Var.f0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i20 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i20);
                i20++;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                b51 b51Var = new b51();
                b51Var.a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(b51Var);
                    str5 = str8;
                    str6 = str7;
                    e51Var.s0.put(b51Var.b(), i18);
                    i18++;
                } else {
                    str5 = str8;
                    arrayList4 = arrayList8;
                    str6 = str7;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(b51Var.b()));
                    e51Var.w0.add(b51Var);
                    e51Var.t0.put(b51Var.b(), i19);
                    i19++;
                }
                arrayList10 = arrayList11;
                str8 = str5;
                str7 = str6;
                arrayList8 = arrayList4;
                size = i21;
            }
            str3 = str8;
            ArrayList arrayList12 = arrayList8;
            str2 = str7;
            org.telegram.messenger.g0.h3(new x31(e51Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((b51) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.yr messagesStorage = e51Var.getMessagesStorage();
                long j3 = -e51Var.b;
                int i22 = e51Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.a.c(new org.telegram.messenger.wp(messagesStorage, org.telegram.messenger.a00.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, j3, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            org.telegram.messenger.g0.h3(new Runnable(e51Var) { // from class: org.telegram.ui.y31
                public final /* synthetic */ e51 b;

                {
                    this.b = e51Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (objArr) {
                        case 0:
                            e51 e51Var2 = this.b;
                            e51Var2.getClass();
                            q41[] q41VarArr2 = q41VarArr;
                            e51Var2.r = q41VarArr2[0];
                            e51Var2.h = q41VarArr2[1];
                            e51Var2.e = q41VarArr2[2];
                            e51Var2.n = q41VarArr2[3];
                            e51Var2.d = q41VarArr2[4];
                            e51Var2.s = q41VarArr2[5];
                            e51Var2.w = q41VarArr2[6];
                            e51Var2.x = q41VarArr2[7];
                            e51Var2.y = q41VarArr2[8];
                            e51Var2.D = q41VarArr2[9];
                            e51Var2.E = q41VarArr2[10];
                            e51Var2.F = q41VarArr2[11];
                            e51Var2.j0(q41VarArr2);
                            break;
                        default:
                            e51 e51Var3 = this.b;
                            e51Var3.getClass();
                            q41[] q41VarArr3 = q41VarArr;
                            e51Var3.d = q41VarArr3[0];
                            e51Var3.H = q41VarArr3[1];
                            e51Var3.I = q41VarArr3[2];
                            e51Var3.J = q41VarArr3[3];
                            e51Var3.K = q41VarArr3[4];
                            e51Var3.L = q41VarArr3[5];
                            e51Var3.e = q41VarArr3[6];
                            e51Var3.M = q41VarArr3[7];
                            e51Var3.j0(q41VarArr3);
                            break;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "TopHoursChartTitle";
            str2 = "%";
            str3 = "GrowthChartTitle";
            str4 = "+";
            r15 = 0;
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            q41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.id.M0(2131749375, str3), r15, r15);
            q41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.id.M0(2131749427, "GroupMembersChartTitle"), r15, r15);
            q41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.id.M0(2131748271, "NewMembersBySourceChartTitle"), 2, r15);
            q41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.id.M0(2131748618, "MembersLanguageChartTitle"), 4, true);
            q41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.id.M0(2131748462, "MessagesChartTitle"), 2, r15);
            q41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.id.M0(2131754489, "ActionsChartTitle"), 1, r15);
            q41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.id.M0(2131744033, str), r15, r15);
            q41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.id.M0(2131744034, "TopDaysOfWeekChartTitle"), 4, r15);
            final q41[] q41VarArr2 = new q41[8];
            q41VarArr2[r15] = i02;
            q41VarArr2[1] = i03;
            q41VarArr2[2] = i04;
            q41VarArr2[3] = i05;
            q41VarArr2[4] = i06;
            q41VarArr2[5] = i07;
            q41VarArr2[6] = i08;
            q41VarArr2[7] = i09;
            q41 q41Var2 = q41VarArr2[6];
            if (q41Var2 != null) {
                q41Var2.n = true;
            }
            q41 q41Var3 = q41VarArr2[7];
            if (q41Var3 != null) {
                q41Var3.o = true;
            }
            a51 a51Var = new a51();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d14 = tL_statsAbsValueAndPrev4.current;
            double d15 = tL_statsAbsValueAndPrev4.previous;
            int i23 = (int) (d14 - d15);
            float abs4 = d15 == 0.0d ? 0.0f : Math.abs((i23 / ((float) d15)) * 100.0f);
            a51Var.a = org.telegram.messenger.id.M0(2131748617, "MembersOverviewTitle");
            a51Var.b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
            if (i23 == 0 || abs4 == 0.0f) {
                a51Var.c = "";
            } else {
                int i24 = (int) abs4;
                if (abs4 == i24) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i23 > 0 ? str4 : "");
                    sb8.append(org.telegram.messenger.g0.o0(i23, 0));
                    a51Var.c = sb8.toString() + " (" + i24 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i23 > 0 ? str4 : "");
                    sb9.append(org.telegram.messenger.g0.o0(i23, 0));
                    a51Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str2);
                }
            }
            a51Var.d = i23 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d16 = tL_statsAbsValueAndPrev5.current;
            double d17 = tL_statsAbsValueAndPrev5.previous;
            int i25 = (int) (d16 - d17);
            float abs5 = d17 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d17)) * 100.0f);
            a51Var.i = org.telegram.messenger.id.M0(2131743532, "ViewingMembers");
            a51Var.j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i25 == 0 || abs5 == 0.0f) {
                a51Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i25 > 0 ? str4 : "");
                sb10.append(org.telegram.messenger.g0.o0(i25, 0));
                a51Var.k = sb10.toString();
            }
            a51Var.l = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            float abs6 = d19 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d19)) * 100.0f);
            a51Var.m = org.telegram.messenger.id.M0(2131747067, "PostingMembers");
            a51Var.n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
            if (i26 == 0 || abs6 == 0.0f) {
                a51Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i26 > 0 ? str4 : "");
                sb11.append(org.telegram.messenger.g0.o0(i26, 0));
                a51Var.o = sb11.toString();
            }
            a51Var.p = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            float abs7 = d21 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d21)) * 100.0f);
            a51Var.e = org.telegram.messenger.id.M0(2131748453, "MessagesOverview");
            a51Var.f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
            if (i27 == 0 || abs7 == 0.0f) {
                a51Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i27 > 0 ? str4 : "");
                sb12.append(org.telegram.messenger.g0.o0(i27, 0));
                a51Var.g = sb12.toString();
            }
            a51Var.h = i27 >= 0;
            e51Var.G = a51Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            e51Var.e0 = tL_statsDateRangeDays2.max_date * 1000;
            e51Var.f0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    x41 x41Var = new x41();
                    x41Var.a = x41.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(org.telegram.messenger.id.G(i29, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.id.a0("CharactersPerMessage", null, 2131752254, org.telegram.messenger.id.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    x41Var.b = sb13.toString();
                    int i30 = i10;
                    if (arrayList2.size() < i30) {
                        arrayList3 = arrayList2;
                        arrayList3.add(x41Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(x41Var);
                    i28++;
                    arrayList2 = arrayList3;
                    i10 = i30;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i31 = 0; i31 < tL_megagroupStats.top_admins.size(); i31++) {
                    ArrayList arrayList19 = e51Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    x41 x41Var2 = new x41();
                    x41Var2.a = x41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb14.append(org.telegram.messenger.id.G(i32, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.id.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.id.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    x41Var2.b = sb14.toString();
                    arrayList19.add(x41Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = e51Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    x41 x41Var3 = new x41();
                    x41Var3.a = x41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        x41Var3.b = org.telegram.messenger.id.G(i34, "Invitations", new Object[0]);
                    } else {
                        x41Var3.b = "";
                    }
                    arrayList22.add(x41Var3);
                }
            }
            final int i35 = 1;
            org.telegram.messenger.g0.h3(new Runnable(e51Var) { // from class: org.telegram.ui.y31
                public final /* synthetic */ e51 b;

                {
                    this.b = e51Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i35) {
                        case 0:
                            e51 e51Var2 = this.b;
                            e51Var2.getClass();
                            q41[] q41VarArr22 = q41VarArr2;
                            e51Var2.r = q41VarArr22[0];
                            e51Var2.h = q41VarArr22[1];
                            e51Var2.e = q41VarArr22[2];
                            e51Var2.n = q41VarArr22[3];
                            e51Var2.d = q41VarArr22[4];
                            e51Var2.s = q41VarArr22[5];
                            e51Var2.w = q41VarArr22[6];
                            e51Var2.x = q41VarArr22[7];
                            e51Var2.y = q41VarArr22[8];
                            e51Var2.D = q41VarArr22[9];
                            e51Var2.E = q41VarArr22[10];
                            e51Var2.F = q41VarArr22[11];
                            e51Var2.j0(q41VarArr22);
                            break;
                        default:
                            e51 e51Var3 = this.b;
                            e51Var3.getClass();
                            q41[] q41VarArr3 = q41VarArr2;
                            e51Var3.d = q41VarArr3[0];
                            e51Var3.H = q41VarArr3[1];
                            e51Var3.I = q41VarArr3[2];
                            e51Var3.J = q41VarArr3[3];
                            e51Var3.K = q41VarArr3[4];
                            e51Var3.L = q41VarArr3[5];
                            e51Var3.e = q41VarArr3[6];
                            e51Var3.M = q41VarArr3[7];
                            e51Var3.j0(q41VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void a0(e51 e51Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                arrayList.add(new org.telegram.messenger.ij(e51Var.currentAccount, arrayList2.get(i7), false, true));
            }
            e51Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.h3(new x31(e51Var, arrayList, 1));
    }

    public static void c0(e51 e51Var) {
        d51 d51Var = e51Var.Y;
        if (d51Var != null) {
            d51Var.b = true;
        }
        int childCount = e51Var.S.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = e51Var.S.getChildAt(i7);
            if (childAt instanceof o41) {
                ((o41) childAt).b.t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.f2 g0(TLRPC.Chat chat, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z9);
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).N0(chat.id);
        return (N0 == null || !(N0.can_view_stats || N0.can_view_stars_revenue)) ? new t5(-chat.id) : new e51(bundle);
    }

    public static mg.b h0(JSONObject jSONObject, int i7, boolean z9) {
        if (i7 == 0) {
            return new mg.b(jSONObject);
        }
        if (i7 == 1) {
            return new mg.c(jSONObject);
        }
        if (i7 == 2) {
            mg.d dVar = new mg.d(jSONObject);
            int length = ((mg.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                dVar.l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = dVar.l;
                    jArr[i10] = jArr[i10] + ((mg.a) dVar.d.get(i11)).a[i10];
                }
            }
            dVar.m = new m4.d0(dVar.l);
            return dVar;
        }
        if (i7 != 4) {
            return null;
        }
        mg.e eVar = new mg.e(jSONObject);
        if (z9) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j3 = 0;
            for (int i12 = 0; i12 < eVar.d.size(); i12++) {
                int length2 = eVar.a.length;
                for (int i13 = 0; i13 < length2; i13++) {
                    long j10 = ((mg.a) eVar.d.get(i12)).a[i13];
                    jArr2[i12] = jArr2[i12] + j10;
                    if (j10 == 0) {
                        iArr[i12] = iArr[i12] + 1;
                    }
                }
                j3 += jArr2[i12];
            }
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < eVar.d.size(); i14++) {
                if (jArr2[i14] / j3 < 0.01d && iArr[i14] > eVar.a.length / 2.0f) {
                    arrayList.add((mg.a) eVar.d.get(i14));
                }
            }
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList.get(i15);
                i15++;
                eVar.d.remove((mg.a) obj);
            }
        }
        int length3 = ((mg.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i16 = 0; i16 < length3; i16++) {
            eVar.l[i16] = 0;
            for (int i17 = 0; i17 < size3; i17++) {
                long[] jArr3 = eVar.l;
                jArr3[i16] = jArr3[i16] + ((mg.a) eVar.d.get(i17)).a[i16];
            }
        }
        new m4.d0(eVar.l);
        return eVar;
    }

    public static q41 i0(TL_stats.StatsGraph statsGraph, String str, int i7, boolean z9) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        q41 q41Var = new q41(str, i7);
        q41Var.m = z9;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                mg.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i7, z9);
                q41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                q41Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.a) == null || jArr2.length < 2) {
                    q41Var.l = true;
                }
                if (i7 == 4 && h02 != null && (jArr = h02.a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    q41Var.e = new mg.e(h02, j3);
                    q41Var.c = j3;
                    return q41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            q41Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return q41Var;
    }

    public static void n0(q41 q41Var, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        mg.b bVar;
        if (q41Var == null || (bVar = q41Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            mg.a aVar = (mg.a) obj;
            int i10 = aVar.g;
            if (i10 >= 0) {
                if (!org.telegram.ui.ActionBar.m6.f1(i10)) {
                    org.telegram.ui.ActionBar.m6.A1(aVar.g, org.telegram.ui.ActionBar.m6.I == org.telegram.ui.ActionBar.m6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.m6.em[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, aVar.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Oj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Nj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i7;
        e51 e51Var = this;
        int i10 = 1;
        e51Var.setHasOwnBackground(true);
        e51Var.Z = new lg.f((org.telegram.ui.ActionBar.h6) null);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(e51Var.currentAccount);
        long j3 = e51Var.b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(e51Var.currentAccount).N0(j3);
        boolean z9 = N0 != null && N0.can_view_stats;
        boolean R = org.telegram.messenger.t3.R(M0);
        boolean z10 = N0 != null && (N0.can_view_revenue || N0.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z9) {
            arrayList.add(qh.b.c(context, e51Var.resourceProvider, qh.a.I, 2131744892));
        }
        arrayList.add(qh.b.c(context, e51Var.resourceProvider, qh.a.O, 2131753163));
        if (z10) {
            arrayList.add(qh.b.c(context, e51Var.resourceProvider, qh.a.P, 2131748407));
        }
        e51Var.q0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        oe0 oe0Var = new oe0(context, e51Var.resourceProvider);
        e51Var.o0 = oe0Var;
        oe0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        e51Var.o0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        e51Var.o0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        e51Var.p0 = frameLayout2;
        frameLayout2.setOnClickListener(new bi.l1(19));
        e51Var.p0.addView(e51Var.o0, c8.ha.e(-1, 72, 81));
        e51Var.p0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = e51Var.q0;
            if (i11 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ru0(e51Var, i11, i10));
            e51Var.o0.addView(e51Var.q0[i11]);
            e51Var.o0.i(bVar, true, false);
            i11++;
        }
        e51Var.h0 = new b41(e51Var, e51Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            tb tbVar = new tb(e51Var, -j3, e51Var.getResourceProvider());
            e51Var.i0 = tbVar;
            tbVar.F.setCaptureSectionsDecoratorAllowed(true);
            e51Var.glassEngine.b(e51Var.i0.F);
        }
        if (z10) {
            frameLayout = frameLayout3;
            i7 = -1;
            zd zdVar = new zd(e51Var.getParentActivity(), e51Var, e51Var.currentAccount, -j3, e51Var.getResourceProvider(), e51Var.glassEngine, org.telegram.messenger.t3.V(M0) && N0.can_view_revenue, N0.can_view_stars_revenue);
            e51Var = e51Var;
            e51Var.j0 = zdVar;
            zdVar.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i7 = -1;
        }
        boolean z11 = z9;
        FrameLayout frameLayout4 = frameLayout;
        e51Var.h0.setAdapter(new c41(e51Var, z11, R, z10, frameLayout4));
        boolean z12 = e51Var.n0;
        boolean z13 = R && !z12;
        e51Var.c = z13;
        if (z13 && e51Var.c0) {
            e51Var.h0.setPosition(z11 ? 1 : 0);
        } else if (z13 && e51Var.d0) {
            e51Var.h0.setPosition(((z12 || !R) ? 0 : 1) + (z11 ? 1 : 0));
        }
        e51Var.p0(e51Var.h0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(e51Var.getParentActivity());
        frameLayout5.addView(e51Var.h0, c8.ha.g());
        View view = new View(context);
        e51Var.k0 = view;
        frameLayout5.addView(view, c8.ha.e(i7, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        e51Var.l0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(e51Var.l0, c8.ha.g());
        frameLayout5.addView(e51Var.simpleActionBar);
        int i12 = 12;
        if (e51Var.c) {
            e51Var.setBulletinDelegate(new fi.r7(i12));
            e51Var.p0.setBackground(e51Var.getBaseSimpleGlass().b(e51Var.p0));
            frameLayout5.addView(e51Var.p0, c8.ha.e(i7, -2, 80));
        }
        e51Var.fragmentView = frameLayout5;
        d41 d41Var = new d41(e51Var, context);
        e51Var.S = d41Var;
        d41Var.setCaptureSectionsDecoratorAllowed(true);
        e51Var.S.setSections(true);
        e51Var.S.setClipToPadding(false);
        e51Var.glassEngine.b(e51Var.S);
        e51Var.S.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        e51Var.a0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        e51Var.V = ch0Var;
        ch0Var.setAutoRepeat(true);
        e51Var.V.f(R.raw.statistic_preload, 120, 120, null);
        e51Var.V.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.m6.Cj;
        org.telegram.ui.ActionBar.t6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.id.M0(2131748777, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.m6.Dj;
        org.telegram.ui.ActionBar.t6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.id.M0(2131748776, null));
        textView2.setGravity(1);
        e51Var.a0.addView(e51Var.V, c8.ha.t(120, 120, 1, 0, 0, 0, 20));
        e51Var.a0.addView(textView, c8.ha.t(-2, -2, 1, 0, 0, 0, 10));
        e51Var.a0.addView(textView2, c8.ha.r(-2, -2, 1));
        frameLayout4.addView(e51Var.a0, c8.ha.d(org.telegram.messenger.qs.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (e51Var.W == null) {
            e51Var.W = new i41(e51Var);
        }
        e51Var.S.setAdapter(e51Var.W);
        v4.b0 b0Var = new v4.b0();
        e51Var.T = b0Var;
        e51Var.S.setLayoutManager(b0Var);
        e51Var.X = new e41();
        e51Var.S.setItemAnimator(null);
        int i15 = 2;
        e51Var.S.j(new e21(e51Var, i15));
        e51Var.S.setOnItemClickListener(new ay0(e51Var, 6));
        e51Var.S.setOnItemLongClickListener(new a41(e51Var));
        frameLayout4.addView(e51Var.S);
        e51Var.R = new org.telegram.ui.Components.jn(context, null, false, null);
        TLRPC.Chat M02 = e51Var.getMessagesController().M0(Long.valueOf(j3));
        e51Var.R.setChatAvatar(M02);
        e51Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        e51Var.simpleActionBar.setTitle(M02 == null ? "" : M02.title);
        e51Var.simpleActionBar.setActionBarMenuOnItemClick(new qt0(e51Var, 12));
        e51Var.R.i(org.telegram.ui.ActionBar.m6.x0(null, i13, false), org.telegram.ui.ActionBar.m6.x0(null, i14, false));
        boolean z14 = e51Var.A0;
        m4 m4Var = e51Var.E0;
        if (z14) {
            e51Var.a0.setAlpha(0.0f);
            org.telegram.messenger.g0.i3(m4Var, 500L);
            e51Var.a0.setVisibility(0);
            e51Var.S.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(m4Var);
            e51Var.a0.setVisibility(8);
            e51Var.S.setVisibility(0);
        }
        fh.g c10 = e51Var.getBaseSimpleGlass().c.c(e51Var.o0, c8.g0.f(e51Var.resourceProvider), false);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
        e51Var.o0.setBackground(c10);
        e51Var.glassEngine.c(e51Var.h0);
        oi.a baseSimpleGlass = e51Var.getBaseSimpleGlass();
        b41 b41Var = e51Var.h0;
        org.telegram.ui.ActionBar.z4 z4Var = e51Var.simpleActionBar;
        org.telegram.ui.ActionBar.h6 h6Var = e51Var.resourceProvider;
        baseSimpleGlass.m = frameLayout5;
        baseSimpleGlass.n = b41Var;
        baseSimpleGlass.a.c(b41Var);
        baseSimpleGlass.g(frameLayout5, z4Var, h6Var);
        e51Var.m0 = new te.a(0, new a41(e51Var), org.telegram.ui.Components.wq.h, 380L, false);
        zd zdVar2 = e51Var.j0;
        if (zdVar2 != null) {
            oi.a baseSimpleGlass2 = e51Var.getBaseSimpleGlass();
            View view2 = zdVar2.a1.d;
            fh.g c11 = baseSimpleGlass2.c.c(view2, null, false);
            c11.p(c8.g0.l(zdVar2.n0));
            c11.q(org.telegram.messenger.g0.L(9.66f));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = e51Var.j0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            e51Var.l0.addView(transactionTabs, layoutParams);
            e51Var.j0.setTabsPinnedChangedListener(new uu0(e51Var, 20));
            e51Var.m0.a(e51Var.j0.e0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new hk(e51Var, i15));
        e51Var.getBaseSimpleGlass().o = new xu(e51Var, frameLayout5, new z5(i10, frameLayout5), i10);
        e51Var.getBaseSimpleGlass().n = null;
        e51Var.simpleActionBar.setBackground(null);
        e51Var.k0.setBackground(e51Var.getBaseSimpleGlass().a(e51Var.k0));
        org.telegram.messenger.g0.E2(e51Var.R.e);
        frameLayout5.addView(e51Var.R.e, c8.ha.e(42, 42, 53));
        e51Var.f0();
        e51Var.fragmentView.setBackgroundColor(e51Var.getThemedColor(org.telegram.ui.ActionBar.m6.a7));
        e51Var.B0 = new r41(e51Var.W, e51Var.T);
        return e51Var.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i7 == org.telegram.messenger.qs.x5) {
            if (((di.r6) objArr[0]) == this.C0) {
                m0();
                r0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.B0.f();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.V2) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.f2 f2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack) : null;
            if (f2Var instanceof rn) {
                ((ActionBarLayout) getParentLayout()).d0(f2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.f2 f2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (f2Var2 instanceof ProfileActivity) {
                    wg.h.f(f2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.f2 f2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.f2) rf.b.g(3, fragmentStack2) : null;
            if (f2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).d0(f2Var2, false);
            }
            finishFragment();
            if (f2Var3 instanceof cn) {
                wg.h.f(f2Var3, chat, true);
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.D) {
            if (i7 == org.telegram.messenger.qs.T) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    l0();
                    return;
                }
                return;
            }
            return;
        }
        if (((Integer) objArr[10]).intValue() == this.classGuid) {
            ArrayList arrayList2 = (ArrayList) objArr[2];
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i12 = 0;
            while (true) {
                arrayList = this.u0;
                if (i12 >= size) {
                    break;
                }
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i12);
                int i13 = this.s0.get(ijVar.e1(), -1);
                if (i13 >= 0 && ((b51) arrayList.get(i13)).b() == ijVar.e1()) {
                    if (ijVar.Z) {
                        arrayList3.add((b51) arrayList.get(i13));
                    } else {
                        ((b51) arrayList.get(i13)).b = ijVar;
                    }
                }
                i12++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.v0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                b51 b51Var = (b51) arrayList.get(i11);
                if (b51Var.b == null) {
                    this.r0 = b51Var.b();
                    break;
                } else {
                    arrayList4.add(b51Var);
                    i11++;
                }
            }
            if (arrayList4.size() < 20) {
                k0();
            }
            r0();
            if (this.W != null) {
                this.S.setItemAnimator(null);
                this.B0.f();
            }
        }
    }

    public final void f0() {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (this.k0 != null) {
            int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.k0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.k0.setLayoutParams(layoutParams);
            }
            t0();
        }
        int L2 = this.c ? org.telegram.messenger.g0.L(72.0f) : 0;
        org.telegram.messenger.g0.B3(this.R.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
        this.p0.setPadding(0, 0, 0, this.mSystemInsets.d);
        d41 d41Var = this.S;
        if (d41Var != null) {
            i0.b bVar = this.mSystemInsets;
            oi.a.e(d41Var, bVar.b, bVar.d, currentActionBarHeight, L2);
        }
        tb tbVar = this.i0;
        if (tbVar != null) {
            org.telegram.ui.Components.pj0 pj0Var = tbVar.F;
            i0.b bVar2 = this.mSystemInsets;
            oi.a.e(pj0Var, bVar2.b, bVar2.d, currentActionBarHeight, L2);
        }
        zd zdVar = this.j0;
        if (zdVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i7 = bVar3.b;
            int i10 = bVar3.d;
            zdVar.U0 = i7;
            zdVar.V0 = i10;
            zdVar.W0 = L2;
            int C = org.telegram.messenger.camera.q.C(48.0f, i7, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.camera.q.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.r41 r41Var = zdVar.X0;
            org.telegram.messenger.g0.B3(r41Var, 0, C, 0, C2);
            r41Var.setPadding(r41Var.getPaddingLeft(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i7) - C, r41Var.getPaddingRight(), (i10 + L2) - C2);
            zdVar.z(-C, -C2);
            zdVar.B();
            zdVar.requestLayout();
            zdVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        f6 f6Var = new f6(21, this);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.S, 0, new Class[]{ng.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j5));
        if (this.b0) {
            while (i7 < 6) {
                n0(i7 == 0 ? this.d : i7 == 1 ? this.H : i7 == 2 ? this.I : i7 == 3 ? this.J : i7 == 4 ? this.K : this.L, arrayList, f6Var);
                i7++;
            }
        } else {
            while (i7 < 12) {
                n0(i7 == 0 ? this.d : i7 == 1 ? this.h : i7 == 2 ? this.n : i7 == 3 ? this.r : i7 == 4 ? this.s : i7 == 5 ? this.w : i7 == 6 ? this.y : i7 == 7 ? this.e : i7 == 8 ? this.x : i7 == 9 ? this.D : i7 == 10 ? this.E : this.F, arrayList, f6Var);
                i7++;
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        b41 b41Var;
        if (motionEvent != null && this.j0 != null && (b41Var = this.h0) != null) {
            View currentView = b41Var.getCurrentView();
            zd zdVar = this.j0;
            if (currentView == zdVar && zdVar.G((motionEvent.getX() - this.h0.getX()) - this.j0.getX(), (motionEvent.getY() - this.h0.getY()) - this.j0.getY())) {
                return false;
            }
        }
        b41 b41Var2 = this.h0;
        if (b41Var2 == null || (b41Var2.b == 0 && b41Var2.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0(q41[] q41VarArr) {
        i41 i41Var = this.W;
        if (i41Var != null) {
            i41Var.E();
            this.S.setItemAnimator(null);
            this.W.f();
        }
        this.A0 = false;
        LinearLayout linearLayout = this.a0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        org.telegram.messenger.g0.r(this.E0);
        this.a0.animate().alpha(0.0f).setDuration(230L).setListener(new g30(this, 28));
        this.S.setVisibility(0);
        this.S.setAlpha(0.0f);
        this.S.animate().alpha(1.0f).setDuration(230L).start();
        for (q41 q41Var : q41VarArr) {
            if (q41Var != null && q41Var.d == null && q41Var.f != null) {
                q41Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new gh(2, this, q41Var));
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.u0;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = this.s0.get(this.r0); i10 < size; i10++) {
            if (((b51) arrayList.get(i10)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((b51) arrayList.get(i10)).b()));
                i7++;
                if (i7 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(this.b);
        this.z0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new w31(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.n0) {
            return;
        }
        boolean z9 = this.b0;
        long j3 = this.b;
        if (z9) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new w31(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.x0;
        arrayList.clear();
        ArrayList arrayList2 = this.w0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            b51 b51Var = (b51) obj;
            org.telegram.messenger.ij f10 = this.C0.f(b51Var.b());
            if (f10 != null) {
                b51Var.b = f10;
                arrayList.add(b51Var);
            }
        }
        this.t0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof o41) {
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.y6) || this.S.b1()) {
            if (view instanceof ng.c) {
                ((ng.c) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof org.telegram.ui.Components.xp) {
            org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) background;
            if ((xpVar.a instanceof ColorDrawable) && xpVar.b != null) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.b7, false);
                if (this.G0 == null || this.H0 != x02) {
                    this.H0 = x02;
                    this.G0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) xpVar.a).setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.a7, false));
                xpVar.b.setColorFilter(this.G0);
                view.invalidate();
                return;
            }
        }
        org.telegram.ui.Components.xp xpVar2 = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.a7, false)), org.telegram.ui.ActionBar.m6.Y0(org.telegram.messenger.t0.b, R.drawable.greydivider, org.telegram.ui.ActionBar.m6.b7), 0, 0);
        xpVar2.x = true;
        view.setBackground(xpVar2);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        ab.b0 b0Var = this.F0;
        if (b0Var != null) {
            b0Var.b();
            this.F0 = null;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        ab.b0 b0Var2 = new ab.b0(notificationCenter, this);
        b0Var2.c(org.telegram.messenger.qs.D);
        b0Var2.c(org.telegram.messenger.qs.T);
        b0Var2.c(org.telegram.messenger.qs.V2);
        b0Var2.c(org.telegram.messenger.qs.x5);
        this.F0 = b0Var2;
        di.z6 P1 = getMessagesController().P1();
        long j3 = this.b;
        di.r6 A = P1.A(2, -1, -j3, true);
        this.C0 = A;
        if (A != null) {
            this.D0 = A.o();
        }
        if (this.a != null) {
            l0();
        } else {
            org.telegram.messenger.qp.s1(this.currentAccount).V2(this.classGuid, j3, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        ab.b0 b0Var = this.F0;
        if (b0Var != null) {
            b0Var.b();
            this.F0 = null;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.g0;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
            u1VarArr[0] = null;
        }
        di.r6 r6Var = this.C0;
        if (r6Var != null) {
            r6Var.z(this.D0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        f0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.jn jnVar = this.R;
            if (jnVar != null) {
                jnVar.i(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Cj, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Dj, false));
            }
            s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(int i7, boolean z9) {
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.q0;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10].f(i10 == i7, z9);
            i10++;
        }
    }

    public final void q0(boolean z9, float f10) {
        for (int i7 = 0; i7 < this.q0.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            qh.b bVar = this.q0[i7];
            bVar.J = max;
            bVar.I = z9;
            bVar.invalidate();
        }
        this.o0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        arrayList.addAll(this.v0);
        arrayList.addAll(this.x0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.messenger.sk(4))));
    }

    public final void s0() {
        d41 d41Var = this.S;
        if (d41Var != null) {
            int childCount = d41Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                o0(this.S.getChildAt(i7));
            }
            int hiddenChildCount = this.S.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                o0(this.S.V(i10));
            }
            int cachedChildCount = this.S.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                o0(this.S.P(i11));
            }
            int attachedScrapChildCount = this.S.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                o0(this.S.O(i12));
            }
            this.S.getRecycledViewPool().a();
        }
        lg.f fVar = this.Z;
        if (fVar != null) {
            fVar.c = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0() {
        boolean z9;
        float f10;
        if (this.k0 == null || this.l0 == null) {
            return;
        }
        zd zdVar = this.j0;
        if (zdVar != null && zdVar.getParent() == this.h0) {
            zd zdVar2 = this.j0;
            if (zdVar2.getVisibility() == 0 && zdVar2.Y0.getVisibility() != 0) {
                z9 = true;
                if (z9) {
                    f10 = 0.0f;
                } else {
                    float x10 = this.j0.getX();
                    float width = this.j0.getWidth();
                    f10 = width > 0.0f ? Math.max(0.0f, Math.min(this.h0.getWidth(), x10 + width) - Math.max(0.0f, x10)) / width : 0.0f;
                    this.l0.setTranslationX(this.h0.getX() + x10);
                    this.l0.setTranslationY(this.j0.getY() + this.h0.getY());
                }
                this.l0.setVisibility((z9 || f10 <= 0.0f) ? 4 : 0);
                te.a aVar = this.m0;
                this.k0.setTranslationY((-(1.0f - ((aVar != null ? aVar.e : 0.0f) * f10))) * org.telegram.messenger.g0.L(44.0f));
            }
        }
        z9 = false;
        if (z9) {
        }
        this.l0.setVisibility((z9 || f10 <= 0.0f) ? 4 : 0);
        te.a aVar2 = this.m0;
        this.k0.setTranslationY((-(1.0f - ((aVar2 != null ? aVar2.e : 0.0f) * f10))) * org.telegram.messenger.g0.L(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
