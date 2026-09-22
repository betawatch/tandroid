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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public static final /* synthetic */ int f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final d31 G;
    public long H;
    public long I;
    public final le.b J;
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
    public final le.b a;
    public Utilities.Callback2 a0;
    public final int b;
    public Runnable b0;
    public final long c;
    public Utilities.Callback2 c0;
    public final org.telegram.ui.ActionBar.f6 d;
    public boolean d0;
    public final boolean e;
    public final HashSet e0;
    public final boolean f;
    public final org.telegram.ui.zn h;
    public final boolean n;
    public final FrameLayout r;
    public final b31 s;
    public final m31 v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.ui.Components.a31] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.a31] */
    public n31(Activity activity, org.telegram.ui.zn znVar, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        ViewGroup viewGroup;
        qr qrVar = qr.h;
        this.a = new le.b(0, this, qrVar, 380L, true);
        this.J = new le.b(0, new s21(this), qrVar, 320L, false);
        this.R = 0.0f;
        this.e0 = new HashSet();
        this.h = znVar;
        this.b = i10;
        this.c = j3;
        this.d = f6Var;
        long j10 = -j3;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        this.f = isBotForumWithEditableTopics;
        this.n = !org.telegram.messenger.l0.u("topics_end_reached_", j10, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.r = frameLayout;
        addView(frameLayout, w7.y5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.F = frameLayout2;
        addView(frameLayout2, w7.y5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        final int i11 = 0;
        b31 b31Var = new b31(this, activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.a31
            public final /* synthetic */ n31 b;

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
                n31 n31Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        m61 m61Var = (m61) obj2;
                        boolean z13 = n31Var.f;
                        int i14 = n31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = n31Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = n31Var.e;
                        int i15 = h31.a;
                        y51 J = y51.J(h31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(n31Var.V == 0);
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
                                if (n31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((y51) hg.k0.g(1, arrayList)).y |= 8;
                                        }
                                        m61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        m61Var.M();
                                        z15 = true;
                                    }
                                    y51 J2 = y51.J(h31.class);
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
                                    long j18 = n31Var.V;
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
                            m61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && n31Var.n) {
                            y51 J3 = y51.J(h31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            y51 J4 = y51.J(h31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            y51 J5 = y51.J(h31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                y51 J6 = y51.J(h31.class);
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
                        n31.b(n31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        m61 m61Var2 = (m61) obj2;
                        boolean z17 = n31Var.e;
                        int i19 = n31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = n31Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = n31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = l31.a;
                            y51 J7 = y51.J(l31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(n31Var.V == 0);
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
                                if (n31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        m61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        m61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = l31.a;
                                    y51 J8 = y51.J(l31.class);
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
                                    long j21 = n31Var.V;
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
                            m61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && n31Var.n) {
                            int i24 = l31.a;
                            y51 J9 = y51.J(l31.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            y51 J10 = y51.J(l31.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            y51 J11 = y51.J(l31.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = l31.a;
                                y51 J12 = y51.J(l31.class);
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
        }, new s21(this), new s21(this), f6Var);
        this.s = b31Var;
        final int i12 = 1;
        b31Var.C1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.a31
            public final /* synthetic */ n31 b;

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
                n31 n31Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        m61 m61Var = (m61) obj2;
                        boolean z13 = n31Var.f;
                        int i14 = n31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = n31Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = n31Var.e;
                        int i15 = h31.a;
                        y51 J = y51.J(h31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(n31Var.V == 0);
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
                                if (n31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((y51) hg.k0.g(1, arrayList)).y |= 8;
                                        }
                                        m61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        m61Var.M();
                                        z15 = true;
                                    }
                                    y51 J2 = y51.J(h31.class);
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
                                    long j18 = n31Var.V;
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
                            m61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && n31Var.n) {
                            y51 J3 = y51.J(h31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            y51 J4 = y51.J(h31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            y51 J5 = y51.J(h31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                y51 J6 = y51.J(h31.class);
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
                        n31.b(n31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        m61 m61Var2 = (m61) obj2;
                        boolean z17 = n31Var.e;
                        int i19 = n31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = n31Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = n31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = l31.a;
                            y51 J7 = y51.J(l31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(n31Var.V == 0);
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
                                if (n31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        m61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        m61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = l31.a;
                                    y51 J8 = y51.J(l31.class);
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
                                    long j21 = n31Var.V;
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
                            m61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && n31Var.n) {
                            int i24 = l31.a;
                            y51 J9 = y51.J(l31.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            y51 J10 = y51.J(l31.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            y51 J11 = y51.J(l31.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = l31.a;
                                y51 J12 = y51.J(l31.class);
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
        b31Var.setWillNotDraw(false);
        b31Var.Y2.r = false;
        b31Var.getContext();
        gg.j0 j0Var = new gg.j0((ViewGroup) b31Var, 6);
        b31Var.X2 = j0Var;
        b31Var.setLayoutManager(j0Var);
        frameLayout.addView(b31Var, w7.y5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        b31Var.j(new c31(this, 0));
        if (isBotForumWithEditableTopics) {
            m31 m31Var = new m31(activity, i10, f6Var);
            this.v = m31Var;
            m31Var.c(true, false, this.V == 0);
            final int i13 = 2;
            m31Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w21
                public final /* synthetic */ n31 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            n31 n31Var = this.b;
                            Boolean bool = n31Var.T;
                            boolean z10 = false;
                            if (bool == null ? !n31Var.Q : !bool.booleanValue()) {
                                z10 = true;
                            }
                            n31Var.d(z10);
                            break;
                        case 1:
                            n31 n31Var2 = this.b;
                            d31 d31Var = n31Var2.G;
                            d31Var.x1(false);
                            b31 b31Var2 = n31Var2.s;
                            b31Var2.x1(false);
                            n31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(d31Var);
                            AndroidUtilities.updateVisibleRows(b31Var2);
                            break;
                        default:
                            this.b.a0.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(m31Var, w7.y5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.v = null;
        }
        final int i14 = 2;
        ViewGroup viewGroup2 = viewGroup;
        d31 d31Var = new d31(activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.a31
            public final /* synthetic */ n31 b;

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
                n31 n31Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        m61 m61Var = (m61) obj2;
                        boolean z13 = n31Var.f;
                        int i142 = n31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j16 = n31Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = n31Var.e;
                        int i15 = h31.a;
                        y51 J = y51.J(h31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(n31Var.V == 0);
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
                                if (n31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((y51) hg.k0.g(1, arrayList)).y |= 8;
                                        }
                                        m61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        m61Var.M();
                                        z15 = true;
                                    }
                                    y51 J2 = y51.J(h31.class);
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
                                    long j18 = n31Var.V;
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
                            m61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && n31Var.n) {
                            y51 J3 = y51.J(h31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            y51 J4 = y51.J(h31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            y51 J5 = y51.J(h31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                y51 J6 = y51.J(h31.class);
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
                        n31.b(n31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        m61 m61Var2 = (m61) obj2;
                        boolean z17 = n31Var.e;
                        int i19 = n31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = n31Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = n31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = l31.a;
                            y51 J7 = y51.J(l31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(n31Var.V == 0);
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
                                if (n31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        m61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        m61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = l31.a;
                                    y51 J8 = y51.J(l31.class);
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
                                    long j21 = n31Var.V;
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
                            m61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && n31Var.n) {
                            int i24 = l31.a;
                            y51 J9 = y51.J(l31.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            y51 J10 = y51.J(l31.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            y51 J11 = y51.J(l31.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = l31.a;
                                y51 J12 = y51.J(l31.class);
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
        }, new s21(this), new s21(this), f6Var);
        this.G = d31Var;
        final int i15 = 1;
        d31Var.C1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.a31
            public final /* synthetic */ n31 b;

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
                n31 n31Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        m61 m61Var = (m61) obj2;
                        boolean z13 = n31Var.f;
                        int i142 = n31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j16 = n31Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = n31Var.e;
                        int i152 = h31.a;
                        y51 J = y51.J(h31.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(n31Var.V == 0);
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
                                if (n31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((y51) hg.k0.g(1, arrayList)).y |= 8;
                                        }
                                        m61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        m61Var.M();
                                        z15 = true;
                                    }
                                    y51 J2 = y51.J(h31.class);
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
                                    long j18 = n31Var.V;
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
                            m61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && n31Var.n) {
                            y51 J3 = y51.J(h31.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            y51 J4 = y51.J(h31.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            y51 J5 = y51.J(h31.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                y51 J6 = y51.J(h31.class);
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
                        n31.b(n31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        m61 m61Var2 = (m61) obj2;
                        boolean z17 = n31Var.e;
                        int i19 = n31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = n31Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = n31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = l31.a;
                            y51 J7 = y51.J(l31.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(n31Var.V == 0);
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
                                if (n31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        m61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        m61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = l31.a;
                                    y51 J8 = y51.J(l31.class);
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
                                    long j21 = n31Var.V;
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
                            m61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && n31Var.n) {
                            int i24 = l31.a;
                            y51 J9 = y51.J(l31.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            y51 J10 = y51.J(l31.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            y51 J11 = y51.J(l31.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = l31.a;
                                y51 J12 = y51.J(l31.class);
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
        d31Var.Y2.r = false;
        d31Var.setClipToPadding(false);
        d31Var.setClipChildren(false);
        viewGroup2.addView(d31Var, w7.y5.d(-1, -1.0f, 119, 0.0f, isBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        d31Var.j(new c31(this, 1));
        final int i16 = 0;
        ImageView i17 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w21
            public final /* synthetic */ n31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        n31 n31Var = this.b;
                        Boolean bool = n31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !n31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        n31Var.d(z10);
                        break;
                    case 1:
                        n31 n31Var2 = this.b;
                        d31 d31Var2 = n31Var2.G;
                        d31Var2.x1(false);
                        b31 b31Var2 = n31Var2.s;
                        b31Var2.x1(false);
                        n31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(d31Var2);
                        AndroidUtilities.updateVisibleRows(b31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.y = i17;
        final int i18 = 0;
        ImageView i19 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w21
            public final /* synthetic */ n31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        n31 n31Var = this.b;
                        Boolean bool = n31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !n31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        n31Var.d(z10);
                        break;
                    case 1:
                        n31 n31Var2 = this.b;
                        d31 d31Var2 = n31Var2.G;
                        d31Var2.x1(false);
                        b31 b31Var2 = n31Var2.s;
                        b31Var2.x1(false);
                        n31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(d31Var2);
                        AndroidUtilities.updateVisibleRows(b31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.E = i19;
        frameLayout.addView(i17, w7.y5.e(44, 36, 51));
        viewGroup2.addView(i19, w7.y5.e(64, 48, 51));
        final int i20 = 1;
        ImageView i21 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w21
            public final /* synthetic */ n31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        n31 n31Var = this.b;
                        Boolean bool = n31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !n31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        n31Var.d(z10);
                        break;
                    case 1:
                        n31 n31Var2 = this.b;
                        d31 d31Var2 = n31Var2.G;
                        d31Var2.x1(false);
                        b31 b31Var2 = n31Var2.s;
                        b31Var2.x1(false);
                        n31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(d31Var2);
                        AndroidUtilities.updateVisibleRows(b31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.w = i21;
        final int i22 = 1;
        ImageView i23 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w21
            public final /* synthetic */ n31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        n31 n31Var = this.b;
                        Boolean bool = n31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !n31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        n31Var.d(z10);
                        break;
                    case 1:
                        n31 n31Var2 = this.b;
                        d31 d31Var2 = n31Var2.G;
                        d31Var2.x1(false);
                        b31 b31Var2 = n31Var2.s;
                        b31Var2.x1(false);
                        n31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(d31Var2);
                        AndroidUtilities.updateVisibleRows(b31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.x = i23;
        frameLayout.addView(i21, w7.y5.e(44, 36, 51));
        viewGroup2.addView(i23, w7.y5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j10, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.l0.u("topicssidetabs", j3, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean u10 = org.telegram.messenger.l0.u("topicssidetabsb", j3, mainSettings, false);
        this.P = u10;
        i19.setImageResource(u10 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        f(false);
        g();
        n();
        o();
    }

    public static void a(n31 n31Var, y51 y51Var) {
        if (n31Var.e) {
            Utilities.Callback2 callback2 = n31Var.c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(y51Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (y51Var.B == -2) {
            Runnable runnable = n31Var.b0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = n31Var.a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf(y51Var.d), Boolean.FALSE);
        }
    }

    public static void b(n31 n31Var, ArrayList arrayList) {
        long j3 = n31Var.c;
        TopicsController topicsController = MessagesController.getInstance(n31Var.b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.vision.e2.e(((y51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j10 = -j3;
        topicsController.reorderPinnedTopics(j10, arrayList2);
        topicsController.sortTopics(j10, false);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    public static boolean c(final n31 n31Var, y51 y51Var, View view) {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        final int i11;
        byte b10;
        final y70 y70Var;
        boolean z10;
        ?? r62;
        y70 y70Var2;
        org.telegram.ui.ActionBar.f6 f6Var2 = n31Var.d;
        org.telegram.ui.zn znVar = n31Var.h;
        long j3 = n31Var.c;
        int i12 = n31Var.b;
        final int i13 = 0;
        if (n31Var.G.c3 || n31Var.s.c3) {
            return false;
        }
        Object obj = y51Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i12);
        TLRPC.Chat chat = j3 < 0 ? messagesController.getChat(Long.valueOf(-j3)) : null;
        TLRPC.User user = j3 > 0 ? messagesController.getUser(Long.valueOf(j3)) : null;
        final y70 I = y70.I(znVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i12, chat)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.p8(n31Var, I, peerDialogId, chat2, 29), false);
            long j10 = chat2.id;
            if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(i12, chat2)) {
                long j11 = chat2.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat chat3 = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            if (user2 == null || !ChatObject.canBlockUsers(chat3)) {
                y70Var2 = I;
                i10 = 8;
            } else {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.f1 y3 = I.y();
                i10 = 8;
                y3.setVisibility(8);
                y70Var2 = I;
                MessagesController.getInstance(i12).checkIsInChat(true, chat3, user2, new t21(n31Var, y3, I, j10, user2, chat3));
            }
            y70Var = y70Var2;
            f6Var = f6Var2;
            r62 = 1;
            i11 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat4 = chat;
            if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                boolean z11 = tL_forumTopic.pinned;
                I.c(z11 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z11 ? R.string.DialogUnpin : R.string.DialogPin), new xn0(n31Var, I, messagesController, tL_forumTopic), false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new u21(n31Var, i13), false);
                }
            }
            if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(n31Var) { // from class: org.telegram.ui.Components.v21
                    public final /* synthetic */ n31 b;

                    {
                        this.b = n31Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z12;
                        int i14 = i13;
                        n31 n31Var2 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        y70 y70Var3 = I;
                        switch (i14) {
                            case 0:
                                y70Var3.u();
                                n31Var2.h.presentFragment(bf1.a0(-n31Var2.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                n31Var2.getClass();
                                y70Var3.u();
                                MessagesController.getInstance(n31Var2.b).getTopicsController().toggleCloseTopic(-n31Var2.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                y70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                sh shVar = new sh(13);
                                n31 n31Var3 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n31Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = n31Var3.V;
                                if (hashSet.size() == 1) {
                                    z12 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(n31Var3.b).getTopicsController().findTopic(-n31Var3.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z12 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.xe(n31Var3, arrayList, j12, hashSet, shVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new lg0(15));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, z12));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            long j12 = n31Var.c;
            long j13 = tL_forumTopic.id;
            int currentAccount = znVar.getCurrentAccount();
            org.telegram.ui.ActionBar.f6 resourceProvider = znVar.getResourceProvider();
            ko koVar = new ko(I, currentAccount, j12, j13, znVar, resourceProvider);
            y70 J = I.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(I, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.he(I, currentAccount, j12, j13, J, znVar, resourceProvider), false);
            org.telegram.ui.ActionBar.f1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.c9(I, resourceProvider, currentAccount, koVar, 17), false);
            f6Var = f6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.t2(I, j12, j13, znVar, resourceProvider, 7), false);
            J.c(0, "", new ai.p0(I, currentAccount, j12, j13, znVar, resourceProvider), false);
            new org.telegram.messenger.o9(currentAccount, j12, j13, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j3, tL_forumTopic.id);
            i10 = 8;
            i11 = 2;
            b10 = 0;
            y70Var = I;
            y70Var.c(isDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute, LocaleController.getString(isDialogMuted ? R.string.Unmute : R.string.Mute), new ai.m3(n31Var, messagesController, tL_forumTopic, I, J, 25), false);
            if (!ChatObject.canManageTopic(i12, chat4, tL_forumTopic) || UserObject.isBotForum(user)) {
                z10 = true;
            } else {
                boolean z12 = tL_forumTopic.closed;
                int i14 = z12 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close;
                String string = LocaleController.getString(z12 ? R.string.RestartTopic : R.string.CloseTopic);
                z10 = true;
                final boolean z13 = true ? 1 : 0;
                y70Var.c(i14, string, new Runnable(n31Var) { // from class: org.telegram.ui.Components.v21
                    public final /* synthetic */ n31 b;

                    {
                        this.b = n31Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z122;
                        int i142 = z13;
                        n31 n31Var2 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        y70 y70Var3 = y70Var;
                        switch (i142) {
                            case 0:
                                y70Var3.u();
                                n31Var2.h.presentFragment(bf1.a0(-n31Var2.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                n31Var2.getClass();
                                y70Var3.u();
                                MessagesController.getInstance(n31Var2.b).getTopicsController().toggleCloseTopic(-n31Var2.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                y70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                sh shVar = new sh(13);
                                n31 n31Var3 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n31Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = n31Var3.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(n31Var3.b).getTopicsController().findTopic(-n31Var3.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.xe(n31Var3, arrayList, j122, hashSet, shVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new lg0(15));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, z122));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            r62 = z10;
            if (ChatObject.canDeleteTopic(i12, chat4, tL_forumTopic)) {
                y70Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", z10 ? 1 : 0), new Runnable(n31Var) { // from class: org.telegram.ui.Components.v21
                    public final /* synthetic */ n31 b;

                    {
                        this.b = n31Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z122;
                        int i142 = i11;
                        n31 n31Var2 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        y70 y70Var3 = y70Var;
                        switch (i142) {
                            case 0:
                                y70Var3.u();
                                n31Var2.h.presentFragment(bf1.a0(-n31Var2.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                n31Var2.getClass();
                                y70Var3.u();
                                MessagesController.getInstance(n31Var2.b).getTopicsController().toggleCloseTopic(-n31Var2.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                y70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                sh shVar = new sh(13);
                                n31 n31Var3 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n31Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = n31Var3.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(n31Var3.b).getTopicsController().findTopic(-n31Var3.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.xe(n31Var3, arrayList, j122, hashSet, shVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new lg0(15));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, z122));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                r62 = z10;
            }
        }
        if (view instanceof i31) {
            cw cwVar = new cw(i11, b10);
            Paint paint = new Paint((int) r62);
            cwVar.c = paint;
            cwVar.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
            y70Var.W(cwVar);
            y70Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var);
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
            shapeDrawable.getPaint().setColor(v02);
            y70Var.W(shapeDrawable);
        }
        y70Var.Z();
        return r62;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        w7.a6.a(imageView);
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

    @Override // le.d
    public final void H(int i10, float f7, float f10, le.e eVar) {
        n();
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
        ofFloat.addUpdateListener(new s70(this, 28));
        this.U.addListener(new e31(this, z10));
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
            o();
        } else {
            if (i10 != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.b).getTopicsController().sortTopics(-j3, false);
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
        le.b bVar = this.J;
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

    public j31 getCurrentTabsPosition() {
        return this.Q ? j31.b : this.P ? j31.c : j31.a;
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
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(j31.c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(j31.a)));
        }
    }

    public final float j(j31 j31Var) {
        float f7;
        float f10 = this.a.e;
        if (j31Var == j31.b) {
            f7 = this.R;
        } else {
            if ((j31Var != j31.a || this.P) && !(j31Var == j31.c && this.P)) {
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
                b31 b31Var = this.s;
                if (i10 >= b31Var.getChildCount()) {
                    break;
                }
                y51 G = b31Var.Y2.G(RecyclerView.S(b31Var.getChildAt(i10)));
                if (G != null && G.r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                d31 d31Var = this.G;
                if (i11 >= d31Var.getChildCount()) {
                    break;
                }
                y51 G2 = d31Var.Y2.G(RecyclerView.S(d31Var.getChildAt(i11)));
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

    public final void n() {
        org.telegram.ui.me meVar = this.O;
        if (meVar != null) {
            meVar.run();
        }
        h();
        float j3 = j(j31.b);
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j3);
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(lerp);
        frameLayout.setVisibility(j3 <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int d = i0.a.d(1.0f - this.R, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.R, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)), mode));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        this.x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        b31 b31Var = this.s;
        boolean canScrollHorizontally = b31Var.canScrollHorizontally(-1);
        b31Var.Y2.N(true);
        if (!canScrollHorizontally) {
            b31Var.v0(0);
        }
        d31 d31Var = this.G;
        boolean canScrollVertically = d31Var.canScrollVertically(-1);
        d31Var.Y2.N(true);
        if (!canScrollVertically) {
            d31Var.v0(0);
        }
        AndroidUtilities.runOnUIThread(new u21(this, 1));
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

    public void setAllTopicsHidden(boolean z10) {
        if (this.d0 != z10) {
            this.d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j3) {
        this.V = j3;
        b31 b31Var = this.s;
        b31Var.Y2.N(true);
        b31Var.invalidate();
        this.G.Y2.N(true);
        m31 m31Var = this.v;
        if (m31Var != null) {
            m31Var.c(true, false, j3 == 0);
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

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
