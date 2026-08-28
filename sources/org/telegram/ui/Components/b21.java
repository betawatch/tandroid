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
import org.telegram.ui.rd1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, td.b {
    public static final /* synthetic */ int b0 = 0;
    public final ImageView A;
    public final FrameLayout B;
    public final q11 C;
    public long D;
    public long E;
    public final td.a F;
    public kg.d G;
    public kg.d H;
    public float I;
    public float J;
    public org.telegram.ui.ge K;
    public boolean L;
    public boolean M;
    public float N;
    public boolean O;
    public Boolean P;
    public ValueAnimator Q;
    public long R;
    public boolean S;
    public Utilities.Callback2 T;
    public Runnable U;
    public Utilities.Callback2 V;
    public boolean W;
    public final td.a a;
    public final HashSet a0;
    public final int b;
    public final long c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final boolean e;
    public final boolean f;
    public final org.telegram.ui.qn h;
    public final boolean n;
    public final FrameLayout r;
    public final o11 s;
    public final a21 v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.ui.Components.n11] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.n11] */
    public b21(Activity activity, org.telegram.ui.qn qnVar, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        ViewGroup viewGroup;
        gr grVar = gr.h;
        this.a = new td.a(0, this, grVar, 380L, true);
        this.F = new td.a(0, new i11(this), grVar, 320L, false);
        this.N = 0.0f;
        this.a0 = new HashSet();
        this.h = qnVar;
        this.b = i9;
        this.c = j10;
        this.d = b6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i9).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i9).getUser(Long.valueOf(j10)));
        this.f = isBotForumWithEditableTopics;
        this.n = !org.telegram.messenger.l0.v("topics_end_reached_", j11, UserConfig.getInstance(i9).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.r = frameLayout;
        addView(frameLayout, g7.e6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.B = frameLayout2;
        addView(frameLayout2, g7.e6.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        final int i10 = 0;
        o11 o11Var = new o11(this, activity, i9, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.n11
            public final /* synthetic */ b21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i11;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i12 = i10;
                b21 b21Var = this.b;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z13 = b21Var.f;
                        int i13 = b21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i13);
                        long j17 = b21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i13).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = b21Var.e;
                        int i14 = u11.a;
                        l41 J = l41.J(u11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(b21Var.R == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i15 = 0;
                            boolean z15 = false;
                            while (i15 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i17 = size;
                                if (z13) {
                                    i11 = i16;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i17;
                                        i15 = i11;
                                    }
                                } else {
                                    i11 = i16;
                                }
                                if (b21Var.a0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i17;
                                    i15 = i11;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((l41) j3.r0.j(1, arrayList)).y |= 8;
                                        }
                                        z41Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        z41Var.M();
                                        z15 = true;
                                    }
                                    l41 J2 = l41.J(u11.class);
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
                                    long j19 = b21Var.R;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i17;
                                    i15 = i11;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z41Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && b21Var.n) {
                            l41 J3 = l41.J(u11.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            l41 J4 = l41.J(u11.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            l41 J5 = l41.J(u11.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l41 J6 = l41.J(u11.class);
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
                        b21.b(b21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z17 = b21Var.e;
                        int i18 = b21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i18);
                        long j20 = b21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i18).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = b21Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i19 = z11.a;
                            l41 J7 = l41.J(z11.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(b21Var.R == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                int i21 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i21;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (b21Var.a0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i21;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        z41Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        z41Var2.M();
                                        z12 = true;
                                    }
                                    int i22 = z11.a;
                                    l41 J8 = l41.J(z11.class);
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
                                    long j22 = b21Var.R;
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
                                    size2 = i21;
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
                            z41Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && b21Var.n) {
                            int i23 = z11.a;
                            l41 J9 = l41.J(z11.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l41 J10 = l41.J(z11.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l41 J11 = l41.J(z11.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i24 = z11.a;
                                l41 J12 = l41.J(z11.class);
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
        }, new i11(this), new i11(this), b6Var);
        this.s = o11Var;
        final int i11 = 1;
        o11Var.B1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.n11
            public final /* synthetic */ b21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i112;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i12 = i11;
                b21 b21Var = this.b;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z13 = b21Var.f;
                        int i13 = b21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i13);
                        long j17 = b21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i13).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = b21Var.e;
                        int i14 = u11.a;
                        l41 J = l41.J(u11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(b21Var.R == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i15 = 0;
                            boolean z15 = false;
                            while (i15 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i17 = size;
                                if (z13) {
                                    i112 = i16;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i17;
                                        i15 = i112;
                                    }
                                } else {
                                    i112 = i16;
                                }
                                if (b21Var.a0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i17;
                                    i15 = i112;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((l41) j3.r0.j(1, arrayList)).y |= 8;
                                        }
                                        z41Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        z41Var.M();
                                        z15 = true;
                                    }
                                    l41 J2 = l41.J(u11.class);
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
                                    long j19 = b21Var.R;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i17;
                                    i15 = i112;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z41Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && b21Var.n) {
                            l41 J3 = l41.J(u11.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            l41 J4 = l41.J(u11.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            l41 J5 = l41.J(u11.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l41 J6 = l41.J(u11.class);
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
                        b21.b(b21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z17 = b21Var.e;
                        int i18 = b21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i18);
                        long j20 = b21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i18).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = b21Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i19 = z11.a;
                            l41 J7 = l41.J(z11.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(b21Var.R == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                int i21 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i21;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (b21Var.a0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i21;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        z41Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        z41Var2.M();
                                        z12 = true;
                                    }
                                    int i22 = z11.a;
                                    l41 J8 = l41.J(z11.class);
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
                                    long j22 = b21Var.R;
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
                                    size2 = i21;
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
                            z41Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && b21Var.n) {
                            int i23 = z11.a;
                            l41 J9 = l41.J(z11.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l41 J10 = l41.J(z11.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l41 J11 = l41.J(z11.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i24 = z11.a;
                                l41 J12 = l41.J(z11.class);
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
        o11Var.setWillNotDraw(false);
        o11Var.U2.r = false;
        o11Var.getContext();
        of.g0 g0Var = new of.g0((ViewGroup) o11Var, 5);
        o11Var.T2 = g0Var;
        o11Var.setLayoutManager(g0Var);
        frameLayout.addView(o11Var, g7.e6.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        o11Var.j(new p11(this, 0));
        if (isBotForumWithEditableTopics) {
            a21 a21Var = new a21(activity, i9, b6Var);
            this.v = a21Var;
            a21Var.c(true, false, this.R == 0);
            final int i12 = 2;
            a21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l11
                public final /* synthetic */ b21 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            b21 b21Var = this.b;
                            Boolean bool = b21Var.P;
                            boolean z10 = false;
                            if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                                z10 = true;
                            }
                            b21Var.d(z10);
                            break;
                        case 1:
                            b21 b21Var2 = this.b;
                            q11 q11Var = b21Var2.C;
                            q11Var.w1(false);
                            o11 o11Var2 = b21Var2.s;
                            o11Var2.w1(false);
                            b21Var2.F.a(false, true);
                            AndroidUtilities.updateVisibleRows(q11Var);
                            AndroidUtilities.updateVisibleRows(o11Var2);
                            break;
                        default:
                            this.b.T.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(a21Var, g7.e6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.v = null;
        }
        final int i13 = 2;
        ViewGroup viewGroup2 = viewGroup;
        q11 q11Var = new q11(activity, i9, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.n11
            public final /* synthetic */ b21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i112;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i122 = i13;
                b21 b21Var = this.b;
                switch (i122) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z13 = b21Var.f;
                        int i132 = b21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i132);
                        long j17 = b21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i132).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i132).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = b21Var.e;
                        int i14 = u11.a;
                        l41 J = l41.J(u11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(b21Var.R == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i15 = 0;
                            boolean z15 = false;
                            while (i15 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i17 = size;
                                if (z13) {
                                    i112 = i16;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i17;
                                        i15 = i112;
                                    }
                                } else {
                                    i112 = i16;
                                }
                                if (b21Var.a0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i17;
                                    i15 = i112;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((l41) j3.r0.j(1, arrayList)).y |= 8;
                                        }
                                        z41Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        z41Var.M();
                                        z15 = true;
                                    }
                                    l41 J2 = l41.J(u11.class);
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
                                    long j19 = b21Var.R;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i17;
                                    i15 = i112;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z41Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && b21Var.n) {
                            l41 J3 = l41.J(u11.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            l41 J4 = l41.J(u11.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            l41 J5 = l41.J(u11.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l41 J6 = l41.J(u11.class);
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
                        b21.b(b21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z17 = b21Var.e;
                        int i18 = b21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i18);
                        long j20 = b21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i18).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = b21Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i19 = z11.a;
                            l41 J7 = l41.J(z11.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(b21Var.R == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                int i21 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i21;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (b21Var.a0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i21;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        z41Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        z41Var2.M();
                                        z12 = true;
                                    }
                                    int i22 = z11.a;
                                    l41 J8 = l41.J(z11.class);
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
                                    long j22 = b21Var.R;
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
                                    size2 = i21;
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
                            z41Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && b21Var.n) {
                            int i23 = z11.a;
                            l41 J9 = l41.J(z11.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l41 J10 = l41.J(z11.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l41 J11 = l41.J(z11.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i24 = z11.a;
                                l41 J12 = l41.J(z11.class);
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
        }, new i11(this), new i11(this), b6Var);
        this.C = q11Var;
        final int i14 = 1;
        q11Var.B1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.n11
            public final /* synthetic */ b21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i112;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i122 = i14;
                b21 b21Var = this.b;
                switch (i122) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        boolean z13 = b21Var.f;
                        int i132 = b21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i132);
                        long j17 = b21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i132).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i132).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = b21Var.e;
                        int i142 = u11.a;
                        l41 J = l41.J(u11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(b21Var.R == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i15 = 0;
                            boolean z15 = false;
                            while (i15 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i15);
                                int i16 = i15 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i17 = size;
                                if (z13) {
                                    i112 = i16;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i17;
                                        i15 = i112;
                                    }
                                } else {
                                    i112 = i16;
                                }
                                if (b21Var.a0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i17;
                                    i15 = i112;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((l41) j3.r0.j(1, arrayList)).y |= 8;
                                        }
                                        z41Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        z41Var.M();
                                        z15 = true;
                                    }
                                    l41 J2 = l41.J(u11.class);
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
                                    long j19 = b21Var.R;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i17;
                                    i15 = i112;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z41Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && b21Var.n) {
                            l41 J3 = l41.J(u11.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            l41 J4 = l41.J(u11.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            l41 J5 = l41.J(u11.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                l41 J6 = l41.J(u11.class);
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
                        b21.b(b21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        z41 z41Var2 = (z41) obj2;
                        boolean z17 = b21Var.e;
                        int i18 = b21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i18);
                        long j20 = b21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i18).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i18).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = b21Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i19 = z11.a;
                            l41 J7 = l41.J(z11.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(b21Var.R == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i20 = 0;
                            while (i20 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i20);
                                i20++;
                                int i21 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i21;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (b21Var.a0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i21;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        z41Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        z41Var2.M();
                                        z12 = true;
                                    }
                                    int i22 = z11.a;
                                    l41 J8 = l41.J(z11.class);
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
                                    long j22 = b21Var.R;
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
                                    size2 = i21;
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
                            z41Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && b21Var.n) {
                            int i23 = z11.a;
                            l41 J9 = l41.J(z11.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            l41 J10 = l41.J(z11.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            l41 J11 = l41.J(z11.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i24 = z11.a;
                                l41 J12 = l41.J(z11.class);
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
        q11Var.U2.r = false;
        q11Var.setClipToPadding(false);
        q11Var.setClipChildren(false);
        viewGroup2.addView(q11Var, g7.e6.d(-1, -1.0f, 119, 0.0f, isBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        q11Var.j(new p11(this, 1));
        final int i15 = 0;
        ImageView i16 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l11
            public final /* synthetic */ b21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        b21 b21Var = this.b;
                        Boolean bool = b21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        b21Var.d(z10);
                        break;
                    case 1:
                        b21 b21Var2 = this.b;
                        q11 q11Var2 = b21Var2.C;
                        q11Var2.w1(false);
                        o11 o11Var2 = b21Var2.s;
                        o11Var2.w1(false);
                        b21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(q11Var2);
                        AndroidUtilities.updateVisibleRows(o11Var2);
                        break;
                    default:
                        this.b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.y = i16;
        final int i17 = 0;
        ImageView i18 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l11
            public final /* synthetic */ b21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        b21 b21Var = this.b;
                        Boolean bool = b21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        b21Var.d(z10);
                        break;
                    case 1:
                        b21 b21Var2 = this.b;
                        q11 q11Var2 = b21Var2.C;
                        q11Var2.w1(false);
                        o11 o11Var2 = b21Var2.s;
                        o11Var2.w1(false);
                        b21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(q11Var2);
                        AndroidUtilities.updateVisibleRows(o11Var2);
                        break;
                    default:
                        this.b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.A = i18;
        frameLayout.addView(i16, g7.e6.e(44, 36, 51));
        viewGroup2.addView(i18, g7.e6.e(64, 48, 51));
        final int i19 = 1;
        ImageView i20 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l11
            public final /* synthetic */ b21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        b21 b21Var = this.b;
                        Boolean bool = b21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        b21Var.d(z10);
                        break;
                    case 1:
                        b21 b21Var2 = this.b;
                        q11 q11Var2 = b21Var2.C;
                        q11Var2.w1(false);
                        o11 o11Var2 = b21Var2.s;
                        o11Var2.w1(false);
                        b21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(q11Var2);
                        AndroidUtilities.updateVisibleRows(o11Var2);
                        break;
                    default:
                        this.b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.w = i20;
        final int i21 = 1;
        ImageView i22 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l11
            public final /* synthetic */ b21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        b21 b21Var = this.b;
                        Boolean bool = b21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !b21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        b21Var.d(z10);
                        break;
                    case 1:
                        b21 b21Var2 = this.b;
                        q11 q11Var2 = b21Var2.C;
                        q11Var2.w1(false);
                        o11 o11Var2 = b21Var2.s;
                        o11Var2.w1(false);
                        b21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(q11Var2);
                        AndroidUtilities.updateVisibleRows(o11Var2);
                        break;
                    default:
                        this.b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.x = i22;
        frameLayout.addView(i20, g7.e6.e(44, 36, 51));
        viewGroup2.addView(i22, g7.e6.e(64, 48, 51));
        MessagesController.getInstance(i9).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i9).getMainSettings();
        if (org.telegram.messenger.l0.v("topicssidetabs", j10, mainSettings, false)) {
            this.N = 1.0f;
            this.M = true;
        }
        boolean v = org.telegram.messenger.l0.v("topicssidetabsb", j10, mainSettings, false);
        this.L = v;
        i18.setImageResource(v ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        f(false);
        g();
        n();
        o();
    }

    public static void a(b21 b21Var, l41 l41Var) {
        if (b21Var.e) {
            Utilities.Callback2 callback2 = b21Var.V;
            if (callback2 != null) {
                callback2.run(Long.valueOf(l41Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (l41Var.B == -2) {
            Runnable runnable = b21Var.U;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = b21Var.T;
        if (callback22 != null) {
            callback22.run(Integer.valueOf(l41Var.d), Boolean.FALSE);
        }
    }

    public static void b(b21 b21Var, ArrayList arrayList) {
        long j10 = b21Var.c;
        TopicsController topicsController = MessagesController.getInstance(b21Var.b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i9 = 0;
        while (i9 < arrayList.size()) {
            i9 = j3.r0.e(((l41) arrayList.get(i9)).d, i9, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static boolean c(final b21 b21Var, l41 l41Var, View view) {
        TLRPC.Chat chat;
        final b21 b21Var2;
        org.telegram.ui.ActionBar.b6 b6Var;
        final int i9;
        ?? r11;
        byte b10;
        int i10;
        final x60 x60Var;
        x60 x60Var2;
        org.telegram.ui.ActionBar.b6 b6Var2 = b21Var.d;
        org.telegram.ui.qn qnVar = b21Var.h;
        long j10 = b21Var.c;
        int i11 = b21Var.b;
        if (b21Var.C.Y2 || b21Var.s.Y2) {
            return false;
        }
        Object obj = l41Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i11);
        TLRPC.Chat chat2 = j10 < 0 ? messagesController.getChat(Long.valueOf(-j10)) : null;
        TLRPC.User user = j10 > 0 ? messagesController.getUser(Long.valueOf(j10)) : null;
        final x60 I = x60.I(qnVar, view);
        if (ChatObject.isMonoForum(chat2)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i11, chat2)) {
                return false;
            }
            TLRPC.Chat chat3 = chat2;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new org.telegram.messenger.lg(b21Var, I, peerDialogId, chat2, 5), false);
            long j11 = chat3.id;
            if (ChatObject.isMonoForum(chat3) && ChatObject.canManageMonoForum(i11, chat3)) {
                long j12 = chat3.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat chat4 = MessagesController.getInstance(i11).getChat(Long.valueOf(j11));
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
            if (user2 == null || !ChatObject.canBlockUsers(chat4)) {
                x60Var2 = I;
                i10 = 8;
            } else {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.g1 y10 = I.y();
                i10 = 8;
                y10.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i11);
                gh.q2 q2Var = new gh.q2(b21Var, y10, I, j11, user2, chat4);
                x60Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, q2Var);
            }
            x60Var = x60Var2;
            b6Var = b6Var2;
            i9 = 2;
            r11 = 1;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat2;
            if (ChatObject.canManageTopics(chat5) || UserObject.isBotForumWithEditableTopics(user)) {
                boolean z10 = tL_forumTopic.pinned;
                int i12 = z10 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                String string = LocaleController.getString(z10 ? R.string.DialogUnpin : R.string.DialogPin);
                int i13 = i12;
                chat = chat5;
                b21Var2 = b21Var;
                no0 no0Var = new no0(b21Var2, I, messagesController, tL_forumTopic, 4);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                int i14 = 0;
                I.c(i13, string, no0Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new j11(b21Var2, i14), false);
                }
            } else {
                b21Var2 = b21Var;
                chat = chat5;
            }
            if (ChatObject.canManageTopics(chat) || UserObject.isBotForumWithEditableTopics(user)) {
                final int i15 = 0;
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(b21Var2) { // from class: org.telegram.ui.Components.k11
                    public final /* synthetic */ b21 b;

                    {
                        this.b = b21Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z11;
                        int i16 = i15;
                        b21 b21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        x60 x60Var3 = I;
                        switch (i16) {
                            case 0:
                                x60Var3.u();
                                b21Var3.h.presentFragment(rd1.Z(-b21Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                b21Var3.getClass();
                                x60Var3.u();
                                MessagesController.getInstance(b21Var3.b).getTopicsController().toggleCloseTopic(-b21Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                x60Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                hc hcVar = new hc(16);
                                b21 b21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = b21Var4.R;
                                if (hashSet.size() == 1) {
                                    z11 = false;
                                    c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(b21Var4.b).getTopicsController().findTopic(-b21Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z11 = false;
                                    c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gh.c3(b21Var4, arrayList, j13, hashSet, hcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(13));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, z11));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            long j13 = b21Var2.c;
            long j14 = tL_forumTopic.id;
            int currentAccount = qnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.b6 resourceProvider = qnVar.getResourceProvider();
            x60 x60Var3 = I;
            zn znVar = new zn(x60Var3, currentAccount, j13, j14, qnVar, resourceProvider);
            x60 J = x60Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.kt0(x60Var3, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.ce(x60Var3, currentAccount, j13, j14, J, qnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.g1 y11 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new c3.d(x60Var3, resourceProvider, currentAccount, znVar, 17), false);
            b6Var = b6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new bg.x0(x60Var3, j13, j14, qnVar, resourceProvider, 8), false);
            J.c(0, "", new gh.w7(x60Var3, currentAccount, j13, j14, qnVar, resourceProvider), false);
            new org.telegram.messenger.m9(currentAccount, j13, j14, J.y(), y11).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.id);
            int i16 = isDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute;
            String string2 = LocaleController.getString(isDialogMuted ? R.string.Unmute : R.string.Mute);
            i9 = 2;
            r11 = 1;
            r11 = 1;
            b10 = 0;
            i10 = 8;
            org.telegram.ui.hr hrVar = new org.telegram.ui.hr(b21Var, messagesController, tL_forumTopic, x60Var3, J, 4);
            x60Var = x60Var3;
            x60Var.c(i16, string2, hrVar, false);
            TLRPC.Chat chat6 = chat;
            if (ChatObject.canManageTopic(i11, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z11 = tL_forumTopic.closed;
                int i17 = z11 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close;
                String string3 = LocaleController.getString(z11 ? R.string.RestartTopic : R.string.CloseTopic);
                final int i18 = r11 == true ? 1 : 0;
                x60Var.c(i17, string3, new Runnable(b21Var) { // from class: org.telegram.ui.Components.k11
                    public final /* synthetic */ b21 b;

                    {
                        this.b = b21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z112;
                        int i162 = i18;
                        b21 b21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        x60 x60Var32 = x60Var;
                        switch (i162) {
                            case 0:
                                x60Var32.u();
                                b21Var3.h.presentFragment(rd1.Z(-b21Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                b21Var3.getClass();
                                x60Var32.u();
                                MessagesController.getInstance(b21Var3.b).getTopicsController().toggleCloseTopic(-b21Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                x60Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                hc hcVar = new hc(16);
                                b21 b21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = b21Var4.R;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(b21Var4.b).getTopicsController().findTopic(-b21Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gh.c3(b21Var4, arrayList, j132, hashSet, hcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(13));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, z112));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i11, chat6, tL_forumTopic)) {
                x60Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(b21Var) { // from class: org.telegram.ui.Components.k11
                    public final /* synthetic */ b21 b;

                    {
                        this.b = b21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z112;
                        int i162 = i9;
                        b21 b21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        x60 x60Var32 = x60Var;
                        switch (i162) {
                            case 0:
                                x60Var32.u();
                                b21Var3.h.presentFragment(rd1.Z(-b21Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                b21Var3.getClass();
                                x60Var32.u();
                                MessagesController.getInstance(b21Var3.b).getTopicsController().toggleCloseTopic(-b21Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                x60Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                hc hcVar = new hc(16);
                                b21 b21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = b21Var4.R;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(b21Var4.b).getTopicsController().findTopic(-b21Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gh.c3(b21Var4, arrayList, j132, hashSet, hcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(13));
                                c2Var.show();
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, z112));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof v11) {
            mv mvVar = new mv(i9, b10);
            Paint paint = new Paint((int) r11);
            mvVar.c = paint;
            mvVar.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
            x60Var.W(mvVar);
            x60Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var);
            float f10 = b10;
            float f11 = dp;
            float f12 = dp2;
            float[] fArr = new float[i10];
            fArr[b10] = f10;
            fArr[r11] = f10;
            fArr[i9] = f11;
            fArr[3] = f11;
            fArr[4] = f12;
            fArr[5] = f12;
            fArr[6] = f10;
            fArr[7] = f10;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(v02);
            x60Var.W(shapeDrawable);
        }
        x60Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i9, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i9);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        g7.g6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        long j10 = this.c;
        int i9 = this.b;
        if (z10) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i9).getTopicsController().onTopicFragmentResume(-j10);
        } else {
            MessagesController.getInstance(i9).getTopicsController().onTopicFragmentPause(-j10);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.updateInterfaces);
        }
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        n();
    }

    public final void d(boolean z10) {
        if (this.M == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.O) {
                this.P = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.L = !this.L;
        }
        this.M = z10;
        this.O = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, z10 ? 1.0f : 0.0f);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new q60(this, 28));
        this.Q.addListener(new r11(this, z10));
        this.Q.setInterpolator(rh.m.V);
        this.Q.setDuration(250L);
        this.Q.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.topicsDidLoaded;
        long j10 = this.c;
        if (i9 == i11) {
            if (((Long) objArr[0]).longValue() != (-j10)) {
                return;
            }
            o();
        } else {
            if (i9 != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.b).getTopicsController().sortTopics(-j10, false);
            o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.B;
        if (frameLayout.getVisibility() == 0) {
            this.G.setBounds((int) frameLayout.getTranslationX(), (int) this.J, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.I));
            this.G.draw(canvas);
        }
        FrameLayout frameLayout2 = this.r;
        if (frameLayout2.getVisibility() == 0) {
            this.H.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.H.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.H.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.B) {
            canvas.clipPath(this.G.h.k);
        }
        if (view == this.r) {
            canvas.clipPath(this.H.h.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        FrameLayout frameLayout = this.B;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.I + this.J);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void f(boolean z10) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.b).getTopicsController().getTopics(-this.c);
        this.a.a((topics == null || topics.isEmpty() || this.W) ? false : true, z10);
    }

    public final void g() {
        td.a aVar = this.F;
        float f10 = aVar.e;
        ImageView imageView = this.w;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView.setVisibility(f10 > 0.0f ? 0 : 8);
        ImageView imageView2 = this.x;
        imageView2.setAlpha(f10);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView2.setVisibility(f10 > 0.0f ? 0 : 8);
        float f11 = 1.0f - aVar.e;
        ImageView imageView3 = this.y;
        imageView3.setAlpha(f11);
        imageView3.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView3.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView3.setVisibility(f11 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.A;
        imageView4.setAlpha(f11);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setVisibility(f11 > 0.0f ? 0 : 8);
    }

    public w11 getCurrentTabsPosition() {
        return this.M ? w11.b : this.L ? w11.c : w11.a;
    }

    public float getSideMenuT() {
        return this.N * this.a.e;
    }

    public final void h() {
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.N);
        FrameLayout frameLayout = this.r;
        frameLayout.setAlpha(lerp);
        frameLayout.setVisibility((1.0f - this.N) * this.a.e > 0.0f ? 0 : 8);
        if (this.L) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.I) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(w11.c)));
        } else {
            frameLayout.setTranslationY(this.J + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(w11.a)));
        }
    }

    public final float j(w11 w11Var) {
        float f10;
        float f11 = this.a.e;
        if (w11Var == w11.b) {
            f10 = this.N;
        } else {
            if ((w11Var != w11.a || this.L) && !(w11Var == w11.c && this.L)) {
                return 0.0f;
            }
            f10 = 1.0f - this.N;
        }
        return f10 * f11;
    }

    public final boolean k() {
        if (this.N <= 0.5f) {
            int i9 = 0;
            while (true) {
                o11 o11Var = this.s;
                if (i9 >= o11Var.getChildCount()) {
                    break;
                }
                l41 G = o11Var.U2.G(RecyclerView.R(o11Var.getChildAt(i9)));
                if (G != null && G.r) {
                    return true;
                }
                i9++;
            }
        } else {
            int i10 = 0;
            while (true) {
                q11 q11Var = this.C;
                if (i10 >= q11Var.getChildCount()) {
                    break;
                }
                l41 G2 = q11Var.U2.G(RecyclerView.R(q11Var.getChildAt(i10)));
                if (G2 != null && G2.r) {
                    return true;
                }
                i10++;
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
            Utilities.Callback2 callback2 = this.V;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.T;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.ge geVar = this.K;
        if (geVar != null) {
            geVar.run();
        }
        h();
        float j10 = j(w11.b);
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10);
        FrameLayout frameLayout = this.B;
        frameLayout.setTranslationX(lerp);
        frameLayout.setVisibility(j10 <= 0.0f ? 8 : 0);
        int i9 = org.telegram.ui.ActionBar.f6.z6;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        int d = i0.a.d(1.0f - this.N, v02, org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.A.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.N, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(i10, b6Var)), mode));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), mode));
        this.x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        o11 o11Var = this.s;
        boolean canScrollHorizontally = o11Var.canScrollHorizontally(-1);
        o11Var.U2.N(true);
        if (!canScrollHorizontally) {
            o11Var.u0(0);
        }
        q11 q11Var = this.C;
        boolean canScrollVertically = q11Var.canScrollVertically(-1);
        q11Var.U2.N(true);
        if (!canScrollVertically) {
            q11Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new j11(this, 1));
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        h();
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        this.R = j10;
        o11 o11Var = this.s;
        o11Var.U2.N(true);
        o11Var.invalidate();
        this.C.U2.N(true);
        a21 a21Var = this.v;
        if (a21Var != null) {
            a21Var.c(true, false, j10 == 0);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.V = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.U = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.T = callback2;
    }

    public void setSideMenuBackgroundDrawable(kg.d dVar) {
        this.G = dVar;
        dVar.p(AndroidUtilities.dp(16.0f));
        this.G.o(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f10) {
        this.I = f10;
        h();
        e();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f10) {
        this.J = f10;
        this.B.setTranslationY(f10);
        h();
        e();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(kg.d dVar) {
        this.H = dVar;
        dVar.p(AndroidUtilities.dp(18.0f));
        this.H.o(AndroidUtilities.dp(7.0f));
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
