package androidx.car.app.model.constraints;

import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class TabContentsConstraints {
    private HashSet mAllowedTemplateTypes;
    public static final TabContentsConstraints DEFAULT = new TabContentsConstraints(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class));
    public static final TabContentsConstraints API_7 = new TabContentsConstraints(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class, NavigationTemplate.class));

    public void validateOrThrow(Template template) {
        if (this.mAllowedTemplateTypes.contains(template.getClass())) {
            return;
        }
        throw new IllegalArgumentException("Type is not allowed in tabs: " + template.getClass().getSimpleName());
    }

    private TabContentsConstraints(List list) {
        this.mAllowedTemplateTypes = new HashSet(list);
    }
}
