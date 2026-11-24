// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class o71 extends FrameLayout implements tjb, ui7 {
    public static final /* synthetic */ int H = 0;
    public boolean E;
    public final fb F;
    public d71 G;
    public final ed0 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final vec d;
    public final d e;
    public final ArrayList f;
    public v61 h;
    public final wec n;
    public final m71[] r;
    public c71 s;
    public int w;
    public final dha x;
    public int y;

    public o71(Context context, d dVar, qw4 qw4Var, dha dhaVar) {
        super(context);
        this.b = new ArrayList();
        this.f = new ArrayList();
        m71[] m71VarArr = new m71[5];
        this.r = m71VarArr;
        final byte b = 1;
        this.F = new fb(this, b);
        this.e = dVar;
        this.x = dhaVar;
        if (dhaVar != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        m71VarArr[0] = new m71(k96.M0(2131750784, null), 0, new e71(this));
        m71VarArr[1] = new m71(k96.M0(2131748459, null), 1, new j71(this));
        m71VarArr[2] = new m71(k96.M0(2131745222, null), 2, new g71(this));
        m71VarArr[3] = new m71(k96.M0(2131748127, null), 3, new l71(this));
        int i = 0;
        while (true) {
            m71[] m71VarArr2 = this.r;
            if (i >= m71VarArr2.length) {
                break;
            }
            m71 m71Var = m71VarArr2[i];
            if (m71Var != null) {
                this.f.add(i, m71Var);
            }
            i++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        wec wecVar = dhaVar == null ? new wec(getContext(), null) : new s39(context, dVar.getResourceProvider(), dhaVar);
        this.n = wecVar;
        wecVar.setAllowDisallowInterceptTouch(false);
        if (qw4Var != null) {
            qw4Var.c(wecVar);
        }
        addView(wecVar, nme.d(-1, -1.0f, 48, 0.0f, (qw4Var == null && dhaVar == null) ? 48.0f : 0.0f, 0.0f, 0.0f));
        vec l = wecVar.l(qw4Var != null ? -2 : 3, true);
        this.d = l;
        frameLayout.addView(l, nme.c(48.0f, -1));
        if (qw4Var != null) {
            frameLayout.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        }
        addView(frameLayout, nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        wecVar.setAdapter(new z61(this, context, qw4Var, dVar, dhaVar));
        LinearLayout linearLayout = new LinearLayout(context);
        zkb.h(bkb.c6, null, linearLayout);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, nme.c(48.0f, -1));
        gl.U3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ed0 ed0Var = new ed0(true);
        this.a = ed0Var;
        imageView.setImageDrawable(ed0Var);
        int i2 = bkb.x8;
        ed0Var.a(bkb.w0(null, i2, false));
        int i3 = bkb.y8;
        ff0 f0 = bkb.f0(bkb.w0(null, i3, false), 1, -1);
        vkb M = zkb.M(i3);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, null);
        imageView.setContentDescription(k96.M0(2131752029, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(gl.L(54.0f), -1));
        this.b.add(imageView);
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: w61
            public final /* synthetic */ o71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                o71 o71Var = this.b;
                switch (b3) {
                    case 0:
                        o71Var.G.G();
                        break;
                    default:
                        o71Var.G.clear();
                        break;
                }
            }
        });
        hn hnVar = new hn(context, true, true, true);
        hnVar.setTextSize(gl.L(18.0f));
        hnVar.setTypeface(gl.o());
        zkb.U(hnVar, i2, null);
        linearLayout.addView(hnVar, nme.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(hnVar);
        r7 r7Var = new r7(context, null, bkb.w0(null, i3, false), bkb.w0(null, i2, false), false, null);
        r7Var.setIcon(R.drawable.msg_clear);
        if (r7Var.getBackground() != null) {
            Drawable background = r7Var.getBackground();
            vkb M2 = zkb.M(i3);
            r7Var.setBackground(background);
            zkb.j(r7Var, background, null, M2, null);
        }
        if (r7Var.getIconView() != null) {
            zkb.s(r7Var.getIconView(), i2, null, PorterDuff.Mode.SRC_IN);
        }
        r7Var.setContentDescription(k96.M0(2131751586, null));
        r7Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(r7Var, new LinearLayout.LayoutParams(gl.L(54.0f), -1));
        this.b.add(r7Var);
        r7Var.setOnClickListener(new View.OnClickListener(this) { // from class: w61
            public final /* synthetic */ o71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                o71 o71Var = this.b;
                switch (b3) {
                    case 0:
                        o71Var.G.G();
                        break;
                    default:
                        o71Var.G.clear();
                        break;
                }
            }
        });
    }

    public final o39 a(View view) {
        if (view == null) {
            return null;
        }
        return view instanceof n71 ? ((n71) view).a : (o39) view;
    }

    public final void b(u61 u61Var, f71 f71Var) {
        o39 listView = getListView();
        if (f71Var.e == 2) {
            if (!(listView.getAdapter() instanceof g71)) {
                return;
            }
            PhotoViewer r0 = PhotoViewer.r0();
            d dVar = this.e;
            r0.S1(null, dVar, null);
            c71 c71Var = this.s;
            if (c71Var == null) {
                c71Var = new c71(this);
                this.s = c71Var;
            }
            c71Var.a = listView;
            File file = u61Var.a;
            File file2 = u61Var.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new jm6(0, file2.getPath(), 0, u61Var.d == 1, 0, 0));
                PhotoViewer.r0().n1(arrayList, 0, -1, false, this.s, null);
            } else {
                gl.s2(file2, file2.getName(), null, dVar.getParentActivity(), null, false);
            }
        }
        if (f71Var.e == 3) {
            if (!MediaController.w().D(u61Var.f)) {
                MediaController.w().R(u61Var.f);
            } else if (MediaController.w().C()) {
                MediaController.w().R(u61Var.f);
            } else {
                MediaController.w().Q(u61Var.f, true);
            }
        }
    }

    public final void c(h71 h71Var, j71 j71Var, o39 o39Var) {
        ArrayList arrayList = j71Var.e;
        PhotoViewer.r0().S1(null, this.e, null);
        c71 c71Var = this.s;
        if (c71Var == null) {
            c71Var = new c71(this);
            this.s = c71Var;
        }
        c71Var.a = o39Var;
        if (arrayList.indexOf(h71Var) >= 0) {
            PhotoViewer.r0().n1(j71Var.r, arrayList.indexOf(h71Var), -1, false, this.s, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8 A[LOOP:2: B:65:0x00f2->B:67:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.h != null) {
            int i = 0;
            while (true) {
                m71[] m71VarArr = this.r;
                if (i >= m71VarArr.length) {
                    break;
                }
                m71 m71Var = m71VarArr[i];
                if (m71Var != null) {
                    if (m71Var.b == 0 && !this.h.b.isEmpty()) {
                        arrayList2.add(m71VarArr[i]);
                    } else if (m71VarArr[i].b == 1 && !this.h.d.isEmpty()) {
                        arrayList2.add(m71VarArr[i]);
                    } else if (m71VarArr[i].b == 2 && !this.h.e.isEmpty()) {
                        arrayList2.add(m71VarArr[i]);
                    } else if (m71VarArr[i].b == 3 && !this.h.f.isEmpty()) {
                        arrayList2.add(m71VarArr[i]);
                    } else if (m71VarArr[i].b == 5 && !this.h.g.isEmpty()) {
                        arrayList2.add(m71VarArr[i]);
                    } else if (m71VarArr[i].b == 4 && !this.h.h.isEmpty()) {
                        arrayList2.add(m71VarArr[i]);
                    }
                }
                i++;
            }
        }
        int size = arrayList2.size();
        wec wecVar = this.n;
        if (size == 1 && this.h.a) {
            this.d.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) wecVar.getLayoutParams()).topMargin = 0;
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        dha dhaVar = this.x;
        if (size2 == size3) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((m71) arrayList.get(i2)).b == ((m71) arrayList2.get(i2)).b) {
                }
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                a71 a71Var = ((m71) arrayList2.get(i3)).c;
                ((m71) arrayList2.get(i3)).c.F();
            }
            if (dhaVar == null) {
                dhaVar.s();
                return;
            }
            return;
        }
        wecVar.D(dhaVar == null);
        while (i3 < arrayList2.size()) {
        }
        if (dhaVar == null) {
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            wec wecVar = this.n;
            if (i >= wecVar.getViewPages().length) {
                return;
            }
            o39 a = a(wecVar.getViewPages()[i]);
            if (a != null) {
                gl.W3(a);
            }
            i++;
        }
    }

    public o39 getListView() {
        return a(this.n.getCurrentView());
    }

    public wec getViewPager() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.F);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
    }

    public void setCacheModel(v61 v61Var) {
        this.h = v61Var;
        d();
    }

    public void setDelegate(d71 d71Var) {
        this.G = d71Var;
    }

    public void setTargetTabsPosition(int i) {
        this.y = i;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.a.a(bkb.w0(null, bkb.x8, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
