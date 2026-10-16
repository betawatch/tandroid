package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public org.telegram.ui.Components.i5 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public int J;
    public final ArrayList K;
    public boolean L;
    public boolean M;
    public a0.h N;
    public ArrayList O;
    public org.telegram.ui.Components.z30 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.u1 a;
    public gi1 b;
    public di.g2 c;
    public org.telegram.ui.Components.mm0 d;
    public org.telegram.ui.Components.f10 e;
    public org.telegram.ui.Components.s70 f;
    public ei1 h;
    public ci1 n;
    public org.telegram.ui.Components.l20 r;
    public FrameLayout.LayoutParams s;
    public boolean v;
    public int w;
    public int x;
    public int y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.N = new a0.h();
        this.O = new ArrayList();
        this.I = z10;
        this.J = i10;
        this.K = arrayList;
        this.x = 0;
        this.G = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(UsersSelectActivity usersSelectActivity, Context context, View view, int i10) {
        long j10;
        UsersSelectActivity usersSelectActivity2;
        org.telegram.ui.Components.aq aqVar;
        a0.h hVar = usersSelectActivity.N;
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            boolean z10 = object instanceof String;
            if (z10) {
                j10 = -9223372036854775807L;
                int i11 = 4;
                if (usersSelectActivity.x == 2) {
                    if (i10 == 1) {
                        j10 = -9223372036854775800L;
                        i11 = 1;
                    } else if (i10 != 2 || usersSelectActivity.H) {
                        if (i10 != (!usersSelectActivity.H ? 1 : 0) + 2) {
                            i11 = 8;
                        }
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = -9223372036854775799L;
                        i11 = 2;
                    }
                    aqVar = g4Var.d;
                    if (aqVar == null ? aqVar.a.q : g4Var.H) {
                        usersSelectActivity.J |= i11;
                    } else {
                        usersSelectActivity.J &= ~i11;
                    }
                } else {
                    if (usersSelectActivity.I) {
                        if (i10 == 1) {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                            j10 = Long.MIN_VALUE;
                        } else if (i10 == 2) {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                        } else if (i10 == 3) {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                            j10 = -9223372036854775806L;
                        } else if (i10 == 4) {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                            j10 = -9223372036854775805L;
                        } else {
                            i11 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                            j10 = -9223372036854775804L;
                        }
                    } else if (i10 == 1) {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                        j10 = -9223372036854775803L;
                    } else if (i10 == 2) {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                        j10 = -9223372036854775802L;
                    } else {
                        i11 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                        j10 = -9223372036854775801L;
                    }
                    aqVar = g4Var.d;
                    if (aqVar == null ? aqVar.a.q : g4Var.H) {
                    }
                }
            } else if (object instanceof TLRPC.User) {
                j10 = ((TLRPC.User) object).id;
            } else {
                if (!(object instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) object;
                j10 = -chat.id;
                if (usersSelectActivity.x == 1 && !ChatObject.canUserDoAdminAction(chat, 13)) {
                    org.telegram.messenger.sk.q(R.string.NeedAdminRightForSetAutoDeleteTimer, org.telegram.ui.Components.zc.a0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z11 = hVar.h(j10) >= 0;
            if (z11) {
                usersSelectActivity.b.b((org.telegram.ui.Components.z30) hVar.f(j10));
                usersSelectActivity2 = usersSelectActivity;
            } else {
                if ((!z10 && !usersSelectActivity.getUserConfig().isPremium() && usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitDefault) || usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitPremium) {
                    sg.j0 j0Var = new sg.j0(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
                    j0Var.w0 = usersSelectActivity.w;
                    usersSelectActivity.showDialog(j0Var);
                    return;
                }
                usersSelectActivity2 = usersSelectActivity;
                if (object instanceof TLRPC.User) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putUser((TLRPC.User) object, !usersSelectActivity2.M);
                } else if (object instanceof TLRPC.Chat) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putChat((TLRPC.Chat) object, !usersSelectActivity2.M);
                }
                org.telegram.ui.Components.z30 z30Var = new org.telegram.ui.Components.z30(usersSelectActivity2.c.getContext(), object);
                usersSelectActivity2.b.a(z30Var, true);
                z30Var.setOnClickListener(usersSelectActivity2);
            }
            usersSelectActivity2.Y();
            if (usersSelectActivity2.M || usersSelectActivity2.L) {
                AndroidUtilities.showKeyboard(usersSelectActivity2.c);
            } else {
                g4Var.c(!z11, true);
            }
            if (usersSelectActivity2.c.length() > 0) {
                usersSelectActivity2.c.setText((CharSequence) null);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r4.equals("existing_chats") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r4.equals("new_chats") != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        long j10;
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof String) {
                    String str = (String) object;
                    j10 = -9223372036854775800L;
                    switch (str.hashCode()) {
                        case -1716307998:
                            str.equals("archived");
                            j10 = -9223372036854775801L;
                            break;
                        case -1237460524:
                            if (str.equals("groups")) {
                                j10 = -9223372036854775806L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case -1197490811:
                            if (str.equals("non_contacts")) {
                                j10 = -9223372036854775807L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case -567451565:
                            if (str.equals("contacts")) {
                                j10 = Long.MIN_VALUE;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case -268161860:
                            break;
                        case 3029900:
                            if (str.equals("bots")) {
                                j10 = -9223372036854775804L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                j10 = -9223372036854775802L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case 104264043:
                            if (str.equals("muted")) {
                                j10 = -9223372036854775803L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        case 151051367:
                            break;
                        case 1432626128:
                            if (str.equals("channels")) {
                                j10 = -9223372036854775805L;
                                break;
                            }
                            j10 = -9223372036854775801L;
                            break;
                        default:
                            j10 = -9223372036854775801L;
                            break;
                    }
                } else {
                    j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
                }
                if (j10 != 0) {
                    g4Var.c(this.N.h(j10) >= 0, true);
                    g4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public final void X() {
        a0.h hVar = this.N;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        ci1 ci1Var = this.n;
        if (ci1Var != null) {
            ci1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Y() {
        int i10 = this.x;
        if (i10 == 0) {
            int i11 = getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
            int i12 = this.w;
            if (i12 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i11, new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i12), Integer.valueOf(this.w), Integer.valueOf(i11)));
                return;
            }
        }
        if (i10 == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.w == 0) {
                this.E.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.R > 0) {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.E.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.s6 title = this.E.getTitle();
            int i13 = this.w;
            title.setText(LocaleController.formatPluralString("Chats", i13, Integer.valueOf(i13)));
            if (this.R > 0) {
                this.E.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.E.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        int i10;
        this.M = false;
        this.L = false;
        this.O.clear();
        this.N.b();
        this.P = null;
        if (this.x == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(parentActivity);
            i5Var.a = true;
            i5Var.b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(parentActivity, true, true, true);
            i5Var.c = s6Var;
            int i11 = org.telegram.ui.ActionBar.g6.A8;
            s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            s6Var.setTextSize(AndroidUtilities.dp(18.0f));
            s6Var.setGravity(3);
            s6Var.setTypeface(AndroidUtilities.bold());
            s6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            i5Var.addView(s6Var);
            org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(parentActivity, true, true, true);
            i5Var.d = s6Var2;
            s6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.B8));
            s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            s6Var2.setGravity(3);
            s6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            i5Var.addView(s6Var2);
            s6Var.getDrawable().J = true;
            s6Var2.getDrawable().J = true;
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
            s6Var.b(1.0f, 150L, esVar);
            s6Var2.b(1.0f, 150L, esVar);
            i5Var.setClipChildren(false);
            this.E = i5Var;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = LocaleController.isRTL;
            kVar.addView(i5Var, w7.z5.a(-1.0f, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f, -1, 0));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i12 = this.x;
        boolean z11 = this.I;
        if (i12 == 0 || i12 == 2) {
            if (z11) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            }
        } else if (i12 == 1) {
            Y();
        }
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 11));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 6);
        this.a = u1Var;
        u1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.a, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
        fVar.addView(this.a);
        gi1 gi1Var = new gi1(this, context);
        this.b = gi1Var;
        this.a.addView(gi1Var, w7.z5.d(-2.0f, -1));
        final int i13 = 0;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ai1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.b;
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.c);
                        break;
                    default:
                        this.b.X();
                        break;
                }
            }
        });
        di.g2 g2Var = new di.g2(this, context, 9);
        this.c = g2Var;
        g2Var.setTextSize(1, 16.0f);
        this.c.setHintColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Xh, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.c.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Yh, false));
        this.c.setCursorWidth(1.5f);
        di.g2 g2Var2 = this.c;
        g2Var2.setInputType(g2Var2.getInputType() | 176);
        this.c.setSingleLine(true);
        this.c.setBackgroundDrawable(null);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setTextIsSelectable(false);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setImeOptions(268435462);
        this.c.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.b.addView(this.c);
        this.c.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.c.setCustomSelectionActionModeCallback(new ji.c1(4));
        this.c.setOnKeyListener(new c70(1, this));
        this.c.addTextChangedListener(new bi1(this));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        this.e = f10Var;
        f10Var.setViewType(10);
        org.telegram.ui.Components.f10 f10Var2 = this.e;
        f10Var2.w = false;
        f10Var2.setItemsCount(3);
        org.telegram.ui.Components.f10 f10Var3 = this.e;
        int i14 = org.telegram.ui.ActionBar.g6.G8;
        int i15 = org.telegram.ui.ActionBar.g6.i6;
        f10Var3.f(i14, i15, i15);
        fVar.addView(this.e);
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, this.e, 1, null, 2);
        this.f = s70Var;
        s70Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f);
        s4.b0 b0Var = new s4.b0(1, false);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.d = mm0Var;
        mm0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        org.telegram.ui.Components.mm0 mm0Var2 = this.d;
        ei1 ei1Var = new ei1(this, context);
        this.h = ei1Var;
        mm0Var2.setAdapter(ei1Var);
        this.d.setLayoutManager(b0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.d.i(new bi.o(10));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new bi.z5(22, this, context));
        this.d.setOnScrollListener(new ue1(this, 2));
        this.s = org.telegram.ui.Components.l20.b();
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(context, this.resourceProvider, false);
        this.r = l20Var;
        l20Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.r, this.s);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ai1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        UsersSelectActivity usersSelectActivity = this.b;
                        usersSelectActivity.c.clearFocus();
                        usersSelectActivity.c.requestFocus();
                        AndroidUtilities.showKeyboard(usersSelectActivity.c);
                        break;
                    default:
                        this.b.X();
                        break;
                }
            }
        });
        this.r.setContentDescription(LocaleController.getString(R.string.Next));
        int i17 = z11 ? 5 : 3;
        for (int i18 = 1; i18 <= i17; i18++) {
            String str = "non_contacts";
            if (this.x == 2) {
                if (i18 == 1) {
                    str = "existing_chats";
                    i10 = 1;
                } else if (i18 == 2 && !this.H) {
                    str = "new_chats";
                    i10 = 2;
                } else if (i18 == (!this.H ? 1 : 0) + 2) {
                    i10 = 4;
                    str = "contacts";
                } else {
                    i10 = 8;
                }
            } else if (z11) {
                if (i18 == 1) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i18 == 2) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i18 == 3) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i18 == 4) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i18 == 1) {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i18 == 2) {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((i10 & this.J) != 0) {
                org.telegram.ui.Components.z30 z30Var = new org.telegram.ui.Components.z30(this.c.getContext(), str);
                this.b.a(z30Var, false);
                z30Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.K;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                Long l4 = (Long) arrayList.get(i19);
                Object user = l4.longValue() > 0 ? getMessagesController().getUser(l4) : getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                if (user != null) {
                    org.telegram.ui.Components.z30 z30Var2 = new org.telegram.ui.Components.z30(this.c.getContext(), user);
                    this.b.a(z30Var2, false);
                    z30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.s70 s70Var = this.f;
            if (s70Var != null) {
                s70Var.e(false, true);
            }
            ei1 ei1Var = this.h;
            if (ei1Var != null) {
                ei1Var.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.d.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        cz0 cz0Var = new cz0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.S7));
        int i12 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.z30 z30Var = (org.telegram.ui.Components.z30) view;
        if (!z30Var.y) {
            org.telegram.ui.Components.z30 z30Var2 = this.P;
            if (z30Var2 != null) {
                z30Var2.a();
            }
            this.P = z30Var;
            z30Var.b();
            return;
        }
        this.P = null;
        this.b.b(z30Var);
        if (this.x == 2) {
            if (z30Var.getUid() == -9223372036854775800L) {
                this.J &= -2;
            } else if (z30Var.getUid() == -9223372036854775799L) {
                this.J &= -3;
            } else if (z30Var.getUid() == Long.MIN_VALUE) {
                this.J &= -5;
            } else if (z30Var.getUid() == -9223372036854775807L) {
                this.J &= -9;
            }
        } else if (z30Var.getUid() == Long.MIN_VALUE) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
        } else if (z30Var.getUid() == -9223372036854775807L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
        } else if (z30Var.getUid() == -9223372036854775806L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
        } else if (z30Var.getUid() == -9223372036854775805L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
        } else if (z30Var.getUid() == -9223372036854775804L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
        } else if (z30Var.getUid() == -9223372036854775803L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
        } else if (z30Var.getUid() == -9223372036854775802L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
        } else if (z30Var.getUid() == -9223372036854775801L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
        }
        Y();
        W();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        di.g2 g2Var = this.c;
        if (g2Var != null) {
            g2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.y = i10;
        gi1 gi1Var = this.b;
        if (gi1Var != null) {
            gi1Var.requestLayout();
        }
    }
}
