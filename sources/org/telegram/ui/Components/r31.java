package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.nd1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class r31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public static final /* synthetic */ int f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final g31 G;
    public long H;
    public long I;
    public final ne.b J;
    public dh.d K;
    public dh.d L;
    public float M;
    public float N;
    public org.telegram.ui.ke O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public Boolean T;
    public ValueAnimator U;
    public long V;
    public boolean W;
    public final ne.b a;
    public Utilities.Callback2 a0;
    public final int b;
    public Runnable b0;
    public final long c;
    public Utilities.Callback2 c0;
    public final org.telegram.ui.ActionBar.d6 d;
    public boolean d0;
    public final boolean e;
    public final HashSet e0;
    public final boolean f;
    public final org.telegram.ui.qn h;
    public final boolean n;
    public final FrameLayout r;
    public final e31 s;
    public final q31 v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.ui.Components.d31] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.d31] */
    public r31(Activity activity, org.telegram.ui.qn qnVar, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        ViewGroup viewGroup;
        bs bsVar = bs.h;
        this.a = new ne.b(0, this, bsVar, 380L, true);
        this.J = new ne.b(0, new y21(this), bsVar, 320L, false);
        this.R = 0.0f;
        this.e0 = new HashSet();
        this.h = qnVar;
        this.b = i10;
        this.c = j10;
        this.d = d6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f = isBotForumWithEditableTopics;
        this.n = !org.telegram.messenger.g0.v("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.r = frameLayout;
        addView(frameLayout, w7.z5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.F = frameLayout2;
        addView(frameLayout2, w7.z5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        final int i11 = 0;
        e31 e31Var = new e31(this, activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.d31
            public final /* synthetic */ r31 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i12;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i13 = i11;
                r31 r31Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        t61 t61Var = (t61) obj2;
                        boolean z13 = r31Var.f;
                        int i14 = r31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = r31Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = r31Var.e;
                        int i15 = k31.a;
                        g61 J = g61.J(k31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(r31Var.V == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z15 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z13) {
                                    i12 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (r31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((g61) i2.e.h(1, arrayList)).y |= 8;
                                        }
                                        t61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        t61Var.M();
                                        z15 = true;
                                    }
                                    g61 J2 = g61.J(k31.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = r31Var.V;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            t61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && r31Var.n) {
                            g61 J3 = g61.J(k31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            g61 J4 = g61.J(k31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            g61 J5 = g61.J(k31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                g61 J6 = g61.J(k31.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        r31.b(r31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        t61 t61Var2 = (t61) obj2;
                        boolean z17 = r31Var.e;
                        int i19 = r31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = r31Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = r31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = p31.a;
                            g61 J7 = g61.J(p31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(r31Var.V == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (r31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        t61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        t61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = p31.a;
                                    g61 J8 = g61.J(p31.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = r31Var.V;
                                    if (z17) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    J8.K(j15 == j16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            t61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && r31Var.n) {
                            int i24 = p31.a;
                            g61 J9 = g61.J(p31.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            g61 J10 = g61.J(p31.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            g61 J11 = g61.J(p31.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = p31.a;
                                g61 J12 = g61.J(p31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.q = false;
                                arrayList2.add(J12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new y21(this), new y21(this), d6Var);
        this.s = e31Var;
        final int i12 = 1;
        e31Var.C1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.d31
            public final /* synthetic */ r31 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i13 = i12;
                r31 r31Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        t61 t61Var = (t61) obj2;
                        boolean z13 = r31Var.f;
                        int i14 = r31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = r31Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = r31Var.e;
                        int i15 = k31.a;
                        g61 J = g61.J(k31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(r31Var.V == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z15 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z13) {
                                    i122 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (r31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((g61) i2.e.h(1, arrayList)).y |= 8;
                                        }
                                        t61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        t61Var.M();
                                        z15 = true;
                                    }
                                    g61 J2 = g61.J(k31.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = r31Var.V;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i122;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            t61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && r31Var.n) {
                            g61 J3 = g61.J(k31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            g61 J4 = g61.J(k31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            g61 J5 = g61.J(k31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                g61 J6 = g61.J(k31.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        r31.b(r31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        t61 t61Var2 = (t61) obj2;
                        boolean z17 = r31Var.e;
                        int i19 = r31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = r31Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = r31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = p31.a;
                            g61 J7 = g61.J(p31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(r31Var.V == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (r31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        t61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        t61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = p31.a;
                                    g61 J8 = g61.J(p31.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = r31Var.V;
                                    if (z17) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    J8.K(j15 == j16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            t61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && r31Var.n) {
                            int i24 = p31.a;
                            g61 J9 = g61.J(p31.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            g61 J10 = g61.J(p31.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            g61 J11 = g61.J(p31.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = p31.a;
                                g61 J12 = g61.J(p31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.q = false;
                                arrayList2.add(J12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        e31Var.setWillNotDraw(false);
        e31Var.W2.r = false;
        e31Var.getContext();
        hg.i0 i0Var = new hg.i0((ViewGroup) e31Var, 5);
        e31Var.V2 = i0Var;
        e31Var.setLayoutManager(i0Var);
        frameLayout.addView(e31Var, w7.z5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        e31Var.j(new f31(this, 0));
        if (isBotForumWithEditableTopics) {
            q31 q31Var = new q31(activity, i10, d6Var);
            this.v = q31Var;
            q31Var.c(true, false, this.V == 0);
            final int i13 = 2;
            q31Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.b31
                public final /* synthetic */ r31 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            r31 r31Var = this.b;
                            Boolean bool = r31Var.T;
                            boolean z10 = false;
                            if (bool == null ? !r31Var.Q : !bool.booleanValue()) {
                                z10 = true;
                            }
                            r31Var.d(z10);
                            break;
                        case 1:
                            r31 r31Var2 = this.b;
                            g31 g31Var = r31Var2.G;
                            g31Var.x1(false);
                            e31 e31Var2 = r31Var2.s;
                            e31Var2.x1(false);
                            r31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(g31Var);
                            AndroidUtilities.updateVisibleRows(e31Var2);
                            break;
                        default:
                            this.b.a0.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(q31Var, w7.z5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.v = null;
        }
        final int i14 = 2;
        ViewGroup viewGroup2 = viewGroup;
        g31 g31Var = new g31(activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.d31
            public final /* synthetic */ r31 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i132 = i14;
                r31 r31Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        t61 t61Var = (t61) obj2;
                        boolean z13 = r31Var.f;
                        int i142 = r31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j17 = r31Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = r31Var.e;
                        int i15 = k31.a;
                        g61 J = g61.J(k31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(r31Var.V == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z15 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z13) {
                                    i122 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (r31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((g61) i2.e.h(1, arrayList)).y |= 8;
                                        }
                                        t61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        t61Var.M();
                                        z15 = true;
                                    }
                                    g61 J2 = g61.J(k31.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = r31Var.V;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i122;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            t61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && r31Var.n) {
                            g61 J3 = g61.J(k31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            g61 J4 = g61.J(k31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            g61 J5 = g61.J(k31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                g61 J6 = g61.J(k31.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        r31.b(r31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        t61 t61Var2 = (t61) obj2;
                        boolean z17 = r31Var.e;
                        int i19 = r31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = r31Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = r31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = p31.a;
                            g61 J7 = g61.J(p31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(r31Var.V == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (r31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        t61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        t61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = p31.a;
                                    g61 J8 = g61.J(p31.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = r31Var.V;
                                    if (z17) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    J8.K(j15 == j16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            t61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && r31Var.n) {
                            int i24 = p31.a;
                            g61 J9 = g61.J(p31.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            g61 J10 = g61.J(p31.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            g61 J11 = g61.J(p31.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = p31.a;
                                g61 J12 = g61.J(p31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.q = false;
                                arrayList2.add(J12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new y21(this), new y21(this), d6Var);
        this.G = g31Var;
        final int i15 = 1;
        g31Var.C1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.d31
            public final /* synthetic */ r31 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i132 = i15;
                r31 r31Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        t61 t61Var = (t61) obj2;
                        boolean z13 = r31Var.f;
                        int i142 = r31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j17 = r31Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = r31Var.e;
                        int i152 = k31.a;
                        g61 J = g61.J(k31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(r31Var.V == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z15 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z13) {
                                    i122 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (r31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((g61) i2.e.h(1, arrayList)).y |= 8;
                                        }
                                        t61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        t61Var.M();
                                        z15 = true;
                                    }
                                    g61 J2 = g61.J(k31.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = r31Var.V;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i122;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            t61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && r31Var.n) {
                            g61 J3 = g61.J(k31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            g61 J4 = g61.J(k31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            g61 J5 = g61.J(k31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                g61 J6 = g61.J(k31.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        r31.b(r31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        t61 t61Var2 = (t61) obj2;
                        boolean z17 = r31Var.e;
                        int i19 = r31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = r31Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = r31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = p31.a;
                            g61 J7 = g61.J(p31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(r31Var.V == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (r31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        t61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        t61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = p31.a;
                                    g61 J8 = g61.J(p31.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = r31Var.V;
                                    if (z17) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    J8.K(j15 == j16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            t61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && r31Var.n) {
                            int i24 = p31.a;
                            g61 J9 = g61.J(p31.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            g61 J10 = g61.J(p31.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            g61 J11 = g61.J(p31.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = p31.a;
                                g61 J12 = g61.J(p31.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.q = false;
                                arrayList2.add(J12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        g31Var.W2.r = false;
        g31Var.setClipToPadding(false);
        g31Var.setClipChildren(false);
        viewGroup2.addView(g31Var, w7.z5.d(-1, -1.0f, 119, 0.0f, isBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        g31Var.j(new f31(this, 1));
        final int i16 = 0;
        ImageView i17 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.b31
            public final /* synthetic */ r31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        r31 r31Var = this.b;
                        Boolean bool = r31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !r31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        r31Var.d(z10);
                        break;
                    case 1:
                        r31 r31Var2 = this.b;
                        g31 g31Var2 = r31Var2.G;
                        g31Var2.x1(false);
                        e31 e31Var2 = r31Var2.s;
                        e31Var2.x1(false);
                        r31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(g31Var2);
                        AndroidUtilities.updateVisibleRows(e31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.y = i17;
        final int i18 = 0;
        ImageView i19 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.b31
            public final /* synthetic */ r31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        r31 r31Var = this.b;
                        Boolean bool = r31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !r31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        r31Var.d(z10);
                        break;
                    case 1:
                        r31 r31Var2 = this.b;
                        g31 g31Var2 = r31Var2.G;
                        g31Var2.x1(false);
                        e31 e31Var2 = r31Var2.s;
                        e31Var2.x1(false);
                        r31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(g31Var2);
                        AndroidUtilities.updateVisibleRows(e31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.E = i19;
        frameLayout.addView(i17, w7.z5.e(44, 36, 51));
        viewGroup2.addView(i19, w7.z5.e(64, 48, 51));
        final int i20 = 1;
        ImageView i21 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.b31
            public final /* synthetic */ r31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        r31 r31Var = this.b;
                        Boolean bool = r31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !r31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        r31Var.d(z10);
                        break;
                    case 1:
                        r31 r31Var2 = this.b;
                        g31 g31Var2 = r31Var2.G;
                        g31Var2.x1(false);
                        e31 e31Var2 = r31Var2.s;
                        e31Var2.x1(false);
                        r31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(g31Var2);
                        AndroidUtilities.updateVisibleRows(e31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.w = i21;
        final int i22 = 1;
        ImageView i23 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.b31
            public final /* synthetic */ r31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        r31 r31Var = this.b;
                        Boolean bool = r31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !r31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        r31Var.d(z10);
                        break;
                    case 1:
                        r31 r31Var2 = this.b;
                        g31 g31Var2 = r31Var2.G;
                        g31Var2.x1(false);
                        e31 e31Var2 = r31Var2.s;
                        e31Var2.x1(false);
                        r31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(g31Var2);
                        AndroidUtilities.updateVisibleRows(e31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.x = i23;
        frameLayout.addView(i21, w7.z5.e(44, 36, 51));
        viewGroup2.addView(i23, w7.z5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.g0.v("topicssidetabs", j10, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean v = org.telegram.messenger.g0.v("topicssidetabsb", j10, mainSettings, false);
        this.P = v;
        i19.setImageResource(v ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        f(false);
        g();
        n();
        o();
    }

    public static void a(r31 r31Var, g61 g61Var) {
        if (r31Var.e) {
            Utilities.Callback2 callback2 = r31Var.c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(g61Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (g61Var.B == -2) {
            Runnable runnable = r31Var.b0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = r31Var.a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf(g61Var.d), Boolean.FALSE);
        }
    }

    public static void b(r31 r31Var, ArrayList arrayList) {
        long j10 = r31Var.c;
        TopicsController topicsController = MessagesController.getInstance(r31Var.b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.play_billing.k3.f(((g61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static boolean c(final r31 r31Var, g61 g61Var, View view) {
        TLRPC.Chat chat;
        final r31 r31Var2;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        byte b10;
        final int i11;
        ?? r11;
        final i80 i80Var;
        i80 i80Var2;
        org.telegram.ui.ActionBar.d6 d6Var2 = r31Var.d;
        org.telegram.ui.qn qnVar = r31Var.h;
        long j10 = r31Var.c;
        int i12 = r31Var.b;
        if (r31Var.G.a3 || r31Var.s.a3) {
            return false;
        }
        Object obj = g61Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i12);
        TLRPC.Chat chat2 = j10 < 0 ? messagesController.getChat(Long.valueOf(-j10)) : null;
        TLRPC.User user = j10 > 0 ? messagesController.getUser(Long.valueOf(j10)) : null;
        final i80 I = i80.I(qnVar, view);
        if (ChatObject.isMonoForum(chat2)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i12, chat2)) {
                return false;
            }
            TLRPC.Chat chat3 = chat2;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.c3(r31Var, I, peerDialogId, chat2, 17), false);
            long j11 = chat3.id;
            if (ChatObject.isMonoForum(chat3) && ChatObject.canManageMonoForum(i12, chat3)) {
                long j12 = chat3.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            if (user2 == null || !ChatObject.canBlockUsers(chat4)) {
                i80Var2 = I;
                i10 = 8;
            } else {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.e1 y3 = I.y();
                i10 = 8;
                y3.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i12);
                ai.c4 c4Var = new ai.c4(r31Var, y3, I, j11, user2, chat4);
                i80Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, c4Var);
            }
            i80Var = i80Var2;
            d6Var = d6Var2;
            r11 = 1;
            i11 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat2;
            if (ChatObject.canManageTopics(chat5) || UserObject.isBotForumWithEditableTopics(user)) {
                boolean z11 = tL_forumTopic.pinned;
                int i13 = z11 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                String string = LocaleController.getString(z11 ? R.string.DialogUnpin : R.string.DialogPin);
                int i14 = i13;
                chat = chat5;
                r31Var2 = r31Var;
                i90 i90Var = new i90(r31Var2, I, messagesController, tL_forumTopic, 9);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                int i15 = 0;
                I.c(i14, string, i90Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new z21(r31Var2, i15), false);
                }
            } else {
                r31Var2 = r31Var;
                chat = chat5;
            }
            if (ChatObject.canManageTopics(chat) || UserObject.isBotForumWithEditableTopics(user)) {
                final int i16 = 0;
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(r31Var2) { // from class: org.telegram.ui.Components.a31
                    public final /* synthetic */ r31 b;

                    {
                        this.b = r31Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z12;
                        int i17 = i16;
                        r31 r31Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        i80 i80Var3 = I;
                        switch (i17) {
                            case 0:
                                i80Var3.u();
                                r31Var3.h.presentFragment(nd1.a0(-r31Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                r31Var3.getClass();
                                i80Var3.u();
                                MessagesController.getInstance(r31Var3.b).getTopicsController().toggleCloseTopic(-r31Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                i80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                rc rcVar = new rc(18);
                                r31 r31Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = r31Var4.V;
                                if (hashSet.size() == 1) {
                                    z12 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(r31Var4.b).getTopicsController().findTopic(-r31Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z12 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(r31Var4, arrayList, j13, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(14));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, z12));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                z10 = false;
            } else {
                z10 = false;
            }
            long j13 = r31Var2.c;
            long j14 = tL_forumTopic.id;
            int currentAccount = qnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.d6 resourceProvider = qnVar.getResourceProvider();
            i80 i80Var3 = I;
            uo uoVar = new uo(i80Var3, currentAccount, j13, j14, qnVar, resourceProvider);
            i80 J = i80Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.st0(i80Var3, 26), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.dc(i80Var3, currentAccount, j13, j14, J, qnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.e1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.cb(i80Var3, resourceProvider, currentAccount, uoVar, 18), false);
            d6Var = d6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.w2(i80Var3, j13, j14, qnVar, resourceProvider, 7), false);
            J.c(0, "", new ai.ia(i80Var3, currentAccount, j13, j14, qnVar, resourceProvider), false);
            new org.telegram.messenger.n9(currentAccount, j13, j14, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.id);
            int i17 = isDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute;
            String string2 = LocaleController.getString(isDialogMuted ? R.string.Unmute : R.string.Mute);
            i10 = 8;
            b10 = 0;
            i11 = 2;
            r11 = 1;
            r11 = 1;
            g30 g30Var = new g30(r31Var, messagesController, tL_forumTopic, i80Var3, J, 3);
            i80Var = i80Var3;
            i80Var.c(i17, string2, g30Var, false);
            TLRPC.Chat chat6 = chat;
            if (ChatObject.canManageTopic(i12, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z12 = tL_forumTopic.closed;
                int i18 = z12 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close;
                String string3 = LocaleController.getString(z12 ? R.string.RestartTopic : R.string.CloseTopic);
                final int i19 = r11 == true ? 1 : 0;
                i80Var.c(i18, string3, new Runnable(r31Var) { // from class: org.telegram.ui.Components.a31
                    public final /* synthetic */ r31 b;

                    {
                        this.b = r31Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z122;
                        int i172 = i19;
                        r31 r31Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        i80 i80Var32 = i80Var;
                        switch (i172) {
                            case 0:
                                i80Var32.u();
                                r31Var3.h.presentFragment(nd1.a0(-r31Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                r31Var3.getClass();
                                i80Var32.u();
                                MessagesController.getInstance(r31Var3.b).getTopicsController().toggleCloseTopic(-r31Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                i80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                rc rcVar = new rc(18);
                                r31 r31Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = r31Var4.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(r31Var4.b).getTopicsController().findTopic(-r31Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(r31Var4, arrayList, j132, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(14));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, z122));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i12, chat6, tL_forumTopic)) {
                i80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(r31Var) { // from class: org.telegram.ui.Components.a31
                    public final /* synthetic */ r31 b;

                    {
                        this.b = r31Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z122;
                        int i172 = i11;
                        r31 r31Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        i80 i80Var32 = i80Var;
                        switch (i172) {
                            case 0:
                                i80Var32.u();
                                r31Var3.h.presentFragment(nd1.a0(-r31Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                r31Var3.getClass();
                                i80Var32.u();
                                MessagesController.getInstance(r31Var3.b).getTopicsController().toggleCloseTopic(-r31Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                i80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                rc rcVar = new rc(18);
                                r31 r31Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r31Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = r31Var4.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(r31Var4.b).getTopicsController().findTopic(-r31Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r4(r31Var4, arrayList, j132, hashSet, rcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(14));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, z122));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof l31) {
            jw jwVar = new jw(i11, b10);
            Paint paint = new Paint((int) r11);
            jwVar.c = paint;
            jwVar.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
            i80Var.W(jwVar);
            i80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var);
            float f7 = b10;
            float f10 = dp;
            float f11 = dp2;
            float[] fArr = new float[i10];
            fArr[b10] = f7;
            fArr[r11] = f7;
            fArr[i11] = f10;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f11;
            fArr[6] = f7;
            fArr[7] = f7;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(w02);
            i80Var.W(shapeDrawable);
        }
        i80Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        w7.b6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        long j10 = this.c;
        int i10 = this.b;
        if (z10) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentResume(-j10);
        } else {
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentPause(-j10);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        }
    }

    public final void d(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.S) {
                this.T = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.P = !this.P;
        }
        this.Q = z10;
        this.S = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, z10 ? 1.0f : 0.0f);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new b80(this, 29));
        this.U.addListener(new h31(this, z10));
        this.U.setInterpolator(li.m.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != (-j10)) {
                return;
            }
            o();
        } else {
            if (i10 != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.b).getTopicsController().sortTopics(-j10, false);
            o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.F;
        if (frameLayout.getVisibility() == 0) {
            this.K.setBounds((int) frameLayout.getTranslationX(), (int) this.N, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.M));
            this.K.draw(canvas);
        }
        FrameLayout frameLayout2 = this.r;
        if (frameLayout2.getVisibility() == 0) {
            this.L.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.L.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.L.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.F) {
            canvas.clipPath(this.K.j.k);
        }
        if (view == this.r) {
            canvas.clipPath(this.L.j.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        FrameLayout frameLayout = this.F;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.M + this.N);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void f(boolean z10) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.b).getTopicsController().getTopics(-this.c);
        this.a.a((topics == null || topics.isEmpty() || this.d0) ? false : true, z10);
    }

    public final void g() {
        ne.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.w;
        imageView.setAlpha(f7);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView.setVisibility(f7 > 0.0f ? 0 : 8);
        ImageView imageView2 = this.x;
        imageView2.setAlpha(f7);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView2.setVisibility(f7 > 0.0f ? 0 : 8);
        float f10 = 1.0f - bVar.e;
        ImageView imageView3 = this.y;
        imageView3.setAlpha(f10);
        imageView3.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView3.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView3.setVisibility(f10 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.E;
        imageView4.setAlpha(f10);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView4.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public m31 getCurrentTabsPosition() {
        return this.Q ? m31.b : this.P ? m31.c : m31.a;
    }

    public float getSideMenuT() {
        return this.R * this.a.e;
    }

    public final void h() {
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.r;
        frameLayout.setAlpha(lerp);
        frameLayout.setVisibility((1.0f - this.R) * this.a.e > 0.0f ? 0 : 8);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(m31.c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(m31.a)));
        }
    }

    public final float j(m31 m31Var) {
        float f7;
        float f10 = this.a.e;
        if (m31Var == m31.b) {
            f7 = this.R;
        } else {
            if ((m31Var != m31.a || this.P) && !(m31Var == m31.c && this.P)) {
                return 0.0f;
            }
            f7 = 1.0f - this.R;
        }
        return f7 * f10;
    }

    public final boolean k() {
        if (this.R <= 0.5f) {
            int i10 = 0;
            while (true) {
                e31 e31Var = this.s;
                if (i10 >= e31Var.getChildCount()) {
                    break;
                }
                g61 G = e31Var.W2.G(RecyclerView.R(e31Var.getChildAt(i10)));
                if (G != null && G.r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                g31 g31Var = this.G;
                if (i11 >= g31Var.getChildCount()) {
                    break;
                }
                g61 G2 = g31Var.W2.G(RecyclerView.R(g31Var.getChildAt(i11)));
                if (G2 != null && G2.r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.b).getTopicsController();
        long j10 = this.c;
        if (topicsController.endIsReached(-j10)) {
            return;
        }
        topicsController.loadTopics(-j10);
    }

    public final void m(long j10, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.ke keVar = this.O;
        if (keVar != null) {
            keVar.run();
        }
        h();
        float j10 = j(m31.b);
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10);
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(lerp);
        frameLayout.setVisibility(j10 <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.h6.z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int f7 = i0.a.f(1.0f - this.R, w02, org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.y.setColorFilter(new PorterDuffColorFilter(f7, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.R, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(i11, d6Var)), mode));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), mode));
        this.x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        e31 e31Var = this.s;
        boolean canScrollHorizontally = e31Var.canScrollHorizontally(-1);
        e31Var.W2.N(true);
        if (!canScrollHorizontally) {
            e31Var.u0(0);
        }
        g31 g31Var = this.G;
        boolean canScrollVertically = g31Var.canScrollVertically(-1);
        g31Var.W2.N(true);
        if (!canScrollVertically) {
            g31Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new z21(this, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        h();
    }

    @Override // ne.d
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        n();
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.d0 != z10) {
            this.d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        this.V = j10;
        e31 e31Var = this.s;
        e31Var.W2.N(true);
        e31Var.invalidate();
        this.G.W2.N(true);
        q31 q31Var = this.v;
        if (q31Var != null) {
            q31Var.c(true, false, j10 == 0);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.c0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.b0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.a0 = callback2;
    }

    public void setSideMenuBackgroundDrawable(dh.d dVar) {
        this.K = dVar;
        dVar.q(AndroidUtilities.dp(16.0f));
        this.K.p(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f7) {
        this.M = f7;
        h();
        e();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f7) {
        this.N = f7;
        this.F.setTranslationY(f7);
        h();
        e();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(dh.d dVar) {
        this.L = dVar;
        dVar.q(AndroidUtilities.dp(18.0f));
        this.L.p(AndroidUtilities.dp(7.0f));
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
