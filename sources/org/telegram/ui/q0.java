package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(String str, int i7) {
        super(str, 0);
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                an.id = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((org.telegram.messenger.ej) obj).d = f10;
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
                lz0 lz0Var = (lz0) obj;
                if (lz0Var.a != f10) {
                    lz0Var.a = f10;
                    SecretMediaViewer secretMediaViewer = lz0Var.r;
                    secretMediaViewer.Q.setAlpha(f10);
                    if (!lz0Var.b) {
                        if (lz0Var.c) {
                            lz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                        }
                        secretMediaViewer.P.setAlpha(f10);
                        break;
                    } else {
                        secretMediaViewer.Q.setPivotX(r4.getWidth());
                        secretMediaViewer.Q.setPivotY(r4.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.Q.setScaleX(f12);
                        secretMediaViewer.Q.setScaleY(f12);
                        org.telegram.ui.Components.v51 v51Var = secretMediaViewer.O;
                        if (v51Var.y != f11) {
                            v51Var.y = f11;
                            v51Var.v.invalidate();
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
                return Float.valueOf(an.id);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.ej) obj).d);
            case 4:
                return Float.valueOf(((wv0) obj).S);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((lz0) obj).a);
        }
    }
}
