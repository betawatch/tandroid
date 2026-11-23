package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(String str, int i7) {
        super(str, 0);
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.q6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                bn.md = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.r1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((org.telegram.messenger.cj) obj).d = f10;
                break;
            case 4:
                ((wv0) obj).setCrossfadeProgress(f10);
                break;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                break;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                break;
            default:
                oz0 oz0Var = (oz0) obj;
                if (oz0Var.a != f10) {
                    oz0Var.a = f10;
                    SecretMediaViewer secretMediaViewer = oz0Var.r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (!oz0Var.b) {
                        if (oz0Var.c) {
                            oz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                        }
                        secretMediaViewer.Q.setAlpha(f10);
                        break;
                    } else {
                        secretMediaViewer.R.setPivotX(r4.getWidth());
                        secretMediaViewer.R.setPivotY(r4.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.R.setScaleX(f12);
                        secretMediaViewer.R.setScaleY(f12);
                        org.telegram.ui.Components.k61 k61Var = secretMediaViewer.P;
                        if (k61Var.y != f11) {
                            k61Var.y = f11;
                            k61Var.v.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(bn.md);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.r1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.cj) obj).d);
            case 4:
                return Float.valueOf(((wv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((oz0) obj).a);
        }
    }
}
