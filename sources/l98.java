// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class l98 extends e implements fn7 {
    public int E;
    public final boolean F;
    public boolean G;
    public String H;
    public int I;
    public boolean J;
    public final do6 K;
    public d79 L;
    public t20 M;
    public h98 N;
    public z2b O;
    public rl2 P;
    public s7 Q;
    public b8 R;
    public int S;
    public boolean T;
    public final byte U;
    public final zu1 V;
    public j89 W;
    public byte X;
    public boolean Y;
    public boolean Z;
    public final boolean a;
    public FrameLayout a0;
    public final HashMap b;
    public d26 b0;
    public final ArrayList c;
    public tb c0;
    public Editable d;
    public View d0;
    public boolean e;
    public iu3 e0;
    public final ArrayList f;
    public ImageView f0;
    public g98 g0;
    public final HashMap h;
    public byte h0;
    public final TextPaint i0;
    public final RectF j0;
    public final Paint k0;
    public AnimatorSet l0;
    public boolean m0;
    public final ArrayList n;
    public n8 n0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout o0;
    public b8[] p0;
    public String q0;
    public boolean r;
    public boolean r0;
    public boolean s;
    public final boolean s0;
    public j98 t0;
    public k98 u0;
    public final int v0;
    public String w;
    public final int w0;
    public String x;
    public final int x0;
    public int y;
    public final f98 y0;

    /* JADX WARN: Multi-variable type inference failed */
    public l98(int i, do6 do6Var, HashMap hashMap, ArrayList arrayList, int i2, boolean z, zu1 zu1Var, boolean z2) {
        super(null);
        this.f = new ArrayList();
        this.h = new HashMap();
        this.n = new ArrayList();
        this.s = true;
        this.J = true;
        this.S = 100;
        this.h0 = (byte) 3;
        this.i0 = new TextPaint(1);
        this.j0 = new RectF();
        this.k0 = new Paint(1);
        this.r0 = true;
        this.y0 = new f98(this);
        this.K = do6Var;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i;
        this.U = i2;
        this.V = zu1Var;
        this.F = z;
        this.s0 = z2;
        if (do6Var == null) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("web_recent_search", 0);
            int i3 = sharedPreferences.getInt("count", 0);
            for (int i4 = 0; i4 < i3; i4++) {
                String string = sharedPreferences.getString("recent" + i4, null);
                if (string == null) {
                    break;
                }
                this.n.add(string);
            }
        }
        if (z2) {
            this.v0 = aob.lh;
            this.w0 = aob.Yg;
            this.x0 = aob.Zg;
        } else {
            this.v0 = aob.h5;
            this.w0 = aob.j5;
            this.x0 = aob.I5;
        }
    }

    public final int a0(int i, Object obj) {
        boolean z = obj instanceof no6;
        Object valueOf = z ? Integer.valueOf(((no6) obj).C) : obj instanceof ro6 ? ((ro6) obj).B : null;
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
        if (i >= 0) {
            if (z) {
                ((no6) obj).e();
            } else if (obj instanceof ro6) {
                ((ro6) obj).e();
            }
            this.y0.X(i);
        }
        return indexOf;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.da));
    }

    public final void b0() {
        this.n.clear();
        t20 t20Var = this.M;
        if (t20Var != null) {
            t20Var.f();
        }
        this.O.e(false, true);
        g0();
    }

    public final d88 c0(int i) {
        int childCount = this.L.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.L.getChildAt(i2);
            if (childAt instanceof d88) {
                d88 d88Var = (d88) childAt;
                int intValue = ((Integer) d88Var.getTag()).intValue();
                do6 do6Var = this.K;
                if (do6Var == null ? !(intValue < 0 || intValue >= this.f.size()) : !(intValue < 0 || intValue >= do6Var.e.size())) {
                    if (intValue == i) {
                        return d88Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        byte b = 0;
        this.Z = false;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        int i = this.v0;
        yob.h(i, null, aVar);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        int i2 = this.w0;
        yob.l(aVar2, 5, i2, null);
        yob.l(this.actionBar, 1, i2, null);
        byte b2 = 3;
        yob.l(this.actionBar, 3, this.x0, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.a;
        do6 do6Var = this.K;
        if (do6Var != null) {
            this.actionBar.setTitle(do6Var.c);
        } else if (!z) {
            this.actionBar.setTitle(ob6.M0(2131745489, null));
        } else if (z) {
            this.actionBar.setTitle(ob6.M0(2131745492, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 21));
        byte b3 = 25;
        if (this.m0) {
            s7 a = this.actionBar.u().a(0, R.drawable.ic_ab_other);
            a.setSubMenuDelegate(new kj4(this, b3));
            this.R = a.e(1, R.drawable.msg_list, ob6.M0(2131745073, null));
            a.e(2, R.drawable.msg_openin, ob6.M0(2131747523, null));
        }
        if (do6Var == null) {
            s7 a2 = this.actionBar.u().a(0, R.drawable.outline_header_search);
            a2.N();
            a2.I = new cm0(this);
            this.Q = a2;
            EditTextBoldCursor searchField = a2.getSearchField();
            yob.X(searchField, i2, null);
            yob.v(searchField, i2, null);
            yob.D(searchField, aob.Me, null);
            if (!z) {
                this.Q.setSearchFieldHint(ob6.M0(2131745489, null));
            } else if (z) {
                this.Q.setSearchFieldHint(ob6.M0(2131745492, null));
            }
        }
        g98 g98Var = new g98(this, context);
        this.g0 = g98Var;
        yob.h(i, null, g98Var);
        this.fragmentView = this.g0;
        d79 d79Var = new d79(context, null);
        this.L = d79Var;
        d79Var.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(50.0f));
        this.L.setClipToPadding(false);
        this.L.setHorizontalScrollBarEnabled(false);
        this.L.setVerticalScrollBarEnabled(false);
        this.L.setItemAnimator(null);
        this.L.setLayoutAnimation(null);
        d79 d79Var2 = this.L;
        h98 h98Var = new h98(4);
        this.N = h98Var;
        d79Var2.setLayoutManager(h98Var);
        byte b4 = 12;
        this.N.O = new ar1(this, b4);
        this.g0.addView(this.L, tre.e(-1, -1, 51));
        d79 d79Var3 = this.L;
        t20 t20Var = new t20(this, context, b4);
        this.M = t20Var;
        d79Var3.setAdapter(t20Var);
        yob.H(this.L, i, null);
        this.L.setOnItemClickListener(new zg4(this, (byte) 18));
        if (this.I != 1) {
            this.L.setOnItemLongClickListener(new d98(this, b2));
        }
        j89 j89Var = new j89(new xh4((Object) this, (byte) 22));
        this.W = j89Var;
        if (this.I != 1) {
            this.L.F.add(j89Var);
        }
        rl2 rl2Var = new rl2(context, getResourceProvider(), b2);
        this.P = rl2Var;
        rl2Var.setAlpha(0.0f);
        this.P.setVisibility(8);
        z2b z2bVar = new z2b(context, this.P, 1, getResourceProvider());
        this.O = z2bVar;
        z2bVar.setAnimateLayoutChange(true);
        this.O.d.setTypeface(Typeface.DEFAULT);
        this.O.d.setTextSize(1, 16.0f);
        yob.X(this.O.d, aob.y6, getResourceProvider());
        this.O.addView(this.P, 0);
        z2b z2bVar2 = this.O;
        if (do6Var != null) {
            z2bVar2.d.setText(ob6.M0(2131747911, null));
        } else {
            z2bVar2.d.setText(ob6.M0(2131747900, null));
        }
        this.O.e(false, false);
        this.g0.addView(this.O, tre.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.L.setOnScrollListener(new e98(this, b));
        if (do6Var == null) {
            n0();
        }
        if (this.r0) {
            View view = new View(context);
            this.d0 = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.d0.setTranslationY(hl.L(48.0f));
            this.g0.addView(this.d0, tre.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.a0 = frameLayout;
            yob.h(i, null, frameLayout);
            this.a0.setVisibility(4);
            this.a0.setTranslationY(hl.L(48.0f));
            this.g0.addView(this.a0, tre.e(-1, 48, 83));
            this.a0.setOnTouchListener(new b02((byte) 20));
            iu3 iu3Var = this.e0;
            if (iu3Var != null) {
                iu3Var.o();
            }
            this.e0 = new iu3(context, this.g0, null, 1, false, null);
            this.e0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(uc7.s1(yac.t0).H0())});
            this.e0.setHint(ob6.M0(2131754447, null));
            this.e0.s();
            xt3 editText = this.e0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.a0.addView(this.e0, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            Editable editable = this.d;
            if (editable != null) {
                this.e0.setText(editable);
            }
            this.e0.getEditText().addTextChangedListener(new nh6(this, (byte) 6));
            byte b5 = 9;
            d26 d26Var = new d26(b5, context, this);
            this.b0 = d26Var;
            d26Var.setFocusable(true);
            this.b0.setFocusableInTouchMode(true);
            this.b0.setVisibility(4);
            this.b0.setScaleX(0.2f);
            this.b0.setScaleY(0.2f);
            this.b0.setAlpha(0.0f);
            this.g0.addView(this.b0, tre.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f0 = new ImageView(context);
            this.f0.setBackgroundDrawable(aob.h0(hl.L(56.0f), aob.w0(null, aob.S5, false), aob.w0(null, aob.T5, false)));
            this.f0.setImageResource(R.drawable.attach_send);
            this.f0.setImportantForAccessibility(2);
            yob.s(this.f0, aob.U5, null, PorterDuff.Mode.MULTIPLY);
            this.f0.setScaleType(ImageView.ScaleType.CENTER);
            this.f0.setOutlineProvider(new yi(b5));
            this.b0.addView(this.f0, tre.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f0.setOnClickListener(new am7(this, (byte) 14));
            this.f0.setOnLongClickListener(new zs(this, b5));
            float L = hl.L(12.0f);
            TextPaint textPaint = this.i0;
            textPaint.setTextSize(L);
            textPaint.setTypeface(hl.o());
            tb tbVar = new tb((byte) 25, context, this);
            this.c0 = tbVar;
            tbVar.setAlpha(0.0f);
            this.c0.setScaleX(0.2f);
            this.c0.setScaleY(0.2f);
            this.g0.addView(this.c0, tre.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.U != 0) {
                this.e0.setVisibility(8);
            }
        }
        this.e = !(do6Var == null && z && !z) && this.J;
        this.L.setEmptyView(this.O);
        d79 d79Var4 = this.L;
        d79Var4.X1 = true;
        d79Var4.Y1 = false;
        m0(0);
        return this.fragmentView;
    }

    public final /* synthetic */ void d0(TLObject tLObject, boolean z) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        uc7.s1(this.currentAccount).j4(tL_contacts_resolvedPeer.users, false);
        uc7.s1(this.currentAccount).c4(tL_contacts_resolvedPeer.chats, false);
        jf7.Y(this.currentAccount).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = this.H;
        this.H = null;
        h0(str, "", z, false);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.s) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(View view, Object obj) {
        boolean z = a0(-1, obj) == -1;
        if (view instanceof zea) {
            ((zea) view).b(this.c.contains(Integer.valueOf(((no6) this.K.e.get(((Integer) view.getTag()).intValue())).C)), true);
        }
        m0(z ? 1 : 2);
        this.t0.h();
    }

    public final void f0(EditTextBoldCursor editTextBoldCursor) {
        if (editTextBoldCursor.getText().length() == 0) {
            return;
        }
        String obj = editTextBoldCursor.getText().toString();
        this.f.clear();
        this.h.clear();
        this.s = true;
        h0(obj, "", this.a, true);
        this.w = obj;
        if (obj.length() == 0) {
            this.w = null;
            this.O.d.setText(ob6.M0(2131747900, null));
        } else {
            this.O.d.setText(ob6.a0("NoResultFoundFor", null, 2131747897, this.w));
        }
        n0();
    }

    public final void g0() {
        SharedPreferences.Editor edit = a.b.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.n.size());
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            edit.putString(uh9.k(i, "recent"), (String) this.n.get(i));
        }
        edit.commit();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.g0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.v0));
        arrayList.add(new apb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.v0));
        arrayList.add(new apb(this.actionBar, 64, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.w0));
        arrayList.add(new apb(this.actionBar, 128, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.w0));
        arrayList.add(new apb(this.actionBar, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.x0));
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.w0));
        s7 s7Var = this.Q;
        arrayList.add(new apb(s7Var != null ? s7Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.w0));
        arrayList.add(new apb(this.L, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.v0));
        arrayList.add(new apb(this.L, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.X9));
        return arrayList;
    }

    public final void h0(String str, String str2, boolean z, boolean z2) {
        if (this.r) {
            this.r = false;
            if (this.y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
                this.y = 0;
            }
        }
        this.H = str;
        this.r = true;
        uc7 s1 = uc7.s1(this.currentAccount);
        uc7 s12 = uc7.s1(this.currentAccount);
        TLObject c2 = s1.c2(z ? s12.o3 : s12.p3);
        if (!(c2 instanceof TLRPC.User)) {
            if (!z2 || this.G) {
                return;
            }
            this.G = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            uc7 s13 = uc7.s1(this.currentAccount);
            tL_contacts_resolveUsername.username = z ? s13.o3 : s13.p3;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new q81((byte) 10, this, z));
            return;
        }
        TLRPC.User user = (TLRPC.User) c2;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = uc7.s1(this.currentAccount).q1(user);
        tL_messages_getInlineBotResults.offset = str2;
        zu1 zu1Var = this.V;
        if (zu1Var != null) {
            long a = zu1Var.a();
            if (wf3.B(a)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().j1(a);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i = this.E + 1;
        this.E = i;
        this.y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new qa7(this, str, i, z, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.y, this.classGuid);
    }

    public final void i0(int i, boolean z) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.t0 == null || this.T) {
            return;
        }
        iu3 iu3Var = this.e0;
        if (iu3Var != null && iu3Var.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof no6) {
                ((no6) obj).a = this.e0.getText().toString();
            } else if (obj instanceof ro6) {
                ((ro6) obj).I = this.e0.getText().toString();
            }
        }
        this.T = true;
        this.t0.C(i, false, z);
        if (this.U != 2) {
            j98 j98Var = this.t0;
            if (j98Var == null || j98Var.f()) {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return hl.B(aob.w0(null, aob.a7, false)) > 0.721f;
    }

    public final void j0(int i, boolean z) {
        this.I = i;
        this.J = z;
        if (i <= 0 || !this.a) {
            return;
        }
        this.I = 1;
    }

    public final boolean k0(boolean z, boolean z2) {
        if (this.e0 != null) {
            if (z != (this.a0.getTag() != null)) {
                AnimatorSet animatorSet = this.l0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.a0.setTag(z ? 1 : null);
                if (this.e0.getEditText().isFocused()) {
                    hl.t1(this.e0.getEditText());
                }
                this.e0.k(true);
                if (z) {
                    this.a0.setVisibility(0);
                    this.b0.setVisibility(0);
                }
                if (!z2) {
                    this.b0.setScaleX(z ? 1.0f : 0.2f);
                    this.b0.setScaleY(z ? 1.0f : 0.2f);
                    this.b0.setAlpha(z ? 1.0f : 0.0f);
                    this.c0.setScaleX(z ? 1.0f : 0.2f);
                    this.c0.setScaleY(z ? 1.0f : 0.2f);
                    this.c0.setAlpha(z ? 1.0f : 0.0f);
                    this.a0.setTranslationY(z ? 0.0f : hl.L(48.0f));
                    this.d0.setTranslationY(z ? 0.0f : hl.L(48.0f));
                    if (!z) {
                        this.a0.setVisibility(4);
                        this.b0.setVisibility(4);
                    }
                    return true;
                }
                this.l0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                d26 d26Var = this.b0;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(d26Var, (Property<d26, Float>) property, z ? 1.0f : 0.2f));
                d26 d26Var2 = this.b0;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(d26Var2, (Property<d26, Float>) property2, z ? 1.0f : 0.2f));
                d26 d26Var3 = this.b0;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(d26Var3, (Property<d26, Float>) property3, z ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<tb, Float>) property, z ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<tb, Float>) property2, z ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<tb, Float>) property3, z ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.a0;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z ? 0.0f : hl.L(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.d0, (Property<View, Float>) property4, z ? 0.0f : hl.L(48.0f)));
                this.l0.playTogether(arrayList);
                this.l0.setInterpolator(new DecelerateInterpolator());
                this.l0.setDuration(180L);
                this.l0.addListener(new gf4((byte) 21, this, z));
                this.l0.start();
                return true;
            }
        }
        return false;
    }

    public final void l0() {
        if (this.e) {
            int childCount = this.L.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.L.getChildAt(i);
                boolean z = childAt instanceof d88;
                do6 do6Var = this.K;
                ArrayList arrayList = this.c;
                if (z) {
                    d88 d88Var = (d88) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (do6Var != null) {
                        d88Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(((no6) do6Var.e.get(num.intValue())).C)) : -1);
                    } else {
                        d88Var.setNum(this.e ? arrayList.indexOf(((ro6) this.f.get(num.intValue())).B) : -1);
                    }
                } else if (childAt instanceof zea) {
                    ((zea) childAt).b(arrayList.indexOf(Integer.valueOf(((no6) do6Var.e.get(((Integer) childAt.getTag()).intValue())).C)) != 0, false);
                }
            }
        }
    }

    public final void m0(int i) {
        int size = this.b.size();
        tb tbVar = this.c0;
        if (size == 0) {
            tbVar.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            k0(false, i != 0);
            return;
        }
        tbVar.invalidate();
        if (k0(true, i != 0) || i == 0) {
            this.c0.setPivotX(0.0f);
            this.c0.setPivotY(0.0f);
            return;
        }
        this.c0.setPivotX(hl.L(21.0f));
        this.c0.setPivotY(hl.L(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.c0, (Property<tb, Float>) View.SCALE_X, i == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.c0, (Property<tb, Float>) View.SCALE_Y, i == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    public final void n0() {
        String str;
        t20 t20Var = this.M;
        if (t20Var != null) {
            t20Var.f();
        }
        if (this.r || (this.n.size() > 0 && ((str = this.w) == null || TextUtils.isEmpty(str)))) {
            this.O.e(true, true);
        } else {
            this.O.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        iu3 iu3Var = this.e0;
        if (iu3Var == null || !iu3Var.e) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        iu3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.s);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        jn7.f(this.currentAccount).n(this, jn7.s);
        if (this.y != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.y, true);
            this.y = 0;
        }
        iu3 iu3Var = this.e0;
        if (iu3Var != null) {
            iu3Var.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPanTranslationUpdate(float f) {
        d79 d79Var = this.L;
        if (d79Var == null) {
            return;
        }
        if (!this.e0.e) {
            d79Var.setTranslationY(f);
        } else {
            this.fragmentView.setTranslationY(f);
            this.L.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.M;
        if (t20Var != null) {
            t20Var.f();
        }
        iu3 iu3Var = this.e0;
        if (iu3Var != null) {
            iu3Var.s();
        }
        s7 s7Var = this.Q;
        if (s7Var != null) {
            s7Var.G(true);
            if (!TextUtils.isEmpty(this.q0)) {
                this.Q.P(this.q0, false);
                this.q0 = null;
                f0(this.Q.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        s7 s7Var;
        if (!z || (s7Var = this.Q) == null) {
            return;
        }
        hl.E3(s7Var.getSearchField());
    }
}
