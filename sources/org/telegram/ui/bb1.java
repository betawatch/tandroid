package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class bb1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final w5 B0;
    public final bh.f C0;
    public final gh.d D0;
    public na1 E;
    public final gh.d E0;
    public na1 F;
    public final bh.b F0;
    public xa1 G;
    public y91 G0;
    public na1 H;
    public final ArrayList H0;
    public na1 I;
    public final RectF I0;
    public na1 J;
    public final RectF J0;
    public na1 K;
    public na1 L;
    public na1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.co R;
    public ca1 S;
    public bh.l T;
    public s4.c0 U;
    public final LruCache V;
    public org.telegram.ui.Components.aj0 W;
    public ga1 X;
    public z91 Y;
    public ab1 Z;
    public TLRPC.ChatFull a;
    public jg.f a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public na1 d;
    public final boolean d0;
    public na1 e;
    public final boolean e0;
    public wa1 f;
    public long f0;
    public long g0;
    public na1 h;
    public final org.telegram.ui.ActionBar.b2[] h0;
    public di.i1 i0;
    public cc j0;
    public ke k0;
    public final boolean l0;
    public gh0 m0;
    public na1 n;
    public ph.b[] n0;
    public int o0;
    public final SparseIntArray p0;
    public final SparseIntArray q0;
    public na1 r;
    public final ArrayList r0;
    public na1 s;
    public final ArrayList s0;
    public final ArrayList t0;
    public final ArrayList u0;
    public na1 v;
    public final ArrayList v0;
    public na1 w;
    public boolean w0;
    public na1 x;
    public boolean x0;
    public na1 y;
    public oa1 y0;
    public bi.l8 z0;

    public bb1(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.h0 = new org.telegram.ui.ActionBar.b2[1];
        this.o0 = -1;
        this.p0 = new SparseIntArray();
        this.q0 = new SparseIntArray();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.x0 = true;
        this.B0 = new w5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.H0 = arrayList;
        RectF rectF = new RectF();
        this.I0 = rectF;
        RectF rectF2 = new RectF();
        this.J0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = bundle.getLong("chat_id");
        this.b = j3;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.l0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().getChatFull(j3);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.C0 = null;
            this.D0 = null;
            this.E0 = null;
            this.F0 = new bh.b(cVar);
            return;
        }
        this.C0 = new bh.f(false);
        this.D0 = new gh.d(null);
        gh.d dVar = new gh.d(null);
        this.E0 = dVar;
        bh.b bVar = new bh.b(dVar);
        this.F0 = bVar;
        bVar.f = LiteMode.isEnabled(262144);
    }

    public static /* synthetic */ void U(bb1 bb1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(bb1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            bb1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new v91(bb1Var, arrayList, 0));
    }

    public static void V(final bb1 bb1Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        ArrayList arrayList3;
        int i10;
        int i11;
        ArrayList arrayList4;
        String str4;
        ArrayList arrayList5 = bb1Var.N;
        ArrayList arrayList6 = bb1Var.O;
        ArrayList arrayList7 = bb1Var.r0;
        String str5 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final na1[] na1VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            na1 na1Var = na1VarArr[2];
            if (na1Var != null) {
                na1Var.n = true;
            }
            wa1 wa1Var = new wa1();
            com.google.firebase.messaging.s a2 = wa1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            wa1Var.o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            wa1Var.p = (String) a2.b;
            wa1Var.q = (String) a2.e;
            wa1Var.r = ((Boolean) a2.c).booleanValue();
            wa1Var.s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.s a10 = wa1.a(tL_broadcastStats.reactions_per_story);
            wa1Var.t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            wa1Var.u = (String) a10.b;
            wa1Var.v = (String) a10.e;
            wa1Var.w = ((Boolean) a10.c).booleanValue();
            wa1Var.x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.s a11 = wa1.a(tL_broadcastStats.views_per_story);
            wa1Var.y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            wa1Var.z = (String) a11.b;
            wa1Var.A = (String) a11.e;
            wa1Var.B = ((Boolean) a11.c).booleanValue();
            wa1Var.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.s a12 = wa1.a(tL_broadcastStats.shares_per_story);
            wa1Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            wa1Var.E = (String) a12.b;
            wa1Var.F = (String) a12.e;
            wa1Var.G = ((Boolean) a12.c).booleanValue();
            wa1Var.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i12 / ((float) d10)) * 100.0f);
            wa1Var.a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            wa1Var.b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs == 0.0f) {
                i10 = i12;
                wa1Var.c = "";
            } else {
                int i13 = (int) abs;
                if (abs == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12 > 0 ? str3 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    wa1Var.c = sb2.toString() + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i12 > 0 ? str3 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    wa1Var.c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
                }
            }
            wa1Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i14 / ((float) d12)) * 100.0f);
            wa1Var.i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            wa1Var.j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 == 0 || abs2 == 0.0f) {
                wa1Var.k = "";
            } else {
                int i15 = (int) abs2;
                if (abs2 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i14 > 0 ? str3 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    wa1Var.k = sb4.toString() + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i14 > 0 ? str3 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    wa1Var.k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs2), "%");
                }
            }
            wa1Var.l = i14 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i16 / ((float) d14)) * 100.0f);
            wa1Var.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            wa1Var.f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 == 0 || abs3 == 0.0f) {
                wa1Var.g = "";
            } else {
                int i17 = (int) abs3;
                if (abs3 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i16 > 0 ? str3 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    wa1Var.g = sb6.toString() + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i16 > 0 ? str3 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    wa1Var.g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs3), "%");
                }
            }
            wa1Var.h = i16 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            wa1Var.m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                wa1Var.n = a4.a.m(i18, "%");
            } else {
                wa1Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            bb1Var.f = wa1Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            bb1Var.f0 = tL_statsDateRangeDays.max_date * 1000;
            bb1Var.g0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                int i22 = i21 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ya1 ya1Var = new ya1();
                ya1Var.a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(ya1Var);
                    str4 = str5;
                    i11 = i22;
                    bb1Var.p0.put(ya1Var.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str4 = str5;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(ya1Var.b()));
                    bb1Var.t0.add(ya1Var);
                    bb1Var.q0.put(ya1Var.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str5 = str4;
                i21 = i11;
                arrayList8 = arrayList4;
                size = i23;
            }
            ArrayList arrayList12 = arrayList8;
            str = str5;
            AndroidUtilities.runOnUIThread(new v91(bb1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                bb1Var.getMessagesStorage().getMessages(-bb1Var.b, 0L, false, arrayList12.size(), ((ya1) arrayList12.get(0)).b(), 0, 0, bb1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            final int i24 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(bb1Var) { // from class: org.telegram.ui.u91
                public final /* synthetic */ bb1 b;

                {
                    this.b = bb1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            bb1 bb1Var2 = this.b;
                            bb1Var2.getClass();
                            na1[] na1VarArr2 = na1VarArr;
                            bb1Var2.d = na1VarArr2[0];
                            bb1Var2.H = na1VarArr2[1];
                            bb1Var2.I = na1VarArr2[2];
                            bb1Var2.J = na1VarArr2[3];
                            bb1Var2.K = na1VarArr2[4];
                            bb1Var2.L = na1VarArr2[5];
                            bb1Var2.e = na1VarArr2[6];
                            bb1Var2.M = na1VarArr2[7];
                            bb1Var2.g0(na1VarArr2);
                            break;
                        default:
                            bb1 bb1Var3 = this.b;
                            bb1Var3.getClass();
                            na1[] na1VarArr3 = na1VarArr;
                            bb1Var3.r = na1VarArr3[0];
                            bb1Var3.h = na1VarArr3[1];
                            bb1Var3.e = na1VarArr3[2];
                            bb1Var3.n = na1VarArr3[3];
                            bb1Var3.d = na1VarArr3[4];
                            bb1Var3.s = na1VarArr3[5];
                            bb1Var3.v = na1VarArr3[6];
                            bb1Var3.w = na1VarArr3[7];
                            bb1Var3.x = na1VarArr3[8];
                            bb1Var3.y = na1VarArr3[9];
                            bb1Var3.E = na1VarArr3[10];
                            bb1Var3.F = na1VarArr3[11];
                            bb1Var3.g0(na1VarArr3);
                            break;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final na1[] na1VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            na1 na1Var2 = na1VarArr2[6];
            if (na1Var2 != null) {
                na1Var2.n = true;
            }
            na1 na1Var3 = na1VarArr2[7];
            if (na1Var3 != null) {
                na1Var3.o = true;
            }
            xa1 xa1Var = new xa1();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i25 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d16)) * 100.0f);
            xa1Var.a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            xa1Var.b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i25 == 0 || abs4 == 0.0f) {
                xa1Var.c = "";
            } else {
                int i26 = (int) abs4;
                if (abs4 == i26) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i25 > 0 ? str3 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    xa1Var.c = sb8.toString() + " (" + i26 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i25 > 0 ? str3 : "");
                    sb9.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    xa1Var.c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs4), str);
                }
            }
            xa1Var.d = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i27 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d18)) * 100.0f);
            xa1Var.i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            xa1Var.j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i27 == 0 || abs5 == 0.0f) {
                xa1Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i27 > 0 ? str3 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i27, 0));
                xa1Var.k = sb10.toString();
            }
            xa1Var.l = i27 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d20)) * 100.0f);
            xa1Var.m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            xa1Var.n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i28 == 0 || abs6 == 0.0f) {
                xa1Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i28 > 0 ? str3 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i28, 0));
                xa1Var.o = sb11.toString();
            }
            xa1Var.p = i28 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i29 / ((float) d22)) * 100.0f);
            xa1Var.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            xa1Var.f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i29 == 0 || abs7 == 0.0f) {
                xa1Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i29 > 0 ? str3 : "");
                sb12.append(AndroidUtilities.formatWholeNumber(i29, 0));
                xa1Var.g = sb12.toString();
            }
            xa1Var.h = i29 >= 0;
            bb1Var.G = xa1Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            bb1Var.f0 = tL_statsDateRangeDays2.max_date * 1000;
            bb1Var.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ua1 ua1Var = new ua1();
                    ua1Var.a = ua1.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb13 = new StringBuilder();
                    int i31 = tL_statsGroupTopPoster.messages;
                    if (i31 > 0) {
                        sb13.append(LocaleController.formatPluralString("messages", i31, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    ua1Var.b = sb13.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(ua1Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(ua1Var);
                    i30++;
                    arrayList2 = arrayList3;
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
                for (int i32 = 0; i32 < tL_megagroupStats.top_admins.size(); i32++) {
                    ArrayList arrayList19 = bb1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i32);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ua1 ua1Var2 = new ua1();
                    ua1Var2.a = ua1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb14 = new StringBuilder();
                    int i33 = tL_statsGroupTopAdmin.deleted;
                    if (i33 > 0) {
                        sb14.append(LocaleController.formatPluralString("Deletions", i33, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    ua1Var2.b = sb14.toString();
                    arrayList19.add(ua1Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i34 = 0; i34 < tL_megagroupStats.top_inviters.size(); i34++) {
                    ArrayList arrayList22 = bb1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i34);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ua1 ua1Var3 = new ua1();
                    ua1Var3.a = ua1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i35 = tL_statsGroupTopInviter.invitations;
                    if (i35 > 0) {
                        ua1Var3.b = LocaleController.formatPluralString("Invitations", i35, new Object[0]);
                    } else {
                        ua1Var3.b = "";
                    }
                    arrayList22.add(ua1Var3);
                }
            }
            final int i36 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(bb1Var) { // from class: org.telegram.ui.u91
                public final /* synthetic */ bb1 b;

                {
                    this.b = bb1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i36) {
                        case 0:
                            bb1 bb1Var2 = this.b;
                            bb1Var2.getClass();
                            na1[] na1VarArr22 = na1VarArr2;
                            bb1Var2.d = na1VarArr22[0];
                            bb1Var2.H = na1VarArr22[1];
                            bb1Var2.I = na1VarArr22[2];
                            bb1Var2.J = na1VarArr22[3];
                            bb1Var2.K = na1VarArr22[4];
                            bb1Var2.L = na1VarArr22[5];
                            bb1Var2.e = na1VarArr22[6];
                            bb1Var2.M = na1VarArr22[7];
                            bb1Var2.g0(na1VarArr22);
                            break;
                        default:
                            bb1 bb1Var3 = this.b;
                            bb1Var3.getClass();
                            na1[] na1VarArr3 = na1VarArr2;
                            bb1Var3.r = na1VarArr3[0];
                            bb1Var3.h = na1VarArr3[1];
                            bb1Var3.e = na1VarArr3[2];
                            bb1Var3.n = na1VarArr3[3];
                            bb1Var3.d = na1VarArr3[4];
                            bb1Var3.s = na1VarArr3[5];
                            bb1Var3.v = na1VarArr3[6];
                            bb1Var3.w = na1VarArr3[7];
                            bb1Var3.x = na1VarArr3[8];
                            bb1Var3.y = na1VarArr3[9];
                            bb1Var3.E = na1VarArr3[10];
                            bb1Var3.F = na1VarArr3[11];
                            bb1Var3.g0(na1VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void W(bb1 bb1Var) {
        RectF rectF = bb1Var.J0;
        bh.f fVar = bb1Var.C0;
        if (Build.VERSION.SDK_INT < 31 || fVar == null || bb1Var.fragmentView == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (bb1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        bb1Var.I0.set(0.0f, -dp, bb1Var.fragmentView.getMeasuredWidth(), bb1Var.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, bb1Var.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(2, bb1Var.H0);
        fVar.e(bb1Var.G0, bb1Var.fragmentView.getMeasuredWidth(), bb1Var.fragmentView.getMeasuredHeight());
    }

    public static void Y(bb1 bb1Var) {
        View currentView = bb1Var.i0.getCurrentView();
        cc ccVar = bb1Var.j0;
        if (currentView == ccVar) {
            bb1Var.actionBar.setAdaptiveBackground(ccVar.F);
            return;
        }
        ke keVar = bb1Var.k0;
        if (currentView == keVar) {
            bb1Var.actionBar.setAdaptiveBackground(keVar.a1);
        } else {
            bb1Var.actionBar.setAdaptiveBackground(bb1Var.S);
        }
    }

    public static void Z(bb1 bb1Var) {
        ab1 ab1Var = bb1Var.Z;
        if (ab1Var != null) {
            ab1Var.b = true;
        }
        int childCount = bb1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = bb1Var.S.getChildAt(i10);
            if (childAt instanceof ma1) {
                ((ma1) childAt).b.t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new v5(-chat.id) : new bb1(bundle);
    }

    public static kg.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new kg.b(jSONObject);
        }
        if (i10 == 1) {
            return new kg.c(jSONObject);
        }
        if (i10 == 2) {
            kg.d dVar = new kg.d(jSONObject);
            int length = ((kg.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                dVar.l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = dVar.l;
                    jArr[i11] = jArr[i11] + ((kg.a) dVar.d.get(i12)).a[i11];
                }
            }
            dVar.m = new SegmentTree(dVar.l);
            return dVar;
        }
        if (i10 != 4) {
            return null;
        }
        kg.e eVar = new kg.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j3 = 0;
            for (int i13 = 0; i13 < eVar.d.size(); i13++) {
                int length2 = eVar.a.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    long j10 = ((kg.a) eVar.d.get(i13)).a[i14];
                    jArr2[i13] = jArr2[i13] + j10;
                    if (j10 == 0) {
                        iArr[i13] = iArr[i13] + 1;
                    }
                }
                j3 += jArr2[i13];
            }
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < eVar.d.size(); i15++) {
                if (jArr2[i15] / j3 < 0.01d && iArr[i15] > eVar.a.length / 2.0f) {
                    arrayList.add((kg.a) eVar.d.get(i15));
                }
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj = arrayList.get(i16);
                i16++;
                eVar.d.remove((kg.a) obj);
            }
        }
        int length3 = ((kg.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i17 = 0; i17 < length3; i17++) {
            eVar.l[i17] = 0;
            for (int i18 = 0; i18 < size3; i18++) {
                long[] jArr3 = eVar.l;
                jArr3[i17] = jArr3[i17] + ((kg.a) eVar.d.get(i18)).a[i17];
            }
        }
        new SegmentTree(eVar.l);
        return eVar;
    }

    public static na1 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        na1 na1Var = new na1(str, i10);
        na1Var.m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                kg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                na1Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                na1Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.a) == null || jArr2.length < 2) {
                    na1Var.l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    na1Var.e = new kg.e(e02, j3);
                    na1Var.c = j3;
                    return na1Var;
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            na1Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return na1Var;
    }

    public static void k0(na1 na1Var, ArrayList arrayList, org.telegram.ui.ActionBar.k6 k6Var) {
        kg.b bVar;
        if (na1Var == null || (bVar = na1Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            kg.a aVar = (kg.a) obj;
            int i11 = aVar.g;
            if (i11 >= 0) {
                if (!org.telegram.ui.ActionBar.j6.c1(i11)) {
                    org.telegram.ui.ActionBar.j6.u1(aVar.g, org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.j6.nl[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, aVar.g));
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof ma1) {
            ((ma1) view).d();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.a7) {
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7), 0, 0);
            oqVar.w = true;
            view.setBackground(oqVar);
            return;
        }
        if (view instanceof lg.c) {
            ((lg.c) view).a();
        } else if (view instanceof va1) {
            int i10 = va1.d;
            ((va1) view).b();
        }
    }

    public final void c0() {
        int i10 = AndroidUtilities.navigationBarHeight;
        int i11 = AndroidUtilities.statusBarHeight;
        gh0 gh0Var = this.m0;
        if (gh0Var != null) {
            gh0Var.setTranslationY(-i10);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        int dp = (this.c ? AndroidUtilities.dp(72.0f) : 0) + i10;
        ca1 ca1Var = this.S;
        if (ca1Var != null) {
            ca1Var.setPadding(0, currentActionBarHeight, 0, dp);
        }
        cc ccVar = this.j0;
        if (ccVar != null) {
            ccVar.F.setPadding(0, currentActionBarHeight, 0, dp);
        }
        ke keVar = this.k0;
        if (keVar != null) {
            keVar.a1.setPadding(0, currentActionBarHeight, 0, dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        bb1 bb1Var = this;
        bb1Var.a0 = new jg.f(null);
        MessagesController messagesController = MessagesController.getInstance(bb1Var.currentAccount);
        long j3 = bb1Var.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(bb1Var.currentAccount).getChatFull(j3);
        boolean z10 = chatFull != null && chatFull.can_view_stats;
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z11 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(ph.b.b(context, bb1Var.resourceProvider, ph.a.I, R.string.Statistics));
        }
        arrayList.add(ph.b.b(context, bb1Var.resourceProvider, ph.a.N, R.string.Boosts));
        if (z11) {
            arrayList.add(ph.b.b(context, bb1Var.resourceProvider, ph.a.O, R.string.Monetization));
        }
        bb1Var.n0 = (ph.b[]) arrayList.toArray(new ph.b[0]);
        gh0 gh0Var = new gh0(context, bb1Var.resourceProvider);
        bb1Var.m0 = gh0Var;
        gh0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i10 = 0;
        while (true) {
            ph.b[] bVarArr = bb1Var.n0;
            if (i10 >= bVarArr.length) {
                break;
            }
            ph.b bVar = bVarArr[i10];
            bVar.setOnClickListener(new di.o4(bb1Var, i10, 25));
            bb1Var.m0.addView(bb1Var.n0[i10]);
            bb1Var.m0.i(bVar, true, false);
            i10++;
        }
        bb1Var.i0 = new di.i1(bb1Var, bb1Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            bb1Var.j0 = new cc(bb1Var, -j3, bb1Var.getResourceProvider());
        }
        if (z11) {
            frameLayout = frameLayout2;
            ke keVar = new ke(bb1Var.getParentActivity(), this, bb1Var.currentAccount, -j3, getResourceProvider(), ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            bb1Var = this;
            bb1Var.k0 = keVar;
            keVar.setActionBar(bb1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z12 = z10;
        FrameLayout frameLayout3 = frameLayout;
        bb1Var.i0.setAdapter(new ba1(bb1Var, z12, isBoostSupported, z11, frameLayout3));
        boolean z13 = bb1Var.l0;
        boolean z14 = isBoostSupported && !z13;
        bb1Var.c = z14;
        if (z14 && bb1Var.d0) {
            bb1Var.i0.setPosition(z12 ? 1 : 0);
        } else if (z14 && bb1Var.e0) {
            bb1Var.i0.setPosition((z12 ? 1 : 0) + ((z13 || !isBoostSupported) ? 0 : 1));
        }
        bb1Var.m0(bb1Var.i0.getCurrentPosition(), false);
        w8 w8Var = new w8(bb1Var, bb1Var.getParentActivity(), 8);
        bb1Var.actionBar.setDrawBlurBackground(w8Var);
        w8Var.setBackgroundColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        ih.k kVar = new ih.k(w8Var);
        bh.b bVar2 = bb1Var.F0;
        bVar2.d = kVar;
        bVar2.e = w8Var;
        w8Var.addView(bb1Var.i0, w7.x5.g());
        w8Var.addView(bb1Var.actionBar);
        if (bb1Var.c) {
            w8Var.addView(bb1Var.m0, w7.x5.e(344, 72, 81));
            bb1Var.setBulletinDelegate(new di.c9(12));
        }
        bb1Var.fragmentView = w8Var;
        ca1 ca1Var = new ca1(bb1Var, context);
        bb1Var.S = ca1Var;
        ca1Var.setSections(true);
        bb1Var.S.setClipToPadding(false);
        ca1 ca1Var2 = bb1Var.S;
        Objects.requireNonNull(ca1Var2);
        bb1Var.T = new bh.l(ca1Var2, w8Var, new xs(ca1Var2, 1));
        cc ccVar = bb1Var.j0;
        if (ccVar != null) {
            org.telegram.ui.Components.ll0 ll0Var = ccVar.F;
            Objects.requireNonNull(ll0Var);
            ccVar.G = new bh.l(ll0Var, w8Var, new xs(ll0Var, 0));
            bb1Var.j0.F.j(new aa1(bb1Var, 1));
        }
        ke keVar2 = bb1Var.k0;
        if (keVar2 != null) {
            org.telegram.ui.Components.d61 d61Var = keVar2.a1;
            Objects.requireNonNull(d61Var);
            keVar2.b1 = new bh.l(d61Var, w8Var, new v8(d61Var, 0));
            bb1Var.k0.a1.j(new aa1(bb1Var, 2));
        }
        bb1Var.G0 = new y91(bb1Var, w8Var);
        bb1Var.S.o1();
        LinearLayout linearLayout = new LinearLayout(context);
        bb1Var.b0 = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        bb1Var.W = aj0Var;
        aj0Var.setAutoRepeat(true);
        bb1Var.W.f(R.raw.statistic_preload, 120, 120, null);
        bb1Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView2.setTag(Integer.valueOf(i12));
        org.telegram.messenger.vl.k(R.string.LoadingStatsDescription, textView2, 1);
        bb1Var.b0.addView(bb1Var.W, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        bb1Var.b0.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        bb1Var.b0.addView(textView2, w7.x5.q(-2, -2, 1));
        frameLayout3.addView(bb1Var.b0, w7.x5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (bb1Var.X == null) {
            bb1Var.X = new ga1(bb1Var);
        }
        bb1Var.S.setAdapter(bb1Var.X);
        s4.c0 c0Var = new s4.c0();
        bb1Var.U = c0Var;
        bb1Var.S.setLayoutManager(c0Var);
        bb1Var.Y = new z91();
        bb1Var.S.setItemAnimator(null);
        bb1Var.S.j(new aa1(bb1Var, 0));
        bb1Var.S.setOnItemClickListener(new b31(bb1Var, 6));
        bb1Var.S.setOnItemLongClickListener(new vl0(bb1Var, 18));
        frameLayout3.addView(bb1Var.S);
        org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, null, false, null);
        bb1Var.R = coVar;
        coVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        bb1Var.R.getAvatarImageView().setScaleX(0.9f);
        bb1Var.R.getAvatarImageView().setScaleY(0.9f);
        bb1Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        bb1Var.actionBar.addView(bb1Var.R, 0, w7.x5.d(-2, -1.0f, 51, !bb1Var.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = bb1Var.getMessagesController().getChat(Long.valueOf(j3));
        bb1Var.R.setChatAvatar(chat2);
        bb1Var.R.setTitle(chat2 == null ? "" : chat2.title);
        org.telegram.ui.Components.co coVar2 = bb1Var.R;
        if (coVar2.getSubtitleTextView() != null) {
            coVar2.getSubtitleTextView().setVisibility(8);
        }
        i2.g.x(false, bb1Var.actionBar);
        bb1Var.actionBar.setActionBarMenuOnItemClick(new o81(bb1Var, 2));
        bb1Var.R.i(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        bb1Var.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        bb1Var.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), true);
        bb1Var.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), false);
        bb1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        boolean z15 = bb1Var.x0;
        w5 w5Var = bb1Var.B0;
        if (z15) {
            bb1Var.b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(w5Var, 500L);
            bb1Var.b0.setVisibility(0);
            bb1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            bb1Var.b0.setVisibility(8);
            bb1Var.S.setVisibility(0);
        }
        dh.d c10 = bVar2.c(bb1Var.m0, fh.b.f(bb1Var.resourceProvider), false);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(7.666f));
        bb1Var.m0.setBackground(c10);
        bb1Var.c0();
        bb1Var.y0 = new oa1(bb1Var.X, bb1Var.U);
        return bb1Var.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((bi.l8) objArr[0]) == this.z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.y0.f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.p6.g(2, fragmentStack) : null;
            if (n2Var instanceof xo) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.p6.g(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (n2Var2 instanceof ProfileActivity) {
                    ug.j.f(n2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.p6.g(3, fragmentStack2) : null;
            if (n2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
            }
            finishFragment();
            if (n2Var3 instanceof co) {
                ug.j.f(n2Var3, chat, true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagesDidLoad) {
            if (i10 == NotificationCenter.chatInfoDidLoad) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    i0();
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
            int i13 = 0;
            while (true) {
                arrayList = this.r0;
                if (i13 >= size) {
                    break;
                }
                MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                int i14 = this.p0.get(messageObject.getId(), -1);
                if (i14 >= 0 && ((ya1) arrayList.get(i14)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((ya1) arrayList.get(i14));
                    } else {
                        ((ya1) arrayList.get(i14)).b = messageObject;
                    }
                }
                i13++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.s0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                ya1 ya1Var = (ya1) arrayList.get(i12);
                if (ya1Var.b == null) {
                    this.o0 = ya1Var.b();
                    break;
                } else {
                    arrayList4.add(ya1Var);
                    i12++;
                }
            }
            if (arrayList4.size() < 20) {
                h0();
            }
            o0();
            if (this.X != null) {
                this.S.setItemAnimator(null);
                this.y0.f();
            }
        }
    }

    public final void g0(na1[] na1VarArr) {
        ga1 ga1Var = this.X;
        if (ga1Var != null) {
            ga1Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.x0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.B0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new gk0(this, 24));
        this.S.setVisibility(0);
        this.S.setAlpha(0.0f);
        this.S.animate().alpha(1.0f).setDuration(230L).start();
        for (na1 na1Var : na1VarArr) {
            if (na1Var != null && na1Var.d == null && na1Var.f != null) {
                na1Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new org.telegram.ui.Components.r51(1, this, na1Var));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        xy0 xy0Var = new xy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{lg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.x6));
        int i13 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, i13));
        org.telegram.ui.Components.co coVar = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.l6(coVar != null ? coVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Oi));
        org.telegram.ui.Components.co coVar2 = this.R;
        arrayList.add(new org.telegram.ui.ActionBar.l6(coVar2 != null ? coVar2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.c0) {
            int i14 = 0;
            while (i14 < 6) {
                k0(i14 == 0 ? this.d : i14 == 1 ? this.H : i14 == 2 ? this.I : i14 == 3 ? this.J : i14 == 4 ? this.K : this.L, arrayList, xy0Var);
                i14++;
            }
        } else {
            int i15 = 0;
            while (i15 < 12) {
                k0(i15 == 0 ? this.d : i15 == 1 ? this.h : i15 == 2 ? this.n : i15 == 3 ? this.r : i15 == 4 ? this.s : i15 == 5 ? this.v : i15 == 6 ? this.x : i15 == 7 ? this.e : i15 == 8 ? this.w : i15 == 9 ? this.y : i15 == 10 ? this.E : this.F, arrayList, xy0Var);
                i15++;
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.p0.get(this.o0); i11 < size; i11++) {
            if (((ya1) arrayList.get(i11)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((ya1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.b);
        this.w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new x91(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.l0) {
            return;
        }
        boolean z10 = this.c0;
        long j3 = this.b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new x91(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        di.i1 i1Var = this.i0;
        if (i1Var == null || (i1Var.b == 0 && i1Var.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0() {
        ArrayList arrayList = this.u0;
        arrayList.clear();
        ArrayList arrayList2 = this.t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ya1 ya1Var = (ya1) obj;
            MessageObject f7 = this.z0.f(ya1Var.b());
            if (f7 != null) {
                ya1Var.b = f7;
                arrayList.add(ya1Var);
            }
        }
        this.q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = this.n0;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e(i11 == i10, z10);
            i11++;
        }
    }

    public final void n0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            ph.b bVar = this.n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.v0;
        arrayList.clear();
        arrayList.addAll(this.s0);
        arrayList.addAll(this.u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.ui.Components.y0(1))));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        bi.u8 storiesController = getMessagesController().getStoriesController();
        long j3 = this.b;
        bi.l8 A = storiesController.A(-j3, 2, -1, true);
        this.z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j3, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.h0;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
            b2VarArr[0] = null;
        }
        bi.l8 l8Var = this.z0;
        if (l8Var != null) {
            l8Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
