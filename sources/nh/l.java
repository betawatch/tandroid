package nh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ m c;
    public final /* synthetic */ n d;

    public l(n nVar, View view, ArrayList arrayList, m mVar) {
        this.d = nVar;
        this.a = view;
        this.b = arrayList;
        this.c = mVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        View view = this.a;
        int scrollY = view.getScrollY() + y3;
        int paddingLeft = x10 - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        n nVar = this.d;
        int i10 = paddingLeft - nVar.a;
        int i11 = paddingTop - nVar.b;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            if (((i) obj).getBounds().contains(i10, i11)) {
                nVar.c = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        n nVar = this.d;
        if (nVar.c) {
            View view = this.a;
            view.playSoundEffect(0);
            nVar.c = false;
            int x10 = (int) motionEvent.getX();
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int paddingLeft = x10 - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = paddingLeft - nVar.a;
            int i11 = paddingTop - nVar.b;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                i iVar = (i) obj;
                if (iVar.getBounds().contains(i10, i11)) {
                    this.c.m(iVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
