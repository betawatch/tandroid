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
import org.telegram.ui.bf1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c41 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, me.d {
    public static final /* synthetic */ int f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final s31 G;
    public long H;
    public long I;
    public final me.b J;
    public ch.d K;
    public ch.d L;
    public float M;
    public float N;
    public org.telegram.ui.me O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public Boolean T;
    public ValueAnimator U;
    public long V;
    public boolean W;
    public final me.b a;
    public Utilities.Callback2 a0;
    public final int b;
    public Runnable b0;
    public final long c;
    public Utilities.Callback2 c0;
    public final org.telegram.ui.ActionBar.e6 d;
    public boolean d0;
    public final boolean e;
    public final HashSet e0;
    public final boolean f;
    public final org.telegram.ui.zn h;
    public final boolean n;
    public final FrameLayout r;
    public final q31 s;
    public final b41 v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.ui.Components.p31] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.p31] */
    public c41(Activity activity, org.telegram.ui.zn znVar, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        ViewGroup viewGroup;
        hs hsVar = hs.h;
        this.a = new me.b(0, this, hsVar, 380L, true);
        this.J = new me.b(0, new h31(this), hsVar, 320L, false);
        this.R = 0.0f;
        this.e0 = new HashSet();
        this.h = znVar;
        this.b = i10;
        this.c = j3;
        this.d = e6Var;
        long j10 = -j3;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        this.f = isBotForumWithEditableTopics;
        this.n = !org.telegram.messenger.q.w("topics_end_reached_", j10, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.r = frameLayout;
        addView(frameLayout, w7.x5.a(36.0f, 7.0f, 7.0f, 7.0f, 7.0f, -1, 55));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.F = frameLayout2;
        addView(frameLayout2, w7.x5.a(-1.0f, 7.0f, 7.0f, 7.0f, 7.0f, 64, 115));
        final int i11 = 0;
        q31 q31Var = new q31(this, activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.p31
            public final /* synthetic */ c41 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i12;
                boolean z11;
                long j11;
                long j12;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                int i13 = i11;
                c41 c41Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        c71 c71Var = (c71) obj2;
                        boolean z13 = c41Var.f;
                        int i14 = c41Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = c41Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = c41Var.e;
                        int i15 = w31.a;
                        p61 J = p61.J(w31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(c41Var.V == 0);
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
                                if (c41Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((p61) hg.c.g(1, arrayList)).y |= 8;
                                        }
                                        c71Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        c71Var.M();
                                        z15 = true;
                                    }
                                    p61 J2 = p61.J(w31.class);
                                    J2.x = j16;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j18 = c41Var.V;
                                    if (z14) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.id;
                                    }
                                    J2.K(j11 == j12);
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
                            c71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && c41Var.n) {
                            p61 J3 = p61.J(w31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            p61 J4 = p61.J(w31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            p61 J5 = p61.J(w31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                p61 J6 = p61.J(w31.class);
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
                        c41.b(c41Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c71 c71Var2 = (c71) obj2;
                        boolean z17 = c41Var.e;
                        int i19 = c41Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = c41Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = c41Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = a41.a;
                            p61 J7 = p61.J(a41.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(c41Var.V == 0);
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
                                if (c41Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        c71Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        c71Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = a41.a;
                                    p61 J8 = p61.J(a41.class);
                                    J8.x = j19;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = c41Var.V;
                                    if (z17) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.id;
                                    }
                                    J8.K(j14 == j15);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            c71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && c41Var.n) {
                            int i24 = a41.a;
                            p61 J9 = p61.J(a41.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            p61 J10 = p61.J(a41.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            p61 J11 = p61.J(a41.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = a41.a;
                                p61 J12 = p61.J(a41.class);
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
        }, new h31(this), new h31(this), e6Var);
        this.s = q31Var;
        final int i12 = 1;
        q31Var.C1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.p31
            public final /* synthetic */ c41 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j11;
                long j12;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                int i13 = i12;
                c41 c41Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        c71 c71Var = (c71) obj2;
                        boolean z13 = c41Var.f;
                        int i14 = c41Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = c41Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = c41Var.e;
                        int i15 = w31.a;
                        p61 J = p61.J(w31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(c41Var.V == 0);
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
                                if (c41Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((p61) hg.c.g(1, arrayList)).y |= 8;
                                        }
                                        c71Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        c71Var.M();
                                        z15 = true;
                                    }
                                    p61 J2 = p61.J(w31.class);
                                    J2.x = j16;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j18 = c41Var.V;
                                    if (z14) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.id;
                                    }
                                    J2.K(j11 == j12);
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
                            c71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && c41Var.n) {
                            p61 J3 = p61.J(w31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            p61 J4 = p61.J(w31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            p61 J5 = p61.J(w31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                p61 J6 = p61.J(w31.class);
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
                        c41.b(c41Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c71 c71Var2 = (c71) obj2;
                        boolean z17 = c41Var.e;
                        int i19 = c41Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = c41Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = c41Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = a41.a;
                            p61 J7 = p61.J(a41.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(c41Var.V == 0);
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
                                if (c41Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        c71Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        c71Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = a41.a;
                                    p61 J8 = p61.J(a41.class);
                                    J8.x = j19;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = c41Var.V;
                                    if (z17) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.id;
                                    }
                                    J8.K(j14 == j15);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            c71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && c41Var.n) {
                            int i24 = a41.a;
                            p61 J9 = p61.J(a41.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            p61 J10 = p61.J(a41.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            p61 J11 = p61.J(a41.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = a41.a;
                                p61 J12 = p61.J(a41.class);
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
        q31Var.setWillNotDraw(false);
        q31Var.W2.r = false;
        q31Var.getContext();
        gg.i0 i0Var = new gg.i0((ViewGroup) q31Var, 5);
        q31Var.V2 = i0Var;
        q31Var.setLayoutManager(i0Var);
        frameLayout.addView(q31Var, w7.x5.a(-1.0f, 41.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        q31Var.j(new r31(this, 0));
        if (isBotForumWithEditableTopics) {
            b41 b41Var = new b41(activity, i10, e6Var);
            this.v = b41Var;
            b41Var.c(true, false, this.V == 0);
            final int i13 = 2;
            b41Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l31
                public final /* synthetic */ c41 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            c41 c41Var = this.b;
                            Boolean bool = c41Var.T;
                            boolean z10 = false;
                            if (bool == null ? !c41Var.Q : !bool.booleanValue()) {
                                z10 = true;
                            }
                            c41Var.d(z10);
                            break;
                        case 1:
                            c41 c41Var2 = this.b;
                            s31 s31Var = c41Var2.G;
                            s31Var.x1(false);
                            q31 q31Var2 = c41Var2.s;
                            q31Var2.x1(false);
                            c41Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(s31Var);
                            AndroidUtilities.updateVisibleRows(q31Var2);
                            break;
                        default:
                            this.b.a0.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(b41Var, w7.x5.a(42.0f, 0.0f, 48.0f, 0.0f, 0.0f, 64, 51));
        } else {
            viewGroup = frameLayout2;
            this.v = null;
        }
        final int i14 = 2;
        ViewGroup viewGroup2 = viewGroup;
        s31 s31Var = new s31(activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.p31
            public final /* synthetic */ c41 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j11;
                long j12;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                int i132 = i14;
                c41 c41Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        c71 c71Var = (c71) obj2;
                        boolean z13 = c41Var.f;
                        int i142 = c41Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j16 = c41Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = c41Var.e;
                        int i15 = w31.a;
                        p61 J = p61.J(w31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(c41Var.V == 0);
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
                                if (c41Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((p61) hg.c.g(1, arrayList)).y |= 8;
                                        }
                                        c71Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        c71Var.M();
                                        z15 = true;
                                    }
                                    p61 J2 = p61.J(w31.class);
                                    J2.x = j16;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j18 = c41Var.V;
                                    if (z14) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.id;
                                    }
                                    J2.K(j11 == j12);
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
                            c71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && c41Var.n) {
                            p61 J3 = p61.J(w31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            p61 J4 = p61.J(w31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            p61 J5 = p61.J(w31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                p61 J6 = p61.J(w31.class);
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
                        c41.b(c41Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c71 c71Var2 = (c71) obj2;
                        boolean z17 = c41Var.e;
                        int i19 = c41Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = c41Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = c41Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = a41.a;
                            p61 J7 = p61.J(a41.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(c41Var.V == 0);
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
                                if (c41Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        c71Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        c71Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = a41.a;
                                    p61 J8 = p61.J(a41.class);
                                    J8.x = j19;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = c41Var.V;
                                    if (z17) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.id;
                                    }
                                    J8.K(j14 == j15);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            c71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && c41Var.n) {
                            int i24 = a41.a;
                            p61 J9 = p61.J(a41.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            p61 J10 = p61.J(a41.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            p61 J11 = p61.J(a41.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = a41.a;
                                p61 J12 = p61.J(a41.class);
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
        }, new h31(this), new h31(this), e6Var);
        this.G = s31Var;
        final int i15 = 1;
        s31Var.C1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.p31
            public final /* synthetic */ c41 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j11;
                long j12;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                int i132 = i15;
                c41 c41Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        c71 c71Var = (c71) obj2;
                        boolean z13 = c41Var.f;
                        int i142 = c41Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j16 = c41Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = c41Var.e;
                        int i152 = w31.a;
                        p61 J = p61.J(w31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(c41Var.V == 0);
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
                                if (c41Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((p61) hg.c.g(1, arrayList)).y |= 8;
                                        }
                                        c71Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        c71Var.M();
                                        z15 = true;
                                    }
                                    p61 J2 = p61.J(w31.class);
                                    J2.x = j16;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j18 = c41Var.V;
                                    if (z14) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.id;
                                    }
                                    J2.K(j11 == j12);
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
                            c71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && c41Var.n) {
                            p61 J3 = p61.J(w31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            p61 J4 = p61.J(w31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            p61 J5 = p61.J(w31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                p61 J6 = p61.J(w31.class);
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
                        c41.b(c41Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c71 c71Var2 = (c71) obj2;
                        boolean z17 = c41Var.e;
                        int i19 = c41Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = c41Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = c41Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = a41.a;
                            p61 J7 = p61.J(a41.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(c41Var.V == 0);
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
                                if (c41Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        c71Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        c71Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = a41.a;
                                    p61 J8 = p61.J(a41.class);
                                    J8.x = j19;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j13 = j19;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = c41Var.V;
                                    if (z17) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.id;
                                    }
                                    J8.K(j14 == j15);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            c71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && c41Var.n) {
                            int i24 = a41.a;
                            p61 J9 = p61.J(a41.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            p61 J10 = p61.J(a41.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            p61 J11 = p61.J(a41.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = a41.a;
                                p61 J12 = p61.J(a41.class);
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
        s31Var.W2.r = false;
        s31Var.setClipToPadding(false);
        s31Var.setClipChildren(false);
        viewGroup2.addView(s31Var, w7.x5.a(-1.0f, 0.0f, isBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f, -1, 119));
        s31Var.j(new r31(this, 1));
        final int i16 = 0;
        ImageView i17 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l31
            public final /* synthetic */ c41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        c41 c41Var = this.b;
                        Boolean bool = c41Var.T;
                        boolean z10 = false;
                        if (bool == null ? !c41Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        c41Var.d(z10);
                        break;
                    case 1:
                        c41 c41Var2 = this.b;
                        s31 s31Var2 = c41Var2.G;
                        s31Var2.x1(false);
                        q31 q31Var2 = c41Var2.s;
                        q31Var2.x1(false);
                        c41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        AndroidUtilities.updateVisibleRows(q31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.y = i17;
        final int i18 = 0;
        ImageView i19 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l31
            public final /* synthetic */ c41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        c41 c41Var = this.b;
                        Boolean bool = c41Var.T;
                        boolean z10 = false;
                        if (bool == null ? !c41Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        c41Var.d(z10);
                        break;
                    case 1:
                        c41 c41Var2 = this.b;
                        s31 s31Var2 = c41Var2.G;
                        s31Var2.x1(false);
                        q31 q31Var2 = c41Var2.s;
                        q31Var2.x1(false);
                        c41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        AndroidUtilities.updateVisibleRows(q31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.E = i19;
        frameLayout.addView(i17, w7.x5.e(44, 36, 51));
        viewGroup2.addView(i19, w7.x5.e(64, 48, 51));
        final int i20 = 1;
        ImageView i21 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l31
            public final /* synthetic */ c41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        c41 c41Var = this.b;
                        Boolean bool = c41Var.T;
                        boolean z10 = false;
                        if (bool == null ? !c41Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        c41Var.d(z10);
                        break;
                    case 1:
                        c41 c41Var2 = this.b;
                        s31 s31Var2 = c41Var2.G;
                        s31Var2.x1(false);
                        q31 q31Var2 = c41Var2.s;
                        q31Var2.x1(false);
                        c41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        AndroidUtilities.updateVisibleRows(q31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.w = i21;
        final int i22 = 1;
        ImageView i23 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l31
            public final /* synthetic */ c41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        c41 c41Var = this.b;
                        Boolean bool = c41Var.T;
                        boolean z10 = false;
                        if (bool == null ? !c41Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        c41Var.d(z10);
                        break;
                    case 1:
                        c41 c41Var2 = this.b;
                        s31 s31Var2 = c41Var2.G;
                        s31Var2.x1(false);
                        q31 q31Var2 = c41Var2.s;
                        q31Var2.x1(false);
                        c41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(s31Var2);
                        AndroidUtilities.updateVisibleRows(q31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.x = i23;
        frameLayout.addView(i21, w7.x5.e(44, 36, 51));
        viewGroup2.addView(i23, w7.x5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j10, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.q.w("topicssidetabs", j3, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean w10 = org.telegram.messenger.q.w("topicssidetabsb", j3, mainSettings, false);
        this.P = w10;
        i19.setImageResource(w10 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        f(false);
        g();
        o();
        p();
    }

    public static void a(c41 c41Var, p61 p61Var) {
        if (c41Var.e) {
            Utilities.Callback2 callback2 = c41Var.c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(p61Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (p61Var.B == -2) {
            Runnable runnable = c41Var.b0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = c41Var.a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf(p61Var.d), Boolean.FALSE);
        }
    }

    public static void b(c41 c41Var, ArrayList arrayList) {
        long j3 = c41Var.c;
        TopicsController topicsController = MessagesController.getInstance(c41Var.b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.vision.e2.e(((p61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j10 = -j3;
        topicsController.reorderPinnedTopics(j10, arrayList2);
        topicsController.sortTopics(j10, false);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    public static boolean c(final c41 c41Var, p61 p61Var, View view) {
        org.telegram.ui.ActionBar.e6 e6Var;
        byte b10;
        int i10;
        final int i11;
        final p80 p80Var;
        boolean z10;
        ?? r62;
        p80 p80Var2;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var2 = c41Var.d;
        org.telegram.ui.zn znVar = c41Var.h;
        long j3 = c41Var.c;
        int i13 = c41Var.b;
        final int i14 = 0;
        if (!c41Var.G.a3 && !c41Var.s.a3) {
            Object obj = p61Var.G;
            if (obj instanceof TLRPC.TL_forumTopic) {
                final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                MessagesController messagesController = MessagesController.getInstance(i13);
                TLRPC.Chat chat = j3 < 0 ? messagesController.getChat(Long.valueOf(-j3)) : null;
                TLRPC.User user = j3 > 0 ? messagesController.getUser(Long.valueOf(j3)) : null;
                final p80 I = p80.I(znVar, view);
                if (ChatObject.isMonoForum(chat)) {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                    if (peerDialogId != 0 && ChatObject.canManageMonoForum(i13, chat)) {
                        TLRPC.Chat chat2 = chat;
                        I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.r8(c41Var, I, peerDialogId, chat2, 29), false);
                        long j10 = chat2.id;
                        if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(i13, chat2)) {
                            long j11 = chat2.linked_monoforum_id;
                            if (j11 != 0) {
                                j10 = j11;
                            }
                        }
                        TLRPC.Chat chat3 = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                        TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(peerDialogId));
                        if (user2 == null || !ChatObject.canBlockUsers(chat3)) {
                            p80Var2 = I;
                            i12 = 8;
                        } else {
                            I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                            org.telegram.ui.ActionBar.f1 y3 = I.y();
                            i12 = 8;
                            y3.setVisibility(8);
                            p80Var2 = I;
                            MessagesController.getInstance(i13).checkIsInChat(true, chat3, user2, new i31(c41Var, y3, I, j10, user2, chat3));
                        }
                        p80Var = p80Var2;
                        e6Var = e6Var2;
                        b10 = 0;
                        i10 = i12;
                        r62 = 1;
                        i11 = 2;
                    }
                } else {
                    TLRPC.Chat chat4 = chat;
                    if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                        boolean z11 = tL_forumTopic.pinned;
                        I.c(z11 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z11 ? R.string.DialogUnpin : R.string.DialogPin), new oo0(c41Var, I, messagesController, tL_forumTopic), false);
                        if (tL_forumTopic.pinned) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new j31(c41Var, i14), false);
                        }
                    }
                    if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                        I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(c41Var) { // from class: org.telegram.ui.Components.k31
                            public final /* synthetic */ c41 b;

                            {
                                this.b = c41Var;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z12;
                                int i15 = i14;
                                c41 c41Var2 = this.b;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                p80 p80Var3 = I;
                                switch (i15) {
                                    case 0:
                                        p80Var3.u();
                                        c41Var2.h.presentFragment(bf1.a0(-c41Var2.c, tL_forumTopic2.id));
                                        break;
                                    case 1:
                                        c41Var2.getClass();
                                        p80Var3.u();
                                        MessagesController.getInstance(c41Var2.b).getTopicsController().toggleCloseTopic(-c41Var2.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                        break;
                                    default:
                                        p80Var3.u();
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                        vh vhVar = new vh(13);
                                        c41 c41Var3 = this.b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c41Var3.getContext());
                                        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.R = pluralString;
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        long j12 = c41Var3.V;
                                        if (hashSet.size() == 1) {
                                            z12 = false;
                                            b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(c41Var3.b).getTopicsController().findTopic(-c41Var3.c, ((Integer) arrayList.get(0)).intValue()).title);
                                        } else {
                                            z12 = false;
                                            b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                        }
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.xe(c41Var3, arrayList, j12, hashSet, vhVar));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fe0(18));
                                        b2Var.show();
                                        TextView textView = (TextView) b2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, z12));
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                    }
                    long j12 = c41Var.c;
                    long j13 = tL_forumTopic.id;
                    int currentAccount = znVar.getCurrentAccount();
                    org.telegram.ui.ActionBar.e6 resourceProvider = znVar.getResourceProvider();
                    ap apVar = new ap(I, currentAccount, j12, j13, znVar, resourceProvider);
                    p80 J = I.J();
                    J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.nu0(I, 26), false);
                    J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.fc(I, currentAccount, j12, j13, J, znVar, resourceProvider), false);
                    org.telegram.ui.ActionBar.f1 y10 = J.y();
                    J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.d9(I, resourceProvider, currentAccount, apVar, 17), false);
                    e6Var = e6Var2;
                    J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.t2(I, j12, j13, znVar, resourceProvider, 7), false);
                    J.c(0, "", new ai.p0(I, currentAccount, j12, j13, znVar, resourceProvider), false);
                    new org.telegram.messenger.n9(currentAccount, j12, j13, J.y(), y10).run();
                    boolean isDialogMuted = messagesController.isDialogMuted(j3, tL_forumTopic.id);
                    b10 = 0;
                    i10 = 8;
                    i11 = 2;
                    p80Var = I;
                    p80Var.c(isDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute, LocaleController.getString(isDialogMuted ? R.string.Unmute : R.string.Mute), new ai.n3(c41Var, messagesController, tL_forumTopic, I, J, 25), false);
                    if (!ChatObject.canManageTopic(i13, chat4, tL_forumTopic) || UserObject.isBotForum(user)) {
                        z10 = true;
                    } else {
                        boolean z12 = tL_forumTopic.closed;
                        int i15 = z12 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close;
                        String string = LocaleController.getString(z12 ? R.string.RestartTopic : R.string.CloseTopic);
                        z10 = true;
                        final boolean z13 = true ? 1 : 0;
                        p80Var.c(i15, string, new Runnable(c41Var) { // from class: org.telegram.ui.Components.k31
                            public final /* synthetic */ c41 b;

                            {
                                this.b = c41Var;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z122;
                                int i152 = z13;
                                c41 c41Var2 = this.b;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                p80 p80Var3 = p80Var;
                                switch (i152) {
                                    case 0:
                                        p80Var3.u();
                                        c41Var2.h.presentFragment(bf1.a0(-c41Var2.c, tL_forumTopic2.id));
                                        break;
                                    case 1:
                                        c41Var2.getClass();
                                        p80Var3.u();
                                        MessagesController.getInstance(c41Var2.b).getTopicsController().toggleCloseTopic(-c41Var2.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                        break;
                                    default:
                                        p80Var3.u();
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                        vh vhVar = new vh(13);
                                        c41 c41Var3 = this.b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c41Var3.getContext());
                                        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.R = pluralString;
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        long j122 = c41Var3.V;
                                        if (hashSet.size() == 1) {
                                            z122 = false;
                                            b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(c41Var3.b).getTopicsController().findTopic(-c41Var3.c, ((Integer) arrayList.get(0)).intValue()).title);
                                        } else {
                                            z122 = false;
                                            b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                        }
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.xe(c41Var3, arrayList, j122, hashSet, vhVar));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fe0(18));
                                        b2Var.show();
                                        TextView textView = (TextView) b2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, z122));
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                    }
                    r62 = z10;
                    if (ChatObject.canDeleteTopic(i13, chat4, tL_forumTopic)) {
                        p80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", z10 ? 1 : 0), new Runnable(c41Var) { // from class: org.telegram.ui.Components.k31
                            public final /* synthetic */ c41 b;

                            {
                                this.b = c41Var;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z122;
                                int i152 = i11;
                                c41 c41Var2 = this.b;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                p80 p80Var3 = p80Var;
                                switch (i152) {
                                    case 0:
                                        p80Var3.u();
                                        c41Var2.h.presentFragment(bf1.a0(-c41Var2.c, tL_forumTopic2.id));
                                        break;
                                    case 1:
                                        c41Var2.getClass();
                                        p80Var3.u();
                                        MessagesController.getInstance(c41Var2.b).getTopicsController().toggleCloseTopic(-c41Var2.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                        break;
                                    default:
                                        p80Var3.u();
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                        vh vhVar = new vh(13);
                                        c41 c41Var3 = this.b;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c41Var3.getContext());
                                        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.R = pluralString;
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        long j122 = c41Var3.V;
                                        if (hashSet.size() == 1) {
                                            z122 = false;
                                            b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(c41Var3.b).getTopicsController().findTopic(-c41Var3.c, ((Integer) arrayList.get(0)).intValue()).title);
                                        } else {
                                            z122 = false;
                                            b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                        }
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.xe(c41Var3, arrayList, j122, hashSet, vhVar));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fe0(18));
                                        b2Var.show();
                                        TextView textView = (TextView) b2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, z122));
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        r62 = z10;
                    }
                }
                if (view instanceof x31) {
                    rw rwVar = new rw(i11, b10);
                    Paint paint = new Paint((int) r62);
                    rwVar.c = paint;
                    rwVar.b = new RectF();
                    paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, e6Var));
                    p80Var.W(rwVar);
                    p80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
                } else {
                    int dp = AndroidUtilities.dp(5.0f);
                    int dp2 = AndroidUtilities.dp(5.0f);
                    int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var);
                    float f7 = b10;
                    float f10 = dp;
                    float f11 = dp2;
                    float[] fArr = new float[i10];
                    fArr[b10] = f7;
                    fArr[r62] = f7;
                    fArr[i11] = f10;
                    fArr[3] = f10;
                    fArr[4] = f11;
                    fArr[5] = f11;
                    fArr[6] = f7;
                    fArr[7] = f7;
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                    shapeDrawable.getPaint().setColor(w02);
                    p80Var.W(shapeDrawable);
                }
                p80Var.Z();
                return r62;
            }
        }
        return false;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        w7.z5.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        long j3 = this.c;
        int i10 = this.b;
        if (z10) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentResume(-j3);
        } else {
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentPause(-j3);
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
        ofFloat.addUpdateListener(new j80(this, 29));
        this.U.addListener(new t31(this, z10));
        this.U.setInterpolator(ji.n.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j3 = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != (-j3)) {
                return;
            }
            p();
        } else {
            if (i10 != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.b).getTopicsController().sortTopics(-j3, false);
            p();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        canvas.save();
        if (view == this.F) {
            canvas.clipPath(this.K.j.k);
        }
        if (view == this.r) {
            canvas.clipPath(this.L.j.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
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
        me.b bVar = this.J;
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

    public y31 getCurrentTabsPosition() {
        return this.Q ? y31.b : this.P ? y31.c : y31.a;
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
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(y31.c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(y31.a)));
        }
    }

    public final float j(y31 y31Var) {
        float f7;
        float f10 = this.a.e;
        if (y31Var == y31.b) {
            f7 = this.R;
        } else {
            if ((y31Var != y31.a || this.P) && !(y31Var == y31.c && this.P)) {
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
                q31 q31Var = this.s;
                if (i10 >= q31Var.getChildCount()) {
                    break;
                }
                p61 G = q31Var.W2.G(RecyclerView.R(q31Var.getChildAt(i10)));
                if (G != null && G.r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                s31 s31Var = this.G;
                if (i11 >= s31Var.getChildCount()) {
                    break;
                }
                p61 G2 = s31Var.W2.G(RecyclerView.R(s31Var.getChildAt(i11)));
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
        long j3 = this.c;
        if (topicsController.endIsReached(-j3)) {
            return;
        }
        topicsController.loadTopics(-j3);
    }

    public final void m(long j3, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        o();
    }

    public final void o() {
        org.telegram.ui.me meVar = this.O;
        if (meVar != null) {
            meVar.run();
        }
        h();
        float j3 = j(y31.b);
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j3);
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(lerp);
        frameLayout.setVisibility(j3 <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.i6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        int d = i0.a.d(1.0f - this.R, w02, org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.R, org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.w0(i11, e6Var)), mode));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), mode));
        this.x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), mode));
        invalidate();
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

    public final void p() {
        f(true);
        q31 q31Var = this.s;
        boolean canScrollHorizontally = q31Var.canScrollHorizontally(-1);
        q31Var.W2.N(true);
        if (!canScrollHorizontally) {
            q31Var.u0(0);
        }
        s31 s31Var = this.G;
        boolean canScrollVertically = s31Var.canScrollVertically(-1);
        s31Var.W2.N(true);
        if (!canScrollVertically) {
            s31Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new j31(this, 1));
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.d0 != z10) {
            this.d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j3) {
        this.V = j3;
        q31 q31Var = this.s;
        q31Var.W2.N(true);
        q31Var.invalidate();
        this.G.W2.N(true);
        b41 b41Var = this.v;
        if (b41Var != null) {
            b41Var.c(true, false, j3 == 0);
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

    public void setSideMenuBackgroundDrawable(ch.d dVar) {
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

    public void setTopMenuBackgroundDrawable(ch.d dVar) {
        this.L = dVar;
        dVar.q(AndroidUtilities.dp(18.0f));
        this.L.p(AndroidUtilities.dp(7.0f));
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
