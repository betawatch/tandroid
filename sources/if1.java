// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class if1 extends n8 {
    public final /* synthetic */ wf1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if1(wf1 wf1Var, hf1 hf1Var) {
        super(hf1Var, -2, -2);
        this.o = wf1Var;
    }

    @Override // n8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wf1 wf1Var = this.o;
        if (wf1Var.G0 != this) {
            return;
        }
        v21.e();
        wf1Var.G0 = null;
    }
}
