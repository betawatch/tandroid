// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mi1 extends FrameLayout implements vlb {
    public final ylb a;
    public final smb b;
    public final u46 c;
    public final int d;
    public int e;

    public mi1(int i, ylb ylbVar, Activity activity) {
        super(activity);
        this.d = i;
        this.a = ylbVar;
        smb smbVar = new smb(activity, ylbVar, (byte) 1);
        this.b = smbVar;
        smbVar.setPadding(gm.L(6.0f), gm.L(5.0f), gm.L(6.0f), 0);
        smbVar.setClipToPadding(false);
        smbVar.setAdapter(new ki1(this, activity, ylbVar, i));
        u46 u46Var = new u46();
        this.c = u46Var;
        u46Var.i1(0);
        smbVar.setLayoutManager(u46Var);
        addView(smbVar, qoe.c(-1.0f, -1));
    }

    public final void a(int i, boolean z) {
        fc7 fc7Var = oc7.r1(this.d).E3;
        int i2 = 0;
        if (fc7Var != null) {
            ArrayList arrayList = fc7Var.c;
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (((ec7) arrayList.get(i3)).c == i) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        if (i2 != this.e) {
            this.e = i2;
            if (!z) {
                this.c.g1(i2, (gm.q.x - gm.L(56.0f)) / 2);
            }
            gm.d0(this.b, new ra((byte) 1, this, z));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // vlb
    public final void updateColors() {
        gm.d0(this.b, new x0(this, oc7.r1(this.d).E3, (byte) 16));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
