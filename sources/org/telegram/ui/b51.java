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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b51 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public boolean A0;
    public boolean B0;
    public o41 C0;
    public fi.h6 D0;
    public n41 E;
    public int E0;
    public n41 F;
    public final m4 F0;
    public n41 G;
    public xi.e G0;
    public x41 H;
    public PorterDuffColorFilter H0;
    public n41 I;
    public int I0;
    public n41 J;
    public n41 K;
    public n41 L;
    public n41 M;
    public n41 N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public org.telegram.ui.Components.zn S;
    public b41 T;
    public v4.c0 U;
    public final h2.j0 V;
    public org.telegram.ui.Components.qh0 W;
    public g41 X;
    public c41 Y;
    public a51 Z;
    public TLRPC.ChatFull a;
    public lg.f a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public n41 d;
    public final boolean d0;
    public n41 e;
    public final boolean e0;
    public w41 f;
    public long f0;
    public long g0;
    public n41 h;
    public final org.telegram.ui.ActionBar.t1[] h0;
    public z31 i0;
    public sb j0;
    public xd k0;
    public View l0;
    public FrameLayout m0;
    public n41 n;
    public te.a n0;
    public final boolean o0;
    public ne0 p0;
    public FrameLayout q0;
    public n41 r;
    public qh.b[] r0;
    public n41 s;
    public int s0;
    public final SparseIntArray t0;
    public final SparseIntArray u0;
    public final ArrayList v0;
    public n41 w;
    public final ArrayList w0;
    public n41 x;
    public final ArrayList x0;
    public n41 y;
    public final ArrayList y0;
    public final ArrayList z0;

    public b51(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new h2.j0(50, 2);
        this.h0 = new org.telegram.ui.ActionBar.t1[1];
        this.s0 = -1;
        this.t0 = new SparseIntArray();
        this.u0 = new SparseIntArray();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new m4(this, 15);
        long j3 = bundle.getLong("chat_id");
        this.b = j3;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.o0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().P0(j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v53 */
    public static void Z(final b51 b51Var, TLObject tLObject) {
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
        ArrayList arrayList5 = b51Var.O;
        ArrayList arrayList6 = b51Var.P;
        ArrayList arrayList7 = b51Var.v0;
        String str7 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final n41[] n41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.gd.N0(2131749080, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.gd.N0(2131750593, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.gd.N0(2131743788, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.gd.N0(2131743280, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.gd.N0(2131749182, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.gd.N0(2131743279, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.gd.N0(2131748081, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.gd.N0(2131748848, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.gd.N0(2131747726, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.gd.N0(2131746189, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.gd.N0(2131744415, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.gd.N0(2131744260, "StoryReactionsByEmotionChartTitle"), 2, false)};
            n41 n41Var = n41VarArr[2];
            if (n41Var != null) {
                n41Var.n = true;
            }
            w41 w41Var = new w41();
            xi.e a10 = w41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            w41Var.o = org.telegram.messenger.gd.N0(2131746182, "ReactionsPerPost");
            w41Var.p = (String) a10.a;
            w41Var.q = (String) a10.b;
            w41Var.r = ((Boolean) a10.c).booleanValue();
            w41Var.s = ((Boolean) a10.d).booleanValue();
            xi.e a11 = w41.a(tL_broadcastStats.reactions_per_story);
            w41Var.t = org.telegram.messenger.gd.N0(2131746181, "ReactionsPerStory");
            w41Var.u = (String) a11.a;
            w41Var.v = (String) a11.b;
            w41Var.w = ((Boolean) a11.c).booleanValue();
            w41Var.x = ((Boolean) a11.d).booleanValue();
            xi.e a12 = w41.a(tL_broadcastStats.views_per_story);
            w41Var.y = org.telegram.messenger.gd.N0(2131743277, "ViewsPerStory");
            w41Var.z = (String) a12.a;
            w41Var.A = (String) a12.b;
            w41Var.B = ((Boolean) a12.c).booleanValue();
            w41Var.C = ((Boolean) a12.d).booleanValue();
            xi.e a13 = w41.a(tL_broadcastStats.shares_per_story);
            w41Var.D = org.telegram.messenger.gd.N0(2131745201, "SharesPerStory");
            w41Var.E = (String) a13.a;
            w41Var.F = (String) a13.b;
            w41Var.G = ((Boolean) a13.c).booleanValue();
            w41Var.H = ((Boolean) a13.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str8 = "GrowthChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i11 = (int) (d - d2);
            float abs = d2 == 0.0d ? 0.0f : Math.abs((i11 / ((float) d2)) * 100.0f);
            w41Var.a = org.telegram.messenger.gd.N0(2131750593, "FollowersChartTitle");
            w41Var.b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs == 0.0f) {
                i7 = i11;
                w41Var.c = "";
            } else {
                int i12 = (int) abs;
                if (abs == i12) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11 > 0 ? str4 : "");
                    sb2.append(org.telegram.messenger.g0.o0(i11, 0));
                    w41Var.c = sb2.toString() + " (" + i12 + "%)";
                    i7 = i11;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i11 > 0 ? str4 : "");
                    sb3.append(org.telegram.messenger.g0.o0(i11, 0));
                    i7 = i11;
                    w41Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            w41Var.d = i7 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d10 = tL_statsAbsValueAndPrev2.current;
            double d11 = tL_statsAbsValueAndPrev2.previous;
            int i13 = (int) (d10 - d11);
            float abs2 = d11 == 0.0d ? 0.0f : Math.abs((i13 / ((float) d11)) * 100.0f);
            w41Var.i = org.telegram.messenger.gd.N0(2131745202, "SharesPerPost");
            w41Var.j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i13 == 0 || abs2 == 0.0f) {
                w41Var.k = "";
            } else {
                int i14 = (int) abs2;
                if (abs2 == i14) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i13 > 0 ? str4 : "");
                    sb4.append(org.telegram.messenger.g0.o0(i13, 0));
                    w41Var.k = sb4.toString() + " (" + i14 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i13 > 0 ? str4 : "");
                    sb5.append(org.telegram.messenger.g0.o0(i13, 0));
                    w41Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            w41Var.l = i13 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            float abs3 = d13 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d13)) * 100.0f);
            w41Var.e = org.telegram.messenger.gd.N0(2131743278, "ViewsPerPost");
            w41Var.f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i15 == 0 || abs3 == 0.0f) {
                w41Var.g = "";
            } else {
                int i16 = (int) abs3;
                if (abs3 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i15 > 0 ? str4 : "");
                    sb6.append(org.telegram.messenger.g0.o0(i15, 0));
                    w41Var.g = sb6.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i15 > 0 ? str4 : "");
                    sb7.append(org.telegram.messenger.g0.o0(i15, 0));
                    w41Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            w41Var.h = i15 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            w41Var.m = org.telegram.messenger.gd.N0(2131751131, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                w41Var.n = com.google.android.gms.internal.vision.e2.i(i17, "%");
            } else {
                w41Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            b51Var.f = w41Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            b51Var.f0 = tL_statsDateRangeDays.max_date * 1000;
            b51Var.g0 = tL_statsDateRangeDays.min_date * 1000;
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
                y41 y41Var = new y41();
                y41Var.a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(y41Var);
                    str5 = str8;
                    str6 = str7;
                    b51Var.t0.put(y41Var.b(), i18);
                    i18++;
                } else {
                    str5 = str8;
                    arrayList4 = arrayList8;
                    str6 = str7;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(y41Var.b()));
                    b51Var.x0.add(y41Var);
                    b51Var.u0.put(y41Var.b(), i19);
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
            org.telegram.messenger.g0.g3(new v31(b51Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((y41) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.tr messagesStorage = b51Var.getMessagesStorage();
                long j3 = -b51Var.b;
                int i22 = b51Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.a.c(new org.telegram.messenger.op(messagesStorage, org.telegram.messenger.sz.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, j3, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            org.telegram.messenger.g0.g3(new Runnable(b51Var) { // from class: org.telegram.ui.w31
                public final /* synthetic */ b51 b;

                {
                    this.b = b51Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (objArr) {
                        case 0:
                            b51 b51Var2 = this.b;
                            b51Var2.getClass();
                            n41[] n41VarArr2 = n41VarArr;
                            b51Var2.r = n41VarArr2[0];
                            b51Var2.h = n41VarArr2[1];
                            b51Var2.e = n41VarArr2[2];
                            b51Var2.n = n41VarArr2[3];
                            b51Var2.d = n41VarArr2[4];
                            b51Var2.s = n41VarArr2[5];
                            b51Var2.w = n41VarArr2[6];
                            b51Var2.x = n41VarArr2[7];
                            b51Var2.y = n41VarArr2[8];
                            b51Var2.E = n41VarArr2[9];
                            b51Var2.F = n41VarArr2[10];
                            b51Var2.G = n41VarArr2[11];
                            b51Var2.j0(n41VarArr2);
                            break;
                        default:
                            b51 b51Var3 = this.b;
                            b51Var3.getClass();
                            n41[] n41VarArr3 = n41VarArr;
                            b51Var3.d = n41VarArr3[0];
                            b51Var3.I = n41VarArr3[1];
                            b51Var3.J = n41VarArr3[2];
                            b51Var3.K = n41VarArr3[3];
                            b51Var3.L = n41VarArr3[4];
                            b51Var3.M = n41VarArr3[5];
                            b51Var3.e = n41VarArr3[6];
                            b51Var3.N = n41VarArr3[7];
                            b51Var3.j0(n41VarArr3);
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
            n41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.gd.N0(2131749182, str3), r15, r15);
            n41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.gd.N0(2131749234, "GroupMembersChartTitle"), r15, r15);
            n41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.gd.N0(2131748078, "NewMembersBySourceChartTitle"), 2, r15);
            n41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.gd.N0(2131748425, "MembersLanguageChartTitle"), 4, true);
            n41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.gd.N0(2131748269, "MessagesChartTitle"), 2, r15);
            n41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.gd.N0(2131754486, "ActionsChartTitle"), 1, r15);
            n41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.gd.N0(2131743788, str), r15, r15);
            n41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.gd.N0(2131743789, "TopDaysOfWeekChartTitle"), 4, r15);
            final n41[] n41VarArr2 = new n41[8];
            n41VarArr2[r15] = i02;
            n41VarArr2[1] = i03;
            n41VarArr2[2] = i04;
            n41VarArr2[3] = i05;
            n41VarArr2[4] = i06;
            n41VarArr2[5] = i07;
            n41VarArr2[6] = i08;
            n41VarArr2[7] = i09;
            n41 n41Var2 = n41VarArr2[6];
            if (n41Var2 != null) {
                n41Var2.n = true;
            }
            n41 n41Var3 = n41VarArr2[7];
            if (n41Var3 != null) {
                n41Var3.o = true;
            }
            x41 x41Var = new x41();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d14 = tL_statsAbsValueAndPrev4.current;
            double d15 = tL_statsAbsValueAndPrev4.previous;
            int i23 = (int) (d14 - d15);
            float abs4 = d15 == 0.0d ? 0.0f : Math.abs((i23 / ((float) d15)) * 100.0f);
            x41Var.a = org.telegram.messenger.gd.N0(2131748424, "MembersOverviewTitle");
            x41Var.b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
            if (i23 == 0 || abs4 == 0.0f) {
                x41Var.c = "";
            } else {
                int i24 = (int) abs4;
                if (abs4 == i24) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i23 > 0 ? str4 : "");
                    sb8.append(org.telegram.messenger.g0.o0(i23, 0));
                    x41Var.c = sb8.toString() + " (" + i24 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i23 > 0 ? str4 : "");
                    sb9.append(org.telegram.messenger.g0.o0(i23, 0));
                    x41Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str2);
                }
            }
            x41Var.d = i23 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d16 = tL_statsAbsValueAndPrev5.current;
            double d17 = tL_statsAbsValueAndPrev5.previous;
            int i25 = (int) (d16 - d17);
            float abs5 = d17 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d17)) * 100.0f);
            x41Var.i = org.telegram.messenger.gd.N0(2131743282, "ViewingMembers");
            x41Var.j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i25 == 0 || abs5 == 0.0f) {
                x41Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i25 > 0 ? str4 : "");
                sb10.append(org.telegram.messenger.g0.o0(i25, 0));
                x41Var.k = sb10.toString();
            }
            x41Var.l = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            float abs6 = d19 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d19)) * 100.0f);
            x41Var.m = org.telegram.messenger.gd.N0(2131746873, "PostingMembers");
            x41Var.n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
            if (i26 == 0 || abs6 == 0.0f) {
                x41Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i26 > 0 ? str4 : "");
                sb11.append(org.telegram.messenger.g0.o0(i26, 0));
                x41Var.o = sb11.toString();
            }
            x41Var.p = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            float abs7 = d21 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d21)) * 100.0f);
            x41Var.e = org.telegram.messenger.gd.N0(2131748260, "MessagesOverview");
            x41Var.f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
            if (i27 == 0 || abs7 == 0.0f) {
                x41Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i27 > 0 ? str4 : "");
                sb12.append(org.telegram.messenger.g0.o0(i27, 0));
                x41Var.g = sb12.toString();
            }
            x41Var.h = i27 >= 0;
            b51Var.H = x41Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            b51Var.f0 = tL_statsDateRangeDays2.max_date * 1000;
            b51Var.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    u41 u41Var = new u41();
                    u41Var.a = u41.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(org.telegram.messenger.gd.G(i29, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.gd.a0("CharactersPerMessage", null, 2131752242, org.telegram.messenger.gd.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    u41Var.b = sb13.toString();
                    int i30 = i10;
                    if (arrayList2.size() < i30) {
                        arrayList3 = arrayList2;
                        arrayList3.add(u41Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(u41Var);
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
                    ArrayList arrayList19 = b51Var.R;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    u41 u41Var2 = new u41();
                    u41Var2.a = u41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb14.append(org.telegram.messenger.gd.G(i32, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.gd.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.gd.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    u41Var2.b = sb14.toString();
                    arrayList19.add(u41Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = b51Var.Q;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    u41 u41Var3 = new u41();
                    u41Var3.a = u41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        u41Var3.b = org.telegram.messenger.gd.G(i34, "Invitations", new Object[0]);
                    } else {
                        u41Var3.b = "";
                    }
                    arrayList22.add(u41Var3);
                }
            }
            final int i35 = 1;
            org.telegram.messenger.g0.g3(new Runnable(b51Var) { // from class: org.telegram.ui.w31
                public final /* synthetic */ b51 b;

                {
                    this.b = b51Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i35) {
                        case 0:
                            b51 b51Var2 = this.b;
                            b51Var2.getClass();
                            n41[] n41VarArr22 = n41VarArr2;
                            b51Var2.r = n41VarArr22[0];
                            b51Var2.h = n41VarArr22[1];
                            b51Var2.e = n41VarArr22[2];
                            b51Var2.n = n41VarArr22[3];
                            b51Var2.d = n41VarArr22[4];
                            b51Var2.s = n41VarArr22[5];
                            b51Var2.w = n41VarArr22[6];
                            b51Var2.x = n41VarArr22[7];
                            b51Var2.y = n41VarArr22[8];
                            b51Var2.E = n41VarArr22[9];
                            b51Var2.F = n41VarArr22[10];
                            b51Var2.G = n41VarArr22[11];
                            b51Var2.j0(n41VarArr22);
                            break;
                        default:
                            b51 b51Var3 = this.b;
                            b51Var3.getClass();
                            n41[] n41VarArr3 = n41VarArr2;
                            b51Var3.d = n41VarArr3[0];
                            b51Var3.I = n41VarArr3[1];
                            b51Var3.J = n41VarArr3[2];
                            b51Var3.K = n41VarArr3[3];
                            b51Var3.L = n41VarArr3[4];
                            b51Var3.M = n41VarArr3[5];
                            b51Var3.e = n41VarArr3[6];
                            b51Var3.N = n41VarArr3[7];
                            b51Var3.j0(n41VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void a0(b51 b51Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                arrayList.add(new org.telegram.messenger.fj(b51Var.currentAccount, arrayList2.get(i7), false, true));
            }
            b51Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.g3(new v31(b51Var, arrayList, 1));
    }

    public static void c0(b51 b51Var) {
        a51 a51Var = b51Var.Z;
        if (a51Var != null) {
            a51Var.b = true;
        }
        int childCount = b51Var.T.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = b51Var.T.getChildAt(i7);
            if (childAt instanceof m41) {
                ((m41) childAt).b.u0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.g2 g0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).P0(chat.id);
        return (P0 == null || !(P0.can_view_stats || P0.can_view_stars_revenue)) ? new t5(-chat.id) : new b51(bundle);
    }

    public static mg.b h0(JSONObject jSONObject, int i7, boolean z10) {
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
            dVar.m = new jb.m(dVar.l);
            return dVar;
        }
        if (i7 != 4) {
            return null;
        }
        mg.e eVar = new mg.e(jSONObject);
        if (z10) {
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
        new jb.m(eVar.l);
        return eVar;
    }

    public static n41 i0(TL_stats.StatsGraph statsGraph, String str, int i7, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        n41 n41Var = new n41(str, i7);
        n41Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                mg.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i7, z10);
                n41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                n41Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.a) == null || jArr2.length < 2) {
                    n41Var.l = true;
                }
                if (i7 == 4 && h02 != null && (jArr = h02.a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    n41Var.e = new mg.e(h02, j3);
                    n41Var.c = j3;
                    return n41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            n41Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return n41Var;
    }

    public static void n0(n41 n41Var, ArrayList arrayList, org.telegram.ui.ActionBar.v6 v6Var) {
        mg.b bVar;
        if (n41Var == null || (bVar = n41Var.d) == null) {
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
                if (!org.telegram.ui.ActionBar.n6.f1(i10)) {
                    org.telegram.ui.ActionBar.n6.A1(aVar.g, org.telegram.ui.ActionBar.n6.I == org.telegram.ui.ActionBar.n6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.n6.hm[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, aVar.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i7;
        b51 b51Var = this;
        int i10 = 1;
        b51Var.setHasOwnBackground(true);
        b51Var.a0 = new lg.f((org.telegram.ui.ActionBar.i6) null);
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(b51Var.currentAccount);
        long j3 = b51Var.b;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(b51Var.currentAccount).P0(j3);
        boolean z10 = P0 != null && P0.can_view_stats;
        boolean R = org.telegram.messenger.v3.R(O0);
        boolean z11 = P0 != null && (P0.can_view_revenue || P0.can_view_stars_revenue);
        int i11 = 3;
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(qh.b.c(context, b51Var.resourceProvider, qh.a.J, 2131744651));
        }
        arrayList.add(qh.b.c(context, b51Var.resourceProvider, qh.a.P, 2131753160));
        if (z11) {
            arrayList.add(qh.b.c(context, b51Var.resourceProvider, qh.a.Q, 2131748214));
        }
        b51Var.r0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        ne0 ne0Var = new ne0(context, b51Var.resourceProvider);
        b51Var.p0 = ne0Var;
        ne0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        b51Var.p0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        b51Var.p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        b51Var.q0 = frameLayout2;
        frameLayout2.setOnClickListener(new bi.o(24));
        b51Var.q0.addView(b51Var.p0, c8.na.e(-1, 72, 81));
        b51Var.q0.setClipToPadding(false);
        int i12 = 0;
        while (true) {
            qh.b[] bVarArr = b51Var.r0;
            if (i12 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i12];
            bVar.setOnClickListener(new tm0(b51Var, i12, i11));
            b51Var.p0.addView(b51Var.r0[i12]);
            b51Var.p0.j(bVar, true, false);
            i12++;
        }
        b51Var.i0 = new z31(b51Var, b51Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            sb sbVar = new sb(b51Var, -j3, b51Var.getResourceProvider());
            b51Var.j0 = sbVar;
            sbVar.G.setCaptureSectionsDecoratorAllowed(true);
            b51Var.glassEngine.b(b51Var.j0.G);
        }
        if (z11) {
            frameLayout = frameLayout3;
            i7 = -1;
            xd xdVar = new xd(b51Var.getParentActivity(), b51Var, b51Var.currentAccount, -j3, b51Var.getResourceProvider(), b51Var.glassEngine, org.telegram.messenger.v3.V(O0) && P0.can_view_revenue, P0.can_view_stars_revenue);
            b51Var = b51Var;
            b51Var.k0 = xdVar;
            xdVar.Y0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i7 = -1;
        }
        boolean z12 = z10;
        FrameLayout frameLayout4 = frameLayout;
        b51Var.i0.setAdapter(new a41(b51Var, z12, R, z11, frameLayout4));
        boolean z13 = b51Var.o0;
        boolean z14 = R && !z13;
        b51Var.c = z14;
        if (z14 && b51Var.d0) {
            b51Var.i0.setPosition(z12 ? 1 : 0);
        } else if (z14 && b51Var.e0) {
            b51Var.i0.setPosition(((z13 || !R) ? 0 : 1) + (z12 ? 1 : 0));
        }
        b51Var.p0(b51Var.i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(b51Var.getParentActivity());
        frameLayout5.addView(b51Var.i0, c8.na.g());
        View view = new View(context);
        b51Var.l0 = view;
        frameLayout5.addView(view, c8.na.e(i7, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        b51Var.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(b51Var.m0, c8.na.g());
        frameLayout5.addView(b51Var.simpleActionBar);
        if (b51Var.c) {
            b51Var.setBulletinDelegate(new bi.t(13));
            b51Var.q0.setBackground(b51Var.getBaseSimpleGlass().b(b51Var.q0));
            frameLayout5.addView(b51Var.q0, c8.na.e(i7, -2, 80));
        }
        b51Var.fragmentView = frameLayout5;
        b41 b41Var = new b41(b51Var, context);
        b51Var.T = b41Var;
        b41Var.setCaptureSectionsDecoratorAllowed(true);
        b51Var.T.setSections(true);
        b51Var.T.setClipToPadding(false);
        b51Var.glassEngine.b(b51Var.T);
        b51Var.T.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        b51Var.b0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(context);
        b51Var.W = qh0Var;
        qh0Var.setAutoRepeat(true);
        b51Var.W.f(R.raw.statistic_preload, 120, 120, null);
        b51Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.n6.Fj;
        org.telegram.ui.ActionBar.u6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.gd.N0(2131748584, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.gd.N0(2131748583, null));
        textView2.setGravity(1);
        b51Var.b0.addView(b51Var.W, c8.na.t(120, 120, 1, 0, 0, 0, 20));
        b51Var.b0.addView(textView, c8.na.t(-2, -2, 1, 0, 0, 0, 10));
        b51Var.b0.addView(textView2, c8.na.r(-2, -2, 1));
        frameLayout4.addView(b51Var.b0, c8.na.d(org.telegram.messenger.ks.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (b51Var.X == null) {
            b51Var.X = new g41(b51Var);
        }
        b51Var.T.setAdapter(b51Var.X);
        v4.c0 c0Var = new v4.c0();
        b51Var.U = c0Var;
        b51Var.T.setLayoutManager(c0Var);
        b51Var.Y = new c41();
        b51Var.T.setItemAnimator(null);
        int i15 = 2;
        b51Var.T.j(new b21(b51Var, i15));
        b51Var.T.setOnItemClickListener(new xx0(b51Var, 6));
        b51Var.T.setOnItemLongClickListener(new y31(b51Var));
        frameLayout4.addView(b51Var.T);
        b51Var.S = new org.telegram.ui.Components.zn(context, null, false, null);
        TLRPC.Chat O02 = b51Var.getMessagesController().O0(Long.valueOf(j3));
        b51Var.S.setChatAvatar(O02);
        b51Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        b51Var.simpleActionBar.setTitle(O02 == null ? "" : O02.title);
        b51Var.simpleActionBar.setActionBarMenuOnItemClick(new gs0(b51Var, 15));
        b51Var.S.i(org.telegram.ui.ActionBar.n6.x0(null, i13, false), org.telegram.ui.ActionBar.n6.x0(null, i14, false));
        boolean z15 = b51Var.B0;
        m4 m4Var = b51Var.F0;
        if (z15) {
            b51Var.b0.setAlpha(0.0f);
            org.telegram.messenger.g0.h3(m4Var, 500L);
            b51Var.b0.setVisibility(0);
            b51Var.T.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(m4Var);
            b51Var.b0.setVisibility(8);
            b51Var.T.setVisibility(0);
        }
        fh.g c10 = b51Var.getBaseSimpleGlass().c.c(b51Var.p0, c8.j0.g(b51Var.resourceProvider), false);
        org.telegram.messenger.m10.s(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
        b51Var.p0.setBackground(c10);
        b51Var.glassEngine.c(b51Var.i0);
        ri.a baseSimpleGlass = b51Var.getBaseSimpleGlass();
        z31 z31Var = b51Var.i0;
        org.telegram.ui.ActionBar.z4 z4Var = b51Var.simpleActionBar;
        org.telegram.ui.ActionBar.i6 i6Var = b51Var.resourceProvider;
        baseSimpleGlass.m = frameLayout5;
        baseSimpleGlass.n = z31Var;
        baseSimpleGlass.a.c(z31Var);
        baseSimpleGlass.g(frameLayout5, z4Var, i6Var);
        b51Var.n0 = new te.a(0, new y31(b51Var), org.telegram.ui.Components.kr.h, 380L, false);
        xd xdVar2 = b51Var.k0;
        if (xdVar2 != null) {
            ri.a baseSimpleGlass2 = b51Var.getBaseSimpleGlass();
            View view2 = xdVar2.b1.d;
            fh.g c11 = baseSimpleGlass2.c.c(view2, null, false);
            c11.p(c8.j0.m(xdVar2.o0));
            c11.q(org.telegram.messenger.g0.L(9.66f));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = b51Var.k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            b51Var.m0.addView(transactionTabs, layoutParams);
            b51Var.k0.setTabsPinnedChangedListener(new qu0(b51Var, 20));
            b51Var.n0.a(b51Var.k0.f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new gk(b51Var, i15));
        b51Var.getBaseSimpleGlass().o = new vu(b51Var, frameLayout5, new a6(i10, frameLayout5), i10);
        b51Var.getBaseSimpleGlass().n = null;
        b51Var.simpleActionBar.setBackground(null);
        b51Var.l0.setBackground(b51Var.getBaseSimpleGlass().a(b51Var.l0));
        org.telegram.messenger.g0.E2(b51Var.S.e);
        frameLayout5.addView(b51Var.S.e, c8.na.e(42, 42, 53));
        b51Var.f0();
        b51Var.fragmentView.setBackgroundColor(b51Var.getThemedColor(org.telegram.ui.ActionBar.n6.a7));
        b51Var.C0 = new o41(b51Var.X, b51Var.U);
        return b51Var.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        int i11 = 0;
        if (i7 == org.telegram.messenger.ks.A5) {
            if (((fi.h6) objArr[0]) == this.D0) {
                m0();
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.f();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.X2) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.g2 g2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.g2) p5.c.h(2, fragmentStack) : null;
            if (g2Var instanceof rn) {
                ((ActionBarLayout) getParentLayout()).d0(g2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.g2 g2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.g2) p5.c.h(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (g2Var2 instanceof ProfileActivity) {
                    wg.h.f(g2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.g2 g2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.g2) p5.c.h(3, fragmentStack2) : null;
            if (g2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).d0(g2Var2, false);
            }
            finishFragment();
            if (g2Var3 instanceof bn) {
                wg.h.f(g2Var3, chat, true);
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ks.D) {
            if (i7 == org.telegram.messenger.ks.T) {
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
                arrayList = this.v0;
                if (i12 >= size) {
                    break;
                }
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i12);
                int i13 = this.t0.get(fjVar.e1(), -1);
                if (i13 >= 0 && ((y41) arrayList.get(i13)).b() == fjVar.e1()) {
                    if (fjVar.Z) {
                        arrayList3.add((y41) arrayList.get(i13));
                    } else {
                        ((y41) arrayList.get(i13)).b = fjVar;
                    }
                }
                i12++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.w0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                y41 y41Var = (y41) arrayList.get(i11);
                if (y41Var.b == null) {
                    this.s0 = y41Var.b();
                    break;
                } else {
                    arrayList4.add(y41Var);
                    i11++;
                }
            }
            if (arrayList4.size() < 20) {
                k0();
            }
            r0();
            if (this.X != null) {
                this.T.setItemAnimator(null);
                this.C0.f();
            }
        }
    }

    public final void f0() {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.l0 != null) {
            int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.l0.setLayoutParams(layoutParams);
            }
            t0();
        }
        int L2 = this.c ? org.telegram.messenger.g0.L(72.0f) : 0;
        org.telegram.messenger.g0.z3(this.S.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
        this.q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        b41 b41Var = this.T;
        if (b41Var != null) {
            i0.b bVar = this.mSystemInsets;
            ri.a.e(b41Var, bVar.b, bVar.d, currentActionBarHeight, L2);
        }
        sb sbVar = this.j0;
        if (sbVar != null) {
            org.telegram.ui.Components.ek0 ek0Var = sbVar.G;
            i0.b bVar2 = this.mSystemInsets;
            ri.a.e(ek0Var, bVar2.b, bVar2.d, currentActionBarHeight, L2);
        }
        xd xdVar = this.k0;
        if (xdVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i7 = bVar3.b;
            int i10 = bVar3.d;
            xdVar.V0 = i7;
            xdVar.W0 = i10;
            xdVar.X0 = L2;
            int D = org.telegram.messenger.m10.D(48.0f, i7, -org.telegram.messenger.g0.L(8.0f));
            int D2 = org.telegram.messenger.m10.D(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.g51 g51Var = xdVar.Y0;
            org.telegram.messenger.g0.z3(g51Var, 0, D, 0, D2);
            g51Var.setPadding(g51Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7) - D, g51Var.getPaddingRight(), (i10 + L2) - D2);
            xdVar.z(-D, -D2);
            xdVar.B();
            xdVar.requestLayout();
            xdVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        g6 g6Var = new g6(21, this);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 0, new Class[]{ng.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.j5));
        if (this.c0) {
            while (i7 < 6) {
                n0(i7 == 0 ? this.d : i7 == 1 ? this.I : i7 == 2 ? this.J : i7 == 3 ? this.K : i7 == 4 ? this.L : this.M, arrayList, g6Var);
                i7++;
            }
        } else {
            while (i7 < 12) {
                n0(i7 == 0 ? this.d : i7 == 1 ? this.h : i7 == 2 ? this.n : i7 == 3 ? this.r : i7 == 4 ? this.s : i7 == 5 ? this.w : i7 == 6 ? this.y : i7 == 7 ? this.e : i7 == 8 ? this.x : i7 == 9 ? this.E : i7 == 10 ? this.F : this.G, arrayList, g6Var);
                i7++;
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        z31 z31Var;
        if (motionEvent != null && this.k0 != null && (z31Var = this.i0) != null) {
            View currentView = z31Var.getCurrentView();
            xd xdVar = this.k0;
            if (currentView == xdVar && xdVar.G((motionEvent.getX() - this.i0.getX()) - this.k0.getX(), (motionEvent.getY() - this.i0.getY()) - this.k0.getY())) {
                return false;
            }
        }
        z31 z31Var2 = this.i0;
        if (z31Var2 == null || (z31Var2.b == 0 && z31Var2.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0(n41[] n41VarArr) {
        g41 g41Var = this.X;
        if (g41Var != null) {
            g41Var.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        org.telegram.messenger.g0.r(this.F0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new zx(this, 29));
        this.T.setVisibility(0);
        this.T.setAlpha(0.0f);
        this.T.animate().alpha(1.0f).setDuration(230L).start();
        for (n41 n41Var : n41VarArr) {
            if (n41Var != null && n41Var.d == null && n41Var.f != null) {
                n41Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new fh(2, this, n41Var));
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.v0;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = this.t0.get(this.s0); i10 < size; i10++) {
            if (((y41) arrayList.get(i10)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((y41) arrayList.get(i10)).b()));
                i7++;
                if (i7 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(this.b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new u31(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.o0) {
            return;
        }
        boolean z10 = this.c0;
        long j3 = this.b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new u31(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        ArrayList arrayList2 = this.x0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            y41 y41Var = (y41) obj;
            org.telegram.messenger.fj f10 = this.D0.f(y41Var.b());
            if (f10 != null) {
                y41Var.b = f10;
                arrayList.add(y41Var);
            }
        }
        this.u0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof m41) {
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.y6) || this.T.b1()) {
            if (view instanceof ng.c) {
                ((ng.c) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof org.telegram.ui.Components.lq) {
            org.telegram.ui.Components.lq lqVar = (org.telegram.ui.Components.lq) background;
            if ((lqVar.a instanceof ColorDrawable) && lqVar.b != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.b7, false);
                if (this.H0 == null || this.I0 != x02) {
                    this.I0 = x02;
                    this.H0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) lqVar.a).setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false));
                lqVar.b.setColorFilter(this.H0);
                view.invalidate();
                return;
            }
        }
        org.telegram.ui.Components.lq lqVar2 = new org.telegram.ui.Components.lq(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false)), org.telegram.ui.ActionBar.n6.Y0(org.telegram.messenger.t0.b, R.drawable.greydivider, org.telegram.ui.ActionBar.n6.b7), 0, 0);
        lqVar2.x = true;
        view.setBackground(lqVar2);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        xi.e eVar = this.G0;
        if (eVar != null) {
            eVar.b();
            this.G0 = null;
        }
        org.telegram.messenger.ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(org.telegram.messenger.ks.D);
        eVar2.c(org.telegram.messenger.ks.T);
        eVar2.c(org.telegram.messenger.ks.X2);
        eVar2.c(org.telegram.messenger.ks.A5);
        this.G0 = eVar2;
        fi.p6 R1 = getMessagesController().R1();
        long j3 = this.b;
        fi.h6 A = R1.A(2, -1, -j3, true);
        this.D0 = A;
        if (A != null) {
            this.E0 = A.o();
        }
        if (this.a != null) {
            l0();
        } else {
            org.telegram.messenger.mp.u1(this.currentAccount).b3(this.classGuid, j3, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        xi.e eVar = this.G0;
        if (eVar != null) {
            eVar.b();
            this.G0 = null;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.h0;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
            t1VarArr[0] = null;
        }
        fi.h6 h6Var = this.D0;
        if (h6Var != null) {
            h6Var.z(this.E0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        f0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.zn znVar = this.S;
            if (znVar != null) {
                znVar.i(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fj, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gj, false));
            }
            s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(int i7, boolean z10) {
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.r0;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10].f(i10 == i7, z10);
            i10++;
        }
    }

    public final void q0(boolean z10, float f10) {
        for (int i7 = 0; i7 < this.r0.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            qh.b bVar = this.r0[i7];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
        }
        this.p0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.z0;
        arrayList.clear();
        arrayList.addAll(this.w0);
        arrayList.addAll(this.y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.messenger.ok(4))));
    }

    public final void s0() {
        b41 b41Var = this.T;
        if (b41Var != null) {
            int childCount = b41Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                o0(this.T.getChildAt(i7));
            }
            int hiddenChildCount = this.T.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                o0(this.T.V(i10));
            }
            int cachedChildCount = this.T.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                o0(this.T.P(i11));
            }
            int attachedScrapChildCount = this.T.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                o0(this.T.O(i12));
            }
            this.T.getRecycledViewPool().a();
        }
        lg.f fVar = this.a0;
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
        boolean z10;
        float f10;
        if (this.l0 == null || this.m0 == null) {
            return;
        }
        xd xdVar = this.k0;
        if (xdVar != null && xdVar.getParent() == this.i0) {
            xd xdVar2 = this.k0;
            if (xdVar2.getVisibility() == 0 && xdVar2.Z0.getVisibility() != 0) {
                z10 = true;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    float x10 = this.k0.getX();
                    float width = this.k0.getWidth();
                    f10 = width > 0.0f ? Math.max(0.0f, Math.min(this.i0.getWidth(), x10 + width) - Math.max(0.0f, x10)) / width : 0.0f;
                    this.m0.setTranslationX(this.i0.getX() + x10);
                    this.m0.setTranslationY(this.k0.getY() + this.i0.getY());
                }
                this.m0.setVisibility((z10 || f10 <= 0.0f) ? 4 : 0);
                te.a aVar = this.n0;
                this.l0.setTranslationY((-(1.0f - ((aVar != null ? aVar.e : 0.0f) * f10))) * org.telegram.messenger.g0.L(44.0f));
            }
        }
        z10 = false;
        if (z10) {
        }
        this.m0.setVisibility((z10 || f10 <= 0.0f) ? 4 : 0);
        te.a aVar2 = this.n0;
        this.l0.setTranslationY((-(1.0f - ((aVar2 != null ? aVar2.e : 0.0f) * f10))) * org.telegram.messenger.g0.L(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
