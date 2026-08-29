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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public org.telegram.ui.Components.e5 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public int F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public a0.h J;
    public ArrayList K;
    public org.telegram.ui.Components.j30 L;
    public int M;
    public int N;
    public org.telegram.ui.ActionBar.w1 a;
    public sg1 b;
    public ig.f c;
    public org.telegram.ui.Components.jl0 d;
    public org.telegram.ui.Components.p00 e;
    public org.telegram.ui.Components.q60 f;
    public rg1 h;
    public pg1 n;
    public org.telegram.ui.Components.u10 r;
    public FrameLayout.LayoutParams s;
    public boolean v;
    public int w;
    public int x;
    public int y;

    public UsersSelectActivity(int i10, ArrayList arrayList, boolean z10) {
        super(null);
        this.J = new a0.h();
        this.K = new ArrayList();
        this.E = z10;
        this.F = i10;
        this.G = arrayList;
        this.x = 0;
        this.C = true;
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
        org.telegram.ui.Components.hp hpVar;
        a0.h hVar = usersSelectActivity.J;
        if (view instanceof org.telegram.ui.Cells.e4) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            Object object = e4Var.getObject();
            boolean z10 = object instanceof String;
            if (z10) {
                j10 = -9223372036854775807L;
                int i11 = 4;
                if (usersSelectActivity.x == 2) {
                    if (i10 == 1) {
                        j10 = -9223372036854775800L;
                        i11 = 1;
                    } else if (i10 != 2 || usersSelectActivity.D) {
                        if (i10 != (!usersSelectActivity.D ? 1 : 0) + 2) {
                            i11 = 8;
                        }
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = -9223372036854775799L;
                        i11 = 2;
                    }
                    hpVar = e4Var.d;
                    if (hpVar == null ? hpVar.a.q : e4Var.D) {
                        usersSelectActivity.F |= i11;
                    } else {
                        usersSelectActivity.F &= ~i11;
                    }
                } else {
                    if (usersSelectActivity.E) {
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
                    hpVar = e4Var.d;
                    if (hpVar == null ? hpVar.a.q : e4Var.D) {
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
                    org.telegram.messenger.x3.s(R.string.NeedAdminRightForSetAutoDeleteTimer, org.telegram.ui.Components.tc.a0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z11 = hVar.h(j10) >= 0;
            if (z11) {
                usersSelectActivity.b.b((org.telegram.ui.Components.j30) hVar.f(j10));
                usersSelectActivity2 = usersSelectActivity;
            } else {
                if ((!z10 && !usersSelectActivity.getUserConfig().isPremium() && usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitDefault) || usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitPremium) {
                    cg.v0 v0Var = new cg.v0(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
                    v0Var.s0 = usersSelectActivity.w;
                    usersSelectActivity.showDialog(v0Var);
                    return;
                }
                usersSelectActivity2 = usersSelectActivity;
                if (object instanceof TLRPC.User) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putUser((TLRPC.User) object, !usersSelectActivity2.I);
                } else if (object instanceof TLRPC.Chat) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putChat((TLRPC.Chat) object, !usersSelectActivity2.I);
                }
                org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(usersSelectActivity2.c.getContext(), object);
                usersSelectActivity2.b.a(j30Var, true);
                j30Var.setOnClickListener(usersSelectActivity2);
            }
            usersSelectActivity2.Y();
            if (usersSelectActivity2.I || usersSelectActivity2.H) {
                AndroidUtilities.showKeyboard(usersSelectActivity2.c);
            } else {
                e4Var.c(!z11, true);
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
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                Object object = e4Var.getObject();
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
                    e4Var.c(this.J.h(j10) >= 0, true);
                    e4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public final void X() {
        a0.h hVar = this.J;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        pg1 pg1Var = this.n;
        if (pg1Var != null) {
            pg1Var.a(this.F, arrayList);
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
                this.A.getTitle().c(LocaleController.getString(R.string.SelectChats), true, true);
                if (this.N > 0) {
                    this.A.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForAutoDelete), true, true);
                    return;
                } else {
                    this.A.getSubtitleTextView().c(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true, true);
                    return;
                }
            }
            org.telegram.ui.Components.o6 title = this.A.getTitle();
            int i13 = this.w;
            title.setText(LocaleController.formatPluralString("Chats", i13, Integer.valueOf(i13)));
            if (this.N > 0) {
                this.A.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.A.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i10;
        this.I = false;
        this.H = false;
        this.K.clear();
        this.J.b();
        org.telegram.ui.ActionBar.c6 c6Var = null;
        this.L = null;
        int i11 = 1;
        if (this.x == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(parentActivity);
            e5Var.a = true;
            e5Var.b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            e5Var.c = o6Var;
            int i12 = org.telegram.ui.ActionBar.g6.A8;
            o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            o6Var.setTextSize(AndroidUtilities.dp(18.0f));
            o6Var.setGravity(3);
            o6Var.setTypeface(AndroidUtilities.bold());
            o6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            e5Var.addView(o6Var);
            org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(parentActivity, true, true, true);
            e5Var.d = o6Var2;
            o6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.B8));
            o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o6Var2.setGravity(3);
            o6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            e5Var.addView(o6Var2);
            o6Var.getDrawable().D = true;
            o6Var2.getDrawable().D = true;
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
            o6Var.b(1.0f, 150L, jrVar);
            o6Var2.b(1.0f, 150L, jrVar);
            e5Var.setClipChildren(false);
            this.A = e5Var;
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            boolean z10 = LocaleController.isRTL;
            lVar.addView(e5Var, i7.f6.d(-1, -1.0f, 0, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i13 = this.x;
        boolean z11 = this.E;
        if (i13 == 0 || i13 == 2) {
            if (z11) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            }
        } else if (i13 == 1) {
            Y();
        }
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 25));
        g gVar = new g(this, context, 4);
        this.fragmentView = gVar;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 6);
        this.a = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.a, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        gVar.addView(this.a);
        sg1 sg1Var = new sg1(this, context);
        this.b = sg1Var;
        this.a.addView(sg1Var, i7.f6.c(-2.0f, -1));
        final int i14 = 0;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ng1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
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
        ig.f fVar = new ig.f(this, context, 10);
        this.c = fVar;
        fVar.setTextSize(1, 16.0f);
        this.c.setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xh, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.c.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yh, false));
        this.c.setCursorWidth(1.5f);
        ig.f fVar2 = this.c;
        fVar2.setInputType(fVar2.getInputType() | 176);
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
        this.c.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.k0(4));
        this.c.setOnKeyListener(new f60(1, this));
        this.c.addTextChangedListener(new og1(this));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        this.e = p00Var;
        p00Var.setViewType(10);
        org.telegram.ui.Components.p00 p00Var2 = this.e;
        p00Var2.w = false;
        p00Var2.setItemsCount(3);
        org.telegram.ui.Components.p00 p00Var3 = this.e;
        int i15 = org.telegram.ui.ActionBar.g6.G8;
        int i16 = org.telegram.ui.ActionBar.g6.i6;
        p00Var3.f(i15, i16, i16);
        gVar.addView(this.e);
        org.telegram.ui.Components.q60 q60Var = new org.telegram.ui.Components.q60(context, this.e, i11, c6Var, 2);
        this.f = q60Var;
        q60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f.d.setText(LocaleController.getString(R.string.NoContacts));
        gVar.addView(this.f);
        f2.j0 j0Var = new f2.j0(1, false);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.d = jl0Var;
        jl0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        org.telegram.ui.Components.jl0 jl0Var2 = this.d;
        rg1 rg1Var = new rg1(this, context);
        this.h = rg1Var;
        jl0Var2.setAdapter(rg1Var);
        this.d.setLayoutManager(j0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.d.i(new lh.j(8));
        gVar.addView(this.d);
        this.d.setOnItemClickListener(new eg.w0(23, this, context));
        this.d.setOnScrollListener(new lb1(this, 3));
        this.s = org.telegram.ui.Components.u10.b();
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
        this.r = u10Var;
        u10Var.setImageResource(R.drawable.floating_check);
        gVar.addView(this.r, this.s);
        final int i17 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ng1
            public final /* synthetic */ UsersSelectActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
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
        int i18 = z11 ? 5 : 3;
        for (int i19 = 1; i19 <= i18; i19++) {
            String str = "non_contacts";
            if (this.x == 2) {
                if (i19 == 1) {
                    str = "existing_chats";
                    i10 = 1;
                } else if (i19 == 2 && !this.D) {
                    str = "new_chats";
                    i10 = 2;
                } else if (i19 == (!this.D ? 1 : 0) + 2) {
                    str = "contacts";
                    i10 = 4;
                } else {
                    i10 = 8;
                }
            } else if (z11) {
                if (i19 == 1) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i19 == 2) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i19 == 3) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i19 == 4) {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i10 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i19 == 1) {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i19 == 2) {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((i10 & this.F) != 0) {
                org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(this.c.getContext(), str);
                this.b.a(j30Var, false);
                j30Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.G;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i20 = 0; i20 < size; i20++) {
                Long l10 = (Long) arrayList.get(i20);
                Object user = l10.longValue() > 0 ? getMessagesController().getUser(l10) : getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                if (user != null) {
                    org.telegram.ui.Components.j30 j30Var2 = new org.telegram.ui.Components.j30(this.c.getContext(), user);
                    this.b.a(j30Var2, false);
                    j30Var2.setOnClickListener(this);
                }
            }
        }
        Y();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.q60 q60Var = this.f;
            if (q60Var != null) {
                q60Var.e(false, true);
            }
            rg1 rg1Var = this.h;
            if (rg1Var != null) {
                rg1Var.l();
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
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    ((org.telegram.ui.Cells.e4) childAt).f(intValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        rx0 rx0Var = new rx0(10, this);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i11));
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 262148, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.e4.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.S7));
        int i12 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, i12));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) view;
        if (!j30Var.y) {
            org.telegram.ui.Components.j30 j30Var2 = this.L;
            if (j30Var2 != null) {
                j30Var2.a();
            }
            this.L = j30Var;
            j30Var.b();
            return;
        }
        this.L = null;
        this.b.b(j30Var);
        if (this.x == 2) {
            if (j30Var.getUid() == -9223372036854775800L) {
                this.F &= -2;
            } else if (j30Var.getUid() == -9223372036854775799L) {
                this.F &= -3;
            } else if (j30Var.getUid() == Long.MIN_VALUE) {
                this.F &= -5;
            } else if (j30Var.getUid() == -9223372036854775807L) {
                this.F &= -9;
            }
        } else if (j30Var.getUid() == Long.MIN_VALUE) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
        } else if (j30Var.getUid() == -9223372036854775807L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
        } else if (j30Var.getUid() == -9223372036854775806L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
        } else if (j30Var.getUid() == -9223372036854775805L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
        } else if (j30Var.getUid() == -9223372036854775804L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
        } else if (j30Var.getUid() == -9223372036854775803L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
        } else if (j30Var.getUid() == -9223372036854775802L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
        } else if (j30Var.getUid() == -9223372036854775801L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
        }
        Y();
        W();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        ig.f fVar = this.c;
        if (fVar != null) {
            fVar.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i10) {
        this.y = i10;
        sg1 sg1Var = this.b;
        if (sg1Var != null) {
            sg1Var.requestLayout();
        }
    }
}
