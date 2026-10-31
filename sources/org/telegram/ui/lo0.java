package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lo0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int D;
    public final boolean E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public final org.telegram.messenger.we J;
    public org.telegram.ui.Components.tk0 K;
    public fg.j L;
    public io0 M;
    public org.telegram.ui.Components.dw0 N;
    public oh.i O;
    public org.telegram.ui.ActionBar.t0 P;
    public org.telegram.ui.ActionBar.b1 Q;
    public int R;
    public boolean S;
    public final int T;
    public final un U;
    public org.telegram.ui.Components.xk0 V;
    public int W;
    public boolean X;
    public boolean Y;
    public FrameLayout Z;
    public final int a;
    public l0 a0;
    public final HashMap b;
    public do0 b0;
    public final ArrayList c;
    public View c0;
    public CharSequence d;
    public org.telegram.ui.Components.wt d0;
    public boolean e;
    public ImageView e0;
    public final ArrayList f;
    public ho0 f0;
    public int g0;
    public final HashMap h;
    public final TextPaint h0;
    public final RectF i0;
    public final Paint j0;
    public AnimatorSet k0;
    public boolean l0;
    public org.telegram.ui.ActionBar.k1 m0;
    public final ArrayList n;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout n0;
    public org.telegram.ui.ActionBar.b1[] o0;
    public String p0;
    public boolean q0;
    public boolean r;
    public final boolean r0;
    public boolean s;
    public ko0 s0;
    public mo0 t0;
    public final int u0;
    public final int v0;
    public String w;
    public final int w0;
    public String x;
    public final eo0 x0;
    public int y;

    public lo0(int i10, org.telegram.messenger.we weVar, HashMap hashMap, ArrayList arrayList, int i11, boolean z10, un unVar, boolean z11) {
        super(null);
        this.f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.n = new ArrayList();
        this.s = true;
        this.I = true;
        this.R = 100;
        this.g0 = 3;
        this.h0 = new TextPaint(1);
        this.i0 = new RectF();
        this.j0 = new Paint(1);
        this.q0 = true;
        this.x0 = new eo0(this);
        this.J = weVar;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i10;
        this.T = i11;
        this.U = unVar;
        this.E = z10;
        this.r0 = z11;
        if (weVar == null) {
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt("count", 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.n.add(string);
            }
        }
        if (z11) {
            this.u0 = org.telegram.ui.ActionBar.t6.ih;
            this.v0 = org.telegram.ui.ActionBar.t6.Vg;
            this.w0 = org.telegram.ui.ActionBar.t6.Wg;
        } else {
            this.u0 = org.telegram.ui.ActionBar.t6.h5;
            this.v0 = org.telegram.ui.ActionBar.t6.j5;
            this.w0 = org.telegram.ui.ActionBar.t6.I5;
        }
    }

    public static /* synthetic */ void Y(lo0 lo0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        org.telegram.messenger.vp.r1(lo0Var.currentAccount).V3(tL_contacts_resolvedPeer.users, false);
        org.telegram.messenger.vp.r1(lo0Var.currentAccount).P3(tL_contacts_resolvedPeer.chats, false);
        org.telegram.messenger.hs.a0(lo0Var.currentAccount).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = lo0Var.G;
        lo0Var.G = null;
        lo0Var.h0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.v5 Z(lo0 lo0Var, int i10) {
        int childCount = lo0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = lo0Var.K.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                int intValue = ((Integer) v5Var.getTag()).intValue();
                org.telegram.messenger.we weVar = lo0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= lo0Var.f.size()) : !(intValue < 0 || intValue >= weVar.e.size())) {
                    if (intValue == i10) {
                        return v5Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.da));
    }

    public final int c0(int i10, Object obj) {
        boolean z10 = obj instanceof org.telegram.messenger.ef;
        Object valueOf = z10 ? Integer.valueOf(((org.telegram.messenger.ef) obj).C) : obj instanceof org.telegram.messenger.hf ? ((org.telegram.messenger.hf) obj).B : null;
        if (valueOf == null) {
            return -1;
        }
        HashMap hashMap = this.b;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = this.c;
        if (!containsKey) {
            hashMap.put(valueOf, obj);
            arrayList.add(valueOf);
            return -1;
        }
        hashMap.remove(valueOf);
        int indexOf = arrayList.indexOf(valueOf);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        if (this.e) {
            l0();
        }
        if (i10 >= 0) {
            if (z10) {
                ((org.telegram.messenger.ef) obj).e();
            } else if (obj instanceof org.telegram.messenger.hf) {
                ((org.telegram.messenger.hf) obj).e();
            }
            this.x0.X(i10);
        }
        return indexOf;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 0;
        this.Y = false;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = this.u0;
        org.telegram.ui.ActionBar.a7.i(i11, lVar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i12 = this.v0;
        org.telegram.ui.ActionBar.a7.m(lVar2, 5, i12, null);
        int i13 = 1;
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i12, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, this.w0, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i14 = this.a;
        org.telegram.messenger.we weVar = this.J;
        if (weVar != null) {
            this.actionBar.setTitle(weVar.c);
        } else if (i14 == 0) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131745778, null));
        } else if (i14 == 1) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131745781, null));
        }
        int i15 = 15;
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, i15));
        int i16 = 2;
        if (this.l0) {
            org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new fo0(this));
            this.Q = a2.e(1, R.drawable.msg_list, org.telegram.messenger.cd.L0(2131745363, null));
            a2.e(2, R.drawable.msg_openin, org.telegram.messenger.cd.L0(2131747812, null));
        }
        if (weVar == null) {
            org.telegram.ui.ActionBar.t0 a10 = this.actionBar.p().a(0, R.drawable.outline_header_search);
            a10.N();
            a10.H = new go0(this);
            this.P = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            org.telegram.ui.ActionBar.a7.V(searchField, i12, null);
            org.telegram.ui.ActionBar.a7.w(searchField, i12, null);
            org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Je, null);
        }
        if (weVar == null) {
            if (i14 == 0) {
                this.P.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745778, null));
            } else if (i14 == 1) {
                this.P.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745781, null));
            }
        }
        ho0 ho0Var = new ho0(this, context);
        this.f0 = ho0Var;
        org.telegram.ui.ActionBar.a7.i(i11, ho0Var, null);
        this.fragmentView = this.f0;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.K = tk0Var;
        tk0Var.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(50.0f));
        this.K.setClipToPadding(false);
        this.K.setHorizontalScrollBarEnabled(false);
        this.K.setVerticalScrollBarEnabled(false);
        this.K.setItemAnimator(null);
        this.K.setLayoutAnimation(null);
        org.telegram.ui.Components.tk0 tk0Var2 = this.K;
        int i17 = 4;
        io0 io0Var = new io0(4);
        this.M = io0Var;
        tk0Var2.setLayoutManager(io0Var);
        this.M.O = new jg.h1(this, 9);
        this.f0.addView(this.K, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.tk0 tk0Var3 = this.K;
        fg.j jVar = new fg.j(i15, this, context);
        this.L = jVar;
        tk0Var3.setAdapter(jVar);
        org.telegram.ui.ActionBar.a7.I(this.K, i11, null);
        this.K.setOnItemClickListener(new g(this, 21));
        if (this.H != 1) {
            this.K.setOnItemLongClickListener(new co0(this, i16));
        }
        org.telegram.ui.Components.xk0 xk0Var = new org.telegram.ui.Components.xk0(new fo0(this));
        this.V = xk0Var;
        if (this.H != 1) {
            this.K.E.add(xk0Var);
        }
        oh.i iVar = new oh.i(i13, context, getResourceProvider());
        this.O = iVar;
        iVar.setAlpha(0.0f);
        this.O.setVisibility(8);
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, this.O, 1, getResourceProvider());
        this.N = dw0Var;
        dw0Var.setAnimateLayoutChange(true);
        this.N.d.setTypeface(Typeface.DEFAULT);
        this.N.d.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(this.N.d, org.telegram.ui.ActionBar.t6.y6, getResourceProvider());
        this.N.addView(this.O, 0);
        if (weVar != null) {
            this.N.d.setText(org.telegram.messenger.cd.L0(2131748197, null));
        } else {
            this.N.d.setText(org.telegram.messenger.cd.L0(2131748185, null));
        }
        this.N.e(false, false);
        this.f0.addView(this.N, w7.b6.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.K.setOnScrollListener(new h3(this, 23));
        if (weVar == null) {
            n0();
        }
        if (this.q0) {
            View view = new View(context);
            this.c0 = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.c0.setTranslationY(org.telegram.messenger.i0.L(48.0f));
            this.f0.addView(this.c0, w7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.Z = frameLayout;
            org.telegram.ui.ActionBar.a7.i(i11, frameLayout, null);
            this.Z.setVisibility(4);
            this.Z.setTranslationY(org.telegram.messenger.i0.L(48.0f));
            this.f0.addView(this.Z, w7.b6.e(-1, 48, 83));
            this.Z.setOnTouchListener(new org.telegram.ui.ActionBar.n2(i13));
            org.telegram.ui.Components.wt wtVar = this.d0;
            if (wtVar != null) {
                wtVar.o();
            }
            this.d0 = new org.telegram.ui.Components.wt(context, this.f0, null, 1, false, null);
            this.d0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).u3)});
            this.d0.setHint(org.telegram.messenger.cd.L0(2131754454, null));
            this.d0.s();
            org.telegram.ui.Components.mt editText = this.d0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.Z.addView(this.d0, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.d0.setText(charSequence);
            }
            this.d0.getEditText().addTextChangedListener(new n0(this, 14));
            int i18 = 19;
            l0 l0Var = new l0(this, context, i18);
            this.a0 = l0Var;
            l0Var.setFocusable(true);
            this.a0.setFocusableInTouchMode(true);
            this.a0.setVisibility(4);
            this.a0.setScaleX(0.2f);
            this.a0.setScaleY(0.2f);
            this.a0.setAlpha(0.0f);
            this.f0.addView(this.a0, w7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.e0 = new ImageView(context);
            this.e0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(56.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.S5, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T5, false)));
            this.e0.setImageResource(R.drawable.attach_send);
            this.e0.setImportantForAccessibility(2);
            org.telegram.ui.ActionBar.a7.t(this.e0, org.telegram.ui.ActionBar.t6.U5, null, PorterDuff.Mode.MULTIPLY);
            this.e0.setScaleType(ImageView.ScaleType.CENTER);
            this.e0.setOutlineProvider(new bi.d2(20));
            this.a0.addView(this.e0, w7.b6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.e0.setOnClickListener(new f50(this, i18));
            this.e0.setOnLongClickListener(new s(this, i17));
            float L = org.telegram.messenger.i0.L(12.0f);
            TextPaint textPaint = this.h0;
            textPaint.setTextSize(L);
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            do0 do0Var = new do0(this, context, i10);
            this.b0 = do0Var;
            do0Var.setAlpha(0.0f);
            this.b0.setScaleX(0.2f);
            this.b0.setScaleY(0.2f);
            this.f0.addView(this.b0, w7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.T != 0) {
                this.d0.setVisibility(8);
            }
        }
        this.e = (weVar != null || i14 == 0 || i14 == 1) && this.I;
        this.K.setEmptyView(this.N);
        org.telegram.ui.Components.tk0 tk0Var4 = this.K;
        tk0Var4.W1 = true;
        tk0Var4.X1 = 0;
        m0(0);
        return this.fragmentView;
    }

    public final void d0() {
        this.n.clear();
        fg.j jVar = this.L;
        if (jVar != null) {
            jVar.f();
        }
        this.N.e(false, true);
        g0();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.t) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(View view, Object obj) {
        boolean z10 = c0(-1, obj) == -1;
        if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).b(this.c.contains(Integer.valueOf(((org.telegram.messenger.ef) this.J.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        m0(z10 ? 1 : 2);
        this.s0.y();
    }

    public final void f0(EditText editText) {
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f.clear();
        this.h.clear();
        this.s = true;
        h0(obj, "", this.a == 1, true);
        this.w = obj;
        if (obj.length() == 0) {
            this.w = null;
            this.N.d.setText(org.telegram.messenger.cd.L0(2131748185, null));
        } else {
            this.N.d.setText(org.telegram.messenger.cd.a0("NoResultFoundFor", null, 2131748182, this.w));
        }
        n0();
    }

    public final void g0() {
        SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.n.size());
        int size = this.n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(i0.a.i(i10, "recent"), (String) this.n.get(i10));
        }
        edit.commit();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.u0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.u0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.w0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.v0));
        org.telegram.ui.ActionBar.t0 t0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var != null ? t0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.u0));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X9));
        return arrayList;
    }

    public final void h0(String str, String str2, boolean z10, boolean z11) {
        if (this.r) {
            this.r = false;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
                this.y = 0;
            }
        }
        this.G = str;
        this.r = true;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.currentAccount);
        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(this.currentAccount);
        TLObject e22 = r12.e2(z10 ? r13.M3 : r13.N3);
        if (!(e22 instanceof TLRPC.User)) {
            if (!z11 || this.F) {
                return;
            }
            this.F = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            org.telegram.messenger.vp r14 = org.telegram.messenger.vp.r1(this.currentAccount);
            tL_contacts_resolveUsername.username = z10 ? r14.M3 : r14.N3;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.voip.u0(9, this, z10));
            return;
        }
        TLRPC.User user = (TLRPC.User) e22;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.vp.r1(this.currentAccount).p1(user);
        tL_messages_getInlineBotResults.offset = str2;
        un unVar = this.U;
        if (unVar != null) {
            long a2 = unVar.a();
            if (org.telegram.messenger.o5.C(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().i1(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i10 = this.D + 1;
        this.D = i10;
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.ln(this, str, i10, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.y, this.classGuid);
    }

    public final void i0(int i10, boolean z10) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.s0 == null || this.S) {
            return;
        }
        org.telegram.ui.Components.wt wtVar = this.d0;
        if (wtVar != null && wtVar.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof org.telegram.messenger.ef) {
                ((org.telegram.messenger.ef) obj).a = this.d0.getText().toString();
            } else if (obj instanceof org.telegram.messenger.hf) {
                ((org.telegram.messenger.hf) obj).I = this.d0.getText().toString();
            }
        }
        this.S = true;
        this.s0.u0(i10, false, z10);
        if (this.T != 2) {
            ko0 ko0Var = this.s0;
            if (ko0Var == null || ko0Var.e()) {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false)) > 0.721f;
    }

    public final void j0(int i10, boolean z10) {
        this.H = i10;
        this.I = z10;
        if (i10 <= 0 || this.a != 1) {
            return;
        }
        this.H = 1;
    }

    public final boolean k0(boolean z10, boolean z11) {
        if (this.d0 != null) {
            if (z10 != (this.Z.getTag() != null)) {
                AnimatorSet animatorSet = this.k0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.Z.setTag(z10 ? 1 : null);
                if (this.d0.getEditText().isFocused()) {
                    org.telegram.messenger.i0.v1(this.d0.getEditText());
                }
                this.d0.k(true);
                if (z10) {
                    this.Z.setVisibility(0);
                    this.a0.setVisibility(0);
                }
                if (!z11) {
                    this.a0.setScaleX(z10 ? 1.0f : 0.2f);
                    this.a0.setScaleY(z10 ? 1.0f : 0.2f);
                    this.a0.setAlpha(z10 ? 1.0f : 0.0f);
                    this.b0.setScaleX(z10 ? 1.0f : 0.2f);
                    this.b0.setScaleY(z10 ? 1.0f : 0.2f);
                    this.b0.setAlpha(z10 ? 1.0f : 0.0f);
                    this.Z.setTranslationY(z10 ? 0.0f : org.telegram.messenger.i0.L(48.0f));
                    this.c0.setTranslationY(z10 ? 0.0f : org.telegram.messenger.i0.L(48.0f));
                    if (!z10) {
                        this.Z.setVisibility(4);
                        this.a0.setVisibility(4);
                    }
                    return true;
                }
                this.k0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                l0 l0Var = this.a0;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<l0, Float>) property, z10 ? 1.0f : 0.2f));
                l0 l0Var2 = this.a0;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<l0, Float>) property2, z10 ? 1.0f : 0.2f));
                l0 l0Var3 = this.a0;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(l0Var3, (Property<l0, Float>) property3, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0, (Property<do0, Float>) property, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0, (Property<do0, Float>) property2, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0, (Property<do0, Float>) property3, z10 ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.Z;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z10 ? 0.0f : org.telegram.messenger.i0.L(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<View, Float>) property4, z10 ? 0.0f : org.telegram.messenger.i0.L(48.0f)));
                this.k0.playTogether(arrayList);
                this.k0.setInterpolator(new DecelerateInterpolator());
                this.k0.setDuration(180L);
                this.k0.addListener(new org.telegram.ui.Components.ha0(19, this, z10));
                this.k0.start();
                return true;
            }
        }
        return false;
    }

    public final void l0() {
        if (this.e) {
            int childCount = this.K.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.K.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.v5;
                org.telegram.messenger.we weVar = this.J;
                ArrayList arrayList = this.c;
                if (z10) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (weVar != null) {
                        v5Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ef) weVar.e.get(num.intValue())).C)) : -1);
                    } else {
                        v5Var.setNum(this.e ? arrayList.indexOf(((org.telegram.messenger.hf) this.f.get(num.intValue())).B) : -1);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) childAt).b(arrayList.indexOf(Integer.valueOf(((org.telegram.messenger.ef) weVar.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0, false);
                }
            }
        }
    }

    public final void m0(int i10) {
        if (this.b.size() == 0) {
            this.b0.setPivotX(0.0f);
            this.b0.setPivotY(0.0f);
            k0(false, i10 != 0);
            return;
        }
        this.b0.invalidate();
        if (k0(true, i10 != 0) || i10 == 0) {
            this.b0.setPivotX(0.0f);
            this.b0.setPivotY(0.0f);
            return;
        }
        this.b0.setPivotX(org.telegram.messenger.i0.L(21.0f));
        this.b0.setPivotY(org.telegram.messenger.i0.L(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b0, (Property<do0, Float>) View.SCALE_X, i10 == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.b0, (Property<do0, Float>) View.SCALE_Y, i10 == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    public final void n0() {
        String str;
        fg.j jVar = this.L;
        if (jVar != null) {
            jVar.f();
        }
        if (this.r || (this.n.size() > 0 && ((str = this.w) == null || TextUtils.isEmpty(str)))) {
            this.N.e(true, true);
        } else {
            this.N.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.d0;
        if (wtVar == null || !wtVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        wtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.t);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.t);
        if (this.y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            this.y = 0;
        }
        org.telegram.ui.Components.wt wtVar = this.d0;
        if (wtVar != null) {
            wtVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPanTranslationUpdate(float f7) {
        org.telegram.ui.Components.tk0 tk0Var = this.K;
        if (tk0Var == null) {
            return;
        }
        if (!this.d0.e) {
            tk0Var.setTranslationY(f7);
        } else {
            this.fragmentView.setTranslationY(f7);
            this.K.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.L;
        if (jVar != null) {
            jVar.f();
        }
        org.telegram.ui.Components.wt wtVar = this.d0;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.P;
        if (t0Var != null) {
            t0Var.F(true);
            if (!TextUtils.isEmpty(this.p0)) {
                this.P.P(this.p0, false);
                this.p0 = null;
                f0(this.P.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.t0 t0Var;
        if (!z10 || (t0Var = this.P) == null) {
            return;
        }
        org.telegram.messenger.i0.J3(t0Var.getSearchField());
    }
}
