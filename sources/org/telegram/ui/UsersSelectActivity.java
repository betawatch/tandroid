package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class UsersSelectActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
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
    public org.telegram.ui.Components.x30 P;
    public int Q;
    public int R;
    public org.telegram.ui.ActionBar.w1 a;
    public tg1 b;
    public fi.c2 c;
    public org.telegram.ui.Components.nm0 d;
    public org.telegram.ui.Components.c10 e;
    public org.telegram.ui.Components.s70 f;
    public sg1 h;
    public qg1 n;
    public org.telegram.ui.Components.j20 r;
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
    public static void V(UsersSelectActivity usersSelectActivity, Context context, View view, int i10) {
        long j10;
        UsersSelectActivity usersSelectActivity2;
        org.telegram.ui.Components.aq aqVar;
        a0.h hVar = usersSelectActivity.N;
        if (view instanceof org.telegram.ui.Cells.k4) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            Object object = k4Var.getObject();
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
                    aqVar = k4Var.d;
                    if (aqVar == null ? aqVar.a.q : k4Var.H) {
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
                    aqVar = k4Var.d;
                    if (aqVar == null ? aqVar.a.q : k4Var.H) {
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
                    org.telegram.messenger.wh.n(R.string.NeedAdminRightForSetAutoDeleteTimer, org.telegram.ui.Components.wc.b0(usersSelectActivity), null);
                    return;
                }
            }
            boolean z11 = hVar.h(j10) >= 0;
            if (z11) {
                usersSelectActivity.b.b((org.telegram.ui.Components.x30) hVar.f(j10));
                usersSelectActivity2 = usersSelectActivity;
            } else {
                if ((!z10 && !usersSelectActivity.getUserConfig().isPremium() && usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitDefault) || usersSelectActivity.w >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitPremium) {
                    tg.j0 j0Var = new tg.j0(4, usersSelectActivity.currentAccount, context, usersSelectActivity, null);
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
                org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(usersSelectActivity2.c.getContext(), object);
                usersSelectActivity2.b.a(x30Var, true);
                x30Var.setOnClickListener(usersSelectActivity2);
            }
            usersSelectActivity2.Z();
            if (usersSelectActivity2.M || usersSelectActivity2.L) {
                AndroidUtilities.showKeyboard(usersSelectActivity2.c);
            } else {
                k4Var.c(!z11, true);
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
    public final void X() {
        long j10;
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k4) {
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) childAt;
                Object object = k4Var.getObject();
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
                    k4Var.c(this.N.h(j10) >= 0, true);
                    k4Var.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public final void Y() {
        a0.h hVar = this.N;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            if (hVar.j(i10) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(hVar.j(i10)));
            }
        }
        qg1 qg1Var = this.n;
        if (qg1Var != null) {
            qg1Var.a(this.J, arrayList);
        }
        finishFragment();
    }

    public final void Z() {
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        int i10;
        this.M = false;
        this.L = false;
        this.O.clear();
        this.N.b();
        org.telegram.ui.ActionBar.u6 u6Var = null;
        this.P = null;
        int i11 = 1;
        if (this.x == 1) {
            Activity parentActivity = getParentActivity();
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(parentActivity);
            i5Var.a = true;
            i5Var.b = AndroidUtilities.dp(8.0f);
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(parentActivity, true, true, true);
            i5Var.c = s6Var;
            int i12 = org.telegram.ui.ActionBar.y6.A8;
            org.telegram.ui.ActionBar.f7.Z(s6Var, i12, null);
            s6Var.setTextSize(AndroidUtilities.dp(18.0f));
            s6Var.setGravity(3);
            s6Var.setTypeface(AndroidUtilities.bold());
            s6Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
            i5Var.addView(s6Var);
            org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(parentActivity, true, true, true);
            i5Var.d = s6Var2;
            s6Var2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
            org.telegram.ui.ActionBar.f7.Z(s6Var2, i12, null);
            s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
            s6Var2.setGravity(3);
            s6Var2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            i5Var.addView(s6Var2);
            s6Var.getDrawable().J = true;
            s6Var2.getDrawable().J = true;
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
            s6Var.b(1.0f, 150L, dsVar);
            s6Var2.b(1.0f, 150L, dsVar);
            i5Var.setClipChildren(false);
            this.E = i5Var;
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            boolean z10 = LocaleController.isRTL;
            kVar.addView(i5Var, org.telegram.ui.Components.kb1.h(-1, -1.0f, 0, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i13 = this.x;
        boolean z11 = this.I;
        if (i13 == 0 || i13 == 2) {
            if (z11) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            }
        } else if (i13 == 1) {
            Z();
        }
        this.actionBar.setActionBarMenuOnItemClick(new r11(this, 15));
        e eVar = new e(this, context, 4);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 5);
        this.a = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.a, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
        eVar.addView(this.a);
        tg1 tg1Var = new tg1(this, context);
        this.b = tg1Var;
        this.a.addView(tg1Var, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        final int i14 = 0;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.og1
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
                        this.b.Y();
                        break;
                }
            }
        });
        fi.c2 c2Var = new fi.c2(this, context, 9);
        this.c = c2Var;
        c2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.B(this.c, org.telegram.ui.ActionBar.y6.Xh, null);
        org.telegram.ui.ActionBar.f7.V(this.c, org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.w(this.c, org.telegram.ui.ActionBar.y6.Yh, null);
        this.c.setCursorWidth(1.5f);
        fi.c2 c2Var2 = this.c;
        c2Var2.setInputType(c2Var2.getInputType() | 176);
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
        this.c.setCustomSelectionActionModeCallback(new li.b1(4));
        this.c.setOnKeyListener(new m60(1, this));
        this.c.addTextChangedListener(new pg1(this));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        this.e = c10Var;
        c10Var.setViewType(10);
        org.telegram.ui.Components.c10 c10Var2 = this.e;
        c10Var2.w = false;
        c10Var2.setItemsCount(3);
        org.telegram.ui.Components.c10 c10Var3 = this.e;
        int i15 = org.telegram.ui.ActionBar.y6.G8;
        int i16 = org.telegram.ui.ActionBar.y6.i6;
        c10Var3.e(i15, i16, i16);
        eVar.addView(this.e);
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(i11, 2, context, this.e, u6Var);
        this.f = s70Var;
        s70Var.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        this.f.d.setText(LocaleController.getString(R.string.NoContacts));
        eVar.addView(this.f);
        s4.c0 c0Var = new s4.c0(1, false);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.d = nm0Var;
        nm0Var.setFastScrollEnabled(0);
        this.d.setEmptyView(this.f);
        org.telegram.ui.Components.nm0 nm0Var2 = this.d;
        sg1 sg1Var = new sg1(this, context);
        this.h = sg1Var;
        nm0Var2.setAdapter(sg1Var);
        this.d.setLayoutManager(c0Var);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.d.i(new di.l(10));
        eVar.addView(this.d);
        this.d.setOnItemClickListener(new di.x4(22, this, context));
        this.d.setOnScrollListener(new z81(this, 4));
        this.s = org.telegram.ui.Components.j20.b();
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context, this.resourceProvider, false);
        this.r = j20Var;
        j20Var.setImageResource(R.drawable.floating_check);
        eVar.addView(this.r, this.s);
        final int i17 = 1;
        this.r.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.og1
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
                        this.b.Y();
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
                } else if (i19 == 2 && !this.H) {
                    str = "new_chats";
                    i10 = 2;
                } else if (i19 == (!this.H ? 1 : 0) + 2) {
                    i10 = 4;
                    str = "contacts";
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
            if ((i10 & this.J) != 0) {
                org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(this.c.getContext(), str);
                this.b.a(x30Var, false);
                x30Var.setOnClickListener(this);
            }
        }
        ArrayList arrayList = this.K;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i20 = 0; i20 < size; i20++) {
                Long l4 = (Long) arrayList.get(i20);
                Object user = l4.longValue() > 0 ? getMessagesController().getUser(l4) : getMessagesController().getChat(Long.valueOf(-l4.longValue()));
                if (user != null) {
                    org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(this.c.getContext(), user);
                    this.b.a(x30Var2, false);
                    x30Var2.setOnClickListener(this);
                }
            }
        }
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            org.telegram.ui.Components.s70 s70Var = this.f;
            if (s70Var != null) {
                s70Var.e(false, true);
            }
            sg1 sg1Var = this.h;
            if (sg1Var != null) {
                sg1Var.l();
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
                if (childAt instanceof org.telegram.ui.Cells.k4) {
                    ((org.telegram.ui.Cells.k4) childAt).f(intValue);
                }
            }
        }
    }

    public int getContainerHeight() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Components.x30.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.di));
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.x30 x30Var = (org.telegram.ui.Components.x30) view;
        if (!x30Var.y) {
            org.telegram.ui.Components.x30 x30Var2 = this.P;
            if (x30Var2 != null) {
                x30Var2.a();
            }
            this.P = x30Var;
            x30Var.b();
            return;
        }
        this.P = null;
        this.b.b(x30Var);
        if (this.x == 2) {
            if (x30Var.getUid() == -9223372036854775800L) {
                this.J &= -2;
            } else if (x30Var.getUid() == -9223372036854775799L) {
                this.J &= -3;
            } else if (x30Var.getUid() == Long.MIN_VALUE) {
                this.J &= -5;
            } else if (x30Var.getUid() == -9223372036854775807L) {
                this.J &= -9;
            }
        } else if (x30Var.getUid() == Long.MIN_VALUE) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
        } else if (x30Var.getUid() == -9223372036854775807L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
        } else if (x30Var.getUid() == -9223372036854775806L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
        } else if (x30Var.getUid() == -9223372036854775805L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
        } else if (x30Var.getUid() == -9223372036854775804L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
        } else if (x30Var.getUid() == -9223372036854775803L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
        } else if (x30Var.getUid() == -9223372036854775802L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
        } else if (x30Var.getUid() == -9223372036854775801L) {
            this.J &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
        }
        Z();
        X();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatDidCreated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        fi.c2 c2Var = this.c;
        if (c2Var != null) {
            c2Var.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            fi.c2 c2Var = this.c;
            if (c2Var != null) {
                org.telegram.ui.ActionBar.f7.m(c2Var, 34, org.telegram.ui.ActionBar.y6.Xh, null);
                org.telegram.ui.ActionBar.f7.w(this.c, org.telegram.ui.ActionBar.y6.Yh, null);
            }
            org.telegram.ui.Components.nm0 nm0Var = this.d;
            if (nm0Var != null) {
                nm0Var.A1();
            }
            org.telegram.ui.ActionBar.w1 w1Var = this.a;
            if (w1Var != null) {
                AndroidUtilities.setScrollViewEdgeEffectColor(w1Var, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
            }
            if (this.b != null) {
                for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
                    View childAt = this.b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.x30) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setContainerHeight(int i10) {
        this.y = i10;
        tg1 tg1Var = this.b;
        if (tg1Var != null) {
            tg1Var.requestLayout();
        }
    }
}
