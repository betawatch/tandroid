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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    public org.telegram.ui.Components.a5 A;
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
    public org.telegram.ui.Components.w20 L;
    public int M;
    public int N;
    public org.telegram.ui.ActionBar.w1 a;
    public qg1 b;
    public fg.g c;
    public org.telegram.ui.Components.wk0 d;
    public org.telegram.ui.Components.e00 e;
    public org.telegram.ui.Components.d60 f;
    public pg1 h;
    public ng1 n;
    public org.telegram.ui.Components.j10 r;
    public FrameLayout.LayoutParams s;
    public boolean v;
    public int w;
    public int x;
    public int y;

    public UsersSelectActivity(int i9, ArrayList arrayList, boolean z10) {
        super(null);
        this.J = new a0.h();
        this.K = new ArrayList();
        this.E = z10;
        this.F = i9;
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
    public static void T(UsersSelectActivity usersSelectActivity, Context context, View view, int i9) {
        long j10;
        UsersSelectActivity usersSelectActivity2;
        org.telegram.ui.Components.dp dpVar;
        a0.h hVar = usersSelectActivity.J;
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            boolean z10 = object instanceof String;
            if (z10) {
                j10 = -9223372036854775807L;
                int i10 = 4;
                if (usersSelectActivity.x == 2) {
                    if (i9 == 1) {
                        j10 = -9223372036854775800L;
                        i10 = 1;
                    } else if (i9 != 2 || usersSelectActivity.D) {
                        if (i9 != (!usersSelectActivity.D ? 1 : 0) + 2) {
                            i10 = 8;
                        }
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = -9223372036854775799L;
                        i10 = 2;
                    }
                    dpVar = g4Var.d;
                    if (dpVar == null ? dpVar.a.q : g4Var.D) {
                        usersSelectActivity.F |= i10;
                    } else {
                        usersSelectActivity.F &= ~i10;
                    }
                } else {
                    if (usersSelectActivity.E) {
                        if (i9 == 1) {
                            i10 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                            j10 = Long.MIN_VALUE;
                        } else if (i9 == 2) {
                            i10 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                        } else if (i9 == 3) {
                            i10 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                            j10 = -9223372036854775806L;
                        } else if (i9 == 4) {
                            i10 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                            j10 = -9223372036854775805L;
                        } else {
                            i10 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                            j10 = -9223372036854775804L;
                        }
                    } else if (i9 == 1) {
                        i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                        j10 = -9223372036854775803L;
                    } else if (i9 == 2) {
                        i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                        j10 = -9223372036854775802L;
                    } else {
                        i10 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                        j10 = -9223372036854775801L;
                    }
                    dpVar = g4Var.d;
                    if (dpVar == null ? dpVar.a.q : g4Var.D) {
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
                    org.telegram.messenger.ll.p(R.string.NeedAdminRightForSetAutoDeleteTimer, org.telegram.ui.Components.oc.a0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z11 = hVar.h(j10) >= 0;
            if (z11) {
                usersSelectActivity.b.b((org.telegram.ui.Components.w20) hVar.f(j10));
                usersSelectActivity2 = usersSelectActivity;
            } else {
                if ((!z10 && !usersSelectActivity.getUserConfig().isPremium() && usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitDefault) || usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitPremium) {
                    zf.j0 j0Var = new zf.j0(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
                    j0Var.s0 = usersSelectActivity.w;
                    usersSelectActivity.showDialog(j0Var);
                    return;
                }
                usersSelectActivity2 = usersSelectActivity;
                if (object instanceof TLRPC.User) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putUser((TLRPC.User) object, !usersSelectActivity2.I);
                } else if (object instanceof TLRPC.Chat) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putChat((TLRPC.Chat) object, !usersSelectActivity2.I);
                }
                org.telegram.ui.Components.w20 w20Var = new org.telegram.ui.Components.w20(usersSelectActivity2.c.getContext(), object);
                usersSelectActivity2.b.a(w20Var, true);
                w20Var.setOnClickListener(usersSelectActivity2);
            }
            usersSelectActivity2.X();
            if (usersSelectActivity2.I || usersSelectActivity2.H) {
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
    public final void V() {
        long j10;
        int childCount = this.d.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.d.getChildAt(i9);
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
                    g4Var.c(this.J.h(j10) >= 0, true);
                    g4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public final void W() {
        a0.h hVar = this.J;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < hVar.m(); i9++) {
            if (hVar.j(i9) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i9)));
            }
        }
        ng1 ng1Var = this.n;
        if (ng1Var != null) {
            ng1Var.a(this.F, arrayList);
        }
        finishFragment();
    }

    public final void X() {
        int i9 = this.x;
        if (i9 == 0) {
            int i10 = getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
            int i11 = this.w;
            if (i11 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i10, new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i11), Integer.valueOf(this.w), Integer.valueOf(i10)));
                return;
            }
        }
        if (i9 == 1) {
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
            org.telegram.ui.Components.j6 title = this.A.getTitle();
            int i12 = this.w;
            title.setText(LocaleController.formatPluralString("Chats", i12, Integer.valueOf(i12)));
            if (this.N > 0) {
                this.A.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.A.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i9;
        this.I = false;
        this.H = false;
        this.K.clear();
        this.J.b();
        org.telegram.ui.ActionBar.b6 b6Var = null;
        this.L = null;
        int i10 = 1;
        if (this.x == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.a5 a5Var = new org.telegram.ui.Components.a5(parentActivity);
            a5Var.a = true;
            a5Var.b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            a5Var.c = j6Var;
            int i11 = org.telegram.ui.ActionBar.f6.A8;
            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            j6Var.setTextSize(AndroidUtilities.dp(18.0f));
            j6Var.setGravity(3);
            j6Var.setTypeface(AndroidUtilities.bold());
            j6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            a5Var.addView(j6Var);
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(parentActivity, true, true, true);
            a5Var.d = j6Var2;
            j6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.B8));
            j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            j6Var2.setGravity(3);
            j6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            a5Var.addView(j6Var2);
            j6Var.getDrawable().D = true;
            j6Var2.getDrawable().D = true;
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
            j6Var.b(1.0f, 150L, grVar);
            j6Var2.b(1.0f, 150L, grVar);
            a5Var.setClipChildren(false);
            this.A = a5Var;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = LocaleController.isRTL;
            kVar.addView(a5Var, g7.e6.d(-1, -1.0f, 0, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i12 = this.x;
        boolean z11 = this.E;
        if (i12 == 0 || i12 == 2) {
            if (z11) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            }
        } else if (i12 == 1) {
            X();
        }
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 3));
        f fVar = new f(this, context, 4);
        this.fragmentView = fVar;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 6);
        this.a = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.a, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        fVar.addView(this.a);
        qg1 qg1Var = new qg1(this, context);
        this.b = qg1Var;
        this.a.addView(qg1Var, g7.e6.c(-2.0f, -1));
        final int i13 = 0;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lg1
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
                        this.b.W();
                        break;
                }
            }
        });
        fg.g gVar = new fg.g(this, context, 10);
        this.c = gVar;
        gVar.setTextSize(1, 16.0f);
        this.c.setHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xh, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.c.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yh, false));
        this.c.setCursorWidth(1.5f);
        fg.g gVar2 = this.c;
        gVar2.setInputType(gVar2.getInputType() | 176);
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
        this.c.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(4));
        this.c.setOnKeyListener(new d60(1, this));
        this.c.addTextChangedListener(new mg1(this));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        this.e = e00Var;
        e00Var.setViewType(10);
        org.telegram.ui.Components.e00 e00Var2 = this.e;
        e00Var2.w = false;
        e00Var2.setItemsCount(3);
        org.telegram.ui.Components.e00 e00Var3 = this.e;
        int i14 = org.telegram.ui.ActionBar.f6.G8;
        int i15 = org.telegram.ui.ActionBar.f6.i6;
        e00Var3.f(i14, i15, i15);
        fVar.addView(this.e);
        org.telegram.ui.Components.d60 d60Var = new org.telegram.ui.Components.d60(context, this.e, i10, b6Var, 2);
        this.f = d60Var;
        d60Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f.d.setText(LocaleController.getString(R.string.NoContacts));
        fVar.addView(this.f);
        f2.m0 m0Var = new f2.m0(1, false);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.d = wk0Var;
        wk0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        org.telegram.ui.Components.wk0 wk0Var2 = this.d;
        pg1 pg1Var = new pg1(this, context);
        this.h = pg1Var;
        wk0Var2.setAdapter(pg1Var);
        this.d.setLayoutManager(m0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.d.i(new ih.l(9));
        fVar.addView(this.d);
        this.d.setOnItemClickListener(new bg.b1(24, this, context));
        this.d.setOnScrollListener(new kb1(this, 3));
        this.s = org.telegram.ui.Components.j10.b();
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.r = j10Var;
        j10Var.setImageResource(R.drawable.floating_check);
        fVar.addView(this.r, this.s);
        final int i16 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lg1
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
                        this.b.W();
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
                    i9 = 1;
                } else if (i18 == 2 && !this.D) {
                    str = "new_chats";
                    i9 = 2;
                } else if (i18 == (!this.D ? 1 : 0) + 2) {
                    str = "contacts";
                    i9 = 4;
                } else {
                    i9 = 8;
                }
            } else if (z11) {
                if (i18 == 1) {
                    i9 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i18 == 2) {
                    i9 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i18 == 3) {
                    i9 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i18 == 4) {
                    i9 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i9 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i18 == 1) {
                i9 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i18 == 2) {
                i9 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i9 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((i9 & this.F) != 0) {
                org.telegram.ui.Components.w20 w20Var = new org.telegram.ui.Components.w20(this.c.getContext(), str);
                this.b.a(w20Var, false);
                w20Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.G;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                Long l10 = (Long) arrayList.get(i19);
                Object user = l10.longValue() > 0 ? getMessagesController().getUser(l10) : getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                if (user != null) {
                    org.telegram.ui.Components.w20 w20Var2 = new org.telegram.ui.Components.w20(this.c.getContext(), user);
                    this.b.a(w20Var2, false);
                    w20Var2.setOnClickListener(this);
                }
            }
        }
        X();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.d60 d60Var = this.f;
            if (d60Var != null) {
                d60Var.e(false, true);
            }
            pg1 pg1Var = this.h;
            if (pg1Var != null) {
                pg1Var.l();
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.updateInterfaces) {
            if (i9 == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.d != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.d.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                return;
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.d.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) childAt).f(intValue);
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
        sx0 sx0Var = new sx0(10, this);
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.f6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.S7));
        int i11 = org.telegram.ui.ActionBar.f6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.di));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, i11));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) view;
        if (!w20Var.y) {
            org.telegram.ui.Components.w20 w20Var2 = this.L;
            if (w20Var2 != null) {
                w20Var2.a();
            }
            this.L = w20Var;
            w20Var.b();
            return;
        }
        this.L = null;
        this.b.b(w20Var);
        if (this.x == 2) {
            if (w20Var.getUid() == -9223372036854775800L) {
                this.F &= -2;
            } else if (w20Var.getUid() == -9223372036854775799L) {
                this.F &= -3;
            } else if (w20Var.getUid() == Long.MIN_VALUE) {
                this.F &= -5;
            } else if (w20Var.getUid() == -9223372036854775807L) {
                this.F &= -9;
            }
        } else if (w20Var.getUid() == Long.MIN_VALUE) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
        } else if (w20Var.getUid() == -9223372036854775807L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
        } else if (w20Var.getUid() == -9223372036854775806L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
        } else if (w20Var.getUid() == -9223372036854775805L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
        } else if (w20Var.getUid() == -9223372036854775804L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
        } else if (w20Var.getUid() == -9223372036854775803L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
        } else if (w20Var.getUid() == -9223372036854775802L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
        } else if (w20Var.getUid() == -9223372036854775801L) {
            this.F &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
        }
        X();
        V();
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
        fg.g gVar = this.c;
        if (gVar != null) {
            gVar.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setContainerHeight(int i9) {
        this.y = i9;
        qg1 qg1Var = this.b;
        if (qg1Var != null) {
            qg1Var.requestLayout();
        }
    }
}
