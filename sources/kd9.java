// default package

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kd9 implements qkb {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public kd9(StaticLayout staticLayout, Rect rect) {
        this.b = staticLayout;
        this.c = rect;
    }

    @Override // qkb, mi7
    public final Layout a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (StaticLayout) obj;
            default:
                qyc qycVar = (qyc) obj;
                ryc rycVar = qycVar.h;
                if (rycVar != null) {
                    return rycVar;
                }
                ryc rycVar2 = new ryc(qycVar);
                qycVar.h = rycVar2;
                return rycVar2;
        }
    }

    @Override // qkb
    public final Rect c() {
        switch (this.a) {
            case 0:
                return (Rect) this.c;
            default:
                return null;
        }
    }

    @Override // qkb
    public final CharSequence getPrefix() {
        byte b = this.a;
        return null;
    }

    @Override // qkb
    public final int getRow() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((al9) this.c).V;
        }
    }

    @Override // qkb
    public final CharSequence getText() {
        switch (this.a) {
            case 0:
                StaticLayout staticLayout = (StaticLayout) this.b;
                if (staticLayout != null) {
                    return staticLayout.getText();
                }
                return null;
            default:
                Layout a = a();
                if (a != null) {
                    return a.getText();
                }
                return null;
        }
    }

    @Override // qkb
    public final int getX() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                al9 al9Var = (al9) this.c;
                return (al9Var.T - al9Var.k0) + ((qyc) this.b).b;
        }
    }

    @Override // qkb
    public final int getY() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return ((al9) this.c).U + ((qyc) this.b).c;
        }
    }

    public kd9(al9 al9Var, qyc qycVar) {
        this.c = al9Var;
        this.b = qycVar;
    }
}
